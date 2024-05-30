package Simulacro1erParcial;

import api.ColaPrioridadTDA;
import api.ColaTDA;
import impl.ColaDinamica;
import impl.ColaPrioridadDinamica;

public class ListaPromediada implements ListaPromediadaTDA{
    NodoListaPromediada Primero;
    NodoListaPromediada Ultimo;
    int i;

    @Override
    public void inicializar() {
        Primero=null;
        Ultimo=null;
        i=0;
    }

    @Override
    public void AgregarValor(int val) {
        NodoListaPromediada aux= new NodoListaPromediada();
        aux.info= val;
        aux.sig=null;

        if (Primero==null){
            Primero=aux;
            Ultimo=Primero;
            i++;
        }else if(val>Promedio()){
            Ultimo.sig=aux;
            Ultimo=aux;
            i++;
        }else if(val<Promedio()){
            aux.sig=Primero;
            Primero=aux;
            i++;
        }
    }

    @Override
    public void eliminar(int val) {
        NodoListaPromediada s = Primero;
        if(Primero.info==val){
            Primero=Primero.sig;
        }else if(Primero.sig.info==val){
            Primero=Primero.sig.sig;
        }else{
            while (s.sig.sig!=null) {
                while (s.sig.info!=val) {
                    s=s.sig;
                }
                while(s.sig.info==val){
                    s.sig=s.sig.sig;
                }
                
            }
        }
        

    }

    @Override
    public float Promedio() {
        NodoListaPromediada aux=Primero;
        float sumatoria=0;

        while(aux!=null){
            sumatoria=sumatoria + aux.info;
            aux=aux.sig;
        }
        return (sumatoria/(i));
    }

    @Override
    public ColaTDA Menores() {
        NodoListaPromediada aux= Primero;
        ColaTDA menores=new ColaDinamica();
        menores.InicializarCola();
        ColaPrioridadTDA menoresp = new ColaPrioridadDinamica();
        menoresp.InicializarCola();

        while (aux!=null) {
            if(aux.info<Promedio()){
                menoresp.Acolar(aux.info,-aux.info);
            }
            aux=aux.sig;
        }

        while (!menoresp.ColaVacia()) {
            menores.Acolar(menoresp.PrimerElemento());
            menoresp.Desacolar();
        }
        return menores;
    }

    @Override
    public ColaTDA Mayores() {
        NodoListaPromediada aux= Primero;
        ColaTDA mayores=new ColaDinamica();
        ColaPrioridadTDA mayoresp= new ColaPrioridadDinamica();
        mayores.InicializarCola();

        while (aux!=null) {
            if(aux.info>Promedio()){
                mayoresp.Acolar(aux.info,aux.info);
            }
            aux=aux.sig;
        }

        while(!mayoresp.ColaVacia()){
            mayores.Acolar(mayoresp.PrimerElemento());
            mayoresp.Desacolar();
        }
        return mayores;
    }

    @Override
    public boolean EstaVacia() {
        return Primero==null;
    }

}

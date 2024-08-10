package impl;
import api.ConjuntoTDA;
import impl.Nodo;


public class ConjuntoDinamico implements ConjuntoTDA {
    Nodo Primero;
    Nodo Ultimo;
    int i=0;

    @Override
    public void InicializarConjunto() {
        Primero=null;
        Ultimo=null;
    }

    @Override
    public boolean ConjuntoVacio() {
        return Primero==null;
    }

    @Override
    public void Agregar(int x) {
        Nodo aux= new Nodo();
        aux.info=x;
        aux.sig=null;
        if (Primero==null){
            Primero=aux;
            Ultimo=aux;
            i++;
        }else if(!Pertenece(x)){//revisar si el ! está bien
            Ultimo.sig=aux;
            Ultimo=aux;
            i++;
        }
    }

    @Override
    public int Elegir() {
        int pos= Math.abs((int)System.nanoTime()%i);
        int cont=0;
        Nodo aux=Primero;
        while((cont<i && cont!=pos) && aux.sig!=null){
            aux=aux.sig;
            cont++;
        }
        return aux.info;
    }

    @Override
    public void Sacar(int x) {
        
        if(Pertenece(x)){
            if(Primero.info==x){
                Primero=Primero.sig;
                i--;
            }else{
                Nodo anterior= Primero;
                Nodo actual=Primero.sig;
                
                while(actual.info!=x){
                    anterior=actual;
                    actual=actual.sig;
                }


                anterior.sig=actual.sig;
                i--;
            }


        }else{
            System.out.println("no existe el elemento a sacar");
        }
    }

    @Override
    public boolean Pertenece(int x) {
        boolean pertenece=false;
        Nodo aux= new Nodo();
        aux=Primero;
        while(!pertenece && aux!=null){
            if(aux.info == x ){
                pertenece=true;
            }
            aux=aux.sig;

        }
        return pertenece;
    }

}

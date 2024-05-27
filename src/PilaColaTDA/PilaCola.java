package PilaColaTDA;

public class PilaCola implements PilaColaTDA{
    NodoPilaCola Toprimero;
    NodoPilaCola Ultimo;
    boolean EsCola;
    int Pares;

    @Override
    public void inicializar() {
        Ultimo=null;
        Toprimero=Ultimo;
        EsCola= true;
        Pares=0;
        

    }

    @Override
    public void Cargar(int valor) {
        NodoPilaCola aux= new NodoPilaCola();
        aux.info=valor;
        aux.sig=null;
        if(EstaVacio()){
            Toprimero=aux;
            Ultimo=Toprimero;
        }else{
            Ultimo.sig=aux;
            Ultimo=aux;
        }
        
        if(valor%2==0){
            Pares++;
            if(Pares>10){
                EsCola=false;
            }
        }
    }

    @Override
    public void Quitar() {
        if (EsCola) {
            Toprimero=Toprimero.sig;
        }else{
            NodoPilaCola aux=Toprimero;
            while(aux.sig!=Ultimo){
                aux=aux.sig;
            }
            Ultimo=aux;
        }
        
        if(EstaVacio()){
            Toprimero=null;
            Ultimo=null;
        }
    }

    @Override
    public void Mostrar() {
        if (EsCola) {
            System.out.println(Toprimero.info);
        }else{
            System.out.println(Ultimo.info);
        }
    }

    @Override
    public boolean EstaVacio() {
        return (Toprimero==null);
    }

    @Override
    public void imprimir() {
        NodoPilaCola aux = new NodoPilaCola();
        aux=Toprimero;
        while(aux!=null){
            System.out.print("-"+ aux.info);
            aux=aux.sig;
        }
        System.out.println();
    }

}

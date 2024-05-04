package Lista;

import impl.Nodo;

public class ListaDinamica implements ListaTDA{
    NodoLista Origen;
    int i;
    @Override
    public void inicializar() {
        Origen=null;
        i=0;
        
    }

    @Override
    public void append(int x) {
        NodoLista aux=new NodoLista();
        aux.info=x;
        aux.sig=null;
        if (Origen==null) {
            Origen=aux;
            i++;
        }else{
            NodoLista actual= Origen.sig;
            NodoLista anterior= Origen;
            while(actual!=null){
                anterior=actual;
                actual=actual.sig;
            }
            anterior.sig=aux;
            i++;
            
        }


    }
        

    

    @Override
    public void clear() {
        Origen=null;
        i=0;
    }

    @Override
    public int count(int x) {
        int cont=0;
        NodoLista aux=Origen;
        while(aux!=null){
            if (aux.info==x) {
                cont++;
            }
            aux=aux.sig;
        }
        return cont;
        
    }

    @Override
    public int index(int x) {
        int cont=0;
        NodoLista aux=Origen;
        while(aux!=null && aux.info!=x){
            aux=aux.sig;
            cont++;
        }
        if(aux!=null){
            return cont;
        }else{
            return -1;
        }
    }

    @Override
    public void insert(int x, int p) {
        NodoLista aux=new NodoLista();
        aux.info=x;
        aux.sig=null;
        if (Origen==null) {
            Origen.info=x;
            i++;
        }else if(p==0){
            aux.sig=Origen;
            Origen=aux;

        }else{
            NodoLista actual= Origen.sig;
            NodoLista anterior= Origen;
            
            for(int cont=0;cont<=p;cont++){
                anterior=actual;
                actual=actual.sig;
            }
            aux.sig=actual;
            anterior.sig=aux;
            i++;
            }
        }

    @Override
    public void pop() {

        NodoLista aux=Origen;
        while(aux.sig.sig!=null){
            aux=aux.sig;
        }
        aux.sig=null;
        i--;
    }

    @Override
    public void remove(int x) {
        NodoLista anterior= Origen;
        NodoLista actual= anterior.sig;
        
        if (Origen.info==x) {
            Origen=Origen.sig;

        }else{
            while(actual.info!=x){
                anterior=actual;
                actual=actual.sig;
            }
            actual=actual.sig;
            anterior.sig=actual;
        }
    }

    @Override
    public void removeAll(int x) {
        while(index(x)!=-1){
            remove(x);
        }
    }

    @Override
    public boolean listaVacia() {
        return Origen==null;
    }

    @Override
    public void mostrarLista() {
        NodoLista aux=Origen;

        System.out.print("[");
        while (aux!=null) {
            System.out.printf("%d, ",aux.info);
            aux=aux.sig;
        }
        System.out.print("]");
        System.out.println();
    }

    @Override
    public int recuperarPos(int x) {
        NodoLista aux=Origen;
        for(int cont=0;cont<x;cont++){
            aux=aux.sig;
        }
        return aux.info;
        

    }
}

package FinalA;

public class MulticonjuntoDinamico implements multiconjuntoTDA{
    
    private class Nodo{
        int valor;
        int mult;
        Nodo sig;
    }

    int i;
    Nodo origen;

    @Override
    public void inicializarMulticonjunto() {
        origen = null;
        i = 0;
    }

    private boolean Pertenece(int x){
        boolean pertenece = false;
        Nodo aux = origen;
        while (!pertenece && aux !=null) {
            if (aux.valor == x) {
                pertenece = true;
            }
            aux = aux.sig;
        }

        return pertenece;
    }

    @Override
    public void agregar(int x) {
        Nodo aux = new Nodo();
        aux.valor = x;
        aux.mult = 1;
        aux.sig = null;
        
        if (multiconjuntojuntoVacio()) {
            origen = aux;
            i++;

        }else if (Pertenece(x)) {
            aux = origen;
            while (aux.valor != x) {
                aux = aux.sig;
            }
            aux.mult++;

        }else{

            aux.sig = origen;
            origen = aux;
            i++;

        }
    }

    

    @Override
    public void sacar(int x) {
        Nodo aux = origen;
        while (aux != null && aux.valor != x) {
            aux = aux.sig;
        }

        aux.mult--;

        if (aux.mult == 0) {
            aux = null;
            i--;
        }

    }

    @Override
    public int multiplicidad(int x) {
        Nodo aux = origen;
        while (aux != null && aux.valor != x) {
            aux = aux.sig;
        }
        
        if (aux != null) {
            return aux.mult;
        }else{
            return 0;
        }
    }

    @Override
    public boolean multiconjuntojuntoVacio() {
        return origen == null;
    }

    @Override
    public int elegir() {
        int pos= Math.abs((int)System.nanoTime()%i);
        int cont=0;
        Nodo aux=origen;
        while((cont<i && cont!=pos) && aux.sig!=null){
            aux=aux.sig;
            cont++;
        }
        return aux.valor;
    }

}

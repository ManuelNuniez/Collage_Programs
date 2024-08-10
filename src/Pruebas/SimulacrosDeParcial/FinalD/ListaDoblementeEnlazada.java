package FinalD;

public class ListaDoblementeEnlazada implements ListaDoblementeEnlazadaTDA{

    NodoDoble primero;
    NodoDoble ultimo;

    @Override
    public void InicializarLista() {
        primero=null;
        ultimo=null;
    }

    @Override
    public void Agregar(int x) {
        NodoDoble aux = new NodoDoble();
        aux.val = x;
        aux.sig = null;
        aux.prev = null;
        if (ListaVacia()) {
            primero=aux;
            ultimo=aux;
        }else{
            aux.prev = ultimo;
            ultimo.sig = aux;
            ultimo = aux;
        }
    }

    @Override
    public void Eliminar(int x) {
        if (primero.val == x) {
            primero=primero.sig;
        }else if (ultimo.val == x) {
            ultimo=ultimo.prev;
            ultimo.sig=null;
        }else{
            NodoDoble aux = primero;
            while (aux.val != x) {
                aux = aux.sig;
            }
            aux.prev.sig = aux.sig;

        }
    }

    @Override
    public int PrimerElemnto() {
        return primero.val;
    }

    @Override
    public int UltimoElemento() {
        return ultimo.val;
    }

    @Override
    public boolean ListaVacia() {
        return primero==null;
    }

    public void Imprimir(){
        NodoDoble aux = primero;
        System.out.print("null --> ");
        while (aux!=null) {
            System.out.print(aux.val + " --> ");
            aux = aux.sig;
        }

        System.out.println("null");
    }

}

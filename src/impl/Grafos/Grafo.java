package impl.Grafos;

import api.ConjuntoTDA;
import api.GrafoTDA;
import impl.ConjuntoDinamico;

public class Grafo implements GrafoTDA{

    NodoVertice root;

    @Override
    public void inicializarGrafo() {
        root=null;
    }

    @Override
    public void AgregarVertice(int v) {
        NodoVertice aux= new NodoVertice();
        aux.valor=v;
        aux.arista=null;
        aux.sigNodo=root;
        root=aux;
    }

    @Override
    public void EliminarVertice(int v) {
        if (root.valor==v ) {
            root= root.sigNodo;
        }
        NodoVertice aux = root;

        while (aux!=null) {
            this.EliminarAristasNodo(aux, v);
            if (aux.sigNodo!=null && aux.sigNodo.valor == v) {
                aux.sigNodo = aux.sigNodo.sigNodo;
            }
            aux =aux.sigNodo;
        }
    }

    @Override
    public ConjuntoTDA Vertices() {
        ConjuntoTDA vertices= new ConjuntoDinamico();
        vertices.InicializarConjunto();

        NodoVertice aux = root;
        while (aux!=null) {
            vertices.Agregar(aux.valor);
            aux=aux.sigNodo;
        }

        return vertices;
    }

    private NodoVertice BuscarNodo (int v){
        NodoVertice aux= root;
        while (aux!=null && aux.valor!=v) {
            aux=aux.sigNodo;
        }
        return aux;
    }

    @Override
    public void AgregarArista(int origen, int destino, int peso) {
        NodoVertice nodoOrigen = BuscarNodo(origen);
        NodoVertice nodoDestino = BuscarNodo(destino);

        NodoArista aux= new NodoArista();
        aux.peso=peso;
        aux.nodoDestino=nodoDestino;
        aux.sigArista= nodoOrigen.arista;
        nodoOrigen.arista =aux;
    }

    private void EliminarAristasNodo(NodoVertice nodo, int v){
        NodoArista aux = nodo.arista;
        if (aux!=null) {
            if (aux.nodoDestino.valor == v) {
                nodo.arista = aux.sigArista;
            }else{
                while (aux.sigArista != null && aux.sigArista.nodoDestino.valor != v) {
                    aux=aux.sigArista;
                }
                if (aux.sigArista != null) {
                    aux.sigArista= aux.sigArista.sigArista;
                }
            }
        }
    }

    @Override
    public void EliminarArista(int origen, int destino) {
        NodoVertice nodoOrigen = BuscarNodo(origen);
        EliminarAristasNodo(nodoOrigen, destino);
    }

    @Override
    public boolean ExisteArista(int origen, int destino) {
        NodoVertice nodoOrigen = BuscarNodo(origen);

        NodoArista aux = nodoOrigen.arista;

        while (aux != null && aux.nodoDestino.valor != destino) {
            aux=aux.sigArista;
        }

        return aux != null;
    }

    @Override
    public int PesoArista(int origen, int destino) {
        NodoVertice nodoOrigen = BuscarNodo(origen);

        NodoArista aux = nodoOrigen.arista;

        while (aux != null && aux.nodoDestino.valor != destino) {
            aux=aux.sigArista;
        }

        return aux.peso;
    }

}

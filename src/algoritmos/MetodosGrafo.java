package algoritmos;
import java.lang.*;
import api.GrafoTDA;
import impl.ColaDinamica;
import impl.ColaPrioridadHeap;
import impl.ConjuntoDinamico;
import impl.DiccionarioSimpleDinamico;
import impl.Grafos.Grafo;
import api.ColaPrioridadTDA;
import api.ColaTDA;
import api.ConjuntoTDA;
import api.DiccionarioSimpleTDA;

public class MetodosGrafo {
    public static void ImprimirGrafo(GrafoTDA grafo) {
        ConjuntoTDA vertices = grafo.Vertices();
        ConjuntoTDA verticesCopia = grafo.Vertices();

        while (!vertices.ConjuntoVacio()) {
            int vertice = vertices.Elegir();
            vertices.Sacar(vertice);

            while (!verticesCopia.ConjuntoVacio()) {
                int verticeCopia = verticesCopia.Elegir();
                verticesCopia.Sacar(verticeCopia);

                if (grafo.ExisteArista(vertice, verticeCopia)) {
                    System.out.println("Arista: " + vertice + " --"+grafo.PesoArista(vertice, verticeCopia) + "--> " + verticeCopia);
                }
            }

            verticesCopia = grafo.Vertices();
        }
    }
    
    public static void Dijkstra(GrafoTDA grafo, int origen){
        ConjuntoTDA visitados = new ConjuntoDinamico();
        visitados.InicializarConjunto(); 
        visitados.Agregar(origen);

        ConjuntoTDA candidatos = new ConjuntoDinamico();
        candidatos.InicializarConjunto();
        candidatos = grafo.Vertices();
        candidatos.Sacar(origen);

        while (!candidatos.ConjuntoVacio()) {
            Integer min = Integer.MAX_VALUE;
            ConjuntoTDA aux = MetodosConjunto.CopiarConjunto(candidatos);
            while (!aux.ConjuntoVacio()) {
                int u = aux.Elegir();
                aux.Sacar(u);
                if (grafo.ExisteArista(origen,u) && grafo.PesoArista(origen,u) < min) {
                    min = grafo.PesoArista(origen, u);
                    int w = u;
                }
            }
        }

        
    }

    public static int BreadthFirstSearch(GrafoTDA g, int nodoInicio, int nodoObjetivo){
        ColaTDA Q = new ColaDinamica();
        Q.InicializarCola();
        ConjuntoTDA visitados = new ConjuntoDinamico();
        ConjuntoTDA vecindario = g.NodosVecinos(nodoInicio);
        Q.Acolar(nodoInicio);
        visitados.Agregar(nodoInicio);
        while (!Q.ColaVacia()) {
            int v = Q.PrimerElemento();
            Q.Desacolar();
            if (nodoObjetivo == v) {
                return v;
            }
            vecindario = g.NodosVecinos(v);
            while (!vecindario.ConjuntoVacio()) {
                int u=vecindario.Elegir();
                vecindario.Sacar(u);
                if (!visitados.Pertenece(u)) {
                    Q.Acolar(u);
                    visitados.Agregar(u);
                }
            }
        } 
        return -1;
    }
}



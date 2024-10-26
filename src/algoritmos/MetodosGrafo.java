package algoritmos;

import api.GrafoTDA;
import impl.ColaDinamica;
import impl.ColaPrioridadHeap;
import impl.ConjuntoDinamico;
import impl.DiccionarioSimpleDinamico;
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
    
    public static int CaminoMasCorto(GrafoTDA grafo, int origen, int destino){

        DiccionarioSimpleTDA caminos = new DiccionarioSimpleDinamico();
        caminos.InicializarDiccionario();

        ColaPrioridadTDA colaPrioridad = new ColaPrioridadHeap();
        colaPrioridad.InicializarCola(false);

        colaPrioridad.Acolar(origen, 0);

        while (!colaPrioridad.ColaVacia()) {
            int vertice = colaPrioridad.PrimerElemento();
            int peso = colaPrioridad.Prioridad();
            colaPrioridad.Desacolar();

            if (!caminos.Claves().Pertenece(vertice)) {
                caminos.Agregar(vertice, peso);

                ConjuntoTDA adyacentes = grafo.NodosVecinos(vertice);
                while (!adyacentes.ConjuntoVacio()) {
                    int adyacente = adyacentes.Elegir();
                    adyacentes.Sacar(adyacente);

                    if (!caminos.Claves().Pertenece(adyacente)) {
                        int pesoArista = grafo.PesoArista(vertice, adyacente);
                        colaPrioridad.Acolar(adyacente, peso + pesoArista);
                    }
                }
            }
        }

        if (caminos.Claves().Pertenece(destino)) {
            return caminos.Recuperar(destino);
        }else{
            return -1;
        }
        

    }

    public static boolean TopoOrdenado(GrafoTDA g){
        ConjuntoTDA vertices = g.Vertices();
        boolean ordenado = true;
        int verticeActual;
        int vecinoActual;
        
        while (ordenado && !vertices.ConjuntoVacio()) {
            verticeActual = vertices.Elegir();
            vertices.Sacar(verticeActual);

            ConjuntoTDA vecinos = g.NodosVecinos(verticeActual);
            while (!vecinos.ConjuntoVacio()) {
                vecinoActual = vecinos.Elegir();
                vecinos.Sacar(vecinoActual);
                
                if (vecinoActual < verticeActual) {
                    ordenado = false;
                }
            }
        }
        
        return ordenado;
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



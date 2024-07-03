package algoritmos;

import api.GrafoTDA;
import impl.ColaPrioridadHeap;
import impl.DiccionarioSimpleDinamico;
import api.ColaPrioridadTDA;
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
}
import algoritmos.MetodosGrafo;
import api.GrafoTDA;
import impl.Grafos.Grafo;

public class PruebaGrafos {
    public static void main(String[] args) {
        GrafoTDA g = new Grafo();
        g.inicializarGrafo();

        g.AgregarVertice(0);
        g.AgregarVertice(1);
        g.AgregarVertice(2);
        g.AgregarVertice(3);
        g.AgregarVertice(4);
        g.AgregarVertice(5);
        g.AgregarVertice(6);

        

        g.AgregarArista(0, 2, 6);
        g.AgregarArista(0, 1, 2);
        g.AgregarArista(1, 3, 5);
        g.AgregarArista(2, 3, 8);
        g.AgregarArista(3, 5, 15);
        g.AgregarArista(3, 4, 10);
        g.AgregarArista(5, 4, 6);
        g.AgregarArista(5, 6, 6);
        g.AgregarArista(4, 6, 2);
        g.AgregarArista(2, 4, 2);
        g.AgregarArista(3, 6, 20);
        //g.AgregarArista(1, 1, 0);

        System.out.println(g.ExisteArista(0, 2));
        System.out.println(g.ExisteArista(1, 3));
        System.out.println(g.PesoArista(1, 3));

        MetodosGrafo.ImprimirGrafo(g);

        System.out.println("Camino mas corto de 3 a 2: " + MetodosGrafo.CaminoMasCorto(g, 3, 2));

        


    }

}

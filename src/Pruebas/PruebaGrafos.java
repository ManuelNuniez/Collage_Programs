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
        

        g.AgregarArista(0, 3, 4);
        g.AgregarArista(0, 1, 7);
        g.AgregarArista(1, 3, 2);
        g.AgregarArista(3, 2, 5);
        //g.AgregarArista(1, 1, 0);

        System.out.println(g.ExisteArista(0, 2));
        System.out.println(g.ExisteArista(1, 3));
        System.out.println(g.PesoArista(1, 3));

        MetodosGrafo.ImprimirGrafo(g);

    }

}

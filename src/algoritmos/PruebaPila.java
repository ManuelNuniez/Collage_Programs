package algoritmos;

import api.PilaTDA;
import impl.PilaDinamica;

public class PruebaPila {
    public static void main(String[] args) {
        PilaTDA p = new PilaDinamica();
        p.InicializarPila();

        p.Apilar(1);
        p.Apilar(2);
        p.Apilar(3);
        p.Apilar(4);
        p.Apilar(5);

        System.out.println(p.Tope());
        System.out.println("primera impresion");
        MetodosPila.ImprimirPila(p);
        System.out.println("segunda impresion");
        MetodosPila.ImprimirPila(p);
    }

}

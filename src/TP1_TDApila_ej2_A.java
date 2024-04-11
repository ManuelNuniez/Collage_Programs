import algoritmos.metodosPila;
import api.PilaTDA;
import impl.PilaDinamica;

public class TP1_TDApila_ej2_A {
    public static void main(String[] args) throws Exception {
        PilaTDA p1 = new PilaDinamica();
        p1.InicializarPila();
        PilaTDA p2 = new PilaDinamica();
        p2.InicializarPila();


        p1.Apilar(1);
        p1.Apilar(2);   
        p1.Apilar(3);
        p1.Apilar(4);
        metodosPila.CopiarPila(p1, p2);
        metodosPila.InvertirPila(p2);
        System.out.println("impresion de pila 1: ");
        metodosPila.ImprimirPila(p1);
        System.out.println("impresion de pila 2: ");
        metodosPila.ImprimirPila(p2);

    }
}

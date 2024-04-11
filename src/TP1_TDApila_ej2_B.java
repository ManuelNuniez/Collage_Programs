import api.PilaTDA;
import impl.PilaDinamica;
import algoritmos.MetodosPila;

public class TP1_TDApila_ej2_B {
    public static void main(String[] args) throws Exception {
        PilaTDA p1 = new PilaDinamica();
        p1.InicializarPila();
        PilaTDA p2 = new PilaDinamica();
        p2.InicializarPila();


        p1.Apilar(1);
        p1.Apilar(2);   
        p1.Apilar(3);
        p1.Apilar(4);
        MetodosPila.CopiarPila(p1, p2);
        System.out.println("impresion de pila 1: ");
        MetodosPila.ImprimirPila(p1);
        System.out.println("impresion de pila 2: ");
        MetodosPila.ImprimirPila(p2);
        
    }

}

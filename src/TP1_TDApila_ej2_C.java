import api.PilaTDA;
import impl.PilaDinamica;
import algoritmos.MetodosPila; 


public class TP1_TDApila_ej2_C {
    public static void main(String[] args) {
        PilaTDA p1 = new PilaDinamica();
        p1.InicializarPila();

        p1.Apilar(1);
        p1.Apilar(2);
        p1.Apilar(3);
        p1.Apilar(4);
        MetodosPila.InvertirPila(p1);
        MetodosPila.ImprimirPila(p1);
    }
    
}
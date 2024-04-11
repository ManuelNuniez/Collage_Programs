import api.PilaTDA;
import algoritmos.metodosPila;
import impl.PilaDinamica;
public class TP1_TDApila_ej2_E {
    public static void main(String[] args) {
        PilaTDA p1 =new PilaDinamica();
        p1.InicializarPila();

        p1.Apilar(1);
        p1.Apilar(2);
        p1.Apilar(3);
        p1.Apilar(4);
        System.out.println("la sumatoria de los elementos de la pila es igual a: " + metodosPila.Sumatoria(p1));
    }
}
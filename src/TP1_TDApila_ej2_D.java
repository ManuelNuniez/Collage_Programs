import api.PilaTDA;
import impl.PilaDinamica;
import algoritmos.metodosPila;

public class TP1_TDApila_ej2_D {
    public static void main(String[] args) {
        PilaTDA p1 = new PilaDinamica();
        p1.InicializarPila();

        p1.Apilar(1);
        p1.Apilar(2);
        p1.Apilar(3);
        p1.Apilar(4);
        p1.Apilar(5);
        System.out.println("Cantidad de elementos en la pila: " + metodosPila.ContarElementos(p1));        
    }
}
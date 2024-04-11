import api.PilaTDA;
import algoritmos.MetodosPila;
import impl.PilaDinamica;
public class TP1_TDApila_ej2_F {
    public static void main(String[] args) {
        PilaTDA p1 =new PilaDinamica();
        p1.InicializarPila();

        p1.Apilar(1);
        p1.Apilar(2);
        p1.Apilar(3);
        p1.Apilar(4);
        
        int promedio= MetodosPila.Sumatoria(p1)/MetodosPila.ContarElementos(p1);
        System.out.println("El promedio de los elementos de la pila es: "+promedio);
        
    }
}
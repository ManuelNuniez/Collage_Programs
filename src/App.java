import api.PilaTDA;
import impl.PilaDinamica;
import algoritmos.metodosPila;

public class App {
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

        
        while (!p2.PilaVacia()){
            System.out.println(p2.Tope());
            p2.Desapilar();
        }
        
    }
}

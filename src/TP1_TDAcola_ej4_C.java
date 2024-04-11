import algoritmos.MetodosCola;
import api.ColaTDA;
import impl.ColaDinamica;

public class TP1_TDAcola_ej4_C {
    public static void main(String[] args){
        ColaTDA c1 = new ColaDinamica();
        c1.InicializarCola();

        System.out.println("    cola original:");
        c1.Acolar(1);
        c1.Acolar(2);
        c1.Acolar(3);
        c1.Acolar(4);
        MetodosCola.ImprimirCola(c1);
        MetodosCola.InvertirCola(c1);

        System.out.println("cola invertida:");

        MetodosCola.ImprimirCola(c1);
    }
}

import algoritmos.MetodosCola;
import api.ColaTDA;
import impl.ColaDinamica;


public class PruebaColaDinamica {
    public static void main(String[] args) {
        ColaTDA c1 = new ColaDinamica();
        c1.InicializarCola();
        
        c1.Acolar(1);
        c1.Acolar(2);
        c1.Acolar(3);
        c1.Acolar(4);

        MetodosCola.ImprimirCola(c1);

        while(!c1.ColaVacia())
        {
            System.out.println(c1.PrimerElemento());
            c1.Desacolar();
        }
        
        
    }
}

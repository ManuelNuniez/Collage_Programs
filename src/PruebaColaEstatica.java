import api.ColaTDA;
import impl.ColaEstatica;

public class PruebaColaEstatica {
    public static void main(String[] args) {
        ColaTDA c1 = new ColaEstatica();
        c1.InicializarCola();
        
        c1.Acolar(1);
        c1.Acolar(2);
        c1.Acolar(3);
        c1.Acolar(4);

        while(!c1.ColaVacia())
        {
            System.out.println(c1.PrimerElemento());
            c1.Desacolar();
        }
        
        
    }
}

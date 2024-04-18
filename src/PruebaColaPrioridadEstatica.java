import api.ColaPrioridadTDA;
import impl.ColaPrioridadEstatica;

public class PruebaColaPrioridadEstatica {
    public static void main(String[] args) throws Exception
    {
        ColaPrioridadTDA cp1 = new ColaPrioridadEstatica();
        cp1.InicializarCola();

        cp1.Acolar(4,2);
        cp1.Acolar(5, 4);
        cp1.Acolar(3, 2);
        cp1.Acolar(1, 1);
        cp1.Acolar(7, 3);
        //deberia imprimir 5-7-4-3-1

        while(!cp1.ColaVacia())
        {
            System.out.println(cp1.PrimerElemento());
            cp1.Desacolar();
        }
    }
}

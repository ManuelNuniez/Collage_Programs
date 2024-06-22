import algoritmos.MetodosColaPrioridad;
import api.ColaPrioridadTDA;
import impl.ColaPrioridadDinamica;
public class PruebaColaPrioridadDinámica {
    public static void main(String[] args) throws Exception
    {
        ColaPrioridadTDA cp1 = new ColaPrioridadDinamica();
        cp1.InicializarCola(true);

        cp1.Acolar(4,2);
        cp1.Acolar(5, 4);
        cp1.Acolar(3, 2);
        cp1.Acolar(1, 1);
        cp1.Acolar(7, 3);
        //no anda
        // tiene que imprimir 5-7-4-3-1

        System.out.println(cp1.Prioridad());

        MetodosColaPrioridad.Imprimir(cp1);
        System.out.println("segunda impresion");
        MetodosColaPrioridad.Imprimir(cp1);

        // System.out.println("primer elemento: " + cp1.PrimerElemento()+ "  Prioridad: " + cp1.Prioridad());
        // while(!cp1.ColaVacia())
        // {
        //     System.out.println("elemento: " + cp1.PrimerElemento() + "  prioridad: " + cp1.Prioridad() );
        //     cp1.Desacolar();
            
        // }
    }

}

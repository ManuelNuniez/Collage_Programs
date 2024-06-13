import impl.ColaPrioridadDinamica;
import impl.ColaPrioridadHeap;
import impl.MaxHeap;
import impl.MaxHeapPrio;
import impl.MinHeap;
import impl.ValPrio;
import algoritmos.MetodosColaPrioridad;
import api.ColaPrioridadTDA;
import api.HeapTDA;
import api.PrioHeapTDA;

public class PruebaColaPrioHeap {
    public static void main(String[] args) {

        ColaPrioridadTDA cp1 = new ColaPrioridadHeap();
        cp1.InicializarCola();

        cp1.Acolar(4,2);
        cp1.Acolar(5, 4);
        cp1.Acolar(3, 2);
        cp1.Acolar(1, 1);
        cp1.Acolar(7, 3);
        //no anda
        // tiene que imprimir 5-7-4-3-1

        System.out.println(cp1.Prioridad());
        System.out.println(cp1.PrimerElemento());

        

        MetodosColaPrioridad.Imprimir(cp1);
        cp1.Desacolar();
        cp1.Desacolar();
        System.out.println("segunda impresion");
        MetodosColaPrioridad.Imprimir(cp1);
    }


}

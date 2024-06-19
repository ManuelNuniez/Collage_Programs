//import impl.MaxHeap;
import impl.MinHeap;
import api.HeapTDA;

public class PruebaHeaps {
    public static void main(String[] args) {
        HeapTDA mx = new MinHeap();
        mx.InicializarHeap();

        System.out.println(mx.HeapVacio());
        

        mx.AgregarH(10);
        mx.AgregarH(2);
        mx.AgregarH(4);
        mx.AgregarH(5);
        mx.AgregarH(11);
        mx.AgregarH(3);
        mx.AgregarH(5);
        mx.AgregarH(11);

        System.out.println(mx.PrimerValor());
        mx.SacarH();
        System.out.println(mx.PrimerValor());

        
    }

}

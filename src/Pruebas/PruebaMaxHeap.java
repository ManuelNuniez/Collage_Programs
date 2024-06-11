import impl.MaxHeap;
import api.HeapTDA;

public class PruebaMaxHeap {
    public static void main(String[] args) {
        HeapTDA mx = new MaxHeap();
        mx.InicializarHeap();

        mx.AgregarH(10);
        mx.AgregarH(2);
        mx.AgregarH(4);
        mx.AgregarH(5);
        mx.AgregarH(11);
        mx.AgregarH(3);
        mx.AgregarH(5);
        mx.AgregarH(11);

        mx.SacarH();

        
    }

}

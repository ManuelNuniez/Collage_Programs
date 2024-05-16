
import Arbol.*;
import algoritmos.MetodosArbolBB;


public class PruebaArbolBB {
    public static void main(String[] args){
        ArbolBBTDA a = new ArbolBB();
        a.InicializarArbol();

        ArbolBBTDA b =new ArbolBB();
        b.InicializarArbol();

        a.AgregarElem(20);
        a.AgregarElem(10);
        a.AgregarElem(35);
        a.AgregarElem(1);
        a.AgregarElem(18);
        a.AgregarElem(26);
        a.AgregarElem(40);
        a.AgregarElem(14);

        b.AgregarElem(18);
        b.AgregarElem(9);
        b.AgregarElem(24);
        b.AgregarElem(3);
        b.AgregarElem(11);
        b.AgregarElem(10);
        b.AgregarElem(20);
        b.AgregarElem(27);

        
        // b.AgregarElem(20);
        // b.AgregarElem(10);
        // b.AgregarElem(35);
        // b.AgregarElem(1);
        // b.AgregarElem(18);
        // a.AgregarElem(26);
        // b.AgregarElem(40);
        // b.AgregarElem(14);

        
        System.out.println(MetodosArbolBB.ElementoAnterior(a,18));

        

        

    }

}

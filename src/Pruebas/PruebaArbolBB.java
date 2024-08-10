

import algoritmos.MetodosArbolBB;
import algoritmos.MetodosConjunto;
import api.ArbolBBTDA;
import api.ConjuntoTDA;
import impl.ArbolBB;


public class PruebaArbolBB {
    public static void main(String[] args){
        ArbolBBTDA a = new ArbolBB();
        a.InicializarArbol();

        ArbolBBTDA b =new ArbolBB();
        b.InicializarArbol();

        ArbolBBTDA c = new ArbolBB();
        c.InicializarArbol();

        a.AgregarElem(20);
        a.AgregarElem(10);
        a.AgregarElem(35);
        a.AgregarElem(1);
        a.AgregarElem(18);
        a.AgregarElem(26);
        a.AgregarElem(40);
        a.AgregarElem(14);

        
        b.AgregarElem(8);
        b.AgregarElem(4);
        b.AgregarElem(12);
        b.AgregarElem(3);
        b.AgregarElem(5);
        b.AgregarElem(1);
        b.AgregarElem(10);
        b.AgregarElem(15);
        b.AgregarElem(9);
        b.AgregarElem(11);
        b.AgregarElem(2);

        c.AgregarElem(8);
        c.AgregarElem(4);
        c.AgregarElem(12);
        c.AgregarElem(1);
        c.AgregarElem(5);
        c.AgregarElem(10);
        c.AgregarElem(15);
        c.AgregarElem(9);
        c.AgregarElem(11);


        
        // MetodosArbolBB.PadreHoja(c);
        // System.out.println(MetodosArbolBB.PadreInmediato(b,1));
        // MetodosArbolBB.AncestroComun(b, 9,12);
        // MetodosArbolBB.AncestroComun(b, 1, 11);
        ConjuntoTDA conj = MetodosArbolBB.ElementosMenores(c, 12);
        MetodosConjunto.ImprimirConjunto(conj);
        System.out.println( );
        

        

        

    }

}

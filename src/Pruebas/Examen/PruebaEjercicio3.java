package Examen;

import api.ArbolBBTDA;
import impl.ArbolBB;

public class PruebaEjercicio3 {
    public static void main(String[] args) {
        ArbolBBTDA a = new ArbolBB();
        a.InicializarArbol();

        a.AgregarElem(20);
        a.AgregarElem(10);
        a.AgregarElem(35);
        a.AgregarElem(1);
        a.AgregarElem(18);
        a.AgregarElem(26);
        a.AgregarElem(40);
        a.AgregarElem(14);
        

        Ejericico3Metodo.ParesMayorMenor(a);
        
    }
}

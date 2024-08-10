package Simulacro1erParcial;

import algoritmos.MetodosCola;

public class MainListaPromediada {
    public static void main(String[] args){
        ListaPromediadaTDA lp = new ListaPromediada();
        lp.inicializar();

        lp.AgregarValor(4);
        lp.AgregarValor(1);
        lp.AgregarValor(3);
        lp.AgregarValor(2);
        lp.AgregarValor(4);

        System.out.println(lp.Promedio());
        System.out.println("Cola de valores mayores al promedio");
        MetodosCola.ImprimirCola(lp.Mayores());
        System.out.println("cola de valores menores al promedio");
        MetodosCola.ImprimirCola(lp.Menores());
        
        System.out.println(lp.EstaVacia());

        lp.eliminar(3);
        lp.eliminar(4);

        
        System.out.println("Cola de valores mayores al promedio");
        MetodosCola.ImprimirCola(lp.Mayores());
        System.out.println("cola de valores menores al promedio");
        MetodosCola.ImprimirCola(lp.Menores());



    }   
}

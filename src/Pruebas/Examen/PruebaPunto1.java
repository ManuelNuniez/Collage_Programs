package Examen;

import algoritmos.MetodosCola;
import algoritmos.MetodosConjunto;
import api.*;
import impl.*;


public class PruebaPunto1 {
    public static void main(String[] args) {
        ConjuntoTDA conjA = new ConjuntoDinamico();
        conjA.InicializarConjunto();

        ConjuntoTDA conjB = new ConjuntoDinamico();
        conjB.InicializarConjunto();

        conjA.Agregar(1);
        conjA.Agregar(2);
        conjA.Agregar(3);

        conjB.Agregar(5);
        conjB.Agregar(6);

        System.out.println("Conjunto A: ");
        MetodosConjunto.ImprimirConjunto(conjA);
        System.out.println();

        System.out.println("ConjuntoB: ");
        MetodosConjunto.ImprimirConjunto(conjB);
        System.out.println();

        System.out.println("el producto entre los dos conjuntos es: ");
        ColaTDA producto = MetodoPunto1.ProductoCartesiano(conjA, conjB);
        MetodosCola.ImprimirCola(producto);
        System.out.println();
        
    }

    
    


    
}

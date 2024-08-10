package Examen;

import algoritmos.MetodosConjunto;
import api.ColaTDA;
import api.ConjuntoTDA;
import impl.ColaDinamica;

public class MetodoPunto1 {
    public static ColaTDA ProductoCartesiano(ConjuntoTDA a, ConjuntoTDA b){

        ColaTDA producto = new ColaDinamica();

        int elementoA;
        int elementoB;

        while (!a.ConjuntoVacio()) {
            elementoA = a.Elegir();
            a.Sacar(elementoA);

            ConjuntoTDA copiaB = MetodosConjunto.CopiarConjunto(b);

            while (!copiaB.ConjuntoVacio()) {

                elementoB = copiaB.Elegir();
                copiaB.Sacar(elementoB);

                producto.Acolar(elementoA);
                producto.Acolar(elementoB);

            }

            
        }

        return producto;
    }
    
}

package Examen;

import api.ConjuntoTDA;
import api.PilaTDA;
import impl.ConjuntoDinamico;
import impl.PilaDinamica;

public class PruebaUniversoAcotado {

    private static void Imprimir(UniversoAcotadoTDA u){
        PilaTDA aux = new PilaDinamica();

        while (!u.ConjuntoVacio()) {

            int elm = u.Elegir();
            u.Sacar(elm);
            aux.Apilar(elm);
            System.out.print(elm + ",");

            
        }

        while (!aux.PilaVacia()) {
            u.Agregar(aux.Tope());
            aux.Desapilar();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        UniversoAcotadoTDA marvel = new UniversoAcotado();
        marvel.InicializarUniverso(6);
        marvel.Agregar(1);
        marvel.Agregar(3);
        marvel.Agregar(5);
        marvel.Agregar(2);
        System.out.println("Universo acotado de 0 a 5 incluido: ");
        Imprimir(marvel);

        System.out.println("elegimos un numero: " + marvel.Elegir());

        marvel.Sacar(2);
        System.out.println("sacamos el 2: ");


        Imprimir(marvel);

        System.out.println("el complemento del universo acotado mostrado anteriormente es: ");
        Imprimir(marvel.Complemento());
    }
}

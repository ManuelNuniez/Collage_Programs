package algoritmos;

import api.ConjuntoTDA;
import api.DiccionarioMultipleTDA;

public class MetodosDiccMultiple {
    public static void ImprimirMultipleDiccionario(DiccionarioMultipleTDA Original){

        ConjuntoTDA claves=Original.Claves();
        
        while (!claves.ConjuntoVacio()) {
            int x=claves.Elegir();
            ConjuntoTDA valores= Original.Recuperar(x);
            System.out.print(x + ": ");
            MetodosConjunto.ImprimirConjunto(valores);
            System.out.println();
            claves.Sacar(x);
        }
    }

}

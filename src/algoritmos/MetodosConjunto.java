package algoritmos;

import api.ConjuntoTDA;
import impl.ConjuntoDinamico;

public class MetodosConjunto {
    
    public static void ImprimirConjunto(ConjuntoTDA original){

        if (original.ConjuntoVacio()) {
            System.out.println("conjunto vacio");
        }else{
            ConjuntoTDA c=CopiarConjunto(original);
            while (!c.ConjuntoVacio()) {
                int x=c.Elegir();
                System.out.print(" " + x);
                c.Sacar(x);
            }
        }
    }

    public static ConjuntoTDA CopiarConjunto(ConjuntoTDA original){
        ConjuntoTDA copia = new ConjuntoDinamico();
        copia.InicializarConjunto();

        ConjuntoTDA aux = new ConjuntoDinamico();
        aux.InicializarConjunto();

        while (!original.ConjuntoVacio()) {
            int x = original.Elegir();
            original.Sacar(x);
            
            aux.Agregar(x);
            copia.Agregar(x);
        }
        while (!aux.ConjuntoVacio()) {
            int x = aux.Elegir();
            aux.Sacar(x);

            original.Agregar(x);
        }

        return copia;

    }
}

package algoritmos;

import api.ConjuntoTDA;
import api.DiccionarioSimpleTDA;
import impl.DiccionarioSimpleDinamico;

public class MetodosDiccSimple {
    public static void ImprimirSimpleDiccionario(DiccionarioSimpleTDA original){
        DiccionarioSimpleTDA d = new DiccionarioSimpleDinamico();
        d.InicializarDiccionario();
        d=original;
        ConjuntoTDA claves= d.Claves();

        while (!claves.ConjuntoVacio()) {
            int x= claves.Elegir();
            System.out.println(x + ": " + d.Recuperar(x));
            claves.Sacar(x);
        }
        
    }
}

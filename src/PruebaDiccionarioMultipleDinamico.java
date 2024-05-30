import algoritmos.MetodosConjunto;
import algoritmos.MetodosDiccMultiple;
import api.ConjuntoTDA;
import api.DiccionarioMultipleTDA;
import impl.DiccionarioMultipleDinamico;


public class PruebaDiccionarioMultipleDinamico {
    public static void main(String[] Args){
        DiccionarioMultipleTDA dicc=new DiccionarioMultipleDinamico();
        dicc.InicializarDiccionario();

        dicc.Agregar(1, 32);
        dicc.Agregar(1, 2);
        dicc.Agregar(1, 212);
        dicc.Agregar(2, 0);
        dicc.Agregar(2, 123);
        dicc.Agregar(2,1);
        dicc.Agregar(3, 0);

        MetodosDiccMultiple.ImprimirMultipleDiccionario(dicc);
        System.out.println("segunda impresion");
        
        
        dicc.EliminarValor(1,2);
        dicc.Eliminar(3);

        MetodosDiccMultiple.ImprimirMultipleDiccionario(dicc);

        
        MetodosConjunto.ImprimirConjunto(dicc.Claves());
        System.out.println();
        MetodosConjunto.ImprimirConjunto(dicc.Recuperar(1));
        System.out.println();
        MetodosConjunto.ImprimirConjunto(dicc.Recuperar(2));
        System.out.println();
        
    }

}

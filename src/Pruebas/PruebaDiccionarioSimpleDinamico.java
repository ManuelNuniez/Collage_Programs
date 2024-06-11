import api.DiccionarioSimpleTDA;
import impl.DiccionarioSimpleDinamico;
import algoritmos.MetodosConjunto;
import algoritmos.MetodosDiccSimple;

public class PruebaDiccionarioSimpleDinamico {
    public static void main(String[] Args){
        DiccionarioSimpleTDA dicc=new DiccionarioSimpleDinamico();
        dicc.InicializarDiccionario();
        
        dicc.Agregar(1, 1);
        dicc.Agregar(2, 2);
        dicc.Agregar(3, 3);
        dicc.Agregar(4,4 );
        dicc.Agregar(5, 5);

        MetodosDiccSimple.ImprimirSimpleDiccionario(dicc);

        MetodosConjunto.ImprimirConjunto(dicc.Claves());
        System.out.println();

        System.out.println(dicc.Recuperar(2));

        dicc.Eliminar(3);
        dicc.Eliminar(2);
        

        System.out.println("segunda impresión");
        MetodosDiccSimple.ImprimirSimpleDiccionario(dicc);

        



        
        
    }

}

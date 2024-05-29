import algoritmos.MetodosDiccMultiple;
import api.ConjuntoTDA;
import api.DiccionarioMultipleTDA;
import impl.DiccionarioMultipleDinamico;
import impl.DiccionarioMultipleEstatico;

public class PruebaDiccionarioMultipleDinamico {
    public static void main(String[] Args){
        DiccionarioMultipleTDA dicc=new DiccionarioMultipleDinamico();
        dicc.InicializarDiccionario();

        dicc.Agregar(1, 1);
        dicc.Agregar(1, 2);
        dicc.Agregar(1, 0);
        dicc.Agregar(2, 0);
        dicc.Agregar(2, 0);
        dicc.Agregar(2,1);
        dicc.Agregar(3, 0);

        MetodosDiccMultiple.ImprimirMultipleDiccionario(dicc);

        dicc.EliminarValor(1,2);
        dicc.Eliminar(3);

        ConjuntoTDA claves=dicc.Claves();
        ConjuntoTDA valores=dicc.Recuperar(1);
        ConjuntoTDA valores2=dicc.Recuperar(2);
        
    }

}

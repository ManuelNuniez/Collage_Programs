import api.ConjuntoTDA;
import api.DiccionarioSimpleTDA;
import impl.DiccionarioSimpleEstatico;

public class PruebaDiccionarioSimpleEstatico {
    public static void main(String[] Args){
        DiccionarioSimpleTDA dicc=new DiccionarioSimpleEstatico();
        dicc.InicializarDiccionario();
        
        dicc.Agregar(1, 1);
        dicc.Agregar(2, 2);
        dicc.Agregar(3, 3);

        ConjuntoTDA claves= dicc.Claves();
        while (!claves.ConjuntoVacio()) {
            int a=claves.Elegir();
            System.out.println("clave: "+ a);
            System.out.println("  valor: "+ dicc.Recuperar(a));
            claves.Sacar(a);
            dicc.Eliminar(a);
        }
        
    }

}

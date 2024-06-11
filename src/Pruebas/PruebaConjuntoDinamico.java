import api.ConjuntoTDA;
import impl.ConjuntoDinamico;


public class PruebaConjuntoDinamico {
    public static void main(String[] args){
        ConjuntoTDA conj1 =new ConjuntoDinamico();
        conj1.InicializarConjunto();
        conj1.Agregar(1);
        conj1.Agregar(2);
        conj1.Agregar(3);
        conj1.Agregar(4);
        conj1.Agregar(5);
        conj1.Agregar(7);
        conj1.Agregar(9);
        conj1.Agregar(8);
        

        while(!conj1.ConjuntoVacio()){
            int a=conj1.Elegir();
            System.out.println(a);
            conj1.Sacar(a);
        }
    }

}

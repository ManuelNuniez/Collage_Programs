import api.ConjuntoTDA;
import impl.ConjuntoEstatico;


public class PruebaConjuntoEstatico {
    public static void main(String[] args){
        ConjuntoTDA conj1 =new ConjuntoEstatico();
        conj1.InicializarConjunto();
        conj1.Agregar(1);
        conj1.Agregar(2);
        conj1.Agregar(3);
        conj1.Agregar(4);

        while(!conj1.ConjuntoVacio()){
            int a=conj1.Elegir();
            System.out.println(a);
            conj1.Sacar(a);
        }
    }

}

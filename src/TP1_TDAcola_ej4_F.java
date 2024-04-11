import algoritmos.MetodosCola;
import api.ColaTDA;
import impl.ColaDinamica;

public class TP1_TDAcola_ej4_F {
    public static void main(String[] args){
        ColaTDA c1 = new ColaDinamica();
        c1.InicializarCola();
        ColaTDA c2 = new ColaDinamica();
        c2.InicializarCola();

        System.out.println("cola 1:");
        c1.Acolar(1);
        c1.Acolar(2);
        c1.Acolar(3);
        c1.Acolar(4);
        MetodosCola.ImprimirCola(c1);

        System.out.println("cola 2");
        c2.Acolar(4);
        c2.Acolar(3);
        c2.Acolar(2);
        c2.Acolar(1);
        MetodosCola.ImprimirCola(c2);

        if(MetodosCola.SonInversas(c1,c2)){
            System.out.println("las colas son inversas");
        }else{
            System.out.println("las colas no son inversas");
        }
    }

}

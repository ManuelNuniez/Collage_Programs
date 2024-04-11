import algoritmos.MetodosCola;
import api.ColaTDA;
import impl.ColaDinamica;

public class TP1_TDAcola_ej4_E {
    public static void main(String[] args){
        ColaTDA c1 = new ColaDinamica();
        c1.InicializarCola();
        ColaTDA c2 = new ColaDinamica();
        c2.InicializarCola();

        System.out.println("cola 1:");
        c1.Acolar(1);
        c1.Acolar(2);
        c1.Acolar(2);
        c1.Acolar(1);
        MetodosCola.ImprimirCola(c1);

        if(MetodosCola.EsCapicua(c1)){
            System.out.println("la cola es capicua");
        }else{
            System.out.println("la cola no es capicua");
        }
    }

}

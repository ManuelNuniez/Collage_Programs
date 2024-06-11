import api.ColaTDA;
import impl.ColaDinamica;
import algoritmos.MetodosCola;

public class TP1_TDAcola_ej4_A {
    public static void main (String[] args){
        ColaTDA c1 = new ColaDinamica();
        ColaTDA c2 = new ColaDinamica();
        c1.InicializarCola();
        c2.InicializarCola();

        System.out.println("    colas originales:");
        c1.Acolar(1);
        c1.Acolar(2);
        c1.Acolar(3);
        c1.Acolar(4);
        System.out.println("cola 1:");
        MetodosCola.ImprimirCola(c1);
        System.out.println("cola 2:");
        MetodosCola.ImprimirCola(c2);
        /*if (c2.ColaVacia()){
            MetodosCola.CopiarCola(c1, c2);

        }else{
            System.out.println("la segunda cola debe estar vacia para copiarle contenido");
        }*/

        MetodosCola.PasarCola(c1, c2);

        System.out.println("    cola pasadas:");
        System.out.println("cola 1:");
        MetodosCola.ImprimirCola(c1);
        System.out.println("cola 2:");
        MetodosCola.ImprimirCola(c2);

    }

}

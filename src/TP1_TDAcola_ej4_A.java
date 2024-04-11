import api.ColaTDA;
import impl.ColaDinamica;
import algoritmos.MetodosCola;



public class TP1_TDAcola_ej4_A {
    public static void main (String[] args){
        ColaTDA c1 = new ColaDinamica();
        ColaTDA c2 = new ColaDinamica();
        c1.InicializarCola();
        c2.InicializarCola();

        System.out.println("primera cola:");
        c1.Acolar(1);
        c1.Acolar(2);
        c1.Acolar(3);
        c1.Acolar(4);
        MetodosCola.ImprimirCola(c1);


        if (c2.ColaVacia()){
            MetodosCola.CopiarCola(c1, c2);

        }else{
            System.out.println("la segunda cola debe estar vacia para copiarle contenido");
        }

        System.out.println("segunda cola:");
        MetodosCola.ImprimirCola(c2);

    }

}

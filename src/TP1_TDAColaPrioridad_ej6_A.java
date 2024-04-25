import api.ColaPrioridadTDA;
import impl.ColaPrioridadDinamica;
import algoritmos.MetodosColaPrioridad;


public class TP1_TDAColaPrioridad_ej6_A {
    public static void main(String[] args){
        
        ColaPrioridadTDA cp1 = new ColaPrioridadDinamica();
        ColaPrioridadTDA cp2 = new ColaPrioridadDinamica();
        cp1.InicializarCola();
        cp2.InicializarCola();

        cp1.Acolar(4,2);
        cp1.Acolar(5, 5);
        cp1.Acolar(3, 3);
        cp1.Acolar(1, 1);
        cp1.Acolar(7, 4);

        cp2.Acolar(1, 2);
        cp2.Acolar(31, 10);
        cp2.Acolar(0, 0);


        MetodosColaPrioridad.Imprimir(cp1);
        System.out.println("-----------Segunda Cola:");
        MetodosColaPrioridad.Imprimir(cp2);

        System.out.println("pasando la cola 2 a la cola 1");
        MetodosColaPrioridad.CombinarColas(cp1, cp2);

        MetodosColaPrioridad.Imprimir(cp1);

    }

}

import api.ColaPrioridadTDA;
import impl.ColaPrioridadDinamica;
import algoritmos.MetodosColaPrioridad;

public class TP1_TDAColaPrioridad_ej6_B {
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

        cp2.Acolar(4,2);
        cp2.Acolar(5, 5);
        cp2.Acolar(3, 3);
        cp2.Acolar(1, 1);
        cp2.Acolar(7, 4);


        MetodosColaPrioridad.Imprimir(cp1);
        System.out.println("-----------Segunda Cola:");
        MetodosColaPrioridad.Imprimir(cp2);

        

        if(MetodosColaPrioridad.SonIguales(cp1, cp2)){
            System.out.println("las colas son iguales");
        }
        else{
            System.out.println("las colas no son iguales");
        }

    }
}

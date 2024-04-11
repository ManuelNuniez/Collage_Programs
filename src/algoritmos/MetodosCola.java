package algoritmos;

import api.ColaTDA;
import impl.ColaDinamica;




public class MetodosCola {

    public static void ImprimirCola(ColaTDA cola){
        ColaTDA aux = new ColaDinamica();
        aux.InicializarCola();

        while(!cola.ColaVacia()){//desacolamos la cola para imprimir, elemento a elemento
            System.out.println(cola.PrimerElemento());
            aux.Acolar(cola.PrimerElemento());
            cola.Desacolar();
        }

        while(!aux.ColaVacia()){//recuperamos la cola original
            cola.Acolar(aux.PrimerElemento());
            aux.Desacolar();

        }


    }

    //Metodo que copia una cola en otra, la pila destino debe estar vacia,
    public static void CopiarCola(ColaTDA origen, ColaTDA destino) {
        ColaTDA aux = new ColaDinamica();
        aux.InicializarCola();

        while (!origen.ColaVacia()){ //mueve la cola de origen a una auxiliar y a la destino
            aux.Acolar(origen.PrimerElemento());
            destino.Acolar(origen.PrimerElemento());
            origen.Desacolar();
        }

        while (!aux.ColaVacia()){ //recupera la a la original
            origen.Acolar(aux.PrimerElemento());
            aux.Desacolar();
        }

    }
    
    public void InvertirCola(ColaTDA cola) {

    }
}

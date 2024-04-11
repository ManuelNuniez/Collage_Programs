package algoritmos;
import api.ColaTDA;
import impl.ColaDinamica;

import api.PilaTDA;
import impl.PilaDinamica;



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

    //pasar una cola a otra, la segunda puede estar vacia o no, la original se pierde
    public static void PasarCola(ColaTDA origen, ColaTDA destino){

        while (!origen.ColaVacia()){
            destino.Acolar(origen.PrimerElemento());
            origen.Desacolar();
        }
    }

    //Metodo que copia una cola en otra, la pila original se conserva, la cola destino puede estar vacia o no
    public static void CopiarCola(ColaTDA origen, ColaTDA destino) {
        ColaTDA aux = new ColaDinamica();
        aux.InicializarCola();

        while (!origen.ColaVacia()){ //mueve la cola de origen a una auxiliar y a la destino
            aux.Acolar(origen.PrimerElemento());
            destino.Acolar(origen.PrimerElemento());
            origen.Desacolar();
        }

        while (!aux.ColaVacia()){ //recupera la original
            origen.Acolar(aux.PrimerElemento());
            aux.Desacolar();
        }

    }

    public static void InvertirCola(ColaTDA cola) {// usando pila
        PilaTDA aux = new PilaDinamica();
        aux.InicializarPila();

        while(!cola.ColaVacia()){//pasamos la cola a la pila
            aux.Apilar(cola.PrimerElemento());
            cola.Desacolar();
        }

        while(!aux.PilaVacia()){//pasamos la pila a la cola, queda en orden inverso
            cola.Acolar(aux.Tope());
            aux.Desapilar();
        }
        
    }

    public static boolean TerminanIgual(ColaTDA cola1, ColaTDA cola2){
        boolean terminanIgual=false;
        MetodosCola.InvertirCola(cola1);
        MetodosCola.InvertirCola(cola2);
        if(cola1.PrimerElemento()== cola2.PrimerElemento()){
            terminanIgual=true;
        }
        return terminanIgual;

    }

    public static boolean EsCapicua(ColaTDA cola){
        boolean esCapicua = true;
        ColaTDA aux = new ColaDinamica();
        aux.InicializarCola();
        MetodosCola.CopiarCola(cola, aux);
        MetodosCola.InvertirCola(aux);
        while(esCapicua && !aux.ColaVacia()){
            if(cola.PrimerElemento()==aux.PrimerElemento()){
                cola.Desacolar();
                aux.Desacolar();
            }
            else{
                esCapicua=false;
            }
        }

        return esCapicua;
    }

    public static boolean SonInversas(ColaTDA cola1,ColaTDA cola2){
        boolean esInversa = true;
        MetodosCola.InvertirCola(cola2);
        while(esInversa && !cola1.ColaVacia()){
            if(MetodosCola.TerminanIgual(cola1, cola2)){
                cola1.Desacolar();
                cola2.Desacolar();
            }else{
                esInversa=false;
            }
        }
        return esInversa;
    }


}

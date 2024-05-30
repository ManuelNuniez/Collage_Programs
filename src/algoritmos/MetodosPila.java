package algoritmos;

import api.PilaTDA;
import impl.PilaDinamica;
public class MetodosPila {

    public static void InvertirPila(PilaTDA origen){
        PilaTDA aux =new PilaDinamica();
        aux.InicializarPila();

        MetodosPila.CopiarPila(origen, aux);

        while (!origen.PilaVacia()) {
            origen.Desapilar();
        }

        while (!aux.PilaVacia()) {
            origen.Apilar(aux.Tope());
            aux.Desapilar();
        }


    }
    public static void CopiarPila(PilaTDA origen, PilaTDA destino){
        PilaTDA aux =new PilaDinamica();
        aux.InicializarPila();

        while (!origen.PilaVacia()) {//mueve la pila de origen a una auxiliar(queda invertida en aux)
            aux.Apilar(origen.Tope());
            origen.Desapilar();
        }

        while (!aux.PilaVacia()) {/*while que recupera la pila invertida a la original y a una copia */
            origen.Apilar(aux.Tope());
            destino.Apilar(aux.Tope());
            aux.Desapilar();
        }
        
    }

    public static void ImprimirPila(PilaTDA pilaOriginal){
        if (!pilaOriginal.PilaVacia()) {

            int elem = pilaOriginal.Tope();
            System.out.println(elem);

            pilaOriginal.Desapilar();

            ImprimirPila(pilaOriginal);
            
            pilaOriginal.Apilar(elem);
        }
    }

    public static int ContarElementos(PilaTDA pila){
        PilaTDA aux= new PilaDinamica();
        aux.InicializarPila();
        int cont = 0;

        while(!pila.PilaVacia())
        {
            aux.Apilar(pila.Tope());
            pila.Desapilar();
            cont++;
        }

        while(!aux.PilaVacia())
        {
            pila.Apilar(aux.Tope());
            aux.Desapilar();
        }
        return cont;
    }

    public static int Sumatoria(PilaTDA pila){
        PilaTDA aux = new PilaDinamica();
        aux.InicializarPila();
        int suma = 0;

        while(!pila.PilaVacia())
        {
            aux.Apilar(pila.Tope());
            suma += pila.Tope();
            pila.Desapilar();
        }

        while(!aux.PilaVacia())
        {
            pila.Apilar(aux.Tope());
            aux.Desapilar();
        }
        return suma;
    }

}

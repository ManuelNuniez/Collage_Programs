package Examen;

import Arbol.ArbolBBTDA;

public class Ejericico3Metodo {
    public static void ParesMayorMenor(ArbolBBTDA arbol){
        if(!arbol.ArbolVacio()){

            ParesMayorMenor(arbol.HijoDer());

            if(arbol.Raiz()%2 ==0){

                System.out.println(arbol.Raiz());
            }
            ParesMayorMenor(arbol.HijoIzq());
        }
    }
}

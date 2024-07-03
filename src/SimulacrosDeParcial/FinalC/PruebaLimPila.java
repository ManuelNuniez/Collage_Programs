package FinalC;

import algoritmos.MetodosPila;

public class PruebaLimPila {
    public static void main(String[] args) {
        LimPilaTDA a = new LimPila();
        a.InicializarPila(3);

        System.out.println(a.PilaVacia());
        System.out.println(a.PilaLlena());
        a.Apilar(1);
        a.Apilar(2);
        a.Apilar(3);

        System.out.println(a.Tope());
        
        a.Apilar(4);
        
        System.out.println(a.PilaVacia());
        System.out.println(a.PilaLlena());
        
        System.out.println(a.Tope());
        
        System.out.println(a.Capacidad());

    }
}

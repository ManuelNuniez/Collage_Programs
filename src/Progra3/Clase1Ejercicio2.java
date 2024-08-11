package Progra3;

public class Clase1Ejercicio2 {

    public static int CalcularRaiz(int n){
        if (n == 1) {
            return n;
        }
        int inicio = 1;
        int fin=n/2;
        int resultado=1;
        while (inicio <= fin && fin*fin != n) {
            int medio = (inicio + fin)/2;

            if (medio*medio < n) {

                inicio = medio;
                resultado = medio;

            }else{

                fin = medio;
                resultado = medio;

            }
        }

        return resultado;

        
    }

    public static void main(String[] args) {
        int n = 18;
        System.out.println(CalcularRaiz(n));
    }
}

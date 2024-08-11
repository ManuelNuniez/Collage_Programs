package Progra3;

public class Clase1Ejercicio1 {

    public static void ArmarLista (int[] vect, int len ){
        for (int i = 0; i < len; i++){
            vect[i] = i;
        }

        vect[6]=5;
    }

    public static int BuscarRepetido(int[] vect,int len){
        int act = 1;
        int prev = 0;
        while (vect[act] != vect[prev] && act < len) {
            act++;
            prev++;
        }
        return act;
    }

    public static void main(String[] args) {
        int n = 10;
        int[] productores = new int[n];

        ArmarLista(productores,n);
        int pos = BuscarRepetido(productores,n);
        System.out.printf("el productor %d esta repetido en la posicion %d", productores[pos],pos);

    }
}

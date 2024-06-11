package impl;

import java.util.Vector;

import api.HeapTDA;

public class MinHeap implements HeapTDA{
    int[] vector;
    int i;
    int tamaño;

    @Override
    public void InicializarHeap() {
        tamaño=2;
        vector= new int[tamaño ];
        i=0;
    }

    private void ResetVector(){
        int[] vectorNuevo = new int[tamaño*10];
        for(int j =0; j<i;j++){
            vectorNuevo[j]=vector[j];
        }
        vector=vectorNuevo;
        tamaño=tamaño*10;
    }


    @Override
    public void AgregarH(int valor) {
        if (i==tamaño) {
            ResetVector();
        }

        vector[i]=valor;
        i++;
        int newPos=i-1;
        int padrePos = (newPos-1)/2;

        while (vector[padrePos]> vector[newPos]) {
            int aux = vector[padrePos];
            vector[padrePos]=vector[newPos];
            vector[newPos] = aux;
            
            newPos = padrePos;
            padrePos= (newPos -1)/2;
        }
    }

    @Override
    public void SacarH() {
        i--;
        vector[0]=vector[i];

        int p =0;
        int hd=2;
        int hi=1;

        while (vector[p] > vector[hi] || vector[p] > vector[hi]) {
            if (vector[hi] < vector[hd]) {
                int aux= vector[p];
                vector[p] = vector[hi];
                vector[hi]= aux;

                p=hi;
                hi=2*p+1;//posicion del nuevo hijo izquierdo
                hd=2* p+2; //posicion del nuevo hijo derecho
            }else{
                int aux = vector[p];
                vector[p] = vector[hd];
                vector[hd]= aux;

                p=hd;
                hi=2*p+1;//posicion del nuevo hijo izquierdo
                hd=2* p+2; //posicion del nuevo hijo derecho
            }
            
        }
    }

    @Override
    public boolean HeapVacio() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'HeapVacio'");
    }

    @Override
    public int PrimerValor() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'PrimerValor'");
    }

}

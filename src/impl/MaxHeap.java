package impl;

import api.HeapTDA;

public class MaxHeap implements HeapTDA {
    int[] vector;
    int i;
    int tamaño;

    @Override
    public void InicializarHeap() {
        tamaño=2;
        vector= new int[tamaño];
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
        //averiguar hijo: 2(posicion padre) +1
        //averiguar padre: {(posicion hijo)-1}/2 
        if (i==tamaño) {
            ResetVector();
        }

        vector[i]=valor;
        i++;
        int newPos=i-1;
        int padrePos= (newPos - 1)/2;
        while (vector[padrePos]< vector[newPos]) {
            int aux = vector[padrePos];
            vector[padrePos] = vector[newPos];
            vector[newPos] = aux;

            newPos=padrePos;
            padrePos=(newPos - 1)/2;
        }
        
    }

    @Override
    public void SacarH() {
        i--;
        vector[0]=vector[i];
        int p=0;
        int hd= 2;
        int hi= 1;

        while (vector[p]<vector[hi] || vector[p]< vector[hd]) {
            if (vector[hi]>vector[hd]) {
                int aux= vector[p];
                vector[p]=vector[hi];
                vector[hi]= aux;

                p=hi;
                hi=2*p+1;
                hd=2*p+2;

            }else{
                int aux = vector[p];
                vector[p]=vector[hd];
                vector[hd]=aux;
                
                p=hd;
                hi=2*p+1;
                hd=2*p+2;
            }
            
        }
        
    }

    @Override
    public boolean HeapVacio() {
        return(i==0);
    }

    @Override
    public int PrimerValor() {
        return vector[0];
    }

}

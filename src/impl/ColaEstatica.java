package impl;

import api.ColaTDA;

public class ColaEstatica implements ColaTDA {
    int[] vector;
    int i;
    @Override
    public void InicializarCola() {
        vector = new int[100];
        i=0;
    }

    @Override
    public void Acolar(int n) {
        vector[i] = n;
        i++;
    }

    @Override
    public void Desacolar() {
       int cont;
        for(cont=0; cont < i + 1; cont++ )
        {
            vector[cont]= vector[cont+1];
        }
        i--;
    }

    @Override
    public int PrimerElemento() {
        return vector[0];
    }

    @Override
    public boolean ColaVacia() {
        return (i==0);
    }


    


}

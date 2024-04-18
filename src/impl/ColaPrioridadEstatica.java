package impl;
import api.ColaPrioridadTDA;

public class ColaPrioridadEstatica implements ColaPrioridadTDA {

    int[] vectorInfo;
    int[] vectorPrio;
    int i;
    @Override
    public void InicializarCola() {
        vectorInfo = new int[100];
        vectorPrio = new int[100];
        i=0;
    }

    @Override
    public void Acolar(int n, int prioridad) {
        int j = i-1;
    
        if (i == 0) {
            vectorInfo[i] = n;
            vectorPrio[i] = prioridad;
        }
        else {
            while (j >= 0 && vectorPrio[j] < prioridad) {
                vectorInfo[j + 1] = vectorInfo[j];
                vectorPrio[j + 1] = vectorPrio[j];
                j--;
            }
            vectorInfo[j + 1] = n;
            vectorPrio[j + 1] = prioridad;
        }
        i++;
    }
    

    @Override
    public void Desacolar() {
        int cont;
        for(cont=0; cont < i+1; cont++ )
        {
         vectorInfo[cont]= vectorInfo[cont+1];
         vectorPrio[cont]=vectorPrio[cont+1];
        }
        i--;
    }

    @Override
    public int PrimerElemento() {
        return vectorInfo[0];
    }

    @Override
    public boolean ColaVacia() {
        return(i==0);
    }

    @Override
    public int Prioridad() {
        return vectorPrio[0];
    }

}

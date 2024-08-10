package FinalC;

public class LimPila implements LimPilaTDA {

    int capacidad;
    int[] vector;
    int i;

    @Override
    public void InicializarPila(int x) {
        capacidad=x;
        vector = new int[capacidad];
        i=0;
    }

    @Override
    public void Apilar(int x) {
        if (i < capacidad) {
            vector[i] = x;
            i++;
        }else{
            for(int j = 0; j < i-1; j++){
                vector[j] = vector[j+1];
            }
            vector[i-1] = x;
        }
    }

    @Override
    public void Desapilar() {
        i--;
    }

    @Override
    public boolean PilaVacia() {
        return i==0;
    }

    @Override
    public boolean PilaLlena() {
        return i==capacidad;
    }

    @Override
    public int Capacidad() {
        return capacidad;
    }

    @Override
    public int Tope() {
        return vector[i-1];
    }

}

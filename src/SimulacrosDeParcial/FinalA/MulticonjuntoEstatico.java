package FinalA;

public class MulticonjuntoEstatico implements multiconjuntoTDA{
    int i;
    int[][] vector;
    int tamaño;

    @Override
    public void inicializarMulticonjunto() {
        i = 0;
        tamaño = 100;
        vector = new int[tamaño][2];
    }

    private void Ampliar(){
        int[][] aux = new int[tamaño*2][2];
        for (int j = 0; j < tamaño; j++) {
            aux[j][0] = vector[j][0];
            aux[j][1] = vector[j][1];
        }
        vector = aux;
        tamaño = tamaño*2;
    }

    @Override
    public void agregar(int x) {
        boolean existe = false;
        int cont = 0;
        if (i == tamaño) {
            Ampliar();
        }

        while (cont != i && !existe) {
            if (vector[cont][0] == x) {
                existe = true;
            }
            cont++;
        }
        cont--;
        if (existe) {
            vector[cont][1]++;
        }else{
            vector[i][0] = x;
            vector[i][1] = 1;
            i++;
        }


    }

    @Override
    public void sacar(int x) {

        int cont = 0;
        while (cont != i && vector[cont][0] != x) {
            cont++;
        }
        

        vector[cont][1]--;
        if (vector[cont][1] == 0) {
            i--;
            vector[cont][0] = vector[i][0];
            vector[cont][1] = vector[i][1];
        }
        
    }

    @Override
    public int multiplicidad(int x) {
        int cont = 0;
        while (cont != i && vector[cont][0] != x) {
            cont++;
        }

        return vector[cont][1];
    }

    @Override
    public boolean multiconjuntojuntoVacio() {
        return i == 0;
    }

    @Override
    public int elegir() {
        int pos= Math.abs((int)System.nanoTime()%i);
        return vector[pos][0];
    }

}

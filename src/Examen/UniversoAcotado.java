package Examen;

public class UniversoAcotado implements UniversoAcotadoTDA {

    int[] vector;
    int tamaño;

    @Override
    public void InicializarUniverso(int n) {
        
        tamaño = n;
        vector = new int[tamaño];
    }

    @Override
    public void Agregar(int x) {
        if (x < tamaño && vector[x] == 0) {
            vector[x] = 1;
        }
    }

    @Override
    public void Sacar(int x) {
        if (x < tamaño && vector[x] == 1) {
            vector[x] = 0;
        }
    }

    @Override
    public int Elegir() {
        int pos;

        do{
            pos = Math.abs((int)System.nanoTime()%tamaño);

        }while(vector[pos] == 0);

        return pos;
    }

    @Override
    public boolean ConjuntoVacio() {

        boolean estaVacio = true;
        int cont=0;

        while(estaVacio && cont < tamaño){
            if(vector[cont] == 1){
                estaVacio= false;
            }
            cont++;
        }

        return estaVacio;
    }

    @Override
    public UniversoAcotadoTDA Complemento() {
        UniversoAcotadoTDA complemento = new UniversoAcotado();
        complemento.InicializarUniverso(tamaño);

        for(int i = 0; i < tamaño; i++){

            if (vector[i] == 0) {
                complemento.Agregar(i);
            }
        }

        return complemento;
    }

}

package impl;
import api.ConjuntoTDA;
public class ConjuntoEstatico implements ConjuntoTDA {
    int[] vector;
    int i;

    @Override
    public void InicializarConjunto() {
        vector=new int[100];
        i=0;
    }

    @Override
    public boolean ConjuntoVacio() {
        return (i==0);
    }

    @Override
    public void Agregar(int x) {
        if(!Pertenece(x)){
            vector[i] = x;
            i++;
        }else{
            System.out.println("el elemento ya se encuentra en el conjunto");
        }

        
    }

    @Override
    public int Elegir() {
        int pos= Math.abs((int)System.nanoTime()%i);
        return vector[pos];
    }

    @Override
    public void Sacar(int x) {
        int cont=0;
        while(Pertenece(x) && cont<i){
            if(vector[cont]==x){
                vector[cont]=vector[i-1];
                i--;
            }
            cont++;
        }
    }

    @Override
    public boolean Pertenece(int x) {
        boolean pertenece = false;
        int cont=0;
        while(!pertenece && cont<i){

            if (vector[cont] == x) {
                pertenece = true;
            }
            cont++;
        }
        
        return pertenece;
    }

}

package impl;
import api.ConjuntoTDA;
import api.DiccionarioSimpleTDA;


public class DiccionarioSimpleEstatico implements DiccionarioSimpleTDA {
    int[] Claves;
    int[] Valores;
    int i;

    @Override
    public void InicializarDiccionario() {
        Claves = new int[100];
        Valores= new int[100];
        i=0;
    }

    @Override
    public void Agregar(int clave, int valor) {
        if(i<100 && !Claves().Pertenece(clave)){
            Claves[i]=clave;
            Valores[i]=valor;
            i++;
        }else if (Claves().Pertenece(clave)) {
            int cont=0;
            while(Claves[cont]!=clave){
                cont++;
            }
            Valores[cont]=valor;    
        }

    }

    @Override
    public void Eliminar(int clave) {
        int cont=0;
        ConjuntoTDA conjuntoClaves = Claves();
        if (conjuntoClaves.Pertenece(clave)) {
            while (Claves[cont]!=clave) {
                cont++;
            }
            Claves[cont]=Claves[i-1];
            Valores[cont]=Valores[i-1];
            i--;
        }else{
            System.out.println("Clave no existe en diccionario");
        }
        
    }

    @Override
    public int Recuperar(int clave) {
        int  cont=0;

        while (Claves[cont]!=clave) {
            cont++;
        }
        int valor=Valores[cont];
        
        return valor;
    }

    @Override
    public ConjuntoTDA Claves() {
        ConjuntoTDA claves= new ConjuntoDinamico();
        for(int cont=0; cont<i; cont++){
            claves.Agregar(Claves[cont]);
        }
        return claves;
    }
 
}

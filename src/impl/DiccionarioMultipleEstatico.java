package impl;

import api.ConjuntoTDA;
import api.DiccionarioMultipleTDA;

public class DiccionarioMultipleEstatico implements DiccionarioMultipleTDA{
    int[][] Matriz;
    int i;
    /*1era columna: clave
     *2da columna, cantidad de valores(aumenta con cada valor inidivudal de la fila)
     3ra - 100va columna se rellena con valores
     */

    @Override
    public void InicializarDiccionario() {
        Matriz= new int[100][100];
        i=0;

        for(int filas=0;filas<100;filas++){
            for(int columnas=0;columnas<100;columnas++){
                Matriz[filas][columnas]=0;//inicializamos la matriz de 100*100 toda llena de 0 
            }
        }
        
        
    }

    @Override
    public void Agregar(int clave, int valor) {
        

    }

    @Override
    public void Eliminar(int clave) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Eliminar'");
    }

    @Override
    public void EliminarValor(int clave, int valor) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'EliminarValor'");
    }

    @Override
    public ConjuntoTDA Recuperar(int clave) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Recuperar'");
    }

    @Override
    public ConjuntoTDA Claves() {
        ConjuntoTDA claves= new ConjuntoDinamico();
        for(int cont=0;cont<i;cont++){
            claves.Agregar(Matriz[cont][0]);
        }

        return claves;
    }

}

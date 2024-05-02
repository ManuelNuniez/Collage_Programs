package impl;

import api.ConjuntoTDA;
import api.DiccionarioMultipleTDA;
import api.PilaTDA;

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
        if(i!=100){
            if (i==0) {
                Matriz[i][0]=clave;
                Matriz[i][1]=2;
                Matriz[i][Matriz[i][1]]=valor;
                Matriz[i][1]++;
                i++;
            }else{
                if(Claves().Pertenece(clave)){//si la clave existe
                    boolean valorExiste=false;
                    int buscaClave=0;
                    while (Matriz[buscaClave][0]!=clave) {//en donde esta la clave?
                        buscaClave++;
                    }
                    
                    int buscaValor=2;
                    while(!valorExiste && buscaValor<Matriz[buscaClave][1]){//el valor esta?
                        if(Matriz[buscaClave][buscaValor]==valor){
                            valorExiste=true;
                        }else{
                            buscaValor++;
                        }
                    }

                    if (!valorExiste) {
                        Matriz[buscaClave][Matriz[buscaClave][1]]=valor;
                        Matriz[buscaClave][1]++;    
                    }   
                }else{//la clave no existe se agrega todo y se aumenta i
                    Matriz[i][0]=clave;
                    Matriz[i][1]=2;//cantidad de valores empieza en 2 para asi usarlo como posicion al agregar un valor, esto en ralidad son matriz[clave][1]-2 valores
                    Matriz[i][Matriz[i][1]]=valor;

                    Matriz[i][1]++;
                    i++;
                }
            }
        }    
    }   
        

    @Override
    public void Eliminar(int clave) {
        if (Claves().Pertenece(clave)) {//si la clave pertenece elimina

            int buscaClave=0;
            while (Matriz[buscaClave][0]!=clave) {//en donde esta la clave?
                buscaClave++;
            }

            PilaTDA valoresUltimaClave=new PilaDinamica();
            valoresUltimaClave.InicializarPila();

            for(int cont = Matriz[i-1][1]-1;cont>=2;cont--){ //guardamos los valores asisgnados a la ultima clave en una pila
                valoresUltimaClave.Apilar(Matriz[i-1][cont]);
            }

            //sobreescribimos la clave con el ultimo valor
            Matriz[buscaClave][0]=Matriz[i-1][0];
            Matriz[buscaClave][1]=Matriz[i-1][1];
            
            for(int cont = Matriz[i-1][1]-1;cont>=2;cont--){ //sacamos los valores de la pila y los ponemos en el espacio de la clave anterior
                Matriz[buscaClave][cont]=valoresUltimaClave.Tope();
                valoresUltimaClave.Desapilar();
            }

            i--;
            
        }
    }

    @Override
    public void EliminarValor(int clave, int valor) {
        if(Claves().Pertenece(clave)){//si la clave existe
            int buscaClave=0;
            while (Matriz[buscaClave][0]!=clave) {//en donde esta la clave?
                buscaClave++;
            }
            
            if (Recuperar(clave).Pertenece(valor)) {
                int buscaValor=2;
                while(Matriz[buscaClave][buscaValor]!=valor){//buscamos el valor
                    buscaValor++;
                }
                Matriz[buscaClave][buscaValor]=Matriz[buscaClave][Matriz[buscaClave][1]-1];
                Matriz[buscaClave][1]--;
            }
        }
    }

    @Override
    public ConjuntoTDA Recuperar(int clave) {
        ConjuntoTDA conjuntoValores =new ConjuntoDinamico();
        conjuntoValores.InicializarConjunto();
        
        if(Claves().Pertenece(clave)){//si la clave existe
            int buscaClave=0;
            while (Matriz[buscaClave][0]!=clave) {//en donde esta la clave?
                buscaClave++;
            }

            for(int cont=Matriz[buscaClave][1];cont>=2;cont--){
                conjuntoValores.Agregar(Matriz[buscaClave][cont]);
            }
        }
        return conjuntoValores;

    }

    @Override
    public ConjuntoTDA Claves() {
        ConjuntoTDA claves= new ConjuntoDinamico();
        for(int buscaClave=0;buscaClave<i;buscaClave++){
            claves.Agregar(Matriz[buscaClave][0]);
        }

        return claves;
    }

}

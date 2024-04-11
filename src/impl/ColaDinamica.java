package impl;

import api.ColaTDA;

public class ColaDinamica implements ColaTDA {
    Nodo Primero;
    Nodo Ultimo;
    @Override
    public void InicializarCola() {
        Primero=null;
        Ultimo=null;
    }


    @Override
    public void Desacolar() { //si queremos que la funcion nos devuelva el numer desacolado, debemos cambiar el tipo de retorno a int y hacer dato=primero.info
        Primero=Primero.sig;
        if (Primero==null)
        {
            Ultimo=null;
        }
    }

    @Override
    public int PrimerElemento() {
        return(Primero.info);
    }

    @Override
    public boolean ColaVacia() {
        return (Primero==null);
    }

    @Override
    public void Acolar(int n) {
        Nodo aux= new Nodo();
        aux.info= n;
        aux.sig=null;
        if(ColaVacia()){
            Primero=aux;
            Ultimo=aux;
        }else{
            Ultimo.sig= aux;
            Ultimo=aux;
            
        }
        
    }


}

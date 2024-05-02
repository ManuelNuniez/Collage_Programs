package impl;

import api.ConjuntoTDA;
import api.DiccionarioMultipleTDA;

public class DiccionarioMultipleDinamico implements DiccionarioMultipleTDA {
    NodoDiccionarioMultiple Origen;

    @Override
    public void InicializarDiccionario() {
        Origen=null;
    }

    @Override
    public void Agregar(int clave, int valor) {
        NodoDiccionarioMultiple aux= new NodoDiccionarioMultiple();
        aux.Clave=clave;
        aux.valores= new ConjuntoDinamico();
        aux.valores.InicializarConjunto();
        aux.valores.Agregar(valor);
        
        //caso 1: el diccionario esta vacio
        if (Origen==null) {

            Origen=aux;

        //Caso 2: la clave existe y el valor no esta en el conjunto de valores asociado a esa clave
        }else if(Claves().Pertenece(clave) && !Recuperar(clave).Pertenece(valor)){

            //sobre-escribo aux, porque no voy a agregar ningun nodo nuevo, asi lo puedo usar apra recorrer
            aux=Origen;
            //buscamos la clave
            while (aux.Clave!=clave) {
                aux=aux.sig;
            }
            aux.valores.Agregar(valor);

        //Caso 3: la clave no existe, se agrega el nodo Aux.
        }else if (!Claves().Pertenece(clave)) {
            aux.sig=Origen;
            Origen=aux;
        }

        //Caso 4: no pasa absolutamente nada porque la clave existe y el valor ya fue asociado a la misma
    }

    @Override
    public void Eliminar(int clave) {
        if(Claves().Pertenece(clave)){
            if (Origen.Clave==clave) {
                Origen=Origen.sig;
            }else{
                NodoDiccionarioMultiple actual=Origen.sig;
                NodoDiccionarioMultiple anterior=Origen;
                while (actual.Clave!=clave) {
                    anterior=actual;
                    actual=actual.sig;
                }
                anterior.sig=actual.sig;
            }
        }
    }

    @Override
    public void EliminarValor(int clave, int valor) {
        if (Claves().Pertenece(clave)) {
            NodoDiccionarioMultiple aux = Origen;
            while (aux.Clave!=clave) {
                aux=aux.sig;
            }

            if (Recuperar(clave).Pertenece(valor)) {
                aux.valores.Sacar(valor);
            }
        }
    }

    @Override
    public ConjuntoTDA Recuperar(int clave) {

        NodoDiccionarioMultiple aux = Origen;

        while (aux.Clave!=clave) {//pasamos por nodos hasta llegar a la Clave que buscamos
            aux=aux.sig;
        }

        return aux.valores;//aux.valores es el conjunto de valores asociados a la clave del nodo
    }

    @Override
    public ConjuntoTDA Claves() {
        ConjuntoTDA claves = new ConjuntoDinamico();
        claves.InicializarConjunto();
        NodoDiccionarioMultiple aux = Origen;
        while (aux!=null) {
            claves.Agregar(aux.Clave);
            aux=aux.sig;
        }
        return claves;
    }

}

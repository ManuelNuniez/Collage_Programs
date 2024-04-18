package impl;

import api.ColaPrioridadTDA;

public class ColaPrioridadDinamica implements ColaPrioridadTDA {
    NodoPrioridad Primero;
    NodoPrioridad Ultimo;

    @Override
    public void InicializarCola() {
        Primero=null;
        Ultimo=null;

    }

    @Override
    public void Acolar(int n, int prioridad) {
        NodoPrioridad aux=new NodoPrioridad();
        //Creacion del nodo que quiero acolar
        aux.info=n;
        aux.prio=prioridad;
        aux.sig=null;

        


        if(ColaVacia()) {//si la cola esta vacia, el unico nodo va ser aux
            Primero=aux;
            Ultimo=aux;
        }
        else{ 
            if (aux.prio>Primero.prio) {//vemos si podemos meter el nuevo nodo al principio de la cola
                aux.sig=Primero;
                Primero=aux;
            }
            else if(aux.prio<=Ultimo.prio)// vemos si metemos el nuevo nodo a lo ultimo
            {
                Ultimo.sig=aux;
                Ultimo=aux;
            }
            else
            {
                /*nodo que vamos a usar apra insertar, es igual a primero apra poder compararlo con
                todos los nodos sin perder elementos*/
                NodoPrioridad salto = Primero;

                while(salto.sig!=Ultimo && salto.sig.prio>=aux.prio) {
                    salto=salto.sig;
                }
                aux.sig=salto.sig;
                salto.sig=aux;
            }
        }
    }

    @Override
    public void Desacolar() {
        Primero=Primero.sig;
        if (Primero==null){
            Ultimo=null;
        }

    }

    @Override
    public int PrimerElemento() {

        return (Primero.info);
    }

    @Override
    public boolean ColaVacia() {
        return(Primero==null);
    }

    @Override
    public int Prioridad() {
        return (Primero.prio);
    }

}

package impl;

import api.ColaPrioridadTDA;
import api.HeapTDA;
import api.PrioHeapTDA;

public class ColaPrioridadHeap implements ColaPrioridadTDA {



    PrioHeapTDA Cola;

    @Override
    public void InicializarCola() {
        Cola= new MaxHeapPrio();
        Cola.InicializarHeap();
    }

    @Override
    public void Acolar(int n, int prioridad) {
        ValPrio aux= new ValPrio();
        aux.valor= n;
        aux.prioridad=prioridad;
        Cola.AgregarH(aux);
    }

    @Override
    public void Desacolar() {
        Cola.SacarH();
    }

    @Override
    public int PrimerElemento() {
        return Cola.PrimerValor();
    }

    @Override
    public boolean ColaVacia() {
        return Cola.HeapVacio();
    }

    @Override
    public int Prioridad() {
        return Cola.Prioridad();
    }

}

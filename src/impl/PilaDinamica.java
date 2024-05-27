package impl;

import api.PilaTDA;

public class PilaDinamica implements PilaTDA {
    Nodo tope;

    @Override
    public void InicializarPila() {
        tope= null;
        
    }

    @Override
    public void Apilar(int x) {
        Nodo aux= new Nodo();
        aux.info= x;
        aux.sig = tope;
        tope =aux;
    }

    @Override
    public void Desapilar() {
        tope= tope.sig;
    }

    @Override
    public int Tope() {
        return(tope.info);
    }

    @Override
    public boolean PilaVacia() {
        return(tope == null);
    }

}

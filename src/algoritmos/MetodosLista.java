package algoritmos;

import api.ListaTDA;

public class MetodosLista {

    public static int SumaRec(ListaTDA l){
        int acum;
        if (l.listaVacia()){
            return 0;
        }else{
            acum= l.recuperarPos(0);
            l.remove(l.recuperarPos(0));
        }

        return  (acum + SumaRec(l));
    }

}

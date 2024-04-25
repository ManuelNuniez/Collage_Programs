package algoritmos;
import api.ColaPrioridadTDA;


import api.ColaTDA;
import impl.ColaDinamica;

public class MetodosColaPrioridad {

    public static void CombinarColas(ColaPrioridadTDA cp1, ColaPrioridadTDA cp2){
        /*pasamos el contenido de la cola 2 a la cola 1, siendo la la cola 1 mas prioritaria que la 2
         * preguntar al profe si esto esta bien o quiere que generemos una tercera cola
         */
        while(!cp2.ColaVacia()){
            cp1.Acolar(cp2.PrimerElemento(), cp2.Prioridad());
            cp2.Desacolar();
        }
    }

    public static void Imprimir(ColaPrioridadTDA cp1){
        /*para imprimir paso los elementos de la cola a 2 pilas, una prioridad y otra de elementos
         * despues la recupero vaciando las 2 pilas y acolando
         */
        ColaTDA elementos = new ColaDinamica();
        ColaTDA prioridad= new ColaDinamica();
        elementos.InicializarCola();
        prioridad.InicializarCola();

        while(!cp1.ColaVacia())
        {
            System.out.println("elemento: " + cp1.PrimerElemento() + "  prioridad: " + cp1.Prioridad() );
            elementos.Acolar(cp1.PrimerElemento());
            prioridad.Acolar(cp1.Prioridad());
            cp1.Desacolar();
        }

        while (!elementos.ColaVacia()) {
            cp1.Acolar(elementos.PrimerElemento(), prioridad.PrimerElemento());
            elementos.Desacolar();
            prioridad.Desacolar();
            
        }

    }

    public static boolean SonIguales(ColaPrioridadTDA cp1,ColaPrioridadTDA cp2){
        boolean sonIguales=true;
        ColaTDA prioridad = new ColaDinamica();
        ColaTDA elementos = new ColaDinamica();
        elementos.InicializarCola();
        prioridad.InicializarCola();
        if (cp1.ColaVacia() && cp2.ColaVacia()) {
            return sonIguales;
        }else if (cp1.ColaVacia() || cp2.ColaVacia()) {
            return (!sonIguales);
        }
        
        while (sonIguales && (!cp1.ColaVacia() && !cp2.ColaVacia())) {

            if (cp1.PrimerElemento()==cp2.PrimerElemento() && cp1.Prioridad()==cp2.Prioridad() && !cp1.ColaVacia() && !cp2.ColaVacia()) {
                elementos.Acolar(cp1.PrimerElemento());
                prioridad.Acolar(cp1.Prioridad());
                cp1.Desacolar();                    
                cp2.Desacolar();
            }else{
                sonIguales=false;
            }
        }
        
        while (!elementos.ColaVacia()) {
            cp1.Acolar(elementos.PrimerElemento(), prioridad.PrimerElemento());                        
            cp2.Acolar(elementos.PrimerElemento(), prioridad.PrimerElemento());
            elementos.Desacolar();
            prioridad.Desacolar();
                
        }

        return sonIguales;
    }
}
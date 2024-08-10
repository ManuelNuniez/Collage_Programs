package EjercicioAlumnosID;
import api.ConjuntoTDA;
import api.ListaTDA;
import impl.ConjuntoDinamico;
import impl.ListaDinamica;

public class DiccAlumnos implements AlumnosTDA {
    NodoAlumnos Origen;

    @Override
    public void inicializar() {
        Origen=null;
        
    }

    @Override
    public void Cargar(int alumno, int nota) {
        NodoAlumnos aux= new NodoAlumnos();
        aux.Clave=alumno;
        aux.indice=1;
        aux.info= new ListaDinamica();
        aux.info.inicializar();
        aux.info.append(nota);

        if (Origen==null) {
            Origen=aux;  
        }else if(Alumnos().Pertenece(alumno)){
            aux=Origen;
            while (aux.Clave!=alumno) {
                aux=aux.sig;
            }
            aux.info.append(nota);
            aux.indice++;
            
        }else if (!Alumnos().Pertenece(alumno)) {
            aux.sig=Origen;
            Origen=aux;
        }

    }

    @Override
    public void ElminarID(int alumno) {
        NodoAlumnos aux=Origen;
        while (aux.sig.Clave!=alumno) {
            aux=aux.sig;
        }
        aux.sig=aux.sig.sig;
    }

    @Override
    public void EliminarNota(int alumno, int nota) {
        NodoAlumnos aux=Origen;
        while (aux.Clave!=alumno) {
            aux=aux.sig;
        }

        aux.info.remove(nota);
        aux.indice--;
    }

    @Override
    public ListaTDA VerNotas(int alumno) {
        NodoAlumnos aux= Origen;
        while (aux.Clave!=alumno) {
            aux=aux.sig;
        }
        return aux.info;
    }

    @Override
    public boolean Aprobo(int alumno) {
        int acum=0;
        NodoAlumnos aux= Origen;
        while (aux.Clave!=alumno) {
            aux=aux.sig;
        }

        for(int i=0;i<aux.indice;i++){
            acum=acum+ aux.info.recuperarPos(i);
        }

        return ((acum/aux.indice)>=4);

    }
    

    @Override
    public float Promedio(int alumno) {
        float acum=0;
        NodoAlumnos aux= Origen;
        while (aux.Clave!=alumno) {
            aux=aux.sig;
        }

        for(int i=0;i<aux.indice;i++){
            acum=acum+ aux.info.recuperarPos(i);
        }
        
        return acum/aux.indice;
    }

    @Override
    public ConjuntoTDA Aprobados() {
        ConjuntoTDA aprobados=new ConjuntoDinamico();
        aprobados.InicializarConjunto();
        ConjuntoTDA alumnos=Alumnos();

        while (!alumnos.ConjuntoVacio()) {
            int clave=alumnos.Elegir();
            alumnos.Sacar(clave);
            if (Promedio(clave)>=4) {
                aprobados.Agregar(clave);
            }
        }

        return aprobados;

    }

    @Override
    public ConjuntoTDA Alumnos() {
        ConjuntoTDA cAlumnos= new ConjuntoDinamico();
        cAlumnos.InicializarConjunto();
        NodoAlumnos aux= Origen;

        while(aux!=null){
            cAlumnos.Agregar(aux.Clave);
            aux=aux.sig;
        }

        return cAlumnos;
    }

}

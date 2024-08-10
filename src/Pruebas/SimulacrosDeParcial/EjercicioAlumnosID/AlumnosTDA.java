package EjercicioAlumnosID;
import api.ConjuntoTDA;
import api.ListaTDA;

public interface AlumnosTDA {
    void inicializar();
    //TDA inicializado
    void Cargar(int alumno,int nota);
    //inicializado y no vacio
    void ElminarID(int alumno);
    //inicializado y no vacio
    void EliminarNota(int alumno, int nota);
    //inicializado y no vacio
    ListaTDA VerNotas(int alumno);
    //inicializado y no vacio
    boolean Aprobo(int alumno);
    //inicializado y no vacio
    float Promedio(int alumno);
    // inicializado y no vacio
    ConjuntoTDA Aprobados();
    //inicializado y no vacio
    ConjuntoTDA Alumnos();
    





}

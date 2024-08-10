package EjercicioAlumnosID;

import algoritmos.MetodosConjunto;

public class PruebaAlumnos {
    public static void main(String[] args) {
        AlumnosTDA da = new DiccAlumnos();
        da.inicializar();

        // Alumno 1001 con notas aleatorias
        da.Cargar(1001, 7);
        da.Cargar(1001, 8);
        da.Cargar(1001, 6);
        da.Cargar(1001, 9);
        da.Cargar(1001, 5);

        // Alumno 1002 con notas aleatorias
        da.Cargar(1002, 6);
        da.Cargar(1002, 4);
        da.Cargar(1002, 7);
        da.Cargar(1002, 8);
        da.Cargar(1002, 5);

        // Alumno 1003 con notas aleatorias
        da.Cargar(1003, 9);
        da.Cargar(1003, 7);
        da.Cargar(1003, 8);
        da.Cargar(1003, 6);
        da.Cargar(1003, 5);

        // Alumno 1004 con notas aleatorias
        da.Cargar(1004, 10);
        da.Cargar(1004, 7);
        da.Cargar(1004, 9);
        da.Cargar(1004, 6);
        da.Cargar(1004, 8);

        da.Cargar(1001, 3);

        // Alumno 1005 con notas bajas (promedio menor a 4)
        da.Cargar(1005, 2);
        da.Cargar(1005, 1);
        da.Cargar(1005, 3);
        da.Cargar(1005, 2);
        da.Cargar(1005, 1);


        da.ElminarID(1002);
        da.EliminarNota(1001, 3);
        MetodosConjunto.ImprimirConjunto(da.Alumnos());
        System.out.println("promedio alumno 1: " + da.Promedio(1001));
        da.VerNotas(1001).mostrarLista();
        //System.out.println("promedio alumno 2: " +da.Promedio(1002));
        System.out.println("Promedio alumno 3: "+da.Promedio(1003));
        System.out.println("Promedio alumno 4: "+da.Promedio(1004));
        System.out.println("promedio alumno 5: " + da.Promedio(1005));

        MetodosConjunto.ImprimirConjunto(da.Aprobados());
        MetodosConjunto.ImprimirConjunto(da.Alumnos());

        
        
    }

}

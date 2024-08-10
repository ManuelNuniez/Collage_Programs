package Examen;

public interface UniversoAcotadoTDA {
    void InicializarUniverso(int n); // costo lineal
    void Agregar(int x); // costo constante
    void Sacar(int x); // costo constante
    int Elegir(); //costo lineal en el peor caso
    boolean ConjuntoVacio(); //costo lineal en el peor caso
    UniversoAcotadoTDA Complemento(); //costo lineal
}

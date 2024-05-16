package Simulacro1erParcial;
import api.ColaTDA;

public interface ListaPromediadaTDA {
    void inicializar();
    //lista ya inicializada
    void AgregarValor(int val);
    //lista inicializada y no vacia
    void eliminar(int val);
    //lista inicializada y no vacia
    float Promedio();
    //lista iniciializada y no vacia
    ColaTDA Menores();
    //cola inicializada y no vacia
    ColaTDA Mayores();
    //cola inicializada
    boolean EstaVacia();

}

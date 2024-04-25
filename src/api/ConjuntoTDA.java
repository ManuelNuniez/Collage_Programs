package api;

public interface ConjuntoTDA {
    void InicializarConjunto();
    //siempre que el conjuntohaya sido inicializado
    boolean ConjuntoVacio();
    //conjunto inicializado
    void Agregar( int x);
    //conjunto inicializado y no vacio
    int Elegir();
    //conjunto inicializazado
    void Sacar(int x);
    //siempre que este incializado
    boolean Pertenece(int x);


}

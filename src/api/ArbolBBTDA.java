package api;

public interface ArbolBBTDA {
    double Raiz();
    ArbolBBTDA HijoIzq();
    ArbolBBTDA HijoDer();
    boolean ArbolVacio();
    void InicializarArbol();
    void AgregarElem(double x);
    void EliminarElem(double x);

}

package Arbol;

public interface ArbolBBTDA {
    int Raiz();
    ArbolBBTDA HijoIzq();
    ArbolBBTDA HijoDer();
    boolean ArbolVacio();
    void InicializarArbol();
    void AgregarElem(int x);
    void EliminarElem(int x);

}

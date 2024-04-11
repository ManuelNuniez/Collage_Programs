package api;

public interface ColaTDA {
    void InicializarCola();
    void Acolar(int n);
    void Desacolar();
    int PrimerElemento();
    boolean ColaVacia();
    int Size();
}

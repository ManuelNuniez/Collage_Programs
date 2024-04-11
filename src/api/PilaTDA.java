package api;

public interface PilaTDA {
    void InicializarPila();/** sin pre-condicion */
    void Apilar(int x);/**pila que este inicializada */
    void Desapilar();/*pila inicializada y apilada */
    int Tope();/*pila inicializada */
    boolean PilaVacia();


}

package api;

public interface GrafoTDA {
    void inicializarGrafo();
    void AgregarVertice(int v);
    void EliminarVertice(int v);
    ConjuntoTDA Vertices();
    void AgregarArista();
    void EliminarArista(int origen, int destino);
    boolean ExisteArista();
    int PesoArista(int origen, int destino);
}

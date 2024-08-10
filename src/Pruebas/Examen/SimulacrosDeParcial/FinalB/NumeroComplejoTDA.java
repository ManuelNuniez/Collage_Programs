package FinalB;

public interface NumeroComplejoTDA {
    void inicializarNumero(double r, double i);
    NumeroComplejoTDA sumar(double r, double i);
    NumeroComplejoTDA multiplicar(double r, double i);
    NumeroComplejoTDA dividir(double r,double i);
    double real();
    double imaginario();
    double rho();
    double psi();
}

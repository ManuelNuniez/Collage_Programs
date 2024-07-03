package FinalB;
import java.math.*;

public class NumeroComplejo implements NumeroComplejoTDA{

    double real;
    double imaginario;

    @Override
    public void inicializarNumero(double r, double i) {

        real = r;
        imaginario = i;
    }
    @Override
    public NumeroComplejoTDA sumar(double r, double i) {
        NumeroComplejoTDA resultado = new NumeroComplejo();
        resultado.inicializarNumero(real + r, imaginario + i);

        return resultado;
    }
    @Override
    public NumeroComplejoTDA multiplicar(double r, double i) {
        NumeroComplejoTDA resultado = new NumeroComplejo();
        double auxr = (real*r - imaginario*i);
        double auxi = (real*i + imaginario*r);
        resultado.inicializarNumero(auxr, auxi);
        return resultado;
    }
    @Override
    public NumeroComplejoTDA dividir(double r, double i) {
        NumeroComplejoTDA resultado = new NumeroComplejo();
        double auxr = (real*r + imaginario*i);
        double auxi = (imaginario*r - real*i);
        double divisor = r*r + i*i;

        resultado.inicializarNumero(auxr/divisor, auxi/divisor);
        return resultado;
    }
    @Override
    public double real() {
        return real;
    }
    @Override
    public double imaginario() {
        return imaginario;
    }
    @Override
    public double rho() {
        return Math.sqrt(real*real + imaginario*imaginario);
    }
    @Override
    public double psi() {
        return Math.atan(imaginario/real);
    }

    
}

package FinalB;

public class PruebaComplejos {
    public static void main(String[] args) {
        NumeroComplejoTDA a = new NumeroComplejo();
        a.inicializarNumero(2, 3);

        System.out.println("Original:");
        MetodosComplejos.ImprimirComplejo(a);
        System.out.println();

        System.out.println("Sumamos 3 + 2i:");
        MetodosComplejos.ImprimirComplejo(a.sumar(3, 2));
        System.out.println();

        System.out.println("multiplicamos por 3 + i:");
        MetodosComplejos.ImprimirComplejo(a.multiplicar(3, 1));
        System.out.println();

        System.out.println("ahora lo dividimos por  2 + 0.5i:");
        MetodosComplejos.ImprimirComplejo(a.dividir(2, 0.5));
        System.out.println();

        System.out.printf("Prueba de rho: %.2f\n",a.rho());
        System.out.printf("Prueba de psi: %.2f",a.psi());
        System.out.println();

    }
}

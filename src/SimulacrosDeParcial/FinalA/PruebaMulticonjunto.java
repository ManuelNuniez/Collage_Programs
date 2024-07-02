package FinalA;


public class PruebaMulticonjunto {
    public static void main(String[] args) {
        multiconjuntoTDA m = new MulticonjuntoDinamico();
        m.inicializarMulticonjunto();

        m.agregar(0);
        m.agregar(0);
        m.agregar(0);
        m.agregar(2);
        m.agregar(1);
        m.agregar(3);
        m.agregar(3);

        System.out.println(m.multiplicidad(0));

        m.sacar(0);
        m.sacar(3);
        m.sacar(3);

        System.out.println(m.multiplicidad(0));
        System.out.println(m.multiplicidad(3));

        System.out.println(m.elegir());
    }
}

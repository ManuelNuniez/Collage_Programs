package FinalD;

public class PruebaListaEnlazada {
    public static void main(String[] args) {
        ListaDoblementeEnlazadaTDA l = new ListaDoblementeEnlazada();
        l.InicializarLista();

        l.Agregar(0);
        l.Agregar(1);
        l.Agregar(2);
        l.Agregar(3);
        l.Agregar(4);
        l.Agregar(5);

        l.Imprimir();

        System.out.println(l.PrimerElemnto());
        System.out.println(l.UltimoElemento());

        l.Eliminar(0);
        l.Eliminar(5);

        System.out.println(l.PrimerElemnto());
        System.out.println(l.UltimoElemento());

        l.Imprimir();
    }

}

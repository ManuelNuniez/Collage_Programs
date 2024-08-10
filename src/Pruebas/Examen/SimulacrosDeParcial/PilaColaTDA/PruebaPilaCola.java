package PilaColaTDA;

public class PruebaPilaCola {
    public static void main(String[] args) {
        PilaCola pc = new PilaCola();
        pc.inicializar();

        pc.Cargar(4);
        pc.Cargar(2);
        pc.Cargar(6);
        pc.Cargar(8);
        pc.Cargar(4);
        pc.Cargar(12);
        pc.Cargar(14);
        pc.Cargar(16);
        pc.Cargar(10);
        pc.Cargar(3);
        pc.Cargar(124);
        pc.Cargar(14);


        pc.imprimir();
        pc.Mostrar();
        pc.Quitar();
        pc.Mostrar();
        System.out.println(pc.EstaVacio());
    }

}

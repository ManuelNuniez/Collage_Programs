package Lista;
public class PruebaListaTDA {
    public static void main(String[] Args){
        ListaTDA lista=new ListaEstatica();
        lista.inicializar();

        lista.append(5);
        lista.append(6);
        lista.append(7);
        lista.insert(4, 0);
        lista.append(4);
        lista.append(10);
        System.out.println(lista.count(4));
        System.out.println(lista.index(4));
        System.out.println(lista.recuperarPos(2));
        lista.mostrarLista();
        lista.pop();
        lista.remove(5);
        lista.removeAll(4);
        lista.mostrarLista();
        lista.clear();
        lista.mostrarLista();
        System.out.println(lista.listaVacia());


    }
}

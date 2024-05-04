package Lista;

public class ListaEstatica implements ListaTDA {
    int[] vector;
    int i;

    @Override
    public void inicializar() {
        vector= new int[100];
        i=0;
    }

    @Override
    public void append(int x) {
        if (i<=99) {
            vector[i]=x;
            i++;
        }
    }

    @Override
    public void clear() {
        i=0;
    }

    @Override
    public int count(int x) {
        int apariciones=0;
        for(int cont =0;cont<i;cont++){
            if (vector[cont]==x) {
                apariciones++;
            }
        }
        return apariciones;

    }

    @Override
    public int index(int x) {

        int indice=0;

        while(vector[indice]!=x && indice<i){
            indice++;
        }

        if(vector[indice]==x){
            return indice;
        }else{
            return -1;
        }
        
    }

    @Override
    public void insert(int x, int p) {
        int cont=i;
        while(cont>p){
            cont--;
            vector[cont+1]=vector[cont];
        }
        vector[cont]=x;
        i++;
    }

    @Override
    public void pop() {
        if(!listaVacia()){
            i--;
        }
    }


    @Override
    public void remove(int x) {
        int cont=0;
        while(vector[cont]!=x){
            cont++;
        }

        while (cont<i) {
            vector[cont]=vector[cont+1];
            cont++;
        }

        i--;
    }

    @Override
    public void removeAll(int x) {
        
        while(index(x)!=-1){
            remove(x);
        }
    }

    @Override
    public boolean listaVacia() {
        return i==0;
    }

    @Override
    public void mostrarLista() {
        System.out.print("[");
        for(int cont=0; cont<i;cont++){
            System.out.printf("%d, ",vector[cont]);
        }
        System.out.print("]");
        System.out.println();
    }

    @Override
    public int recuperarPos(int x) {
        return vector[x];

    }

}

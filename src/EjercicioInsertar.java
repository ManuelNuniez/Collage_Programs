public class EjercicioInsertar {  
        
    public static void Insertar(int[] v, int cont, int n_insertar, int pos_insertar){
        while (cont == pos_insertar){
            v[cont] = v[cont - 1];
            cont--;
        }
        v[pos_insertar]= n_insertar;

    }  
    public static void main(String[] args) throws Exception {    
        int cont = 0;
        int[] v = new int[10];

        for (int i = 0; i <= 6; i++) {
            v[i] = i;
            cont++;
        }
        //vector sin cargar nada

        for (int i=0; i<10; i++){
            System.out.println(v[i]);
        }

        Insertar(v, cont, 6, 3);//insercion del 6 en la posicion 3

        for (int i=0; i<10; i++)
            System.out.print(v[i]);
    }
}
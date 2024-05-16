package algoritmos;
import Arbol.ArbolBBTDA;
import api.ConjuntoTDA;
import impl.ConjuntoDinamico;

public class MetodosArbolBB {
    public static void PreOrder(ArbolBBTDA a){
        if(a.ArbolVacio()){
            System.out.println(a.Raiz());
            PreOrder(a.HijoIzq());
            PreOrder(a.HijoDer());
        }
    }

    public static void InOrder(ArbolBBTDA a){
        if(a.ArbolVacio()){
            PreOrder(a.HijoIzq());
            System.out.println(a.Raiz());
            PreOrder(a.HijoDer());
        }
    }

    public static void PostOrder(ArbolBBTDA a){
        if(a.ArbolVacio()){
            PreOrder(a.HijoIzq());
            PreOrder(a.HijoDer());
            System.out.println(a.Raiz());
        }
    }

    public static int Contar(ArbolBBTDA a){ //cuenta la cantidad de nodods del arbol
        if (a.ArbolVacio()) {
            return 0;
        }
        else{
            return (1+ Contar(a.HijoIzq()) + Contar(a.HijoDer()));
        }
    }

    public static int CalcularProfundidad(ArbolBBTDA t, int x){
        if (t.ArbolVacio()) {
            return 0;
        }else if (t.Raiz()==x) {
            return 0;
        }else if (t.Raiz()>x) {
            return (1+ CalcularProfundidad(t.HijoIzq(), x));
        }else{
            return (1+CalcularProfundidad(t.HijoDer(), x));
        }
    }

    public static boolean existeElementoEnABB(ArbolBBTDA t, int x){
        if (t.ArbolVacio()){
             return false ;
        }
        else if (t.Raiz() == x){
            return true;
        }
        else if (t.Raiz() > x){
            return existeElementoEnABB(t.HijoIzq(), x);
        }
        else{
            return existeElementoEnABB(t.HijoDer(), x);
        }
    }
    
    public static ConjuntoTDA NodosPares(ArbolBBTDA a){
    
        ConjuntoTDA r= new ConjuntoDinamico();
        r.InicializarConjunto();
        
        if (!a.ArbolVacio()){
            if (a.Raiz() % 2 == 0){
                r.Agregar(a.Raiz());
            }
            ConjuntoTDA rI = NodosPares(a.HijoIzq());
            ConjuntoTDA rD = NodosPares(a.HijoDer());
            while (!rI.ConjuntoVacio()){
                int x = rI.Elegir();
                r.Agregar(x);
                rI.Sacar(x);
            }
            while (!rD.ConjuntoVacio()){
                int x = rD.Elegir();
                r.Agregar(x);
                rD.Sacar(x);
            }
        }
        return r;
    }

    public static boolean EsHoja(ArbolBBTDA a, int valor){
        
        if (a.ArbolVacio()){
            return false ;
        }
       else if (a.Raiz() == valor && a.HijoDer().ArbolVacio() && a.HijoIzq().ArbolVacio()){
           return true;
        }
       else if (a.Raiz() > valor){
           return EsHoja(a.HijoIzq(), valor);
        }
       else{
           return EsHoja(a.HijoDer(), valor);
        }

    }

    public static int MenorElemento(ArbolBBTDA a){
        if (a.ArbolVacio()) {
            return -1;
        }else if (a.HijoIzq().ArbolVacio()) {
            return a.Raiz();
        }else{
            return MenorElemento(a.HijoIzq());
        }
    }

    public static int Sumatoria(ArbolBBTDA a){
        if (a.ArbolVacio()){
            return 0;
        }
        else{
            return (a.Raiz() + Sumatoria(a.HijoDer()) + Sumatoria(a.HijoIzq()));

        }
    }

    public static int CantDeHojas(ArbolBBTDA a){
        if(a.ArbolVacio()){
            return 0;
        }else if (EsHoja(a, a.Raiz())){
            return (1+ CantDeHojas(a.HijoDer()) + CantDeHojas(a.HijoDer()));
        }else{
            return (CantDeHojas(a.HijoDer()) + CantDeHojas(a.HijoDer()));
        }
    }

    public static int Altura(ArbolBBTDA a){
        if (a.ArbolVacio()) {
            return 0;
        }else if (1+ Altura(a.HijoIzq()) > Altura(a.HijoDer())+1){ //como si fuera la funcion max, comparo que rama tiene mayor altura si la izqu o derecha
            return(1+Altura(a.HijoIzq()));
            
        }else{
            return (Altura(a.HijoDer())+1);
        }
        
    }
    
    public static boolean IgualForma(ArbolBBTDA a,ArbolBBTDA b){
        if (a.ArbolVacio() && b.ArbolVacio()) {
            return true;
        }else if (a.ArbolVacio() || b.ArbolVacio()) {
            return false;
        }else{
            return (IgualForma(a.HijoDer(), b.HijoDer()) && IgualForma(a.HijoIzq(), b.HijoIzq()));
        }
        

        
    }

    public static boolean ArbolesIguales(ArbolBBTDA a, ArbolBBTDA b){
        return (IgualForma(a, b) && Sumatoria(a)==Sumatoria(b));

    }

    public static int ContarElemEnNivel(ArbolBBTDA a, int nivel){
        if (a.ArbolVacio() || nivel<0) {
            return 0;
        }else if (nivel==0){
            return 1;
        }else{
            nivel--;
            return (ContarElemEnNivel(a.HijoDer(), nivel) + ContarElemEnNivel(a.HijoIzq(), nivel));
        }
    }

    public static ConjuntoTDA ElementosMayores(ArbolBBTDA a, int val){
        ConjuntoTDA conj = new ConjuntoDinamico();
        conj.InicializarConjunto();

        if (!a.ArbolVacio()){
            if (a.Raiz() > val){
                conj.Agregar(a.Raiz());
            }
            ConjuntoTDA conjI = ElementosMayores(a.HijoIzq(),val);
            ConjuntoTDA conjD = ElementosMayores(a.HijoDer(),val);

            while (!conjI.ConjuntoVacio()){
                int x = conjI.Elegir();
                conj.Agregar(x);
                conjI.Sacar(x);
            }
            while (!conjD.ConjuntoVacio()){
                int x = conjD.Elegir();
                conj.Agregar(x);
                conjD.Sacar(x);
            }
        }
        return conj;
    }

    public static int ElementoAnterior(ArbolBBTDA a,int valor){
        
        if (a.Raiz()==valor) {
            return a.Raiz();
        }else if (ElementoAnterior(a.HijoDer(), valor)==valor || ElementoAnterior(a.HijoIzq(), valor)==valor) {
            return a.Raiz();
        }else{
            return -1;
        }
    }

}

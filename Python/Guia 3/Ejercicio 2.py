"""
Programa desarrollado por Manuel Nuñez el 5 de septiembre del 2023 a las 10:03hs
para cada matriz que se muestra en el pdf, desarrollar una funcion que la genere y escribir un programa que invoque
a cada una y las muestre en pantalla. el tamaño debe establecerse como NXN es decir, puede ser variable"""

def ImprimirMatriz(matriz):
    """Funcion de impresion de matrices"""
    
    for fila in matriz:
        for elemento in fila:
            print("%5d"%elemento, end="")
        print()

def MatrizA(filas,columnas):
    """Creación de matriz tipo A: [[1 0 0 0]
                                    [0 3 0 0]
                                    [0 0 5 0]
                                    [0 0 0 7]]"""
    
    matriz=[]
    acum=1
    for f in range(filas):
        matriz.append([])
        for c in range(columnas):
            if f==c: ##cuando el numero de fila y columna coincida le agrega el numero impar (en la diagonal)
                matriz[f].append(acum)
                acum+=2
            else:
                matriz[f].append(0)
    return matriz

def MatrizB(filas,columnas):
    """Creacion de matriz tipo B: [[0 0 0 27]
                                   [0 0 9 0]
                                   [0 3 0 0]
                                   [1 0 0 0]]"""
    matriz=[]
    acum=0## esta seria la cantidad de 0 a la derecha del numero
    for f in range(filas):
        matriz.append([])
        for c in range(columnas):
            if c==columnas-1-acum: ## cuando la columna sea igual a la columna menos acum le agrega el numero)
                matriz[f].append(3**c) ##3^c 3 elevado al numero de columna actual
                acum+=1
            else:
                matriz[f].append(0)
    return matriz

def MatrizC(filas,columnas):
    matriz=[[0]*columnas for i in range(filas)]
    limite=columnas
    acum=filas ##el numero mas grande de la matriz que va arriba de todo
    veces=1 ##repeticiones ded numero en cada fila
    for f in range(filas):
        for i in range(0,veces):
            matriz[f].insert(0,acum) ##agrega el numero al principio la cantidad que sea "veces" en cada caso  
        acum-=1
        veces+=1
        matriz[f]=matriz[f][ :limite] ##saco lo sobrante con una rebanada
        
    return matriz

def MatrizF(filas,columnas):
    matriz=[[0]*columnas for i in range(filas)]
    limite=columnas-1
    acum=1
    veces=1
    for f in range(filas):
        for i in range(0,veces):
#             matriz[f].insert(0,acum)
            matriz[f][0]=acum
            acum+=1
        matriz[f][0:veces]=sorted(matriz[f][:veces])    
        matriz[f]=matriz[f][ : : -1]
        veces+=1
    return matriz


def main():
    fila=int(input("ingrese numero de filas de la matriz: "))
    columna=int(input("ingrese numero de columnas de la matriz: "))
    
    ImprimirMatriz(MatrizF(fila,columna))
    
    
    
if __name__=="__main__":
    main()
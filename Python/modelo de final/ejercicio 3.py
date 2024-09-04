import random

def CrearMatriz(tamaño=4):
    numeros_unicos=set()
    matriz=[]
    
    for i in range((tamaño*tamaño)):
        numeros_unicos.add(random.randint(100,999))
        
    for f in range(tamaño):
        matriz.append([])
        for c in range(tamaño):
            matriz[f].append(numeros_unicos.pop())
    return matriz


def IngresoTamaño():
    while True:
        try:
            n=int(input("ingrese tamaño de la matriz, un numero positivo y menor a 20: "))
            assert n<20, "El numero ingresado es mayor a 20"
            assert n>0, "el numero ingresado es negativo o igual a 0"
            break
        except ValueError as mensaje:
            print(f"Error, {mensaje}, intente de nuevo\n")
        except AssertionError as mensaje:
            print(f"{mensaje}, intente de nuevo\n")
            
    return n

def MayorMenorDiagonal(matriz):
    mayor=0
    menor=1000
    largo=len(matriz)
    for i in range(largo):
        if matriz[i][i]>mayor:
            mayor=matriz[i][i]
        if matriz[i][i]<menor:
            menor= matriz[i][i]
    return menor,mayor

def ListaDiagonalSup(matriz):
    lista=[]
    largo=len(matriz)
    for i in range(largo):
        lista=lista + matriz[i][i:]
    return lista

def ListadiagonalInf(matriz):
    lista=[]
    largo=len(matriz)
    for i in range(largo):
        lista=lista+ matriz[i][:i+1]
    return lista
    
    
n=IngresoTamaño()
matriz=CrearMatriz(n)
for fila in matriz:
    for elemento in fila:
        print(elemento, end=" ")
    print()

menor,mayor=MayorMenorDiagonal(matriz)
print(f"el mayor numero de la diagonal es el {mayor} y el menor es {menor}")

diagonalSup=ListaDiagonalSup(matriz)
print("elementos de la triangular superior:")
print(*diagonalSup)

diagonalInf=ListadiagonalInf(matriz)
print("\n elementos de la triangular inferior:")
print(*diagonalInf)

imparesSuperior=list(filter(lambda x: x%2!=0,diagonalSup))
print(f"impares diagonal superior:")
print(imparesSuperior)





    

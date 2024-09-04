"""
Programa desarrollado por Manuel Nuñez el 3 de octubre del 2023 a las 14:11
consigna:
desarrolle un programa que permita realizar reservas en una sala de cine de N filas con M butacas por fila.
desarrollar las siguientes funciones en el programa:

    -Mostrar_butacas: mostrar en pantalla el estado de cada una de la s butacas, se deberá mostrar antes de que el ususario realize
    la reserva y se volvera  a mostrar despues de que la misma actualizada
    -Reservar: debera recibir una amtriz de parametro y la butaca seleccionada y actualizará ña matriz en caso de estar disponible,
    la funcion devuelve TRUE o FALSE si se logro reservar o no la butaca
    -CargarSala: recibe la matriz como paramentro y la cargará con valores aleatorios para simular una sala con butacas reservada
    -Butacas_libres: Recibe como parametro una amtriz y retornrá cuantas butacas desocupadas hay en la sala
    -Butacas contiguas: Busca la secuencia mas larga de butacas libres contiguas en una misma fila, devuelve las coordenadas de inicio
"""
import random

def CargarSala(matriz):
    filas=len(matriz)
    columnas=len(matriz[0])
    for f in range(filas):
        for c in range(columnas):
            matriz[f][c]=random.randint(0,1)
    MostrarButacas(matriz)

def MostrarButacas(matriz):
    for fila in matriz:
        for elemento in fila:
            print("%2d"%elemento,end=" ")
        print()

def Reservar(matriz):
    coFila=int(input("ingrese en que fila esta la butaca a reservar: \n"))
    coColumna=int(input("ingrese en quie columna esta la butaca a reservar: \n"))
    if(matriz[coFila][coColumna])==1:
        return False
    else:
        matriz[coFila][coColumna]=1
        return True

def ButacasLibres(matriz):
    cant=0
    for f in range(len (matriz)):
        cant=cant+matriz[f].count(0)
        
    return cant

def ButacasContiguas(matriz):
    pass





def main():
    f=int(input("ingrese cantidad de filas :"))
    c=int(input("ingrese cantidad de columnas: "))
    matriz=[[0]*c for i in range(f)]
    CargarSala(matriz)
    butacaLibre=Reservar(matriz)
    if not butacaLibre:
        print("la butaca ya fue ocupada")
    else:
        print("butaca Reservada, actualizando datos:\n")
        MostrarButacas(matriz)
        
    print("la sala tiene %d butacas libres"%ButacasLibres(matriz))
    
    
if __name__=="__main__":
    main()
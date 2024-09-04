"""
Programa desarrollado por Manuel Nuñez el 3 de octubre del 2023 a las 13:39
consigna:
desarrollar una amtriz de N x N con numeros enteros al azar comprendidos entre 0 y N^2 de forma que ningun numero se repita
"""
import random
def Buscar(matriz,n):
    for s in range(len(matriz)):
        if n in matriz[s]:
            return True
    return False

        

n=4

matriz=[]
for f in range(n):
    matriz.append([])
    for c in range(n):
        item=random.randint(0,n**2)
        while Buscar(matriz,item):
            item=random.randint(0,n**2)
        matriz[f].append(item)

for fila in matriz:
    for elemento in fila:
        print("%3d"%elemento,end=" ")
    print()

"""
Programa desarrollado por Manuel Nuñez el 1 de octubre del 2023 a las 13:00
consigna:
 - Crear una lista con los cuadrados de los numeros entre 1 y N (ambos incluidos) dond3e N se ingresa desde el teclado.
 - luego imprimir los ultimos 10 valores de la lista
"""

n=int(input("ingrese N"))
lista=[n**2 for n in range(n+1)]
for i in range(len(lista)-1,len(lista)-11,-1):
    if i<0:
        break
    else:
        print(lista[i])
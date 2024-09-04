"""
Programa desarrollado por Manuel Nuñez el 31 de agosto del 2023 a las 8:10
consigna:
 escribir funciones para:
    a. Generar una lista de 50 numeros aleatorios del 1 al 100
    b. Recibir una lista como parametro y devolver True si la misma contiene algun elemento repetido, sin modificar la lista
    c. Recibir una lista como parámetro y devolver una nueva lista con los elementos unicos de la lista original sin importar el orden
"""
import random

def CrearLista():
    lista=[]
    for i in range(50):
        lista.append(random.randint(1,100))
        
    return lista

def BuscarRepetidos(lista):
    x=0
    numeroRepetido=0
    
    veces=lista.count(lista[x])
    if veces<2:
        while x<len(lista)-1:
            x+=1
            veces=lista.count(lista[x])
            if veces>=2:
                break
        else:
            return False,-1
        
    numeroRepetido=lista[x]
    return True,numeroRepetido

def EliminarRepetidos(lista):
    hayRepetidos,valorRepetido=BuscarRepetidos(lista)
    while hayRepetidos:
        if valorRepetido in lista:
            lista.remove(valorRepetido)
        hayRepetidos,valorRepetido=BuscarRepetidos(lista)
        
    return lista
            


lista=CrearLista()

print("lista original: ")
print(*lista,sep=" - ")
lista=EliminarRepetidos(lista)
print("\nlista sin repetidos:\n",*lista,sep=" - ")


# lista ejemplo:
# lista=[99, 97, 29, 90, 31, 86, 78, 59, 91, 29, 47, 40, 52, 62, 70, 57, 61, 13, 84, 19, 20, 59, 95, 86, 91, 99, 62, 20, 54, 89, 97, 15, 35, 86, 35, 88, 7, 82, 97, 73, 64, 91, 67, 6, 90, 16, 4, 35, 72, 5]
# se repiten 29 x2,91 x3,20 x2 ,86 x3,97 x2,35x2 =14 repeticiones
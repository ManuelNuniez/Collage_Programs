"""
Programa desarrollado por Manuel Nuñez el 3 de octubre del 2023 a las 12:53
consigna:

escribir una funcion que reciba una lista de numeros enteros como parámetro y la normalice, es decir,
que todos sus elementos deben sumar 1, respetando las proporciones relativas que cada elemento tiene en la lista original.
desarrollar un programa que permita verificar el comportamiento de la funcion

"""
import random

def Normalizar(lista):
    suma=sum(lista)
    print(*lista)
    print(suma)
    
    if suma!=1:
        listaNormalizada=list(map(lambda x: x/suma,lista))
        
    return listaNormalizada
    
        

def main():
    lista=[random.randint(1,3) for x in range(4)]
    listaNueva=Normalizar(lista)
    print(sum(listaNueva))
    print(*listaNueva)
    
if __name__=="__main__":
    main()
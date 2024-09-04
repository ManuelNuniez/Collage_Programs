"""
Programa desarrollado por Manuel Nuñez el 1 de octubre del 2023 a las 13:15
consigna:

Escribir una funcion que reciba una lista como parametro y devuelva True si esta ordenada de forma ascedente o false en caso contrario.
"""
import random

def EstaOrdenada(lista):
    for i in range(len(lista)):
        if lista[i]>lista[i+1]:
            return False
        else:
            return True


lista= [chr(random.randint(65,90)) for x in range(6)]
s=random.randint(1,2)
if s==1:
    lista.sort(reverse=True)
else:
    lista.sort()
    
print(EstaOrdenada(lista))
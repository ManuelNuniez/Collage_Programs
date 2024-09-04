"""
Programa desarrollado por Manuel Nuñez el 3 de octubre del 2023 a las 13:28
consigna:
generar una lista con numeros al azar entre 1 y 100 y crear una nueva lista con los elementos de la primera que sean impares.
el proceso deberá realizarse usando listas por comprension, imprimir las 2 listas en pantalla
"""
import random

lista1=[random.randint(1,100) for x in range(10)]
print(*sorted(lista1))

        

lista2 =[x for x in range(1,100) if x in lista1 and x%2==1]

print(*lista2)
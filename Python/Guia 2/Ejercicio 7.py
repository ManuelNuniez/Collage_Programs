"""
Programa desarrollado por Manuel Nuñez el 3 de octubre del 2023 a las 13:07
consigna:

intercalar los elementos de una lista entre los elementos de otra, debera realizarse exclusivamente mediante rebanadas
y no se creará una nueva lista, se modificara la nueva
"""

import random

lista1=[random.randint(0,10) for x in range(5)]
print(*lista1)
lista2=[random.randint(0,10) for y in range(5)]

for i in range(len(lista2)):
    # Insertamos el elemento de lista2 en la posición 2*i+1 de lista1
    lista1[2*i+1:2*i+1] = [lista2[i]]
print(*lista2)    
print(*lista1)



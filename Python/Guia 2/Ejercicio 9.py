"""
Programa desarrollado por Manuel Nuñez el 3 de octubre del 2023 a las 13:25
consigna:
generar un lista por comprension con los digitos entre A y be que sean multiplos de 7 pero no de 5
"""

a=int(input("ingrese a: "))
b=int(input("ingrese B: "))
lista=(x for x in range(a,b) if x%7==0 and x%5!=0)

print(*lista)
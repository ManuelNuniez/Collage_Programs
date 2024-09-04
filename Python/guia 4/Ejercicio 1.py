"""Programa desarrollado por Manuel Nuñez el 14 de septiembre del 2023 a las 09:55
consigna:
 desarrollar una funcion que determine si una cadena de caracters es capicúa, son utilizar cadenas auxiliares ni rebanadas.
 
"""

def Capicua(cadena):
    esCapicua=True
    cadena= cadena.replace(" ","")
    long=len(cadena)
    for i in range(long//2):
        if cadena[i]!=cadena[long-1-i]:
            esCapicua=False
            break
    return esCapicua


palabra=input("ingrese una cadena: ")

if Capicua(palabra):
    print("la cadena ingresada es capicua.")
else:
    print("la cadena ingresada no es capicua")
    
    """palabras de prueba:
        anita lava la tina
        reconocer
        112211
        oso
        radar
    """
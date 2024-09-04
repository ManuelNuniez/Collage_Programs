"""Programa desarrollado por Manuel Nuñez el 13 de septiembre del 2023 a las 10:14hs
Consigna:
desarrollar una funcion que devuelva los ultimos n caracteres de una cadena dada"""

def UltimosN(cadena,n):
    if n>len(cadena):
        n=len(cadena)
    indice=len(cadena)-n
    subCadena=cadena[indice: ]
    return subCadena

def main():
    string=input("ingrese una cadena de caracteres: \n")
    n=int(input("ingrese los ultimos digitos que desa conservar: "))
    cadenaNueva=UltimosN(string,n)
    print(cadenaNueva)
    
    
if __name__=="__main__":
    main()
"""Programa desarrollado por Manuel Nuñez el 13 de septiembre del 2023 a las 09:35
Consigna:
    desarrollar funcion que extraiga una subcadena de caracteres indicando la posicion y la cantidad de caracteres deseada.
    devolver la nueva cadena como valor de retorno"""

def Extraccion(cadena,posicion,caracteres):
    """utilizando slides"""
    subcadena=cadena[posicion:posicion+caracteres]
    return subcadena


def ExtraccionBis(cadena,posicion,caracteres):
    subcadena=cadena[posicion]
    for i in range(posicion+1,posicion+caracteres):
        subcadena=subcadena+cadena[i]
    return subcadena


def main():
    frase=input("ingrese cadena de carácteres: ")
    pos=int(input("a partir de que posicion se extraeran carácteres?\n"))
    
    while pos>len(frase)-1 or pos<0:
        print("posicion fuera de rango")
        pos=int(input("a partir de que posicion se extraeran carácteres?\n"))
        
    cant= int(input("cuantos caracteres desea extraer?\n"))
    if (pos+cant)>len(frase):
        cant=(len(frase)-pos)
        
#     subCadena=Extraccion(frase,pos,cant)
    subCadena=ExtraccionBis(frase,pos,cant)
    print("la nueva cadena de caracteres:\n",subCadena)
    
    
    
    
    
if __name__=="__main__":
    main()
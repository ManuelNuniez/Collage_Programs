"""Programa desarrollado por Manuel Nuñez el 13 de septiembre del 2023 a las 09:56
Consigna:
funcion que reciba como parametros un string en el que las palabras esten separadas por uno o mas espacios.
devolver otra cadena con las palabras ordenadas alfabeticamente dejando un espacio entre ellas"""

def SacaryOrdenar(cadena):
    lista=cadena.split()
    lista.sort()
    return (' ').join(lista)
    


def main():
    cadena=input("ingrese cadena de caracteres: \n")
    cadena=SacaryOrdenar(cadena)
    print("la cadena limpia y ordenada es:\n",cadena)
    
if __name__=="__main__":
    main()
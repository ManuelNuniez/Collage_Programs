"""Programa desarrollado por Manuel Nuñez el 13 de septiembre del 2023 a las 10:20hs
Consigna:
desarrollar una funcion para remplazar todas las apariciones de una palabra por otra en una cadena de caracteres
devolver la cadena obtenida y un entero con la cantidad de remplazos realizados.
tener en cuenta de solo remplazar palabras completas y no fragmentos
"""

def Remplazar(cadena,palabraVieja,palabraNueva):
    lista=cadena.split()
    contador=0
    for i,elemento in enumerate(lista):
        if elemento==palabraVieja:
            lista[i]=palabraNueva
            contador+=1
    return contador,(' ').join(lista)
            
            


def main():
    string=input("ingrese cadena de caracteres: \n")
    palabraV=input("que palabra desea eliminar?\n")
    palabraN=input("que palabra desea agregar?:\n")
    veces,cadenaNueva=Remplazar(string,palabraV,palabraN)
    
    print("se hicieron %d remplazos\n"%veces)
    print(cadenaNueva)
    
if __name__=="__main__":
    main()
"""programa desarrollado por manuel núñez el 5 de octubre de 2023 a las 09:29hs
consigna:
escribir una funcion para eliminar una subcadena de una cadena de cartacteres
a partir de su posicion y cantidad de caracteres dados, devolviendo una cadena resultante
escribir un programa para verificar el comportamiento de la misma
escribir una funcion para cada uno de los siguientes casos:
    utilizando slices
    sin utilizar slices
"""
def BorrarConSlices(cadena,indice,limite):
    if limite>=len(cadena[indice: ]):
        subCadena=cadena[ :indice]
    else:
        subCadena=cadena[ :indice] + cadena[indice+limite: ]
    return subCadena

def BorrarSinSlices(cadena,indice,limite):
    subCadena=""
    for i,elemento in enumerate(cadena):
        if i>=indice and i<(indice+limite):
            continue
        else:
            subCadena=subCadena+elemento
    return subCadena







def main():
    cadena=input("ingrese cadena de caracteres: \n")
    posicion=int(input("a partir de que posicion desea eliminar: \n"))
    cantidad=int(input("ingrese cantidad de caracteres a eliminar: \n"))
    
    #cadenaNueva=BorrarConSlices(cadena,posicion,cantidad)
    cadenaNueva=BorrarSinSlices(cadena,posicion,cantidad)
    print(cadenaNueva)
    
if __name__=="__main__":
    main()
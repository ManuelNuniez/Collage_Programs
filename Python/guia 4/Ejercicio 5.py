"""Programa desarrollado por Manuel Nuñez el 13 de septiembre del 2023 a las 09:55
Consigna:
 Escribir una funcion "filtrar_Palabras()" que reciba una cadena que contenga una frase y un entero N y devuelva otra cadena
 con las palabras que tengan n o mas carácteres de la cadena original.
 escribir un programa para verificar el comportamiento de la misma y hacer 3 versiones de la funcion para cada caso:
     -utilizando solo ciclos normales
     -utilizando listas por comprension
     -utilizando filter
"""
# def FiltrarPalabras(cadena,n):
#     """utilizando ciclos normales"""
#     lista=cadena.split()
#     cadenaNueva=[]
#     
#     for palabra in (lista):
#         if len(palabra)>=n:
#             cadenaNueva.append(palabra)
#             
#     
#     return ' '.join(cadenaNueva)

# def FiltrarPalabras(cadena,n):
#     """utilizando listas por comprension"""
#     lista=cadena.split()
#     nuevaCadena=[palabra for palabra in lista if len(palabra)>=n]
#     return ' '.join(nuevaCadena)

def FiltrarPalabras(cadena,n):
    """utilizando filter"""
    lista=cadena.split()
    nuevaCadena=list(filter(lambda x: len(x)>=n,lista))
    return ' '.join(nuevaCadena)



def main():
    string="era lunes y no tenia ganas de ir a la escuela"
    numero=3
    print(FiltrarPalabras(string,numero))
    
if __name__=="__main__":
    main()
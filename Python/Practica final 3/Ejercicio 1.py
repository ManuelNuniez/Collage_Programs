def FiltrarCadena(cadena,nuevaCadena=""):
    if len(cadena)==0:
        return nuevaCadena
    else:
        if cadena[0].isalpha() or cadena[0]== " ":
            return FiltrarCadena(cadena[1:],nuevaCadena+ cadena[0])
        else:
            return FiltrarCadena(cadena[1:],nuevaCadena)
        
cadena=input("ingrese frase: ")
nueva=FiltrarCadena(cadena)
print(f"la nueva cadena quedo de la siguiente manera:\n{nueva}")
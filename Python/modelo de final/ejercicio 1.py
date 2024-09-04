def ExtraerCaracter(frase,lista=[], contador=0):
    if contador>=len(frase):
        return lista
    else:
        if frase[contador][0].isalpha():
            return ExtraerCaracter(frase,lista+list(frase[contador][0]),contador+1)
        else:
            return ExtraerCaracter(frase,lista,contador+1)
        
cadena=input("ingrese una frase: ")
cadena=cadena.split()
listaIniciales=ExtraerCaracter(cadena)
print(listaIniciales)
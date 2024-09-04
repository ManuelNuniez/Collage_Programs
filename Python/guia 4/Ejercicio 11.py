"""Programa desarrollado por Manuel Nuñez el 13 de septiembre del 2023 a las 10:40hs
Consigna:
escribir un programa que cuente cuantas veces se encuentra una subcadena dentro de otra cadena, sin diferenciar mayusculasy minusculas
tener en cuenta que los caracteres de la subcadena no necesariamente deben estar en forma consecutiva dentro de la cadena
pero si respetando el orden de los mismos"""

def BuscarSubCadena(string,subString):
    contSubString=0
    contadorLetra=0
    for letra in string:
        if letra==subString[contadorLetra]:
            contadorLetra+=1
            if contadorLetra==len(subString):
                contadorLetra=0
                contSubString+=1
    return contSubString
        
    

def main():
    cadena=input("ingrese cadena de caracteres: \n")
    subCadena=input("ingrese subCadena: \n")
    cadena=cadena.lower()
    subCadena=subCadena.lower()
    
    veces=BuscarSubCadena(cadena,subCadena)
    
    print("se encontró %d veces la subCadena\n"%veces)

    
if __name__=="__main__":
    main()
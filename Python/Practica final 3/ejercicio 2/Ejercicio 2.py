def AnalizarPalabra(palabra):
    conjPalabra=set(palabra)
    return len(conjPalabra)

def PalabraMasLarga(linea):
    linea=linea.replace("\n","")
    listLinea=linea.split(" ")
    largo=0
    for i in range(0,len(listLinea)):
        palabraAnalizada=AnalizarPalabra(listLinea[i])
        if palabraAnalizada>largo:
            palabraLarga=[]
            largo=palabraAnalizada
            palabraLarga.append(listLinea[i])
        elif palabraAnalizada==largo:
            palabraLarga.append(listLinea[i])
            
    if len(palabraLarga)>1:
        return (";").join(palabraLarga) + "\n"
    else:
        return str(palabraLarga[0]) + "\n"
    
try:
    frases=open("frases.txt","rt")
    palabras=open("palabra_mas_larga.txt","wt")
    
    for linea in frases:
        palabraClave=PalabraMasLarga(linea)
        palabras.write(palabraClave)
    
except FileNotFoundError as mensaje:
    print(f"el archivo no se pudo abrir correctamente, {mensaje}")
except OSError as mensaje:
    print(f"ERROR, {mensaje}")
    
finally:
    try:
        frases.close()
        palabras.close()
    except NameError:
        pass
    
    
        
        
    
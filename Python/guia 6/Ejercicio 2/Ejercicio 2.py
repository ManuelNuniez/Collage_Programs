"""escribir un programa que permita grabar un archivo los datos de lluvia caida durante un año.
cada linea del archivo se grabara con el siguiente formato:
        <dia>;<mes>;<lluvia en mm>
los datos se generaran mediante numero al azar entre 50 y 200.
por ultimo hay que leer el archivo generado e imprimir un informe de forma matricial donde cada columna represente el mes
y cada fila corresponda a los dias del mes. imprimir el total de lluvia caida en todo el año
"""
import random
def diasMes(mes):
    treintaDias=[4,6,9,11]
    if mes in treintaDias:
        return 1
    elif mes==2:
        return 0
    else:
        return -1

def ContadorDias(dia, mes):
    dia+=1
    tipoMes=diasMes(mes)
    if tipoMes==1 and dia>30:
        mes+=1
        dia=1
    elif tipoMes==-1 and dia>31:
        dia=1
        mes+=1
    elif tipoMes==0 and dia>28:
        mes+=1
        dia=1
        
    return dia,mes

def GenerarMatriz(lectura):
    matriz= [["-"]*30 for i in range(12)]
    for fila in matriz:
        for elemento in fila:
            print("%2s"%elemento,end= " " )


def main():
    try:
        escritura= open("lluvia.txt", "wt")
        lectura= open("lluvia.txt", "rt")
        dia=0
        mes=1
        acum=0
        dia,mes=ContadorDias(dia, mes)
        while dia<=31 and mes<=12:
            mmLluvia=random.randint(50,200)
            acum+=mmLluvia
            linea=";".join(list(map(str,[dia,mes,mmLluvia])))
            escritura.write(linea + "\n")
            dia,mes=ContadorDias(dia, mes)
        
        GenerarMatriz(lectura)
        print(f"\ncalleron {acum} mm de lluvia")
            
    except FileNotFoundError as mensaje:
        print("no se pudo abrir el archivo, ", mensaje)
    except OSError as mensaje:
        print("ERROR:", mensaje)
    finally:
        try:
            escritura.close()
            lectura.close()
        except NameError:
            pass
        

if __name__== "__main__":
    main()
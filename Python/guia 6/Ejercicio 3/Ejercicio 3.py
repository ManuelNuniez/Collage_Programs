"""programa desarrollado por manuel nuñez el 26 de octubre del 2023 a las 10:30 hs
consigna:
clasificacion de atletas, realizar un programa que haga lo siguiente:
-GrabarRangoAlturas(): graba en un archivo las alturas de los atletas de distintas diciplinas, los que se ingresan desde el teclado. cada dato debe
    ser grabado en una linea distinta
- GrabarPromedio():graba en un archivo los promedios de las alturas de los atletas presentes en el archivo generado en el paso anterior
    la disciplina y el promedio deben grabarse en lineas diferentes.
- MostrarMasAltos() muestra por pantalla la disciplina deportiva cuyos atletas superan la estatura promedio general. Obtener los datos
del segundoa rchivo"""
def IngresoDeporte():
    deporte=input("ingrese el nombre del deporte que desea registrar o X para terminar: ")
    deporte.lower()
    while not deporte.isalpha():
        deporte=input("ingrese el nombre del deporte Valido o X para terminar: ")
    return deporte
         
def IngresoDeAlturas():
    while True:
        try:
            alturas=float(input("ingrese altura de un atleta en metros o -1 para terminar: "))
            assert alturas==-1 or alturas>0
            break
        except (ValueError,AssertionError):
            print("altura invalida, ingrese nuevamente")
    
    return alturas

def GrabarRangoAlturas():
    try:
        archAlturas= open("Alturas","wt")
        deporte=IngresoDeporte()
        while deporte!='x':
            archAlturas.write(deporte + '\n')
            altura=IngresoDeAlturas()
            while altura!=-1:
                altura=str(altura)
                archAlturas.write(altura + '\n')
                altura=IngresoDeAlturas()
            deporte=IngresoDeporte() 
    except OSError as mensaje:
        print("ERROR: ", mensaje)
    else:
        print("carga de datos en el archivo finalizada exitosamente")
    finally:
        try:
            archAlturas.close()
        except NameError:
            pass
def GrabarPromedio():
    alturas=[]
    try:
        archAlturas= open("Alturas","rt")
        archPromedio= open("promedioxDeporte","wt")
        
        for linea in archAlturas:
            linea=linea.split("\n")
            if linea[0].isalpha():
                if len(alturas)>0:
                    alturas= list(map(float,alturas))
                    promedio=str(sum(alturas)/len(alturas))
                    archPromedio.write(promedio + "m" + "\n")
                    alturas=[]
                archPromedio.write(linea[0] + " Promedio de altura:" + "\n")
            else:
                alturas.append(linea[0])
        alturas= list(map(float,alturas))
        promedio=str(sum(alturas)/len(alturas))
        archPromedio.write(promedio + "m" + "\n")
        
    except FileNotFoundError as mensaje:
        print("el archivo no se pudo leer",mensaje)
        
            
                    
    except OSError as mensaje:
        print("ERROR: ",mensaje)
    else:
        print("archivo de promedios se creo exitosamente")
    finally:
        try:
            archAlturas.close()
            archPromedio.close()
        except NameError:
            pass
            

def main():
    #GrabarRangoAlturas()
    GrabarPromedio()

if __name__=="__main__":
    main()
    

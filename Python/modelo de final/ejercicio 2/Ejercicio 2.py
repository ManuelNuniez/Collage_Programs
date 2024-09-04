import random

def BuscarPregunta(archivo,preguntasHechas):
    archivo.seek(0)
    numero=random.randint(1,8)
    for i in range(numero):
        linea=archivo.readline()
    pregunta=linea.split(";")
    
    while linea[0] in preguntasHechas:
        archivo.seek(0)
        numero=random.randint(1,8)
        for i in range(numero):
            linea=archivo.readline()
        pregunta=linea.split(";")
    preguntasHechas.append(linea[0])
    print(pregunta[1])
    return pregunta[2][:2],preguntasHechas

def IngresarRespuesta():
    while True :
        try:
            resp=input("Respuesta: ")
            resp=resp.lower()
            assert resp=="si" or resp=="no"
            break
        except (AssertionError,ValueError):
            print("ingrese una respuesta valida, intente nuevamente")
    return resp
    
        

try:
    archivo=open("preguntas.txt", "rt")
    juegoTerminado=False
    ganadas=0
    preguntasHechas=[]
    while not juegoTerminado and ganadas<3:
        respuesta,preguntasHechas=BuscarPregunta(archivo,preguntasHechas)
        respuestaUsuario=IngresarRespuesta()
        if respuestaUsuario!=respuesta:
            juegoTerminado=True
            print("ohh, fallaste, suerte en el proximo intento")
        else:
            ganadas+=1
            
    if ganadas==3:
        print("Felicidades, ganaste!!")

    
except FileNotFoundError as mensaje:
    print(f"el archivo no fue encontrado, {mensaje}")
finally:
    try:
        archivo.close()
    except OSError:
        pass
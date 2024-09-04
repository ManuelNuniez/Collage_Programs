""" programa creado por manuel núñez el 24 de agosto del 2023 a las 10:30 hs
Consigna:
desarrollar una funcion que reciba 3 numeros enteros positivos.
verifique si corresponden a una fecha correcta o no, realizar tambien un programa para verificar el comportamiento de la funcion"""
def Positivo(numero):
    if numero<0:
        numero=numero*-1
    
    return numero

def EsBisiesto(anio):
    if anio % 4 != 0:
        return False
    elif anio % 100 != 0:
        return True
    elif anio % 400 != 0:
        return False
    else:
        return True

def FechaCorrecta(dia,mes,año):
    bisiesto=EsBisiesto(año)
    if mes<12:
        if dia<31:
            if dia<30 and (mes==4 or mes==6 or mes==9 or mes==12):
                return True
            elif dia<31 and mes!=2:
                return  True
            elif dia<29:
                if bisiesto:
                    return True
                elif dia<28 and not bisiesto:
                    return True
                
    return False

dia=int(input("ingrese dia: "))
Positivo(dia)
    
mes=int(input("ingrese mes: "))
Positivo(mes)

anio=int(input("ingrese año: "))
Positivo(anio)

nice=FechaCorrecta(dia,mes,anio)

if nice:
    print("la fecha ingresada es valida")
else:
    print ("la fecha ingresada no es valida")



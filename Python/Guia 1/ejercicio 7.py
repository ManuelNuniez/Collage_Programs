""" programa creado por manuel núñez el 24 de agosto del 2023 a las 10:49 hs
Consigna:
Desarrollar funcion que reciba como parametro una fecha cualquiera expresada en 3 enteros y calcule y devuelva 3 enteros correspondientes al dia dado,
luego armar programas que permitan:
 - sumar N dias
 - Calcular cantidad de dias existentes entre 2 fechas"""
def diasMes(mes):
    if mes==4 or mes==6 or mes==9 or mes==12:
        return False 
    elif mes!=2:
        return True
    else:
        return False

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
    mesNudillo=diasMes(mes)
    if mes<=12:
        if dia<=31:
            if dia<=30 and not mesNudillo and mes!=2:
                return True
            elif dia<=31 and mesNudillo:
                return  True
            elif dia<=29 and mes==2:
                if bisiesto:
                    return True
                elif dia<=28 and not bisiesto:
                    return True
                
    return False

def IngresoFecha():
    nice=False 
    while not nice:
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
    return dia,mes,anio

def DiaSiguiente(dia,mes,año):
    mesNudillo=diasMes(mes)
    bisiesto=EsBisiesto(año)
    dia+=1
    if (dia>30 and not mesNudillo) or(dia>31 and mesNudillo):
        dia=1
        mes+=1
    elif mes==2:
        if (dia>29 and bisisesto) or (dia>28 and not bisiesto):
            dia=1
            mes+=1
    
    if mes>12:
        mes=1
        dia=1
        año+=1
        
    return dia,mes,año

## sumar dias:
# dia,mes,anio=IngresoFecha()
# print("\n la fecha ingresada es: %02d/%02d/%d"%(dia,mes,anio))
# 
# masDias=int(input("ingrese cantidad de dias a sumar: "))
# for i in range(masDias):
#     dia,mes,anio= DiaSiguiente(dia,mes,anio)
# 
# print("la nueva fecha es: %02d/%02d/%d"%(dia,mes,anio))

##Diferencia de dias:
dia,mes,anio=IngresoFecha()
print("\n la fecha ingresada es: %02d/%02d/%d\n "%(dia,mes,anio))


print("\n ingrese una segunda fecha: ")

dia2,mes2,anio2=IngresoFecha()
print("\n la segunda fecha ingresada es: %02d/%02d/%d \n"%(dia2,mes2,anio2))
contadorDias=0
while dia!=dia2 or mes!=mes2 or  anio!=anio2:
    dia,mes,anio= DiaSiguiente(dia,mes,anio)
    contadorDias+=1
    

print("hay %d dias de diferencia entre la primera y segunda fecha"%contadorDias)


        
        
            
        
    



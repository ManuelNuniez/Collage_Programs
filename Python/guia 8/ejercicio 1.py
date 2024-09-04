def FechaValida(dia,mes):
    if mes.isalpha():
        mes=mes.lower()
    tMeses = ("enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre")
    if mes in tMeses and dia>0:
        if (mes==tMeses[3] or mes==tMeses[5] or mes==tMeses[8] or mes==tMeses[9])  and dia>31:
            return False,[]
        elif (mes in tMeses and mes!=tMeses[1]) and dia>30:
            return False,[]
        elif mes == tMeses[1] and dia>29:
            return False,[]
        else:
            print(f"la fecha es: {dia} de {mes}")
            return True, [dia,tMeses.index(mes)]
    else:
        return False,[]
    
def SumarDias(fechaActual, dias):
    dias31=(3,5,8,9)
    while dias>0:
        fechaActual[0]+=1
        dias-=1
        if fechaActual[0]>31 and fechaActual[1] in dias31:
            fechaActual[0]=1
            fechaActual[1]+=1
        elif fechaActual[0]>30 and fechaActual[1]<12 and fechaActual[1]!=1:
            fechaActual[0]=1
            fechaActual[1]+=1
        elif fechaActual[0]>29 and fechaActual[1]==1:
            fechaActual[0]=1
            fechaActual[1]+=1
            
        if fechaActual[1]>11:
            fechaActual[0]=1
            fechaActual[1]=0
    return fechaActual
    
    
        
while True:
    try:
        dia=int(input("ingrese numero de dia: "))
        mes= input("ingrese mes: ")
        valida,fecha=FechaValida(dia, mes)
        assert valida
        break
    except (ValueError, AssertionError):
        print("-fecha invalida, intentelo nuevamente\n")
while True:
    try: 
        diasSumar=int(input("ingrese la cantidad de dias que quiere sumar a su fecha anterior: "))
        break
    except ValueError as mensaje:
        print("ingrese un valor valido\n")
fecha=SumarDias(fecha,diasSumar)
print("ahora la fecha actual es el %d del %d"%(fecha[0],fecha[1]))

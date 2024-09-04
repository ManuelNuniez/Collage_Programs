def ExtenderFecha(fecha):
    mes=fecha[1]-1
    tMeses = ("enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre")
    mensaje= "la fecha ingresada no es valida"
    if mes <=11 and mes>=0:
        if (mes==3 or mes==5 or mes==8 or mes==9)  and dia>31:
            return False, mensaje
        elif mes!=1 and dia>30:
            return False,mensaje
        elif mes == 1 and dia>29:
            return False,mensaje
        else:
            mensaje= f"{fecha[0]} de {tMeses[mes]} del 2{fecha[2]:0>3}"
            return True, mensaje
    else:
        return False, mensaje

while True:
    try:
        dia=int(input("ingrese numero de dia: "))
        mes= int(input("ingrese numero de mes: "))
        año= (input("ingrese los 2 ultimos digitos del año: "))
        fecha= (dia,mes,año,)
        assert len(fecha[2])<=3 and len(fecha[2])>0
        valida,msg=ExtenderFecha(fecha)
        assert valida
        
        break
    except (ValueError, AssertionError):
        print("la fecha ingresada no es valida")
        

print(msg)
        
    
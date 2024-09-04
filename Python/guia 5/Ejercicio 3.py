"""Programa desarrollado por Manuel Nuñez el 19 de Octubre del 2023 a las 10:10
Consigna:
Desarrollar una funcion que devuelva una cadena de caracteres con el nombre del mes cuyo numero recibe como parametro
los nombres de los meses Deberan obtenerse de una lista de cadenas de caracteres inicializada dentro de la funcion,
devolver una cadena vacia si el numero de mes es invalido, la deteccion de meses invalidos se deberá hacer con excepciones"""

def SeleccionarMes(nro): 
    mes=[]
    nro-=1
    listaMeses=["Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"]
    try:
        assert nro>=0
        mes=listaMeses[nro]
    except (IndexError,AssertionError):
        print("ERROR: el numero de mes que busca, no existe")
        return mes
    return mes


def main():
    numeroMes=int(input("ingrese el numero de mes que desea buscar: "))
    mes=SeleccionarMes(numeroMes)
    
    if len(mes)>0:
        print("el mes seleccionado es el nro %d que corresponde al mes de %s"%(numeroMes,mes))
        
if __name__=="__main__":
    main()
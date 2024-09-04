"""
Programa desarrollado por Manuel Nuñez el 2 de septiembre del 2023 a las 14:40hs
consigna:
 ingreso de numero de afiliado (numero positivo de 4 digitos)
 ingreso de urgencia con un 0 y por turno con un 1, se termina la carga de datos con -1 en la seccion de numero de socio
 
     a. mostrar listado de los pacientes atendidos por urgencia y de los atendidos por turno, en orden de llegada
     b. Realizar busqueda de un numero de afiliado e informar cuantas veces se presento por turno y cuantas por urgencia. repetir
     hasta que se ingrese un -1 en numerod e afiliado a buscar
 """


def BuscarAfiliado(nro,lista):
    """se encarga de buscar si el numero de afiliado fue registrado antes, devuelve su posicion"""
    if nro in lista:
        pos=lista.index(nro)
        return pos
    else:
        print("\nEl afiliado no existe")
        return -1
    
def MostrarLista(listaPacientes,listaUrgencia,listaTurno):
    """ impresion de las listas con formato y todo"""
    
    print("               Tipo De Atencion")
    print("paciente - Por Turno - Por urgencia")
    for i in range(len(listaPacientes)):
        print("%d %10d %11d"%(listaPacientes[i],listaTurno[i],listaUrgencia[i]))

        
def Afiliado():
    
    """se ingresa el numero de afiliado corroborando si es correcto
        devuelve un numero de afiliado valido"""
    
    
    nroAfiliado=int(input("ingrese nro de afiliado o -1 para terminar: "))
        
    while nroAfiliado > 9999 or nroAfiliado<-1:
        nroAfiliado=int(input("nro de afiliado incorrecto, ingrese nuevamente: "))
        
    return nroAfiliado
           

def main():
       
    urgencia=[]
    turno=[]
    afiliados=[]
    
    nroAfiliado=Afiliado()
    while nroAfiliado!=-1:
        posicion=BuscarAfiliado(nroAfiliado,afiliados)
        
        if posicion==-1:# si BuscarAfiliado() devuelve -1 es porque el afiliado no existe, entonces lo agregamos
            print("Nuevo afiliado agregado\n")
            afiliados.append(nroAfiliado)
            turno.append(0)
            urgencia.append(0)
            
        atencion=int(input("ingrese 0 si es urgencia o 1 si es por turno: "))
        while atencion!=0 and atencion!=1:
            print ("Tipo de atencion invalido")
            atencion=int(input("ingrese 0 si es urgencia o 1 si es por turno: "))
           
           
        if atencion==1:
            turno[posicion]=turno[posicion]+1
        else:
            urgencia[posicion]=turno[posicion]+1
            
        nroAfiliado=Afiliado()
    if len(afiliados)>0:        
        MostrarLista(afiliados,urgencia,turno)
        
        nroAfiliado=int(input("ingrese el numero de afiliado que desea buscar o  -1 para terminar: "))
        while nroAfiliado!=-1:
            posicion=BuscarAfiliado(nroAfiliado,afiliados)
            if posicion!=-1:
                print("\nel afiliado %d ingresó %d veces por turno y %d veces por urgencia"%(afiliados[posicion],turno[posicion],urgencia[posicion]))
            nroAfiliado=int(input("\ningrese el numero de afiliado que desea buscar: "))

if __name__=="__main__":
    main()
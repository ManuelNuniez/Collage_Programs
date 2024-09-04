import random
def BuscarPar(lista,mayor=0):
    if len(lista)==0 and mayor==0:
        return -1
    elif len(lista)==0:
        return mayor
    else:
        n=lista.pop()
        if n%2==0 and n>mayor:
            mayor=n
        return BuscarPar(lista,mayor)
    
lista=[random.randint(1,31) for i in range(3)]
parMayor=BuscarPar(lista)
if parMayor==-1:
    
    print("no hay numeros pares en la lista")
else:
    print(f"el mayor numero par es: {parMayor}")
    
    
    
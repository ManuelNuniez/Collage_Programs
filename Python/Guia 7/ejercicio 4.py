def SumasSuscesivas(n, n2, acum=0):
    if acum==n*n2:
        return acum
    acum=acum+n
    return SumasSuscesivas(n,n2,acum)
    
    
    
n=3
n2=4
mul=SumasSuscesivas(n,n2)
print(mul)
def SumasSuscesivas(n, n2):
    if n<0:
        return n+n2
    return SumasSuscesivas(n-n2,n2)
    
    
    
n=12
n2=4
mul=SumasSuscesivas(n,n2)
print(mul)
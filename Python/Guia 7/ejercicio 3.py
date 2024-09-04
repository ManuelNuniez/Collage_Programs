def ContarDigitos(n,acum=0):
    if n==0:
        return acum
    else:
        acum+=n
        n-=1
        return ContarDigitos(n,acum)
    
n=10
acum=ContarDigitos(n)
print(f"el numero {n}, suma= {acum}")
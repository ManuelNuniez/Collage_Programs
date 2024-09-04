def ContarDigitos(n,contador=0):
    n=n//10
    contador+=1
    if n==0:
        return contador
    else:
        
        return ContarDigitos(n,contador)
    
n=1234567890
cant=ContarDigitos(n)
print(f"el numero {n} tiene {cant} digitos")

def VerificarUsuario(usuario):
    if usuario.isalnum():
        return True
    else:
        return False
    
def VerificarDominio(dominio):
    partesDominio=dominio.split(".")
    if len(partesDominio)>3:
        return False
    elif len(partesDominio[0])<1:
        return false
    elif partesDominio[1]!="com" or partesDominio[2]!="ar":
        return False
    else:
        return True
    

def VerificarCorreo(correo):
    partes=correo.split("@")
    if len(partes)>2:
        return False
    dominio=VerificarDominio(partes[1])
    usuario=VerificarUsuario(partes[0])
    if not dominio or not usuario:
        return False
    else:
        return True
    

listaCorreos=[]
correo=input("ingrese correo electónico \n")

while len(correo)>0:
    correcto=VerificarCorreo(correo)
    while not correcto:
        correo=input("ingrese correo electónico Valido \n")
        correcto=VerificarCorreo(correo)
    if correcto:
        print("correo Valido \n")
        listaCorreos.append(correo.lower())
        
    correo=input("ingrese correo electónico \n")
    
print("\nIngreso finalizado, lista de correos: \n")

for correo in listaCorreos:
    print(correo)
    

        

def escribirEnArchivos(alumno,desaprobados,aprobados,estado):
    alumno=(";").join(alumno)
    if estado==0:
        aprobados.write(alumno + "\n")
    else:
        desaprobados.write(alumno + ";" + estado + "\n")
        


try:
    archAlumnos=open("alumnos.txt","rt")
    archAprobados=open("aprobados.txt","wt")
    archDesaprobados=open("desaprobados.txt","wt")
    
    for linea in archAlumnos:
        recuperar=0
        alumno=linea.split(";")
        alumno[1]=alumno[1].capitalize()
        alumno[2]=alumno[2].capitalize()
        if len(alumno[4])>1:
            alumno[4]=alumno[4][:-1:]
        
        
        if int(alumno[3])<4 or int(alumno[4])<4:
            if int(alumno[3])<4 and int(alumno[4])<4:
                recuperar="AMBOS"
            elif int(alumno[3])<4:
                recuperar= "PRIMERO"
            else:
                recuperar="SEGUNDO"
                
        escribirEnArchivos(alumno,archDesaprobados,archAprobados,recuperar)
                
    
except FileNotFoundError as mensaje:
    print(f"no se pudo abrir el archivo, {mensaje}")
    
finally:
    try:
        archAlumnos.close()
        archAprobados.close()
        archDesaprobados.close()
    except OSError:
        pass
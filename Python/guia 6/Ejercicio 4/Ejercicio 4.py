


def main():
    try:
        lectura= open("apellidos.txt", "rt")
        escritini= open("ITALIA.txt", "wt")
        escriturez= open("ESPAÑA.txt", "wt")
        escritian= open("ARMENIA.txt", "wt")
        

        for linea in lectura:
            nombre=linea.split(",")
            nombre=nombre[0].lower()
            if nombre[-3:]=="ini":
                escritini.write(linea)
            elif nombre[-3:]=="ian":
                escritian.write(linea)
            elif nombre[-2:]=="ez":
                escriturez.write(linea)
            
            
        
        
    except FileNotFoundError as mensaje:
        print(f"no se pudo encontrar el archivo, {mensaje}")
    except OSError as mensaje:
        print(f"ERROR, {mensaje}")
    finally:
        try:
            lectura.close()
            escritini.close()
            escritian.close()
            escriturez.close()
        except NameError:
            pass
if __name__=="__main__":
    main()
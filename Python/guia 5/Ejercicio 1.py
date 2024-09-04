"""Programa desarrollado por Manuel Nuñez el 19 de Octubre del 2023 a las 09:55
Consigna:
Desarrollar una funcion para ingresar a travez del teclado un número natural.
la funcion va a rechazar cualquier ingreso invalido de datos utilizando excepciones y mostrara la razon exacta del error.
Controlar que se ingrese un numero, que ese numero sea entero y mayor a 0
devolver el valor ingresado cuando sea correcto.
"""

def EsCorrecto():
    while True:
        try:
            n=int(input("ingrese numero entero mayor a 0: "))
            assert n>0, "\nERROR: el numero es menor o igual a 0"
            break
        except ValueError:
            print("\nERROR: ingrese un numero entero valido")
        except AssertionError as mensaje:
            print(mensaje)
    return n


def main():
    n=EsCorrecto()
    print("El numero entero ingresado es %d y es correcto"%n)
    
    
if __name__=="__main__":
    main()
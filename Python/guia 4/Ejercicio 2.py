"""programa desarrollado por manuel núñez el 5 de octubre de 2023 a las 09:18hs
consigna:
leer una cadena de caracteres e imprimirla centrada en la pantalla. suponer que la misma tiene 80 Columnas."""

cadena=input("ingrese cadena de caracteres: ")
ancho=80
costados=(ancho-len(cadena))//2
print(f"{' '*costados}{cadena}{' '*costados} ")
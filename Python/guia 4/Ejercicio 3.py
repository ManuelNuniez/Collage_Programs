"""Programa desarrollado por Manuel Nuñez el 13 de septiembre del 2023 a las 09:42
Consigna:
 los numeros clave de 2 caja fuertes estan intercalados dentro de un número llamado "clave maestra" de longitud desconocida
 realizar un programa para obtener ambas claves una clave esta en posiciones imapares y la otra en las posiciones pares
"""

claveMaestra =input("ingresar Clave maestra ")
longitud= len(claveMaestra)
caja1 = claveMaestra[0:longitud:2]
print("clave de la primera caja: \n%s"%caja1)

caja2 = claveMaestra[1:longitud:2]
print("clave de la segunda caja: \n%s"%caja2)
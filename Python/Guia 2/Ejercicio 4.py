"""
Programa desarrollado por Manuel Nuñez el 31 de agosto del 2023 a las 10:00
consigna:
 Eliminar de una lista de palabras, las palabras que estan en otra lista
 """

listaOriginal=["Argentina","Croacia", "PBajos", "Australia", "copa", "copa", "copa", "Francia","Croacia"]
listaElimina=["Croacia","PBajos","Australia","Francia"]
print("lista original: ")
print(*listaOriginal,sep=" - ")
print("\nPalabras a eliminar:")
print(*listaElimina,sep=" - ")

x=0
while x<=len(listaElimina)-1:
    while listaElimina[x] in listaOriginal:
        listaOriginal.remove(listaElimina[x])
    x+=1
print("\nResultado: ")
print(*listaOriginal,sep=" - ")
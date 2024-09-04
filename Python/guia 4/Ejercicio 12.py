cartas=["1","2","3","4","5","6","7","8","9","Sota","Caballo","Rey"]
palos=["Oros","Bastos","Copas","Espadas"]

baraja=[f"{carta} {palo}" for palo in palos for carta in cartas]

for naipe in baraja:
    print(naipe)

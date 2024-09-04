def binario_a_decimal(binario, posicion=0):
    if binario == 0:
        return 0

    ultimo_bit = binario % 10
    decimal_parcial = ultimo_bit * (2 ** posicion)

    # Llamada recursiva para procesar el resto del número binario
    resto_decimal = binario_a_decimal(binario // 10, posicion + 1)

    return decimal_parcial + resto_decimal

# Ejemplo de uso
numero_binario = 1101
resultado_decimal = binario_a_decimal(numero_binario)

print(f"El número binario {numero_binario} en decimal es: {resultado_decimal}")


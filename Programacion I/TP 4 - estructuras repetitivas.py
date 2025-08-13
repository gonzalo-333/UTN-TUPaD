
''' 1) Crea un programa que imprima en pantalla todos los números enteros desde 0 hasta 100 
(incluyendo ambos extremos), en orden creciente, mostrando un número por línea '''

for i in range (0, 101):
    print(i)

''' 2) Desarrolla un programa que solicite al usuario un número entero y determine la cantidad de 
dígitos que contiene '''

num = input('Ingrese un numero: ')
print("El numero ", num, " tiene ", len(num), " digitos")

''' 3) Escribe un programa que sume todos los números enteros comprendidos entre dos valores 
dados por el usuario, excluyendo esos dos valores '''

valor_base = int(input("Ingrese un numero entero: "))
valor_tope = int(input("Ingrese otro numero entero: "))
suma = 0

if valor_base > valor_tope:
    temporal = valor_base
    valor_base = valor_tope
    valor_tope = temporal

for i in range(valor_base+1, valor_tope):
    suma += i
print(suma)

''' 4) Elabora un programa que permita al usuario ingresar números enteros y los sume en 
secuencia. El programa debe detenerse y mostrar el total acumulado cuando el usuario ingrese 
un 0 '''

numero = int(input("Ingrese un numero (0 para cortar): "))
suma = 0

while numero != 0:
    suma += numero
    numero = int(input("Ingrese otro numero (0 para cortar): "))

print(suma)

''' 5) Crea un juego en el que el usuario deba adivinar un número aleatorio entre 0 y 9. Al final, el 
programa debe mostrar cuántos intentos fueron necesarios para acertar el número '''

import random
numero = int(input("Adivine un numero (0 a 9): "))
aleatorio = random.randint(0, 9)
intentos = 0

while numero != aleatorio:
    intentos += 1
    print("Intentalo de nuevo")
    numero = int(input("Adivine un numero (0 a 9): "))

print("¡Adivinaste!")

''' 6) Desarrolla un programa que imprima en pantalla todos los números pares comprendidos 
entre 0 y 100, en orden decreciente '''

for i in range(100, 0, -1):
    if i % 2 == 0:
        print(i)

''' 7) Crea un programa que calcule la suma de todos los números comprendidos entre 0 y un 
número entero positivo indicado por el usuario. '''

tope = int(input("Ingrese un numero mayor a 0: "))
suma = 0

for i in range(0, tope+1):
    suma += i

print(suma)

''' 8) Escribe un programa que permita al usuario ingresar 100 números enteros. Luego, el
programa debe indicar cuántos de estos números son pares, cuántos son impares, cuántos son 
negativos y cuántos son positivos. '''

pares = 0
impares = 0
negativos = 0
positivos = 0

for i in range(100):
    numero = int(input("Ingrese un numero: "))
    if numero % 2 == 0:
        pares +=1
    elif numero % 2 != 0:
        impares += 1
    if numero < 0:
        negativos += 1
    elif numero > 0:
        positivos += 1

print(f"Ha ingresado {pares} numeros pares, {impares} numeros impares, {negativos} numeros negativos y {positivos} numeros positivos.")

''' 9) Elabora un programa que permita al usuario ingresar 100 números enteros y luego calcule la 
media de esos valores. '''

cont = 0
acum = 0

for i in range(3):
    numero = int(input("Ingrese un numero: "))
    cont += 1
    acum += numero

print("El promedio de los valores ingresados es: ", acum/cont)

''' 10) Escribe un programa que invierta el orden de los dígitos de un número ingresado por el 
usuario. '''

numero = str(input("Ingrese un numero: "))
invertido = ''

for i in numero[::-1]:
    invertido += i

print(invertido)

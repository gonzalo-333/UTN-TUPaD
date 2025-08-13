# ejercicio 1
print("Hello World!")

# ejercicio 2
nombre = input("Ingrese su nombre: ")

print(f"Hola {nombre}!")

# ejercicio 3
nombre = input("Ingrese su nombre: ")
apellido = input("Ingrese su apellido: ")
edad = input("Ingrese su edad: ")
lugar = input("Ingrese su lugar: ")

print(f"Soy {nombre} {apellido}, tengo {edad} años y vivo en {lugar}.")

# ejercicio 4
radio = float(input("Ingrese un radio: "))
pi = 3.1416
area = pi*radio**2
perimetro = pi*radio*2

print(area, perimetro)

# ejercicio 5
segundos = int(input("Ingrese una cantidad de segundos: "))
horas = segundos/3600

print(f"{segundos} equivale a {horas} horas.")

# ejercicio 6
numero = int(input("Ingrese un numero: "))

for i in range (1, 11):
    print(f"{numero} x {i} = {numero*i}")

# ejercicio 7
numero1 = int(input("Ingrese primer numero: "))
numero2 = int(input("Ingrese segundo numero: # 

while numero1 == 0 or numero2 == 0:
    numero1 = int(input("ERROR. Ingrese primer numero distinto de 0: "))
    numero2 = int(input("ERROR. Ingrese segundo numero distinto de 0: # 

print("La suma de ambos es: ", numero1 + numero2)
print("La division de ambos es: ", numero1 / numero2)
print("La multiplicacion de ambos es: ", numero1 * numero2)
print("La resta de ambos es: ", numero1 - numero2)

# ejercicio 8
altura = float(input("Ingrese su altura en metros: "))
peso = float(input("Ingrese su peso en kilos: "))
imc = peso/(altura**# 

print(f"Su indice de masa corporal (IMC) es: {imc}")

# ejercicio 9
celsius = float(input("Ingrese una temperatura en grados celsius (Cº): "))
fahrenheit = (9/5)*celsius+32

print(f"Una temperatura de {celsius}Cº equivale a {fahrenheit}Fº")

# ejercicio 10
numero1 = float(input("Ingrese primer numero: "))
numero2 = float(input("Ingrese segundo numero: "))
numero3 = float(input("Ingrese tercer numero: "))
promedio = (numero1 + numero2 + numero3) / 3

print(f"El promedio entre los tres numeros ingresados es: {promedio}")

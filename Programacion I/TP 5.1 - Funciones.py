''' 1. Crear una función llamada imprimir_hola_mundo que imprima por
pantalla el mensaje: “Hola Mundo!”. Llamar a esta función desde el
programa principal '''

#Definicion de funciones
def imprimir_hola_mundo():
    return print("Hola Mundo!")

# Programa principal
imprimir_hola_mundo()

''' 2. Crear una función llamada saludar_usuario(nombre) que reciba
como parámetro un nombre y devuelva un saludo personalizado.
Por ejemplo, si se llama con saludar_usuario("Marcos"), deberá devolver: “Hola Marcos!”. Llamar a esta función desde el programa principal solicitando el nombre al usuario '''

#Definicion de funciones
def saludar_usuario(nombre):
    return print(f"Hola {nombre}!")

# Programa principal
nombre = input("¿Cual es tu nombre?: ")
saludar_usuario(nombre)

''' 3. Crear una función llamada informacion_personal(nombre, apellido,
edad, residencia) que reciba cuatro parámetros e imprima: “Soy
[nombre] [apellido], tengo [edad] años y vivo en [residencia]”. Pedir los datos al usuario y llamar a esta función con los valores ingresados. '''

#Definicion de funciones
def informacion_personal(nombre, apellido, edad, residencia):
    return print(f"Soy {nombre} {apellido}, tengo {edad} años y vivo en {residencia}")

# Programa principal
nombre = input("¿Cual es tu nombre?: ")
apellido = input("¿Y tu apellido?: ")
edad = input("¿Cuantos años tenes?: ")
residencia = input("¿En que localidad vivis?: ")

informacion_personal(nombre, apellido, edad, residencia)

''' 4. Crear dos funciones: calcular_area_circulo(radio) que reciba el radio como parámetro y devuelva el área del círculo. calcular_perimetro_circulo(radio) que reciba el radio como parámetro y devuelva el perímetro del círculo. Solicitar el radio al usuario y llamar ambas funciones para mostrar los resultados '''

# Importo libreria
import math

# Definicion de funciones
def calcular_area_circulo(radio):
    area = math.pi * (radio ** 2)
    return print(f"El area del circulo es {area}.")

def calcular_perimetro_circulo(radio):
    perimetro = 2 * math.pi * radio
    return print(f"El perimetro del circulo es {perimetro}. ")

#Programa principal
radio = float(input("¿Cual es el radio del criculo?: "))
calcular_area_circulo(radio)
calcular_perimetro_circulo(radio)

''' 5. Crear una función llamada segundos_a_horas(segundos) que reciba
una cantidad de segundos como parámetro y devuelva la cantidad
de horas correspondientes. Solicitar al usuario los segundos y mostrar el resultado usando esta función. '''

# Definicion de funciones
def segundos_a_horas(segundos):
    horas = segundos / 3600
    return print(f"{segundos} segundos equivale a {horas} horas")

#Programa principal
segundos = int(input("Ingrese cantidad de segundos: "))
segundos_a_horas(segundos)

''' 6. Crear una función llamada tabla_multiplicar(numero) que reciba un
número como parámetro y imprima la tabla de multiplicar de ese
número del 1 al 10. Pedir al usuario el número y llamar a la función. '''

# Definicion de funciones
def tabla_multiplicar(numero):
    for i in range(1, 11):
        print(f"{numero} x {i} = {numero*i}")

#Programa principal
numero = int(input("Ingrese un numero: "))
tabla_multiplicar(numero)

''' 7. Crear una función llamada operaciones_basicas(a, b) que reciba
dos números como parámetros y devuelva una tupla con el resultado de sumarlos, restarlos, 
multiplicarlos y dividirlos. Mostrar los resultados de forma clara.'''

# Definicion de funciones
def operaciones_basicas(a, b):
    suma = a+b
    resta = a-b
    mult = a*b
    div = a/b
    return print(f"a + b = {suma}, a - b = {resta}, a x b = {mult}, a / b = {div}")

#Programa principal
num1 = int(input("Ingrese un primer numero: "))
num2 = int(input("Ingrese un segundo numero: "))
operaciones_basicas(num1, num2)

''' 8. Crear una función llamada calcular_imc(peso, altura) que reciba el
peso en kilogramos y la altura en metros, y devuelva el índice de
masa corporal (IMC). Solicitar al usuario los datos y llamar a la función para mostrar el resultado con dos decimales. '''

# Definicion de funciones
def calcular_imc(peso, altura):
    imc = peso/(altura**2)
    return print(f"El Indice de Masa Corporal (IMC) es: {round(imc, 2)}")

#Programa principal
peso = float(input("Ingrese peso (en kilogramos): "))
altura = float(input("Ingrese altura (en metros): "))
calcular_imc(peso, altura)

''' 9. Crear una función llamada celsius_a_fahrenheit(celsius) que reciba
una temperatura en grados Celsius y devuelva su equivalente en
Fahrenheit. Pedir al usuario la temperatura en Celsius y mostrar el
resultado usando la función. '''

# Definicion de funciones
def celsius_a_fahrenheit(celsius):
    f = (celsius * (9/5)) + 32
    return print(f"{celsius}ºC equivalen a {f}ºF")

#Programa principal
c = float(input("Ingrese temperatura en ºC: "))
celsius_a_fahrenheit(c)

'''10.Crear una función llamada calcular_promedio(a, b, c) que reciba
tres números como parámetros y devuelva el promedio de ellos.
Solicitar los números al usuario y mostrar el resultado usando esta
función.'''

# Definicion de funciones
def calcular_promedio(a, b, c):
    promedio = (a+b+c)/3
    return print(f"El promedio de los valores ingresados es: {promedio}")

#Programa principal
a = float(input("Ingrese un primer numero: "))
b = float(input("Ingrese un segundo numero: "))
c = float(input("Ingrese un tercer numero: "))
calcular_promedio(a, b, c)
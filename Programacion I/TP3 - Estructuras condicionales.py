#                       Práctico 3: Estructuras condicionales
#-------------------------------------------------------------------------------------------
#                                                                    Mauro Gonzalo Santini

'''
1) Escribir un programa que solicite la edad del usuario. Si el usuario es mayor de 18 años,
deberá mostrar un mensaje en pantalla que diga “Es mayor de edad”
'''

# envio valor ingresado, convertido a entero, a variable
edad = int(input("Ingrese su edad: "))
# lo comparo en la codicion
if edad >= 18:
    print("Es mayor de edad")

'''
2) Escribir un programa que solicite su nota al usuario. Si la nota es mayor o igual a 6, deberá
mostrar por pantalla un mensaje que diga “Aprobado”; en caso contrario deberá mostrar el
mensaje “Desaprobado”
'''

# envio valor ingresado, convertido a entero, a variable
nota = float(input("Ingrese una nota: "))
# lo comparo en la codicion
if nota >= 6:
    print("Aprobado")
else:
    print("Desaprobado")

'''
3) Escribir un programa que permita ingresar solo números pares. Si el usuario ingresa un
número par, imprimir por en pantalla el mensaje "Ha ingresado un número par"; en caso
contrario, imprimir por pantalla "Por favor, ingrese un número par"
'''

# envio valor ingresado, convertido a entero, a variable
numero = int(input("Ingrese un número: "))
# lo comparo en la codicion
if numero%2 == 0:
    print("Ha ingresado un número par")
else:
    print("Por favor, ingrese un número par")

'''
4) Escribir un programa que solicite al usuario su edad e imprima por pantalla a cuál de las
siguientes categorías pertenece:
● Niño/a: menor de 12 años.
● Adolescente: mayor o igual que 12 años y menor que 18 años.
● Adulto/a joven: mayor o igual que 18 años y menor que 30 años.
● Adulto/a: mayor o igual que 30 años
'''

# envio valor ingresado, convertido a entero, a variable
edad = int(input("Ingrese su edad: "))
# lo comparo en la codicion
if edad >= 30:
    print("Categoría: Adulto/a")
elif edad >= 18:
    print("Categoría: Adulto/a jóven")
elif edad >= 12:
    print("Categoría: Adolescente")
else:
    print("Categoría: Niño/a")

'''
5) Escribir un programa que permita introducir contraseñas de entre 8 y 14 caracteres
(incluyendo 8 y 14). Si el usuario ingresa una contraseña de longitud adecuada, imprimir por en
pantalla el mensaje "Ha ingresado una contraseña correcta"; en caso contrario, imprimir por
pantalla "Por favor, ingrese una contraseña de entre 8 y 14 caracteres".
'''

# envio valor a variable, convertido a la cantidad de caracteres que tiene
password = len(input("Ingrese una contraseña: "))
# comparo su valor con las codiciones en la expresion
if password >= 8 and password <= 14:
    print("Ha ingresado una contraseña correcta")
else:
    print("Por favor, ingrese una contraseña de entre 8 y 14 caracteres")

'''
6) Escribir un programa que tome la lista numeros_aleatorios, calcule su moda, su mediana y su 
media y las compare para determinar si hay sesgo positivo, negativo o no hay sesgo. Imprimir 
el resultado por pantalla.
'''

# importo libreria random y, de statistics, solo mode, median, mean
import random
from statistics import mode, median, mean
# genero una lista de 50 numeros aleatorios del 1 al 100
numeros_aleatorios = [random.randint(1, 100) for i in range(50)]
# guardo media, mediana y moda para posterior uso
media = mean(numeros_aleatorios)
mediana = median(numeros_aleatorios)
moda = mode(numeros_aleatorios)
# los comparo e imprimo en pantalla un mensaje segun caso
if media > mediana and mediana > moda:
    print("Sesgo positivo o a la derecha")
elif media < mediana and mediana < moda:
    print("Sesgo negativo o a la izquierda")
else:
    print("Sin sesgo")

''' 
7) Escribir un programa que solicite una frase o palabra al usuario. Si el string ingresado
termina con vocal, añadir un signo de exclamación al final e imprimir el string resultante por
pantalla; en caso contrario, dejar el string tal cual lo ingresó el usuario e imprimirlo por
pantalla
'''

# pido frase y la convierto a minusculas
frase = input("Ingrese una frase: ")
frase_min = frase.lower()
# creo variables en minusculas para comparar luego
a = "a"
e = "e"
i = "i"
o = "o"
u = "u"
# comparo si la ultima letra es vocal, en cuyo casi imprimo la frase original con ! al final
if frase_min[-1] == a or frase_min[-1] == e or frase_min[-1] == i or frase_min[-1] == o or frase_min[-1] == u:
    print(frase + "!")
else:
    print(frase)

'''
8) Escribir un programa que solicite al usuario que ingrese su nombre y el número 1, 2 o 3
dependiendo de la opción que desee:
1. Si quiere su nombre en mayúsculas. Por ejemplo: PEDRO.
2. Si quiere su nombre en minúsculas. Por ejemplo: pedro.
3. Si quiere su nombre con la primera letra mayúscula. Por ejemplo: Pedro.
El programa debe transformar el nombre ingresado de acuerdo a la opción seleccionada por el
usuario e imprimir el resultado por pantalla
'''

# pido nombre, opcion de conversion y convierto opcion a entero
nombre = input("Ingrese su nombre: ")
print("Ahora elija una opción para convertir su nombre a:")
print("1. Si quiere su nombre en mayúsculas. Por ejemplo: PEDRO.")
print("2. Si quiere su nombre en minúsculas. Por ejemplo: pedro.")
print("3. Si quiere su nombre con la primera letra mayúscula. Por ejemplo: Pedro.")
opcion = int(input("Opcion elegida:"))
# comparo opcion con enteros y segun el caso imprimo el nombre como lo eligio el usuario
if opcion == 1:
    print(nombre.upper())
elif opcion == 2:
    print(nombre.lower())
elif opcion == 3:
    print(nombre.title())

'''
9) Escribir un programa que pida al usuario la magnitud de un terremoto, clasifique la
magnitud en una de las siguientes categorías según la escala de Richter e imprima el resultado
por pantalla
'''

# envio valor ingresado, convertido a entero, a variable
magnitud = float(input("Ingrese magnitud del terremoto: "))
# lo comparo en la codicion e imprimo intensidad
if magnitud >= 7:
    print("Extremo (puede causar graves daños a gran escala)")
elif magnitud >= 6:
    print("Muy Fuerte (puede causar daños significativos)")
elif magnitud >= 5:
    print("Fuerte (puede causar daños en estructuras débiles)")
elif magnitud >= 4:
    print("Moderado (sentido por personas, pero generalmente no causa daños)")
elif magnitud >= 3:
    print("Leve (ligeramente perceptible)")
else:
    print("Muy leve (imperceptible)")

'''
10 )Escribir un programa que pregunte al usuario en cuál hemisferio se encuentra (N/S), qué mes
del año es y qué día es. El programa deberá utilizar esa información para imprimir por pantalla
si el usuario se encuentra en otoño, invierno, primavera o verano
'''

# pido dia, mes y hemisferio
dia = int(input("Que dia es (1-31): "))
mes = int(input("Que mes es (1-12): "))
hemisferio = input("¿En que hemisferio se encuentra? (N) norte o (S) sur: ").lower()

# armo condicionales para decidir estacion e imprimirla en pantalla
if (dia >= 21 and mes >= 12) or (dia < 20 and mes <= 3):
    print('Invierno') if hemisferio == 'n' else print('Verano')
elif (dia >= 21 and mes >= 9) or (dia < 20 and mes <= 12):
    print('Otoño') if hemisferio == 'n' else print('Primavera')
elif (dia >= 21 and mes >= 6) or (dia < 20 and mes <= 9):
    print('Verano') if hemisferio == 'n' else print('Invierno')
elif (dia >= 21 and mes >= 3) or (dia < 20 and mes <= 6):
    print('Primavera') if hemisferio == 'n' else print('Otoño')












''' 
1) Crea una función recursiva que calcule el factorial de un número. Luego, utiliza esa 
función para calcular y mostrar en pantalla el factorial de todos los números enteros 
entre 1 y el número que indique el usuario
''' 

# funcion que recibe numero ingresado
def factorial(n):
    # valido convencion de !0 como 1
    if n == 0:
        return 1
    else:
        # calculo factorial del numero llamando a la propia funcion
        return n * factorial(n-1)

#solicito numero para iniciar factorial
numero = int(input("Ingrese un numero: "))
print(factorial(numero))

''' 
2) Crea una función recursiva que calcule el valor de la serie de Fibonacci en la posición 
indicada. Posteriormente, muestra la serie completa hasta la posición que el usuario 
especifique.
''' 

lista = []

# funcion que calcula fibonacci
def fibonacci(n):
    # se que el 1er numero es 0 y el 2do es 1, por lo que 
    # si n es 0 devuelve 0 y si es 1, 1
    if n < 2:
        return n
    else:
        # para cualquier otro numero ingresado voy a calcular recursivamente los dos anteriores,
        # ej: si n=3 manda 2(n-1) y 1(n-2) a la funcion, que hace lo mismo con n=2 y n=1, obteniendo
        # 1 (1+0) para la posicion n=2 y 1 (return n) para n=1. Asi el calculo final para n=3 es 1+1.
        # Resultado: en la posicion 3 de la serie Fibonacci tenemos el valor 2
        return fibonacci(n-1) + fibonacci(n-2)

# funcion que muestra serie fibonacci
def imprimir_secuencia(n):
    # con ciclo for voy enviando todos los numeros anteriores al ingresado
    # y los voy agregando en la lista de numeros de la serie
    for i in range(0, n+1):
        lista.append(fibonacci(i))
    # una vez terminado el ciclo, imprimo la lista
    print(lista)

# pido numero (posicion) para hacer la serie y se lo envio a la funcion que hace la lista
numero = int(input("Ingrese un numero: "))
imprimir_secuencia(numero)

''' 
3) Crea una función recursiva que calcule la potencia de un número base elevado a un 
exponente, utilizando la fórmula b^e = b*b^(e-1). Prueba esta función en un 
algoritmo general
''' 

def potencia(b, e):
    # se que si el exponente = 0 el resultado sera 1, por lo que establezco
    # ese caso base a partir del cual pueda resolverse la potenciacion
    if e == 0:
        return 1
    else:
        # multiplico base por llamadas recursivas a la propia funcion hasta que ésta
        # alcance el caso base y empiece a resolver la operacion principal
        # ej: 2^3 lo resolveria comenzando por la llamada recursiva, a cada llamda la funcion
        # responderia bajando el indice hasta que este sea 0 teniendo, ahi retorna 1 y comienza a resolver
        # hacia atras haciendo 2^1=2, con ese 2 hace 2^2=4 y con ese 4 hace 2^4=8
        return b*potencia(b, e-1)

base = int(input("Ingrese base: "))
expo = int(input("Ingrese exponente: "))
print(potencia(base, expo))

''' 
4) Crear una función recursiva en Python que reciba un número entero positivo en base 
decimal y devuelva su representación en binario como una cadena de texto.
''' 

def binario(n):
    # llego al final de las divisiones del cociente
    if n <= 1 :
        return str(n)
    else:
        # voy concatenando cociente y restos, ya que casteo el caso base a string, quedando el caso base 
        # al principio del string y todos los restos detras y en orden
        cociente = n // 2
        resto = n % 2
        return binario(cociente) + str(resto)

num = int(input("Ingrese un numero: "))
print(binario(num))

''' 
5) Implementá una función recursiva llamada es_palindromo(palabra) que reciba una 
cadena de texto sin espacios ni tildes, y devuelva True si es un palíndromo o False si no 
lo es. Requisitos: La solución debe ser recursiva. No se debe usar [::-1] ni la función reversed()
''' 

def hace_substring(palabra, inicio, fin):
    # verifico si se superponen, lo que significa que se llegó al medio
    if inicio >= fin:
        return ""
    return palabra[inicio] + hace_substring(palabra, inicio + 1, fin)

def es_palindromo(palabra):
    primerLetra = palabra[0]
    ultimaLetra = palabra[len(palabra)-1]
    if len(palabra) <= 1:
        return True
    elif primerLetra != ultimaLetra:
        return False
    else:
        substring = hace_substring(palabra, 1, len(palabra)-1)
        return es_palindromo(substring)

palabra = input("Ingrese una palabra: ")
print(es_palindromo(palabra.lower()))

''' 
6) Escribí una función recursiva en Python llamada suma_digitos(n) que reciba un 
número entero positivo y devuelva la suma de todos sus dígitos.
 Restricciones: No se puede convertir el número a string. Usá operaciones matemáticas (%, //) y recursión
''' 

def es_entero_positivo(n):
    # valido que sea entero positivo
    if n % 1 == 0 and n > 0:
        # si lo es le paso el valor casteado a la funcion que suma
        return suma_digitos(int(n))
    else:
        # si no lo es, sigo llamando recursivamente a la funcion que comprueba
        numero = float(input("ERROR. Ingrese un numero entero positivo: "))
        return es_entero_positivo(numero)

# funcion que hace la suma recibe un valor validado
def suma_digitos(n):
    # caso base: si llegó al final de la recursión, la funcion se "desenrolla" hacia atras
    if n == 0:
        return n
    else:
        # con el modulo saco el ultimo numero y le sumo recursivamente la division entera
        return (n % 10) + suma_digitos(n // 10)

numero = float(input("Ingrese un numero entero positivo: "))
print(f'La suma de los digitos del numero ingresado es {es_entero_positivo(numero)}')

''' 
7) Un niño está construyendo una pirámide con bloques. En el nivel más bajo coloca n 
bloques, en el siguiente nivel uno menos (n - 1), y así sucesivamente hasta llegar al 
último nivel con un solo bloque.
Escribí una función recursiva contar_bloques(n) que reciba el número de bloques en el 
nivel más bajo y devuelva el total de bloques que necesita para construir toda la 
pirámide.
''' 

def contar_bloques(n):
    # llego al final
    if n == 0:
        return n
    else:
        # tomo la base y le voy sumando uno menos que la base misma para los niveles superiores
        return n + contar_bloques(n - 1)

base = int(input("Ingrese cantidad de bloques en la base: "))
print(f'El total de bloques de la piramide es: {contar_bloques(base)}')


'''
8) Escribí una función recursiva llamada contar_digito(numero, digito) que reciba un 
número entero positivo (numero) y un dígito (entre 0 y 9), y devuelva cuántas veces 
aparece ese dígito dentro del número.

'''

def contar_digito(numero, digito):
    # obtengo el ultimo digito con el modulo
    ultimo_digito = numero % 10
    # voy reduciendo el numero, asi lo recorro digito a digito
    ultimo_digito_recursivo = numero // 10
    # llego al final, no tengo nada para devolver ya que estoy por debajo de la unidad
    if numero == 0:
        return 0
    # comparo digito y ultimo digito, si son iguales cuento 1 y le sumo la llamada recursiva
    elif digito == ultimo_digito:
        return 1 + contar_digito(ultimo_digito_recursivo, digito)
    # si no se dieron los casos anteriores, no sumo nada y sigo recorriendo el numero
    else:
        return contar_digito(ultimo_digito_recursivo, digito)


numero = int(input("Ingrese numero positivo: "))
digito = int(input("Ingrese digito del 0 al 9): "))
print(contar_digito(numero, digito))
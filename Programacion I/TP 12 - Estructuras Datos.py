'''
1) Dado el diccionario precios_frutas

precios_frutas = {'Banana': 1200, 'Ananá': 2500, 'Melón': 3000, 'Uva': 1450}

Añadir las siguientes frutas con sus respectivos precios:

● Naranja = 1200
● Manzana = 1500
● Pera = 2300
'''

precios_frutas = {
    'Banana': 1200,
    'Ananá': 2500,
    'Melón': 3000,
    'Uva': 1450
    }

precios_frutas["Naranja"] = 1200
precios_frutas["Manzana"] = 1500
precios_frutas["Pera"] = 2300

print(precios_frutas)

'''
2) Siguiendo con el diccionario precios_frutas que resulta luego de ejecutar el código 
desarrollado en el punto anterior, actualizar los precios de las siguientes frutas:

● Banana = 1330
● Manzana = 1700
● Melón = 2800
'''

precios_frutas = {
    'Banana': 1200,
    'Ananá': 2500,
    'Melón': 3000,
    'Uva': 1450,
    'Naranja': 1200,
    'Manzana': 1500,
    'Pera': 2300
    }

precios_frutas["Banana"] = 1330
precios_frutas["Manzana"] = 1700
precios_frutas["Melón"] = 2800

print(precios_frutas)

'''
3) Siguiendo con el diccionario precios_frutas que resulta luego de ejecutar el código 
desarrollado en el punto anterior, crear una lista que contenga únicamente las frutas sin los 
precios.
'''

precios_frutas = {
    'Banana': 1200,
    'Ananá': 2500,
    'Melón': 3000,
    'Uva': 1450,
    'Naranja': 1200,
    'Manzana': 1500,
    'Pera': 2300
    }

precios = list(precios_frutas.values())
print(precios)

'''
4) Escribí un programa que permita almacenar y consultar números telefónicos.
• Permití al usuario cargar 5 contactos con su nombre como clave y número como valor.
• Luego, pedí un nombre y mostrale el número asociado, si existe.
'''

def consultar_diccionario(agenda):
    busqueda = input("¿Que persona busca?: ").lower()
    if busqueda in agenda.keys():
        return print(agenda[busqueda])
    else:
        return print("La persona no esta en la agenda")

def agregar_diccionario():
    contactos = {}
    print(".:: Agenda ::.")
    for i in range(3):
        nombre = input("Ingresa un nombre: ")
        telefono = input("Ingresa un numero de telefono: ")
        contactos[nombre] = telefono
    return consultar_diccionario(contactos)

agregar_diccionario()

'''
5) Solicita al usuario una frase e imprime:
• Las palabras únicas (usando un set).
• Un diccionario con la cantidad de veces que aparece cada palabra.
'''

def palabras_unicas(frase):
    # recibe la frase, separo las palabras y obtengo una lista
    unicas = frase.split(" ")
    # convierto la lista a set
    unicas = set(unicas)
    return unicas

def recuento(frase):
    # recibe frase y separa palabras
    palabras = frase.split(" ")
    # creo diccionario vacio
    recuento = {}
    # ciclo por la cantida de palabras
    for palabra in palabras:
        # si la palabra vuelve a estar en recuento sumo 1 al valor de la clave
        if palabra in recuento:
            recuento[palabra] += 1
        else:
            # la primera vez que lea la palabra va a ir a parar aca
            # por lo que cargo valor 1
            recuento[palabra] = 1
    return recuento

frase = input("Ingrese frase: ")
print(f"Palabras únicas: {palabras_unicas(frase)}")
print(f"Recuento: {recuento(frase)}")

'''
6) Permití ingresar los nombres de 3 alumnos, y para cada uno una tupla de 3 notas.
Luego, mostrá el promedio de cada alumno.

'''

def cargar_alumnos():
    # creo una lista vacia para almacenar alumons y notas
    lista = []
    # indico que son 3 alumnos con 3 notas cada uno
    num_alumnos = 3
    num_notas = 3
    # itero sobre cantidad de alumnos y los cargo
    for i in range(num_alumnos):
        nombre = input(f"Ingrese nombre del alumno {i+1}: ")
        notas = []
        # itero sobre cantidad de notas y las cargo en lista de notas
        for j in range(num_notas):
            nota = int(input(f"Ingrese nota {j+1} de {nombre}: "))
            notas.append(nota)
        # convierto la lista de notas en tupla
        tupla = tuple(notas)
        # voy cargando alumno y notas en la lista
        lista.append((nombre, tupla))
    # le envio lista a funcion que saca promedio
    return promedio(lista)

def promedio(lista_alumnos_puntajes):
    # recorro la lista
    for alumno in lista_alumnos_puntajes:
        # tomo el indice 1 de la tupla (notas cargadas)
        notas = alumno[1]
        promedio = []
        promedio.append(notas)
        # inicio suma en 0, luego se pisa para no mezclar notas de alumnos
        suma = 0
        #sumo notas y saco promedio
        for nota in notas:
            suma += nota
            promedio = suma/len(notas)
        print(f"El promedio de las notas de {alumno[0]} es: {promedio}")

cargar_alumnos()

'''
7) Dado dos sets de números, representando dos listas de estudiantes que aprobaron Parcial 1
y Parcial 2:
• Mostrá los que aprobaron ambos parciales.
• Mostrá los que aprobaron solo uno de los dos.
• Mostrá la lista total de estudiantes que aprobaron al menos un parcial (sin repetir).
'''

def ambos_parciales(parcial1, parcial2):
    interseccion = parcial1.intersection(parcial2)
    return interseccion

def un_solo_parcial(parcial1, parcial2):
    # primero saco los que estan en el grupo 1 pero no en el 2,
    # luego los que estan en el grupo 2 pero no en el 1,
    # por ultimo hago la union de ambos
    dif1 = parcial1.difference(parcial2)
    dif2 = parcial2.difference(parcial1)
    union = dif1.union(dif2)
    return union
        
def al_menos_uno(parcial1, parcial2):
    # hago una union porque no va a haber repetidos de quienes aprobaron 
    union = parcial1.union(parcial2)
    return union
    
P1 = {"Ana", "Joaquin", "Gabriel", "German", "Vicente", "Juana"}
P2 = {"Ana", "Joaquin", "Giselle", "German", "Clara"}

print(f"Estudiantes que aprobaron ambos parciales: {(ambos_parciales(P1, P2))}")
print(f"Estudiantes que aprobaron un solo parcial: {(un_solo_parcial(P1, P2))}")
print(f"Estudiantes que aprobaron al menos un parcial: {(al_menos_uno(P1, P2))}")

'''
8) Armá un diccionario donde las claves sean nombres de productos y los valores su stock. 
Permití al usuario:
• Consultar el stock de un producto ingresado.
• Agregar unidades al stock si el producto ya existe.
• Agregar un nuevo producto si no existe
'''

def consulta(producto):
    # consulto producto
    if producto.lower() in productos:
        # guardo valor stock de clave producto
        stock = productos[producto]
        print(f"El stock de {producto} es: {stock}")
        # consulto si quiere cambiar el stock
        actualizar_stock = input("¿Desea agregar stock? (si/no): ")
        if actualizar_stock.lower() == "si":
            # si es asi, lo paso a la otra funcion
            agregar_unidades(producto)
        else:
            # si no, finaliza el programa
            print("Programa finalizado.")
    else:
        # si el producto no se encuentra en el diccioneario
        print(f"El producto '{producto}' no se encuentra en la lista.")
        agregar = input(f"¿Desea agregar '{producto}' a la lista? (si/no) ")
        # si lo quiere agregar, lo mando a la otra funcion
        if agregar.lower() == "si":
            agregar_producto(producto)
        else:
            # si no, finaliza el programa
            print("Programa finalizado.")

# recibe el producto al que se desea cambiar stock
def agregar_unidades(producto):
    # pido stock que se desea agregar
    unidades = int(input(f"¿Cuantas unidades de {producto} quiere agregar? "))
    # guardo el stock anterior
    stock = productos[producto]
    #sumo stock anterior al nuevo
    stock += unidades
    print(f"Ahora hay {stock} unidades de {producto}.")
    print("Programa finalizado.")

# recibe producto que no esta en la lista
def agregar_producto(producto):
    # lo cargo a la lista y lo inicio con stock 0
    productos[producto] = 0
    # pregunto si desea agregar stock
    cargar = input(f"El producto {producto} ahora está en la lista, ¿desea cargarle stock? ").lower()
    if cargar == "si":
        # si es asi, lo paso a la otra funcion
        agregar_unidades(producto)
    else:
        # si no, finaliza el programa
        print("Programa finalizado.")
    
productos = {
    "yerba": 50,
    "carne": 60,
    "atun": 15,
    "jabon de manos": 20,
    "rejilla": 12,
    "galletitas de agua": 31,
    "manzana": 40,
    "helado": 0
    }

print("\n--- Consulta de stock ---\n")
producto = input(f"¿Que producto quiere consultar?: ")
consulta(producto)

'''
9) Creá una agenda donde las claves sean tuplas de (día, hora) y los valores sean eventos
Permití consultar qué actividad hay en cierto día y hora.
'''
# recibo la tupla
def consultar_agenda(diaHora):
    # busco la tupla en el diccionario
    if diaHora in agenda:
        print(f"{diaHora[0]} a las {diaHora[1]} horas: {agenda[diaHora]} ")
    else:
        print(f"No hay actividad o evento agendados para el dia {diaHora[0]} {diaHora[1]} horas")

agenda = {
    ("Lunes", "10:00"):"Entregar informe ventas",
    ("Martes", "09:30"):"Reunión",
    ("Miercoles", "15:15"):"Llamar proveedor",
    ("Jueves", "19:00"):"Comprar entradas Megadeth",
    ("Viernes", "16:45"):"Preparar cartel cumpleaños",
}

print(f"\n--- Consultar agenda ---")
# al iniciar pido dia y hora para hacer consulta
dia = input("Ingrese el dia (ej. Lunes): ").lower()
hora = input("Ingrese la hora (ej. 10:00): ")
# mando las variables a una tupla
busqueda = (dia.capitalize(), hora)
# envio la tupla a la funcion
consultar_agenda(busqueda)

'''
10) Dado un diccionario que mapea nombres de países con sus capitales, construí un nuevo 
diccionario donde:
• Las capitales sean las claves.
• Los países sean los valores
'''

def mapear(original):
    # creo un diccionario vacio para alojar los pares clave:valor
    invertido = {}
    # recorro la lista original tomando claves y valores
    for pais, capital in original.items():
        # cada clave del original la guardo como valor en el nuevo 
        # y cada valor lo guardo como clave
        invertido[capital] = pais
    print(invertido)

original = {"Argentina":"Buenos Aires", "Italia":"Roma", "Francia":"Paris", "España":"Madrid", "Noruega":"Oslo"}
# mando diccionario a la funcion
mapear(original)


import time
inventario_jugador_compacto = [
    {"nombre": "Piedra", "cantidad": 100},
    {"nombre": "Oro", "cantidad": 320},
    {"nombre": "Madera", "cantidad": 650},
    {"nombre": "Hierro", "cantidad": 50},
    {"nombre": "Gema", "cantidad": 15}
]

# Lista extendida (100 elementos)
inventario_jugador_extendido = [
    {"nombre": "Piedra", "cantidad": 100},
    {"nombre": "Oro", "cantidad": 320},
    {"nombre": "Madera", "cantidad": 650},
    {"nombre": "Hierro", "cantidad": 50},
    {"nombre": "Gema", "cantidad": 15},
    {"nombre": "Planta Curativa", "cantidad": 45},
    {"nombre": "Tela de Araña", "cantidad": 80},
    {"nombre": "Cuerno de Bestia", "cantidad": 12},
    {"nombre": "Fruta Mágica", "cantidad": 30},
    {"nombre": "Cristal Azul", "cantidad": 7},
    {"nombre": "Polvo Estelar", "cantidad": 220},
    {"nombre": "Raíz Extraña", "cantidad": 40},
    {"nombre": "Seda Élfica", "cantidad": 95},
    {"nombre": "Escama de Dragón", "cantidad": 3},
    {"nombre": "Perla Brillante", "cantidad": 8},
    {"nombre": "Runas Antiguas", "cantidad": 5},
    {"nombre": "Hueso Pulido", "cantidad": 60},
    {"nombre": "Poción de Vida", "cantidad": 25},
    {"nombre": "Mana Pura", "cantidad": 18},
    {"nombre": "Setas Venenosas", "cantidad": 55},
    {"nombre": "Pluma de Grifo", "cantidad": 9},
    {"nombre": "Esencia de Luz", "cantidad": 11},
    {"nombre": "Savia de Árbol", "cantidad": 70},
    {"nombre": "Lana Suave", "cantidad": 150},
    {"nombre": "Barro Fértil", "cantidad": 210},
    {"nombre": "Flor Nocturna", "cantidad": 14},
    {"nombre": "Cáscara de Tortuga", "cantidad": 16},
    {"nombre": "Pelo de Lobo", "cantidad": 85},
    {"nombre": "Diente de Ogro", "cantidad": 4},
    {"nombre": "Agua Bendita", "cantidad": 28},
    {"nombre": "Mineral de Bronce", "cantidad": 180},
    {"nombre": "Baya Roja", "cantidad": 90},
    {"nombre": "Tallo Fuerte", "cantidad": 110},
    {"nombre": "Roca Volcánica", "cantidad": 20},
    {"nombre": "Sal Marina", "cantidad": 130},
    {"nombre": "Corazón de Golem", "cantidad": 2},
    {"nombre": "Ojo de Cíclope", "cantidad": 1},
    {"nombre": "Vial Vacío", "cantidad": 250},
    {"nombre": "Miel Pura", "cantidad": 170},
    {"nombre": "Semilla Antigua", "cantidad": 33},
    {"nombre": "Planta Carnívora", "cantidad": 6},
    {"nombre": "Polen Dorado", "cantidad": 38},
    {"nombre": "Fragmento de Espejo", "cantidad": 10},
    {"nombre": "Llave Oxidada", "cantidad": 1},
    {"nombre": "Símbolo Desconocido", "cantidad": 3},
    {"nombre": "Arena Mágica", "cantidad": 75},
    {"nombre": "Grasa de Slime", "cantidad": 190},
    {"nombre": "Veneno de Serpiente", "cantidad": 20},
    {"nombre": "Flor Glacial", "cantidad": 13},
    {"nombre": "Madera Petrificada", "cantidad": 48},
    {"nombre": "Piedra Solar", "cantidad": 9},
    {"nombre": "Roca Lunar", "cantidad": 7},
    {"nombre": "Seda de Gusano", "cantidad": 115},
    {"nombre": "Sangre de Murciélago", "cantidad": 60},
    {"nombre": "Musgo Luminoso", "cantidad": 140},
    {"nombre": "Alas de Hada", "cantidad": 4},
    {"nombre": "Garra de Oso", "cantidad": 18},
    {"nombre": "Piel de Zorro", "cantidad": 22},
    {"nombre": "Poción de Fuerza", "cantidad": 15},
    {"nombre": "Elixir de Agilidad", "cantidad": 12},
    {"nombre": "Daga Rota", "cantidad": 5},
    {"nombre": "Escudo Vieja", "cantidad": 3},
    {"nombre": "Amuleto Extraño", "cantidad": 1},
    {"nombre": "Capa Desgastada", "cantidad": 2},
    {"nombre": "Guantes de Cuero", "cantidad": 8},
    {"nombre": "Botas Rápidas", "cantidad": 6},
    {"nombre": "Casco Oxidado", "cantidad": 4},
    {"nombre": "Anillo Dorado", "cantidad": 1},
    {"nombre": "Collar de Perlas", "cantidad": 2},
    {"nombre": "Espada Ligera", "cantidad": 7},
    {"nombre": "Arco Corto", "cantidad": 5},
    {"nombre": "Flechas de Hierro", "cantidad": 80},
    {"nombre": "Bolsa de Monedas", "cantidad": 3},
    {"nombre": "Mapa Antiguo", "cantidad": 1},
    {"nombre": "Libro de Hechizos", "cantidad": 2},
    {"nombre": "Papiro Misterioso", "cantidad": 4},
    {"nombre": "Vara de Roble", "cantidad": 9},
    {"nombre": "Antorcha Encendida", "cantidad": 15},
    {"nombre": "Cuerda Resistente", "cantidad": 35},
    {"nombre": "Pico Robusto", "cantidad": 2},
    {"nombre": "Hacha Filosa", "cantidad": 3},
    {"nombre": "Pala de Mano", "cantidad": 7},
    {"nombre": "Red de Pesca", "cantidad": 10},
    {"nombre": "Cesta de Mimbre", "cantidad": 6},
    {"nombre": "Saco Vacío", "cantidad": 25},
    {"nombre": "Botella de Vidrio", "cantidad": 40},
    {"nombre": "Vendaje Limpio", "cantidad": 50},
    {"nombre": "Agujas de Hueso", "cantidad": 18},
    {"nombre": "Hilo Fuerte", "cantidad": 60},
    {"nombre": "Tinta Oscura", "cantidad": 22},
    {"nombre": "Cera de Abeja", "cantidad": 30},
    {"nombre": "Plomo Pesado", "cantidad": 45},
    {"nombre": "Carbón Puro", "cantidad": 110},
    {"nombre": "Azufre Volátil", "cantidad": 19},
    {"nombre": "Salitre Raro", "cantidad": 25},
    {"nombre": "Gusano Luminoso", "cantidad": 12},
    {"nombre": "Raíz Amarga", "cantidad": 8},
    {"nombre": "Hoja de Té", "cantidad": 30},
    {"nombre": "Grano de Café", "cantidad": 40},
    {"nombre": "Especias Exóticas", "cantidad": 15},
    {"nombre": "Vino Añejo", "cantidad": 5}
]

# Algoritmo de ordenamiento burbuja (Bubble Sort)
# Este algoritmo ordena una lista de elementos comparando pares adyacentes
def bubble_sort(arr):
        # Obtiene la longitud de la lista
        n = len(arr)
        # Itera sobre cada elemento de la lista
        for i in range(n):
            # Itera sobre los elementos restantes que no están ordenados
            for j in range(0, n - i - 1):
                # Compara el elemento actual con el siguiente       
                if arr[j] > arr[j + 1]:
                    # Intercambia los elementos si están en el orden incorrecto
                    arr[j], arr[j + 1] = arr[j + 1], arr[j]
        # Devuelve la lista ordenada
        return arr
    



# Ejercicio de ordenamiento de inventario de un jugador con bubble sort
#Definimos una lista de diccionarios que representa dos inventario de distinta extension
#Lista compacta (5 elementos)



# Funcion para ordenar el inventario por cantidad de recursos usando el algoritmo burbuja
# Recibe como parametro una lista de diccionarios
# Devuelve la lista ordenanda por el campo "cantidad"
def bubble_sort_por_cantidad(inventario):
    # Obtiene la cantidad de elementos en el inventario
    n = len(inventario)
    # Itera sobre cada elemento del inventario
    for i in range(n):
        # Itera sobre los elementos restantes que no están ordenados
        for j in range(0, n-i-1):
            # Compara el elemento actual con el siguiente
            if inventario[j]['cantidad'] > inventario[j+1]['cantidad']:
                # Intercambia los elementos si están en el orden incorrecto
                inventario[j], inventario[j+1] = inventario[j+1], inventario[j]
    # Devuelve el inventario ordenado
    return inventario

# Función para mostrar el inventario en la consola
# Recibe como parámetros la lista de inventario y un estado descriptivo
# No devuelve valores, solo imprime el inventario
def mostrar_inventario(inventario, estado):
    # Imprime el encabezado con el estado del inventario
    print(f"\n--- INVENTARIO ({estado}) ---")
    # Itera sobre cada elemento del inventario
    for item in inventario:
        # Imprime la cantidad y el nombre de cada elemento
        print(f"{item['cantidad']} unidades: {item['nombre']}")



inicio = time.time()
#mostrar_inventario(inventario_jugador_compacto, "DESORDENADO")
bubble_sort_por_cantidad(inventario_jugador_compacto)
mostrar_inventario(inventario_jugador_compacto, "ORDENADO")
fin = time.time()
eficiencia = fin - inicio
# se usa formateador de coma flotante a 10 digitos, para facilitar lectura
print(f"El tiempo total de ejecución fue: {eficiencia:.10f} segundos")

inicio = time.time()
#mostrar_inventario(inventario_jugador_extendido, "DESORDENADO")
bubble_sort_por_cantidad(inventario_jugador_extendido)
mostrar_inventario(inventario_jugador_extendido, "ORDENADO")
fin = time.time()
eficiencia = fin - inicio
# se usa formateador de coma flotante a 10 digitos, para facilitar lectura
print(f"El tiempo total de ejecución fue: {eficiencia:.10f} segundos")



# Funcion para ordenar el inventario por cantidad de recursos usando el algoritmo burbuja
# Recibe como parametro una lista de diccionarios
# Devuelve la lista ordenanda por el campo "nombre"
def bubble_sort_por_nombre(inventario):
    # Obtiene la cantidad de elementos en el inventario
    n = len(inventario)
    # Itera sobre cada elemento del inventario
    for i in range(n):
        # Itera sobre los elementos restantes que no están ordenados
        for j in range(0, n-i-1):
            # Compara el elemento actual con el siguiente
            if inventario[j]['nombre'] > inventario[j+1]['nombre']:
                # Intercambia los elementos si están en el orden incorrecto
                inventario[j], inventario[j+1] = inventario[j+1], inventario[j]
    # Devuelve el inventario ordenado
    return inventario

# Ordenamos el inventario compacto por nombre
inicio = time.time()
bubble_sort_por_nombre(inventario_jugador_compacto)
mostrar_inventario(inventario_jugador_compacto, "ORDENADO POR NOMBRE")
fin = time.time()
eficiencia = fin - inicio
# se usa formateador de coma flotante a 10 digitos, para facilitar lectura
print(f"El tiempo total de ejecución fue: {eficiencia:.10f} segundos")

# Ordenamos el inventario extendido por nombre
inicio = time.time()
bubble_sort_por_nombre(inventario_jugador_extendido)
mostrar_inventario(inventario_jugador_extendido, "ORDENADO POR NOMBRE")
fin = time.time()
eficiencia = fin - inicio
# se usa formateador de coma flotante a 10 digitos, para facilitar lectura
print(f"El tiempo total de ejecución fue: {eficiencia:.10f} segundos")

# Algoritmo de ordenamiento por selección (Selection Sort)
# Funcion para ordenar el inventario por cantidad de recursos usando el algoritmo de seleccion
# Recibe como parametro una lista de diccionarios
# Devuelve la lista ordenanda por el campo "nombre"
def selection_sort_por_nombre(inventario):
    # Obtiene los elementos del inventario
    n = len(inventario)
    # Itera sobre cada elemento
    for i in range(n):
        # Inicializa el indice del menor elemento como el actual
        min_idx = i
        # Itera sobre los elementos restantes para ecncontrar el menor
        for j in range(i, n):
            # Comparamos los valores de 'cantidad'
            if inventario[j]["nombre"] < inventario[min_idx]["nombre"]:
                # Actualiza el indice del menor elemento encontrado
                min_idx = j
        # Intercambia el elemento actual con el menor encontrado (sin usar variable temporal)
        inventario[i], inventario[min_idx] =  inventario[min_idx], inventario[i]
    # Devuelve el inventario ordenado
    return inventario

# Función para mostrar el inventario en la consola
# Recibe como parámetros la lista de inventario y un estado descriptivo
# No devuelve valores, solo imprime el inventario
def mostrar_inventario(inventario, estado):
    # Imprime el encabezado con el estado del inventario
    print(f"\n--- INVENTARIO ({estado}) ---")
    # Itera sobre cada elemento del inventario
    for item in inventario:
        # Imprime la cantidad y el nombre de cada elemento
        print(f"{item['nombre']}: {item['cantidad']} unidades")

inicio = time.time()
#mostrar_inventario(inventario_jugador_compacto, "DESORDENADO")
selection_sort_por_nombre(inventario_jugador_compacto)
mostrar_inventario(inventario_jugador_compacto, "ORDENADO")
fin = time.time()
eficiencia = fin - inicio
# se usa formateador de coma flotante a 10 digitos, para facilitar lectura
print(f"El tiempo total de ejecución fue: {eficiencia:.10f} segundos")

inicio = time.time()
#mostrar_inventario(inventario_jugador_extendido, "DESORDENADO")
selection_sort_por_nombre(inventario_jugador_extendido)
mostrar_inventario(inventario_jugador_extendido, "ORDENADO")
fin = time.time()
eficiencia = fin - inicio
# se usa formateador de coma flotante a 10 digitos, para facilitar lectura
print(f"El tiempo total de ejecución fue: {eficiencia:.10f} segundos")

# Funcion para ordenar el inventario por cantidad de recursos usando el algoritmo de seleccion
# Recibe como parametro una lista de diccionarios
# Devuelve la lista ordenanda por el campo "cantidad"
def selection_sort_por_cantidad(inventario):
    # Obtiene los elementos del inventario
    n = len(inventario)
    # Itera sobre cada elemento
    for i in range(n):
        # Inicializa el indice del menor elemento como el actual
        min_idx = i
        # Itera sobre los elementos restantes para ecncontrar el menor
        for j in range(i, n):
            # Comparamos los valores de 'cantidad'
            if inventario[j]["cantidad"] < inventario[min_idx]["cantidad"]:
                # Actualiza el indice del menor elemento encontrado
                min_idx = j
        # Intercambia el elemento actual con el menor encontrado (sin usar variable temporal)
        inventario[i], inventario[min_idx] =  inventario[min_idx], inventario[i]
    # Devuelve el inventario ordenado
    return inventario

# Función para mostrar el inventario en la consola
# Recibe como parámetros la lista de inventario y un estado descriptivo
# No devuelve valores, solo imprime el inventario
def mostrar_inventario(inventario, estado):
    # Imprime el encabezado con el estado del inventario
    print(f"\n--- INVENTARIO ({estado}) ---")
    # Itera sobre cada elemento del inventario
    for item in inventario:
        # Imprime la cantidad y el nombre de cada elemento
        print(f"{item['cantidad']} unidades: {item['nombre']}")

inicio = time.time()
#mostrar_inventario(inventario_jugador_compacto, "DESORDENADO")
selection_sort_por_cantidad(inventario_jugador_compacto)
mostrar_inventario(inventario_jugador_compacto, "ORDENADO")
fin = time.time()
eficiencia = fin - inicio
# se usa formateador de coma flotante a 10 digitos, para facilitar lectura
print(f"El tiempo total de ejecución fue: {eficiencia:.10f} segundos")

inicio = time.time()
#mostrar_inventario(inventario_jugador_extendido, "DESORDENADO")
selection_sort_por_cantidad(inventario_jugador_extendido)
mostrar_inventario(inventario_jugador_extendido, "ORDENADO")
fin = time.time()
eficiencia = fin - inicio
# se usa formateador de coma flotante a 10 digitos, para facilitar lectura
print(f"El tiempo total de ejecución fue: {eficiencia:.10f} segundos")

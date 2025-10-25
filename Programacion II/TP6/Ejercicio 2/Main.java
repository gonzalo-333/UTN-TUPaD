public class Main {
    public static void main(String[] args) {
        System.out.println("--- GESTION DE BIBLIOTECA ---");

        // 1. Creamos una biblioteca.
        System.out.println("\n.:: TAREA 1: CREAR BIBLIOTECA ::.");
        Biblioteca bibliotecaCentral = new Biblioteca("Biblioteca Central");

        // 2. Crear al menos tres autores
        System.out.println("\n.:: TAREA 2: CREAR AUTORES ::.");
        Autor a1 = new Autor("AUT001", "Jorge Luis Borges", "Argentino");
        Autor a2 = new Autor("AUT002", "Isabel Allende", "Chilena");
        Autor a3 = new Autor("AUT003", "Julio Verne", "Francés");
        a1.mostrarInfo();
        a2.mostrarInfo();
        a3.mostrarInfo();

        // 3. Agregar 5 libros asociados a alguno de los Autores a la biblioteca.
        System.out.println("\n.:: TAREA 3: AGREGAR 5 LIBROS ::.");
        bibliotecaCentral.agregarLibro("978-0307455848", "Ficciones", 1944, a1);
        bibliotecaCentral.agregarLibro("978-8420473954", "El Aleph", 1949, a1);
        bibliotecaCentral.agregarLibro("978-0345437937", "La casa de los espíritus", 1982, a2);
        bibliotecaCentral.agregarLibro("978-0140449495", "Viaje al centro de la Tierra", 1864, a3);
        bibliotecaCentral.agregarLibro("978-8445076643", "Veinte mil leguas de viaje submarino", 1870, a3);
        // Intentamos agregar un ISBN duplicado para probar validacion
        bibliotecaCentral.agregarLibro("978-8445076643", "Duplicado", 2000, a2); 

        // 4. Listar todos los libros con su información y la del autor.
        System.out.println("\n.:: TAREA 4: LISTAR TODOS LOS LIBROS ::.");
        bibliotecaCentral.listarLibros();

        // 5. Buscar un libro por su ISBN y mostrar su información.
        System.out.println("\n.:: TAREA 5: BUSCAR LIBRO POR ISBN ::.");
        Libro libroBuscado = bibliotecaCentral.buscarLibroPorIsbn("978-0140449495");
        if (libroBuscado != null) {
            System.out.println("Libro encontrado:");
            libroBuscado.mostrarInfo();
        } else {
            System.out.println("Libro no encontrado.");
        }

        // 6. Filtrar y mostrar los libros publicados en un año específico.
        System.out.println("\n.:: TAREA 6: FILTRAR LIBROS POR AÑO ::.");
        bibliotecaCentral.filtrarLibrosPorAnio(1982);
        
        // 7. Eliminar un libro por su ISBN y listar los libros restantes.
        System.out.println("\n.:: TAREA 7: ELIMINAR LIBRO Y LISTAR RESTANTES ::.");
        bibliotecaCentral.eliminarLibro("978-0345437937"); // La casa de los espíritus
        bibliotecaCentral.listarLibros();

        // 8. Mostrar la cantidad total de libros en la biblioteca.
        System.out.println("\n.:: TAREA 8: CANTIDAD TOTAL DE LIBROS ::.");
        int totalLibros = bibliotecaCentral.obtenerCantidadLibros();
        System.out.println("La biblioteca tiene un total de " + totalLibros + " libros.");

        // 9. Listar todos los autores de los libros disponibles en la biblioteca.
        System.out.println("\n.:: TAREA 9: LISTAR AUTORES DISPONIBLES ::.");
        bibliotecaCentral.mostrarAutoresDisponibles();
    }
}
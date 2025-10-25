import java.util.ArrayList;

class Biblioteca {
    private String nombre;
    private ArrayList<Libro> libros;            // RELACION COMPOSICION

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        // Iniciamos la coleccion
        this.libros = new ArrayList<>(); 
        System.out.println("\nBiblioteca '" + this.nombre + "' creada.");
    }

    public void agregarLibro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        if (buscarLibroPorIsbn(isbn) != null) {
            System.out.println("Libro con ISBN " + isbn + " ya existe. No se agregó.");
            return;
        }
        
        Libro nuevoLibro = new Libro(isbn, titulo, anioPublicacion, autor);
        libros.add(nuevoLibro);
        System.out.println("Libro agregado: " + titulo);
    }

    public void listarLibros() {
        if (libros.isEmpty()) {
            System.out.println("La biblioteca está vacía.");
            return;
        }
        System.out.println("\n--- LISTADO DE LIBROS EN '" + this.nombre + "' (Total: " + libros.size() + ") ---");
        for (Libro l : libros) {
            l.mostrarInfo();
        }
        System.out.println("------------------------------------------------------------\n");
    }

    public Libro buscarLibroPorIsbn(String isbn) {
        for (Libro l : libros) {
            if (l.getIsbn().equals(isbn)) {
                return l;
            }
        }
        return null;
    }

    public boolean eliminarLibro(String isbn) {
        Libro aEliminar = buscarLibroPorIsbn(isbn);
        if (aEliminar != null) {
            libros.remove(aEliminar);
            System.out.println("Libro ISBN: " + isbn + " eliminado.");
            return true;
        }
        System.out.println("No se pudo eliminar. Libro ISBN " + isbn + " no encontrado.");
        return false;
    }

    public int obtenerCantidadLibros() {
        return libros.size();
    }

    public void filtrarLibrosPorAnio(int anio) {
        System.out.println("\n--- LIBROS PUBLICADOS EN EL AÑO " + anio + " ---");
        boolean encontrado = false;
        for (Libro l : libros) {
            if (l.getAnioPublicacion() == anio) {
                l.mostrarInfo();
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontraron libros publicados en " + anio + ".");
        }
        System.out.println("----------------------------------------\n");
    }

    public void mostrarAutoresDisponibles() {
        ArrayList<String> nombresAutores = new ArrayList<>();
        // Recorro la lista de libros, tiene asociados a los autores
        for (Libro l : libros) {
            String nombreAutor = l.getAutor().getNombre();
            // para que no haya autores repetidos tomo nombre de los autores
            //  y si no estan en la ArrayList que los contiene, lo agrego 
            if(!nombresAutores.contains(nombreAutor)){
                nombresAutores.add(nombreAutor);
            }
        }
        
        System.out.println("\n--- AUTORES DISPONIBLES EN LA BIBLIOTECA (" + this.nombre + ") ---");
        for (String nombre : nombresAutores) {
            System.out.println("-> " + nombre);
        }
        System.out.println("-----------------------------------------------------------------\n");
    }
}
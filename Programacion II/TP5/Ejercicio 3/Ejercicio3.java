
public class Ejercicio3 {
    public static void main(String[] args) {

      // 1. Creamos objetos independientes Autor y Editorial
      Autor autor1 = new Autor("George Orwell", "Inglés");
      Editorial editorial1 = new Editorial("Anti Fabian Society Society", "Freedom Av., 333");

      // 2. Creamos un libro, asociando un Autor y una Editorial
      Libro libro1 = new Libro("1984", "978-84-350-1427-4", autor1, editorial1);
        
      System.out.println("=== Información del Libro ===");
      System.out.println("Título: " + libro1.getTitulo());
      System.out.println("Autor: " + libro1.getAutor().getNombre() + " (" + libro1.getAutor().getNacionalidad() + ")");
      System.out.println("Editorial: " + libro1.getEditorial().getNombre() + ", " + libro1.getEditorial().getDireccion() + ".");
    }
}

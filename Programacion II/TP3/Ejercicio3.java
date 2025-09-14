import java.util.Scanner;

public class Ejercicio3 {
  public static void main(String args[]) {
    Scanner input = new Scanner(System.in);

    Libro libro = new Libro();
    libro.setTitulo("Titulo Ausente");
    libro.setAutor("Autor Inexistente");
    libro.setAnioPublicacion(2000);

    System.out.println("Información del libro cargada en sistema:");
    System.out.println("El título del libro es: " + libro.getTitulo());
    System.out.println("El autor del libro es: " + libro.getAutor());
    System.out.println("El año de publicación es: " + libro.getAnioPublicacion());
    System.out.println("");
    System.out.print("Ingrese nuevo año de publicación: ");
    int nuevoAnio = Integer.parseInt(input.nextLine());

    while (nuevoAnio < 2000) {
        System.out.println("Año de publicación inválido. Debe ser 2000 o mayor.");
        System.out.print("Ingrese un anio de publicacion valido: ");
        nuevoAnio = Integer.parseInt(input.nextLine());
    }

    libro.setAnioPublicacion( nuevoAnio );
    System.out.println("");
    System.out.print("Información actualizada del libro: ");
    libro.mostrarInfo();
  }
}

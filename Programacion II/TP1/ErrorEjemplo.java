
import java.util.Scanner;

public class ErrorEjemplo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa tu nombre: ");
    
        // ERROR: String nombre = scanner.nextInt();
        String nombre = scanner.nextLine();     // CORREGIDO
    
        System.out.println("Hola, " + nombre);
    }
}
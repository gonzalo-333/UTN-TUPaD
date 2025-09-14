
import java.util.Scanner;

public class ValoresSolicitados {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String nombre;
        int edad;
        
        System.out.print("Ingrese su nombre: ");
        nombre = input.nextLine();
        
        System.out.print("Ingrese su edad: ");
        edad = Integer.parseInt(input.nextLine());
        
        System.out.println();
        System.out.println("Valores ingresados");
        System.out.println("------------------");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
}
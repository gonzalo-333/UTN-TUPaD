
// Porgrama que pide años de nacimiento e indica edades posibles

import java.util.Scanner;

public class ejercicioIntegrador01 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int anioDeNacimiento, anioActual, edad;
        
        anioActual = 2025;
        
        System.out.print("Ingrese año de nacimiento: ");
        anioDeNacimiento = Integer.parseInt(input.nextLine());
        
        edad = anioActual - anioDeNacimiento;
        System.out.print("Tu edad es: " + (edad-1) + " o " + edad + " años");
    }
}
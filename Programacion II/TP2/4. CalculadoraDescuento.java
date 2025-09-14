
import java.util.Scanner;

public class CalculadoraDescuento {
  public static void main(String args[]) {
    Scanner input = new Scanner(System.in);
    double precio;
    String categoria;
    
    System.out.print("Ingrese precio de producto: $");
    precio = Double.parseDouble(input.nextLine());
    
    System.out.print("Ingrese precio de producto (A, B, C): ");
    categoria = input.nextLine();
    
    if( categoria.equalsIgnoreCase("A") ){
        System.out.println("Descuento aplicado: 10%");
        precio = precio * 0.9;
        System.out.print("Precio final: $" + precio);
    } else if ( categoria.equalsIgnoreCase("B") ){
        System.out.println("Descuento aplicado: 15%");
        precio = precio * 0.85;
        System.out.print("Precio final: $" + precio);
    } else {
        System.out.println("Descuento aplicado: 20%");
        precio = precio * 0.8;
        System.out.print("Precio final: $" + precio);
    } 
  }
}
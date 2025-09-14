
import java.util.Scanner;

public class SumaPares {
  public static void main(String args[]) {
    Scanner input = new Scanner(System.in);
    int num, suma;
    
    System.out.print("Ingrese un número (0 para terminar): ");
    num = Integer.parseInt(input.nextLine());
    suma = 0;
    
    while( num != 0 ){
            
        if( num % 2 == 0 ){
            suma += num;    
        }
        
        System.out.print("Ingrese un número (0 para terminar): ");
        num = Integer.parseInt(input.nextLine());
    }
    
    System.out.print("La suma de los números pares es: " + suma);
        
  }
}
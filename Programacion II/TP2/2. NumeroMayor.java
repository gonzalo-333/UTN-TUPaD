
import java.util.Scanner;

public class NumeroMayor {
  public static void main(String args[]) {
    Scanner input = new Scanner(System.in);
    int num1, num2, num3;
    
    System.out.print("Ingrese primer numero: ");
    num1 = Integer.parseInt(input.nextLine());
    
    System.out.print("Ingrese segundo numero: ");
    num2 = Integer.parseInt(input.nextLine());
    
    System.out.print("Ingrese tercer numero: ");
    num3 = Integer.parseInt(input.nextLine());
    
    
    if( num1 > num2 && num1 > num3 ){
        System.out.print("El mayor es: " + num1);
    } else if ( num2 > num1 && num2 > num3 ){
        System.out.print("El mayor es: " + num2);
    } else {
        System.out.print("El mayor es: " + num3);
    }
  }
}
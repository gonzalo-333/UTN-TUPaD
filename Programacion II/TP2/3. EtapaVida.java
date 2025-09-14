
import java.util.Scanner;

public class EtapaVida {
  public static void main(String args[]) {
    Scanner input = new Scanner(System.in);
    int edad;
    
    System.out.print("Ingrese edad: ");
    edad = Integer.parseInt(input.nextLine());
    
    if( edad < 12 ){
        System.out.print("Niño");
    } else if ( edad >= 12 && edad <= 17 ){
        System.out.print("Adolescente");
    } else if ( edad >= 18 && edad <= 59 ){
        System.out.print("Adulto");
    } else {
        System.out.print("Adulto mayor");
    }
  }
}
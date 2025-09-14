
import java.util.Scanner;

public class AnioBisiesto {
  public static void main(String args[]) {
    Scanner input = new Scanner(System.in);
    int anio;
    
    System.out.print("Ingrese un año: ");
    anio = Integer.parseInt(input.nextLine());
    
    if( (anio % 4 == 0 && anio % 100 != 0) || anio % 400 == 0){
        System.out.print("El año " + anio + " es bisiesto.");
    } else {
        System.out.print("El año " + anio + " no es bisiesto.");
    }
  }
}

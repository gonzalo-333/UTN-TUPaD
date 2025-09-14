
import java.util.Scanner;

public class ValidacionNota {
  public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int num;
        boolean notaValida;
    
    do{
        System.out.print("Ingrese una nota (0-10): ");
        num = Integer.parseInt(input.nextLine());

        if( num < 0 || num > 10){
            System.out.println("Error: Nota inválida. Ingrese una nota entre 0 y 10.");        
            notaValida = false;
        } else {
            notaValida = true;
        }
    } while( !notaValida );
    
    System.out.print("Nota guardada correctamente.");
  }
}
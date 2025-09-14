
import java.util.Scanner;

public class ContPosNegCer {
  public static void main(String args[]) {
    Scanner input = new Scanner(System.in);
    int num, pos, neg, cer;
    pos = 0;
    neg = 0;
    cer = 0;
    
    for(int i = 1; i <= 10; i++){
        System.out.print("Ingrese el número " + i + ": ");
        num = Integer.parseInt(input.nextLine());
        
        if( num > 0 ){
            pos += 1;
        } else if( num < 0 ){
            neg += 1;
        } else {
            cer += 1;
        }
    }
    
    System.out.println("Resultados:");
    System.out.println("Positivos: " + pos);
    System.out.println("Negativos: " + neg);
    System.out.println("Ceros: " + cer);
  }
}
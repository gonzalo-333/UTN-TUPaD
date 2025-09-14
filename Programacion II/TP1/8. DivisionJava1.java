
import java.util.Scanner;

public class DivisionJava1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int numero1, numero2, div;

        System.out.print("Ingrese primer numero entero: ");
        numero1 = Integer.parseInt(input.nextLine());
        
        System.out.print("Ingrese primer segundo entero: ");
        numero2 = Integer.parseInt(input.nextLine());
        
        div = numero1 / numero2;
        
        System.out.println(numero1 + " / " + numero2 + ": " + div);
    }
}
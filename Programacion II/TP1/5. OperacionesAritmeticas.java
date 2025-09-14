
import java.util.Scanner;

public class OperacionesAritmeticas {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int numero1, numero2, sum, res, mul, div;
        
        System.out.print("Ingrese primer numero entero: ");
        numero1 = Integer.parseInt(input.nextLine());
        
        System.out.print("Ingrese primer segundo entero: ");
        numero2 = Integer.parseInt(input.nextLine());
        
        sum = numero1 + numero2;
        res = numero1 - numero2;
        mul = numero1 * numero2;
        div = numero1 / numero2;
        
        System.out.println(numero1 + " + " + numero2 + ": " + sum);
        System.out.println(numero1 + " - " + numero2 + ": " + res);
        System.out.println(numero1 + " x " + numero2 + ": " + mul);
        System.out.println(numero1 + " / " + numero2 + ": " + div);

    }
}
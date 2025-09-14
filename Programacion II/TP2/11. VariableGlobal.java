
import java.util.Scanner;

public class VariableGlobal {
    static final double DESCUENTO = 0.10;
    
      static double calcularDescuentoEspecial(double precio){
        double descuento;
        
        descuento = precio*DESCUENTO;
        
        return descuento; 
      }
      
    public static void main(String args[]) {
      
      Scanner input = new Scanner(System.in);
      double precio, descuentoAplicado, precioFinal;

      System.out.print("Ingrese el precio del producto: ");
      precio = Integer.parseInt(input.nextLine());
    
      descuentoAplicado = calcularDescuentoEspecial(precio);
      precioFinal = precio - descuentoAplicado;
      System.out.println("El descuento especial aplicado es: " + descuentoAplicado);
      System.out.println("El precio final con descuento es: " + precioFinal);  
    }
}
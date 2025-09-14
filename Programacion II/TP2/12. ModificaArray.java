
import java.util.Scanner;

public class ModificaArray {
    static double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};
    
    static void PreciosOriginales(){
        
        for(double precio : precios){
        System.out.println(precio);
        }
    }
        
    static void PreciosModificados(int aModificar, double nuevoPrecio){
        precios[aModificar] = nuevoPrecio;
        
        for(double precio : precios){
        System.out.println(precio);
        }
    }
    
    public static void main(String args[]) {
      Scanner input = new Scanner(System.in);
      int producto;
      double precio;

      System.out.print("¿A que producto desea modificarle el precio? (1-5): ");
      producto = Integer.parseInt(input.nextLine());
    
      System.out.print("Ingrese el precio del producto: ");
      precio = Double.parseDouble(input.nextLine());
      
      
      System.out.println("Precios Originales: ");
      PreciosOriginales();
      System.out.println("Precios Modificados: ");
      PreciosModificados(producto-1, precio);
    }
}

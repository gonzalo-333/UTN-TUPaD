
import java.util.Scanner;

public class RecursivaArray {
    static double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};
    
    static String MostrarPrecios(int indice, double[] arreglo){
        if( indice >= arreglo.length ){
            return "";
        } else {
            System.out.println(arreglo[indice]);
            return MostrarPrecios(indice + 1, arreglo);
        }
    }
    
    static double[] ModificarPrecio(int aModificar, double nuevoPrecio){
        precios[aModificar] = nuevoPrecio;
        return precios;
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
    MostrarPrecios(0, precios);
    precios = ModificarPrecio(producto - 1, precio);
    System.out.println("Precios Modificados: ");
    MostrarPrecios(0, precios);
    }
}
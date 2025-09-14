
import java.util.Scanner;

public class CostoTotalEnvio {

    public static double calcularCostoEnvio(double peso, String zona){
        double costoEnvio;
        if( zona.equalsIgnoreCase("Nacional")){
            costoEnvio = 5 * peso;
        } else {
            costoEnvio = 10 * peso;
        }
        
        return costoEnvio; 
    }
    
    public static double calcularTotalCompra(double precioProducto, double costoEnvio){
        double costoTotal = precioProducto + costoEnvio;
        return costoTotal;
    }
    
  public static void main(String args[]) {
    Scanner input = new Scanner(System.in);
    double peso, precioProducto, total, envio;
    String zona;
    
    System.out.print("Ingrese el precio del producto: ");
    precioProducto = Double.parseDouble(input.nextLine());
    
    System.out.print("Ingrese el peso del paquete en kg: ");
    peso = Double.parseDouble(input.nextLine());

    System.out.print("Ingrese la zona de envío (Nacional/Internacional): ");
    zona = input.nextLine();
    
    envio = calcularCostoEnvio(peso, zona);
    total = calcularTotalCompra(precioProducto, envio);
    System.out.println("El costo de envío es: " + envio);
    System.out.println("El total a pagar es: " + total);
  }
}

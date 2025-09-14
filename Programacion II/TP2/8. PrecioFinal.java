
import java.util.Scanner;

public class PrecioFinal {

    public static double calcularPrecioFinal(double precioBase, double impuesto, double descuento){
        double precioConImp = precioBase * (impuesto / 100);
        double precioConDes = precioBase * (descuento / 100);
        double precioFinal = precioBase + precioConImp - precioConDes;
        return precioFinal;
    }
    
  public static void main(String args[]) {

    Scanner input = new Scanner(System.in);
    double precioBase, impuesto, descuento, aPagar;
    
    System.out.print("Ingrese el precio base del producto: ");
    precioBase = Double.parseDouble(input.nextLine());
    
    System.out.print("Ingrese el impuesto en porcentaje (Ejemplo: 10 para 10%): ");
    impuesto = Double.parseDouble(input.nextLine());

    System.out.print("Ingrese el descuento en porcentaje (Ejemplo: 5 para 5%): ");
    descuento = Double.parseDouble(input.nextLine());
    
    aPagar = calcularPrecioFinal(precioBase, impuesto, descuento);
    System.out.print("El precio final del producto es: " + aPagar);
  }
}
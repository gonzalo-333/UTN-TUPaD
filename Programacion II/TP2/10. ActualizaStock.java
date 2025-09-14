
import java.util.Scanner;

public class ActualizaStock {

    public static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida){
        int stockActualizado;
        
        stockActualizado = stockActual - cantidadVendida + cantidadRecibida;
        return stockActualizado;
    }
    
  public static void main(String args[]) {
    Scanner input = new Scanner(System.in);
    int stockActual, cantidadVendida, cantidadRecibida, nuevoStock;

    System.out.print("Ingrese el stock actual del producto: ");
    stockActual = Integer.parseInt(input.nextLine());
    
    System.out.print("Ingrese la cantidad vendida: ");
    cantidadVendida = Integer.parseInt(input.nextLine());

    System.out.print("Ingrese la cantidad recibida: ");
    cantidadRecibida = Integer.parseInt(input.nextLine());
    
    nuevoStock = actualizarStock(stockActual, cantidadVendida, cantidadRecibida);
    System.out.println("El nuevo stock del producto es: " + nuevoStock);
  }
}
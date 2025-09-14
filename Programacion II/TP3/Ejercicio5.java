import java.util.Scanner;

public class Ejercicio5 {
  public static void main(String args[]) {
    Scanner input = new Scanner(System.in);
    int avance, recarga;

    NaveEspacial nave1 = new NaveEspacial();

    nave1.setNombre("Hernán Cortés");
    nave1.setCombustible( 50 );
    
    System.out.println("Estado de la nave antes del despegue:");
    System.out.println(nave1.mostrarEstado());
    
    nave1.despegar();
    System.out.print("¿Cuánto debe avanzar la nave \"" + nave1.getNombre() + "\"?: ");
    avance = Integer.parseInt(input.nextLine());
    nave1.avanzar( avance );
    System.out.print("¿Cuántos litros de combustible desea cargar a la nave \"" + nave1.getNombre() + "\"?: ");
    recarga = Integer.parseInt(input.nextLine());
    nave1.recargarCombustible( recarga );
    System.out.print("¿Cuánto debe avanzar la nave \"" + nave1.getNombre() + "\"?: ");
    avance = Integer.parseInt(input.nextLine());
    nave1.avanzar( avance );
    nave1.despegar();
    
    System.out.println("Estado actual de la nave: ");
    System.out.println(nave1.mostrarEstado());
  }
}

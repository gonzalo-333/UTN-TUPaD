
public class Ejercicio1 {
  public static void main(String args[]) {
    
    // 1.- Creamos el titular que tendrá el pasaporte
    Titular titular1 = new Titular("Mengano Fulanito", "12345678");

    // 2.- Generamos un nuevo pasaporte, le pasamos el titular y los datos para generar
    //     a su vez, a traves de la relacion de copmposicion, la foto del mismo
    Pasaporte pasaporte1 = new Pasaporte("AR987654", "01/01/2025", "fotocarnet.jpg", "JPEG", titular1);
        
    // 3.- Seteamos el pasaporte para el titular completando así la relacion bidireccional
    titular1.setPasaporte(pasaporte1);

    System.out.println("=== Pasaporte y Titular ===");
    System.out.println("Pasaporte numero: " + pasaporte1.getNumero());
    System.out.println("Titular del pasaporte: " + pasaporte1.getTitular().getNombre());
    System.out.println("DNI del titular: " + pasaporte1.getTitular().getDni());
    
    System.out.println("\n____Asociación Bidireccional____");
    System.out.println("El titular " + titular1.getNombre() + " tiene el pasaporte " + titular1.getPasaporte().getNumero() + " emitido el día " + pasaporte1.getFechaEmision() + ".");
    
    System.out.println("\n____Relación de Composición____");
    System.out.println("El pasaporte tiene una foto formato ." + pasaporte1.getFoto().getFormato());
  }
}

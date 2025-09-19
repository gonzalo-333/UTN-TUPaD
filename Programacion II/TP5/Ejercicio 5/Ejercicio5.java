
public class Ejercicio5 {
    public static void main(String[] args) {

      // 1. Creamos el Propietario
      Propietario propietario1 = new Propietario("Carlos Torres", "40765432");
        
      // 2. Creamos una Computadora (y, por composición, su PlacaMadre)
      Computadora compu1 = new Computadora("Dell", "XYZ-456", "ASUS ROG", "Intel Z590", propietario1);
        
      // 3.  Enlazar los dos objetos por relación bidireccional
      propietario1.setComputadora(compu1);
      compu1.setPropietario(propietario1);

      System.out.println("=== Información de la Computadora ===");
      System.out.println("Marca: " + compu1.getMarca());
      System.out.println("Propietario: " + compu1.getPropietario().getNombre());
      System.out.println("Modelo de la placa madre: " + compu1.getPlacaMadre().getModelo());
        
      System.out.println("\n=== Información del Propietario ===");
      System.out.println("Nombre: " + propietario1.getNombre());
      System.out.println("DNI: " + propietario1.getDni());
      System.out.println("Número de serie de su computadora: " + propietario1.getComputadora().getNumeroSerie());
    }
}


public class Ejercicio2 {
  public static void main(String args[]) {
    
    // 1. Relación de AGREGACION: La batería existe independientemente
    Bateria bateria1 = new Bateria("Li-Ion 5000", 5000.0);

    // 2. Creamos el celular, pasándole la batería al constructor
    Celular celular1 = new Celular("123456789", "Samsung", "Galaxy S25", bateria1);
    
    // 3. Creamos el usuario, que también existe de forma independiente
    Usuario usuario1 = new Usuario("Maria Lopez", "38765432");

    // 4. Relación BIDIRECCIONAL: Enlazamos los dos objetos
    celular1.setUsuario(usuario1);
    usuario1.setCelular(celular1);

    System.out.println("--- Información del Celular ---");
    System.out.println("Marca: " + celular1.getMarca());
    System.out.println("Modelo: " + celular1.getModelo());
    System.out.println("Usuario: " + celular1.getUsuario().getNombre());
    System.out.println("Capacidad de la batería: " + celular1.getBateria().getCapacidad() + " mAh");

    System.out.println("\n--- Información del Usuario ---");
    System.out.println("Nombre: " + usuario1.getNombre());
    System.out.println("DNI: " + usuario1.getDni());
    System.out.println("Modelo de su celular: " + usuario1.getCelular().getModelo());
    System.out.println("IMEI del celular: " + usuario1.getCelular().getImei());

  }
}

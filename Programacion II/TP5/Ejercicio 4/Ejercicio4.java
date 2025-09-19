
public class Ejercicio4 {
    public static void main(String[] args) {

      // 1. Creamos el banco
      Banco banco1 = new Banco("Banco Nacion", "20-98996432-1");

      // 2. Creamos un cliente
      Cliente cliente1 = new Cliente("Ana Torres", "12345678");
        
      // 3. Crear una tarjeta, pasándole el banco al constructor
      TarjetaDeCredito tarjeta1 = new TarjetaDeCredito("4567-8901-2345-6789", "12/28", banco1);
        
      // 4. Asociamos los dos objetos con los setters de la asociación bidireccional
      cliente1.setTarjeta(tarjeta1);
      tarjeta1.setCliente(cliente1);

      System.out.println("=== Información de Tarjeta ===");
      System.out.println("Número: " + tarjeta1.getNumero());
      System.out.println("Banco emisor: " + tarjeta1.getBanco().getNombre());
      System.out.println("Titular: " + tarjeta1.getCliente().getNombre());
      System.out.println("Fecha de Venciniento: " + tarjeta1.getFechaVencimiento());
        
      System.out.println("\n=== Información de Cliente ===");
      System.out.println("Nombre: " + cliente1.getNombre());
      System.out.println("DNI: " + cliente1.getDni());
      System.out.println("Número de tarjeta: " + cliente1.getTarjeta().getNumero());
    }
}

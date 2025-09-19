
public class Ejercicio6 {
    public static void main(String[] args) {

      // 1. Creamos cliente y mesa
      Cliente cliente1 = new Cliente("Ana García", "11-3586-7091");
      Mesa mesa1 = new Mesa(10, 4);

      // 2. Creamos una reserva y le pasamos cliente y mesa
      Reserva reserva1 = new Reserva("20/09/2025", "20:00", cliente1, mesa1);
        
      // 3. Creamos otra reserva que usa la misma Mesa
      Cliente cliente2 = new Cliente("Luis Gómez", "11-5869-3120");
      Reserva reserva2 = new Reserva("20/09/2025", "22:00", cliente2, mesa1);

      System.out.println("=== Información de la Reserva 1 ===");
      System.out.println("Fecha y hora: " + reserva1.getFecha() + " " + reserva1.getHora());
      System.out.println("Cliente: " + reserva1.getCliente().getNombre() + " (Tel: " + reserva1.getCliente().getTelefono() + ")");
      System.out.println("Mesa asignada: #" + reserva1.getMesa().getNumero() + " (Capacidad: " + reserva1.getMesa().getCapacidad() + ")");
        
      System.out.println("\n=== Información de la Reserva 2 ===");
      System.out.println("Fecha y hora: " + reserva2.getFecha() + " " + reserva2.getHora());
      System.out.println("Cliente: " + reserva2.getCliente().getNombre() + " (Tel: " + reserva2.getCliente().getTelefono() + ")");
      System.out.println("Mesa asignada: #" + reserva2.getMesa().getNumero() + " (Capacidad: " + reserva2.getMesa().getCapacidad() + ")");
    }
}

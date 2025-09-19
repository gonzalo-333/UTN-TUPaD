
public class Ejercicio7 {
    public static void main(String[] args) {

      // 1. Creamos el motor
      Motor motor1 = new Motor("Eléctrico", "E-100200");

      // 2. Creamos el vehiculo y le pasamos el motor creado
      Vehiculo vehiculo1 = new Vehiculo("AB-123-CD", "Tesla", motor1);
        
      // 3. Creamos el conductor
      Conductor conductor1 = new Conductor("Juan Pérez", "99999999");

      // 4. Relacionamos ambos objetos
      vehiculo1.setConductor(conductor1);
      conductor1.setVehiculo(vehiculo1);

      System.out.println("=== Información del Vehículo ===");
      System.out.println("Modelo: " + vehiculo1.getModelo());
      System.out.println("Propietario: " + vehiculo1.getConductor().getNombre());
      System.out.println("Tipo de motor: " + vehiculo1.getMotor().getTipo());

      System.out.println("\n=== Información del Conductor ===");
      System.out.println("Nombre: " + conductor1.getNombre());
      System.out.println("Nº Licencia: " + conductor1.getLicencia());
      System.out.println("Vehículo: " + conductor1.getVehiculo().getModelo());
      System.out.println("Patente: " + conductor1.getVehiculo().getPatente());
    }
}

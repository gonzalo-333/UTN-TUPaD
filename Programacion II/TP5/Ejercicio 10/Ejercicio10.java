
public class Ejercicio10 {
    public static void main(String[] args) {

      // 1. Creamos el titular
      Titular titular1 = new Titular("Laura Díaz", "30123456");

      // 2. Creaamos la cuenta bancaria y le pasamos datos para generar la clave y el objeto titular
      CuentaBancaria cuenta1 = new CuentaBancaria("001234567890", 50000.50, "9876", "18/09/2025", titular1);

      // 3. Relacionas bidireccionalmente los dos objetos
      titular1.setCuenta(cuenta1);
      cuenta1.setTitular(titular1);

      System.out.println("=== Cuenta Bancaria ===");
      System.out.println("CBU: " + cuenta1.getCbu());
      System.out.println("Saldo: $" + cuenta1.getSaldo());
      System.out.println("Titular de la cuenta: " + cuenta1.getTitular().getNombre());

      System.out.println("\n=== Titular ===");
      System.out.println("Nombre: " + titular1.getNombre());
      System.out.println("DNI: " + titular1.getDni());
      System.out.println("CBU: " + titular1.getCuenta().getCbu());
    }
}

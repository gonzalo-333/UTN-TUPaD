
public class EjercicioTP4 {
  public static void main(String args[]) {

    Empleado emp1 = new Empleado(1, "Juan", "administrativo", 1200);
    Empleado emp2 = new Empleado("Martin", "seguridad");
    Empleado emp3 = new Empleado("Pedro", "limpieza");
    Empleado emp4 = new Empleado("Carla", "atencion al publico");

    System.out.println(".:: INFORMACIÓN INICIAL ::.");
    System.out.println(emp1.toString());
    System.out.println(emp2.toString());
    System.out.println(emp3.toString());
    System.out.println(emp4.toString());

    System.out.println("\n- AUMENTOS DE SALARIO APLICADOS -");
    System.out.println("Empleado 1: +10.5%");
    System.out.println("Empleado 2: +100");
    System.out.println("Empleado 3: +90");
    System.out.println("Empleado 4: +10.5%");
    emp1.actualizarSalario(10.5);
    emp2.actualizarSalario(100);
    emp3.actualizarSalario(90);
    emp4.actualizarSalario(10.5);

    System.out.println("\n.:: INFORMACIÓN DESPUÉS DEL AUMENTO ::.");
    System.out.println(emp1.toString());
    System.out.println(emp2.toString());
    System.out.println(emp3.toString());
    System.out.println(emp4.toString());

    System.out.println(Empleado.mostrarTotalEmpleados());
  }
}

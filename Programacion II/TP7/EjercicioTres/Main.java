import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Con el ArrayList estaríamos haciendo un UPCASTING: de subclases EmpleadoPlanta y 
        // EmpleadoTemporal a superclase Empleado
        ArrayList<Empleado> empleados = new ArrayList<>();
        
        // Creo y agrego empleados 
        EmpleadoPlanta e1 = new EmpleadoPlanta("Juan");
        EmpleadoPlanta e2 = new EmpleadoPlanta("Pedro");
        EmpleadoTemporal e3 = new EmpleadoTemporal("Esteban", 8500.30, 100);
        EmpleadoTemporal e4 = new EmpleadoTemporal("Javier", 7900.25, 160);
        
        empleados.add(e1);
        empleados.add(e2);
        empleados.add(e3);
        empleados.add(e4);
        
        // Recorro el array y llamo cada metodo para calcular sueldos
        for(Empleado e : empleados) {
            String tipo = "";
            // uso instance of para informar el tipo de empleado
            if(e instanceof EmpleadoPlanta){
                   tipo = "Planta";
            } else if (e instanceof EmpleadoTemporal){
                   tipo = "Temporal";
            }
            // implemento polimorfismo
            System.out.println("El empleado " + e.nombre + " (" + tipo + ") cobra $" + e.calcularSueldo() + ".- por mes.");
        }

        // DOWNCASTING ejemplo
        EmpleadoPlanta empP = (EmpleadoPlanta) empleados.get(0);
        System.out.println("  [Downcasting] Sueldo fijo de " + empP.nombre + " verificado.");
    
    }
}
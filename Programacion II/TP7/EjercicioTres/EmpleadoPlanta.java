
public class EmpleadoPlanta extends Empleado{ 		// Extiendo de empleado
    private static final double SUELDO_BASE = 1500000.0;

    public EmpleadoPlanta(String nombre) {
        super(nombre);
    }
    
    @Override
    public double calcularSueldo() {
        return SUELDO_BASE;
    }

}

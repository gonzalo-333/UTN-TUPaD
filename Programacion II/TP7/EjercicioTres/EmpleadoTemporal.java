
public class EmpleadoTemporal extends Empleado{ 			//Extiendo de empleado
    private double precioHora;
    private int horasTrabajadas;

    public EmpleadoTemporal(String nombre, double precioHora, int horasTrabajadas) {
        super(nombre);
        this.precioHora = precioHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public double calcularSueldo() {
        return Math.round(precioHora * horasTrabajadas);
    }

}
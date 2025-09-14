
public class Empleado {
    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    private static int totalEmpleados = 0;

    public Empleado( int id, String nombre, String puesto, double salario ){
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++;
    }

    public Empleado( String nombre, String puesto){
        this.id = totalEmpleados + 1;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 1000;
        totalEmpleados++;
    }

    public void actualizarSalario(double porcentaje){
        this.salario += (this.salario/100) * porcentaje;
    }

    public void actualizarSalario(int cantidad){
        this.salario += cantidad;
    }
    
    @Override
    public String toString(){
        return "El empleado Nº de legajo " + id + ", " + nombre + ", se desempeña como " + puesto + " percibiendo un salario de $" + salario + ".";
    }

    public static String mostrarTotalEmpleados(){
        return "\n___Total_de_empleados___\nActualmente hay " + totalEmpleados + " empleados.";
    }
    
    public void setId( int id ){
        this.id = id;
    }

    public void setNombre( String nombre  ){
        this.nombre = nombre;
    }

    public void setPuesto( String puesto ){
        this.puesto = puesto;
    }

    public void setSalario( double salario ){
        this.salario = salario;
    }

    public int getId(){
        return this.id;
    }

    public String getNombre(){
        return this.nombre;
    }

    public String getPuesto(){
        return this.puesto;
    }

    public double getSalario(){
        return this.salario;
    }
}
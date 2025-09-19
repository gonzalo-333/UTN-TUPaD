
class Conductor {
    private String nombre;
    private String licencia;
    private Vehiculo vehiculo;          // ASOCIACION BIDIRECCIONAL

    public Conductor(String nombre, String licencia) {
        this.nombre = nombre;
        this.licencia = licencia;
    }

    // seteamos vehiculo para conductor
    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getLicencia() {
        return licencia;
    }
    
    public Vehiculo getVehiculo() {
        return vehiculo;
    }
}
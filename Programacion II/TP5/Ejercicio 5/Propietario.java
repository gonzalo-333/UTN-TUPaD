
class Propietario {
    private String nombre;
    private String dni;
    private Computadora computadora;        // ASOCIACION BIDIRECCIONAL

    public Propietario(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    // hacemos setter para establecer la asociación
    public void setComputadora(Computadora computadora) {
        this.computadora = computadora;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }
    
    public Computadora getComputadora() {
        return computadora;
    }
}
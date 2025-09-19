
class Vehiculo {
    private String patente;
    private String modelo;
    private Motor motor;            // RELACION DE AGREGACION
    private Conductor conductor;    // ASOCIACION BIDIRECCIONAL

    public Vehiculo(String patente, String modelo, Motor motor) {
        this.patente = patente;
        this.modelo = modelo;
        this.motor = motor;         // le paso el objeto Motor
    }

    // seteamos conductor para vehiculo
    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }

    public String getPatente() {
        return patente;
    }

    public String getModelo() {
        return modelo;
    }

    public Motor getMotor() {
        return motor;
    }

    public Conductor getConductor() {
        return conductor;
    }
}
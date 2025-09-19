
class Titular {
    private String nombre;
    private String dni;
    private Pasaporte pasaporte;    // ASOCIACION BIDIRECCIONAL

    public Titular(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    // al crear el pasaporte necesito vincularlo con el setter
    // que recibe el pasaporte desde fuera
    public void setPasaporte(Pasaporte pasaporte) {
        this.pasaporte = pasaporte;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }
    
    // me tiene que devolver el pasaporte que recibió
    public Pasaporte getPasaporte() {
        return pasaporte;
    }


}
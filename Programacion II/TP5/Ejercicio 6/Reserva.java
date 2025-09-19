
class Reserva {
    private String fecha;
    private String hora;
    private Cliente cliente;    // ASOCIACION UNIDIRECCIONAL
    private Mesa mesa;          // RELACION DE AGREGACIÓN

    public Reserva(String fecha, String hora, Cliente cliente, Mesa mesa) {
        this.fecha = fecha;
        this.hora = hora;
        this.cliente = cliente;
        this.mesa = mesa;
    }

    public String getFecha() {
        return fecha;
    }

    public String getHora() {
        return hora;
    }

    // establecemos la relacion con un getter
    public Cliente getCliente() {
        return cliente;
    }

    public Mesa getMesa() {
        return mesa;
    }
}

class TarjetaDeCredito {
    private String numero;
    private String fechaVencimiento;
    private Banco banco;                // RELACION DE AGRAGACION
    private Cliente cliente;            // ASOCIACION BIDIRECCIONAL

    public TarjetaDeCredito(String numero, String fechaVencimiento, Banco banco) {
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
        this.banco = banco;             // Realizamos la agregación pasándole el objeto como parámtero
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getNumero() {
        return numero;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public Banco getBanco() {
        return banco;
    }

    public Cliente getCliente() {
        return cliente;
    }
}
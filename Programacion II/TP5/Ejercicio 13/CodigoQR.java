
class CodigoQR {
    private String valor;
    private Usuario usuario;        // ASOPCIACION UNIDIRECCIONAL

    public CodigoQR(String valor, Usuario usuario) {
        this.valor = valor;
        this.usuario = usuario;
    }

    public String getValor() {
        return valor;
    }

    public Usuario getUsuario() {
        return usuario;
    }
}
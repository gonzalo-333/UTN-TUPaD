
class Celular {
    private String imei;
    private String marca;
    private String modelo;
    private Bateria bateria;    // AGREGACION
    private Usuario usuario;    // ASOCIACION BIDIRECCIONAL

    public Celular(String imei, String marca, String modelo, Bateria bateria) {
        this.imei = imei;
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = bateria; // Se le pasa un objeto Bateria ya existente
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getImei() {
        return imei;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public Bateria getBateria() {
        return bateria;
    }

    public Usuario getUsuario() {
        return usuario;
    }
}
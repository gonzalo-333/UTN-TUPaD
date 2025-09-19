
class Pasaporte {
    private String numero;
    private String fechaEmision;
    private Foto foto;          // RELACION DE COMPOSICION
    private Titular titular;    // ASOCIACION BIDIRECCIONAL
    
    public Pasaporte(String numero, String fechaEmision, String imagen, String formato, Titular titular) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.titular = titular;
        this.foto = new Foto(imagen, formato); // creamos foto como composición
    }

    public String getNumero() {
        return numero;
    }

    public String getFechaEmision() {
        return fechaEmision;
    }

    public Foto getFoto() {
        return foto;
    }

    public Titular getTitular() {
        return titular;
    }
}
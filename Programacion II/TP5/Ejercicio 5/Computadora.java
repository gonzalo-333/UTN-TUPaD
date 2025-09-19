
class Computadora {
    private String marca;
    private String numeroSerie;
    private PlacaMadre placaMadre;      // RELACION DE COMPOSICION
    private Propietario propietario;    // ASOCIACION BIDIRECCIONAL

    public Computadora(String marca, String numeroSerie, String modeloPlaca, String chipset, Propietario propietario) {
        this.marca = marca;
        this.numeroSerie = numeroSerie;
        this.propietario = propietario;
        this.placaMadre = new PlacaMadre(modeloPlaca, chipset);     // COMPOSICION placa madre
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    public String getMarca() {
        return marca;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public PlacaMadre getPlacaMadre() {
        return placaMadre;
    }

    public Propietario getPropietario() {
        return propietario;
    }
}
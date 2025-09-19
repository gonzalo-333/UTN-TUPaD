
class Render {
    private String formato;
    private Proyecto proyecto;      // AOSICACION UNIDIRECCIONAL

    public Render(String formato, Proyecto proyecto) {
        this.formato = formato;
        this.proyecto = proyecto;
    }

    public String getFormato() {
        return formato;
    }

    public Proyecto getProyecto() {
        return proyecto;
    }
}
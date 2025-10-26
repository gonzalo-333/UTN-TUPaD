
public abstract class Figura {
    protected String nombre;

    public Figura(String nombre) {
        this.nombre = nombre;
    }
    
    // Metodo abstracto para subclases
    public void calcularArea(){
    }
}
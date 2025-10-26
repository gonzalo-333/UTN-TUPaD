
public class Rectangulo extends Figura{ 			// Extiendo de  figura
    private double base;
    private double altura;

    public Rectangulo(double base, double altura, String nombre) {
        super(nombre);
        this.base = base;
        this.altura = altura;
    }
    
    // Sobreescritura de metodo heredado
    @Override
    public void calcularArea(){
        System.out.println("Area de rectangulo '" + nombre + "': " +  (base * altura));
    }
}
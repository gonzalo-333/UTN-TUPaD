
public class Circulo extends Figura{					//Extiendo de figura
    private double radio;

    // Contructor con argumento para atributo propio
    public Circulo(double radio, String nombre) {
        super(nombre);
        this.radio = radio;
    }
    
    // Sobreescritura de metodo heredado
    @Override
    public void calcularArea(){
        System.out.println("Area de círculo '" + nombre + "': " +  (radio *  3.14));
    }
}
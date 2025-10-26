
public class Auto extends Vehiculo {			// Extiendo de la clase vehiculo
    private int cantidadDePuertas;

    // Llamo expresamente al constructor de la clase padre
    // ya que el constructor de auto agrega su propio parametro
    public Auto(int cantidadDePuertas, String marca, String modelo) {
        super(marca, modelo);
        this.cantidadDePuertas = cantidadDePuertas;
    }

    // Sobreescribo el metodo mostrarInfo, heredado de Vehiculo
    @Override
    public void mostrarInfo(){
        System.out.println("Marca: " + this.marca + ", modelo: " + this.modelo + ", cantidad de puertas: " + cantidadDePuertas);
    }
}

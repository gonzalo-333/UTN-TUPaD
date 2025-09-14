
public class Ejercicio2 {
  public static void main(String args[]) {
    
    Mascota m1 = new Mascota();
    m1.nombre = "Max";
    m1.especie = "Perro";
    m1.edad = 1;
    
    m1.mostrarInfo();
    m1.cumplirAnios();
    m1.mostrarInfo();
    m1.cumplirAnios();
    m1.mostrarInfo();
  }
}

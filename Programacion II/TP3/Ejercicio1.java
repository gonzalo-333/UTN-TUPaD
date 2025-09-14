
public class Ejercicio1 {
  public static void main(String args[]) {
    
    Estudiante e1 = new Estudiante();
    e1.nombre = "Juan";
    e1.apellido = "Pepe";
    e1.curso = "Programación II";
    e1.calificacion = 8.5;
    
    e1.mostrarInfo();
    e1.subirCalificacion(1.5);
    e1.mostrarInfo();
    e1.bajarCalificacion(0.5);
    e1.mostrarInfo();
  }
}

public class Estudiante {
    
    String nombre;
    String apellido;
    String curso;
    double calificacion;
    
    void mostrarInfo(){
        System.out.println(nombre + " " + apellido + ", " + curso + ": " + calificacion + ".");
    }
    
    void subirCalificacion(double puntos){
        calificacion += puntos;
    }
    
    void bajarCalificacion(double puntos){
        calificacion -= puntos;
    }
  
}
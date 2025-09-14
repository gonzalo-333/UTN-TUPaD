
public class Mascota {
    
    String nombre;
    String especie;
    int edad;
    
    void mostrarInfo(){
        System.out.println(nombre + ", " + especie + ", " + edad + " años.");
    }
    
    void cumplirAnios(){
        edad += 1;
    }
}
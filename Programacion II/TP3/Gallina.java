
public class Gallina {
    private String idGallina;
    private int edad, huevosPuestos;
    
    public void setIdGallina(String id) {
        this.idGallina = id;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setHuevosPuestos(int hp) {
        this.huevosPuestos = hp;
    }

    public void ponerHuevo(){
        this.huevosPuestos += 1;
    }

    public void envejecer() {
        this.edad += 1;
    }

    public String mostrarEstado(){
        return "La gallina " + this.idGallina + " (" + this.edad + " años) ha puesto " + this.huevosPuestos + " huevos.";
    }
}
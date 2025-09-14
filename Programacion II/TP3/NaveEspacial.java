
public class NaveEspacial {
    private String nombre;
    private int combustible, distancia;
    private final int TANQUE_FULL = 300;

    public void setNombre( String nombre ){
        this.nombre = nombre;
    }    
    public void setCombustible( int combustible ){
        this.combustible = combustible;
    }

    public String getNombre(){
        return nombre;
    }

    public int getCombustible(){
        return combustible;
    }

    public void despegar(){
        final int CONSUMO_DESPEGUE = 20;
        if( combustible <= 60 ){
            System.out.println("No hay suficiente combustible para despegar, llenar el tanque");
        } else {
            System.out.println("¡Despegue!");
            combustible -= CONSUMO_DESPEGUE;
        }
    }

    public void avanzar(int distancia){
        int consumo = distancia * 10;
        if( this.combustible < consumo ){
            System.out.println("El tanque no aguanta esa distancia");
        } else {
            this.distancia = distancia;
            combustible -= consumo;
        }
    }

    public void recargarCombustible(int cantidad){
        int carga = combustible + cantidad;
        if( TANQUE_FULL <= carga ){
            System.out.println("La carga supera el límite del tanque de " + nombre + ". Se procede a completarlo con " + (TANQUE_FULL - combustible) + " litros.");
            combustible = TANQUE_FULL;
        } else {
            System.out.println("Carga realizada, ahora se dispone de " + carga + " litros.");
            combustible = carga;
        } 
    }

    public String mostrarEstado(){
        return "La nave \"" + nombre + "\" tiene " + combustible + " litros de combustible y recorrió " + distancia + " kilómetros.";
    }

}
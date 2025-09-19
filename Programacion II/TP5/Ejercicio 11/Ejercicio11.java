
public class Ejercicio11 {
    public static void main(String[] args) {

        // 1. Creamos un artista
        Artista artista1 = new Artista("Megadeth", "Heavy Metal");
        
        // 2. Creamos la cancion del artista
        Cancion cancion1 = new Cancion("Symphony of Destruction", artista1);
        
        // 3. Creamos el reproductor
        Reproductor miReproductor = new Reproductor();
        
        // 4. Por último, usamos el reproductor para escuchar la cancion
        miReproductor.reproducir(cancion1);
    }
}

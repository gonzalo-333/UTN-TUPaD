
public class Ejercicio13 {
    public static void main(String[] args) {

        // 1. Creamos un usuario
        Usuario usuario1 = new Usuario("Ana Gómez", "ana.gomez@mail.com");

        // 2. Creamos un generador de QR
        GeneradorQR generador = new GeneradorQR();

        // 3. Usamos el GeneradorQR para crear un CodigoQR
        CodigoQR codigo1 = generador.generar("www.ejemplo.com", usuario1);

        System.out.println("\n=== El Código QR ha sido creado ===");
        System.out.println("Valor: " + codigo1.getValor());
        System.out.println("Asociado con: " + codigo1.getUsuario().getNombre());
    }
}

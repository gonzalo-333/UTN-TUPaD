
public class Ejercicio8 {
    public static void main(String[] args) {

      // 1. Creamos un usuario
      Usuario usuario1 = new Usuario("Pedro López", "pedro.lopez@empresa.com");

      // 2. Creamos un documento y le pasamos los datos para la composicion de la tarjeta que tiene al usuario
      //    por agregacion
      Documento doc1 = new Documento("Contrato", "En el día de la fecha, bla bla bla...", "hash123", "18/09/2025", usuario1);
        
      System.out.println("=== Información del Documento ===");
      System.out.println("Título: " + doc1.getTitulo());
      System.out.println("Contenido: " + doc1.getContenido());
        
      System.out.println("\n=== Información de la Firma ===");
      System.out.println("Código Hash: " + doc1.getFirma().getCodigoHash());
      System.out.println("Fecha de firma: " + doc1.getFirma().getFecha());
      System.out.println("Firmado por: " + doc1.getFirma().getUsuario().getNombre());
    }
}

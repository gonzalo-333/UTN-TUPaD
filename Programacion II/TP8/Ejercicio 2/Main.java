
public class Main {
    public static void main(String[] args) {
        GestorExcepciones gestor = new GestorExcepciones();
        
        // 1. División Segura (simular divisor 0)
        gestor.divisionSegura(); 
        
        // 2. Conversión (simular entrada "hola" o numero decimal)
        gestor.convertirCadenaANumero(); 
        
        // 3. Lectura de archivo
        gestor.lecturaArchivo();
        
        // 4. Excepción personalizada
        gestor.validarEdad(150); // Lanza y captura EdadInvalidaException
        gestor.validarEdad(35);  // Válido
        
        // 5. try-with-resources (simular archivo inexistente)
        gestor.leerConTryWithResources("archivo_para_leer.txt");
    }
}

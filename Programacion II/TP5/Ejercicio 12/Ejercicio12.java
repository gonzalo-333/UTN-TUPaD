
public class Ejercicio12 {
    public static void main(String[] args) {

        // 1. Creamos un contribuyente
        Contribuyente contribuyente1 = new Contribuyente("Fulanito Pérez", "20-123456789-0");
        
        // 2. Creamos un impuesto
        Impuesto impuesto1 = new Impuesto(5000.50, contribuyente1);
        
        // 3. Creamos una calculadora
        Calculadora miCalculadora = new Calculadora();
        
        // 4. A la calculadora creada le pasamos el impuesto
        miCalculadora.calcular(impuesto1);
    }
}

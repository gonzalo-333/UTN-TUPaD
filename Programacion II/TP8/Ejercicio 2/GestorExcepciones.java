
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

class GestorExcepciones {
    private Scanner scanner;
    Scanner input = new Scanner(System.in);
    
    public void divisionSegura() {
        System.out.println("\n--- 1. División Segura ---");
        try {
            System.out.print("Ingrese el numerador: ");
            int num = Integer.parseInt(input.nextLine());
            System.out.print("Ingrese el divisor: ");
            double den = Double.parseDouble(input.nextLine());
            
            // Si el denominador es 0, se lanza ArithmeticException
            double resultado = (double) num / den;
            System.out.println("Resultado: " + resultado);
            
        } catch (ArithmeticException e) {
            System.err.println("Error: No se puede dividir por cero.");
        } catch (InputMismatchException e) {
            System.err.println("Error: Debe ingresar números enteros.");
        } finally {
            System.out.println("Operación de división finalizada.");
        }
    }
    
    public void convertirCadenaANumero() {
        System.out.println("\n--- 2. Conversión de Cadena ---");
        try {
            System.out.print("Ingrese un texto para convertir a número (entero): ");
            String texto = input.nextLine();
            
            // Si el texto no es un número válido, se lanza NumberFormatException
            int numero = Integer.parseInt(texto);
            System.out.println("Número (string) convertido con éxito (a int): " + numero);
            
        } catch (NumberFormatException e) {
            System.err.println("Error: La cadena ingresada no es un número entero válido.");
        }
    }
    
    public void lecturaArchivo(){
        System.out.println("\n--- 3. Lectura de Archivo ---");
        System.out.println("Ingrese el nombre del archivo txt: ");
        String nombre = input.nextLine();
        try {
            File archivo = new File(nombre);
            BufferedReader br = new BufferedReader(new FileReader(archivo));
            System.out.println(br.readLine());
            System.out.println("Archivo '" + nombre + "' encontrado y abierto con éxito.");
        } catch (FileNotFoundException e) {
            System.err.println("Error: Archivo no encontrado");
        } catch (IOException e) {
             System.err.println("Error de I/O al cerrar el archivo.");
        }
    }
    
    public void validarEdad(int edad) {
        System.out.println("\n--- 4. Excepción Personalizada ---");
        try {
            if (edad < 0 || edad > 120) {
                // Lanzo excepción
                throw new EdadInvalidaException("La edad debe estar entre 0 y 120 años.");
            }
            System.out.println("Edad validada: " + edad);
        } catch (EdadInvalidaException e) {
            // Capturo excepción
            System.err.println("Error de Validación: " + e.getMessage());
        }
    }
    
    public void leerConTryWithResources(String rutaArchivo) {
        System.out.println("\n--- 5. Uso de try-with-resources ---");
        File archivo = new File("/home/olivia/Descargas/UTN/ProgII/Ejercicios U8/Excepciones/ArchivoEjemplo.txt");
        try(BufferedReader br = new BufferedReader(new FileReader(archivo))){
            System.out.println(br.readLine());  
        } catch(IOException ex) {
            System.out.println("Error de E/S: "+ ex.getMessage());
        }
    }
}

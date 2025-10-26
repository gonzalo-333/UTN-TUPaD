import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Creo array vacio de figuras
        ArrayList<Figura> figuras = new ArrayList<>();
        
        // Creo y agrego 4 figuras
        Rectangulo r1 = new Rectangulo(4.0,  2.0, "Rectángulo 1");
        Rectangulo r2 = new Rectangulo(6.0,  3.0, "Rectángulo 2");
        Circulo c1 = new Circulo(8, "Círculo 1");
        Circulo c2 = new Circulo(12, "Círculo 2");
        
        figuras.add(r1);
        figuras.add(r2);
        figuras.add(c1);
        figuras.add(c2);
        
        // Recorro array y calculo area en cada figura
        for(Figura f : figuras){
            f.calcularArea();
        }
    }
}
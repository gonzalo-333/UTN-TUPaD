
// Dependencia de uso: el metodo calcular() solamente utiliza el
// objetoi que recibe, pero no lo almacena

class Calculadora {
    public void calcular(Impuesto impuesto) {
        System.out.println("=== CALCULADORA DE IMPUESTOS ===");
        System.out.println("Monto del impuesto: $" + impuesto.getMonto());
        System.out.println("A nombre de: " + impuesto.getContribuyente().getNombre() + " (CUIL: " + impuesto.getContribuyente().getCuil() + ")");
    }
}
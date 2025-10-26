
public class Main {
    public static void main(String[] args) {

        Auto a = new Auto(2, "VW", "Escarabajo");
        a.mostrarInfo();

        // Upcasting: Tratar el Auto como un Vehiculo
        Vehiculo v = a;
        System.out.println("\n.:: Haceindo upcasting ::.");
        v.mostrarInfo();

    }
}


public class Ejercicio4 {
  public static void main(String args[]) {

    Gallina gallina1 = new Gallina();
    Gallina gallina2 = new Gallina();

    gallina1.setIdGallina("Pepita");
    gallina1.setEdad(1);
    gallina1.setHuevosPuestos(3);

    gallina2.setIdGallina("Juanita");
    gallina2.setEdad(2);
    gallina2.setHuevosPuestos(4);

    System.out.println("Estado anterior de las gallinas:");
    System.out.println(gallina1.mostrarEstado());
    System.out.println(gallina2.mostrarEstado());

    gallina1.ponerHuevo();
    gallina1.envejecer();
    gallina2.ponerHuevo();
    gallina2.envejecer();
    
    System.out.println("");
    System.out.println("Estado actual de las gallinas:");    
    System.out.println( gallina1.mostrarEstado() );
    System.out.println( gallina2.mostrarEstado() );
  }
}

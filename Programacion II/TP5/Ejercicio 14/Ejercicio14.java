
public class Ejercicio14 {
    public static void main(String[] args) {

        // 1. Creamos un proyecto
        Proyecto proyecto1 = new Proyecto("Cronovisor", 15.5);

        // 2. Creamos un editor de video
        EditorVideo miEditor = new EditorVideo();

        // 3. Por último, usamos el editor para renderizar el proyecto
        Render renderFinal = miEditor.exportar("MP4", proyecto1);

        System.out.println("\n=== Renderizado completo ===");
        System.out.println("Proyecto: " + renderFinal.getProyecto().getNombre());
        System.out.println("Duración: " + renderFinal.getProyecto().getDuracionMin() + " minutos");
        System.out.println("Formato: " + renderFinal.getFormato());
    }
}

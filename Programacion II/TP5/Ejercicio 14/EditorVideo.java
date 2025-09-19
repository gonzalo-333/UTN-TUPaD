
// Dependencia de creacion: el metodo exportar() crea un objeto Render, llamando a
// a un constructor y luego lo retorna

class EditorVideo {
    public Render exportar(String formato, Proyecto proyecto) {
        System.out.println("Exportando proyecto \"" + proyecto.getNombre() + "\" a formato " + formato + "...");
        Render objeto = new Render(formato, proyecto);
        return objeto;
    }
}
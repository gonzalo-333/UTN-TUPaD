
class Libro {
    private String isbn;
    private String titulo;
    private int anioPublicacion;
    private Autor autor;                        // Asociación con Autor

    public Libro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
        this.autor = autor;
    }

    // Getters
    public String getIsbn() {
        return isbn;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public Autor getAutor() {
        return autor;
    }

    // Método solicitado
    public void mostrarInfo() {
        System.out.println("ISBN: " + isbn + " | Título: " + titulo + " | Año: " + anioPublicacion);
        System.out.print("           ");
        autor.mostrarInfo();
    }
}

public class Libro {
    private String titulo;
    private String autor;
    private int anioPublicacion;
    
    public void mostrarInfo(){
        System.out.println("\"" + titulo + "\", " + autor + ", " + anioPublicacion + ".");
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo(){
        return titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAutor(){
        return autor;
    }

    public void setAnioPublicacion( int anio ){
            this.anioPublicacion = anio;
    }

    public int getAnioPublicacion(){
        return anioPublicacion;
    }
}

// Dependencia de uso: el metodo reproducir() solamente utiliza el
// objetoi que recibe, pero no lo almacena

class Reproductor {
    public void reproducir(Cancion cancion) {
        System.out.println("Reproduciendo: \"" + cancion.getTitulo() + "\" \\m/_(>_<)_\\m/ ");
        System.out.println("Artista: " + cancion.getArtista().getNombre());
    }
}
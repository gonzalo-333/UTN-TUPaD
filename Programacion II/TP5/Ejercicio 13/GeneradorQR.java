
// Dependencia de creacion: el metodo generar() crea un objeto, llamando a
// a un constructor y luego lo retorna

class GeneradorQR {
    public CodigoQR generar(String valor, Usuario usuario) {
        System.out.println("Generando código QR para: " + usuario.getNombre());
        // creo el codigo llamando al constructor de la otra clase
        CodigoQR QR = new CodigoQR(valor, usuario);
        return QR;
    }
}
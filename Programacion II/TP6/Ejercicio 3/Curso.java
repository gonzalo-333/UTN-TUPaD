

class Curso {
    private String codigo;
    private String nombre;
    private Profesor profesor;                      // RELACION BIDIRECCIONAL

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.profesor = null;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    // --- Sincronización BIDIRECCIONAL ---

    // Asigna/cambia el profesor sincronizando ambos lados.
    public void setProfesor(Profesor nuevoProfesor) {
        // 1. Quita la relacion antigua si existía
        if (this.profesor != null && this.profesor != nuevoProfesor) {
            this.profesor.getCursos().remove(this); 
            System.out.println("El curso " + this.codigo + " fue quitado de la lista del Prof. " + this.profesor.getNombre());
        }

        // 2. Establece la nueva relación
        this.profesor = nuevoProfesor;

        // 3. Agrega la nueva relación
        if (nuevoProfesor != null && !nuevoProfesor.getCursos().contains(this)) {
            nuevoProfesor.getCursos().add(this); 
            System.out.println("El curso " + this.codigo + " fue agregado a la lista del Prof. " + nuevoProfesor.getNombre());
        }
    }

    // --- Impresión ---
    
    public void mostrarInfo() {
        String nombreProfesor;

        if (profesor != null) {
            nombreProfesor = profesor.getNombre();
        } else {
            nombreProfesor = "SIN ASIGNAR";
        }
        System.out.println("Código: " + codigo + " | Nombre: " + nombre + " | Profesor: " + nombreProfesor);
    }
}
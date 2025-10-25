

import java.util.ArrayList;
import java.util.List;

class Profesor {
    private String id;
    private String nombre;
    private String especialidad;
    private List<Curso> cursos;                     // RELACION BIDIRECCIONAL

    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.cursos = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    // --- Sincronización BIDIRECCIONAL ---

    // Agrega un curso a la lista y SINCRONIZA el lado del Curso
    public void agregarCurso(Curso c) {
        if (!this.cursos.contains(c)) {
            this.cursos.add(c);
            // Sincroniza llamando al setter del curso que maneja el lado del Profesor
            if (c.getProfesor() != this) { 
                c.setProfesor(this);
            }
        }
    }

    // Elimina un curso de la lista y SINCRONIZA el lado del Curso
    public void eliminarCurso(Curso c) {
        if (this.cursos.remove(c)) {
            // Sincroniza: Si el profesor del curso es este, lo deja en null
            if (c.getProfesor() == this) { 
                c.setProfesor(null);
            }
        }
    }

    // --- Impresión ---
    
    // Muestra códigos y nombres de los cursos
    public void listarCursos() {
        if (cursos.isEmpty()) {
            System.out.println("No dicta cursos actualmente.");
            return;
        }
        System.out.println("Total: " + cursos.size());
        for (Curso c : cursos) {
            System.out.println("-> " + c.getCodigo() + " - " + c.getNombre());
        }
    }

    // Muestra datos del profesor y cantidad de cursos
    public void mostrarInfo() {
        System.out.println("ID: " + id + " | Nombre: " + nombre + " | Especialidad: " + especialidad);
        System.out.println("Cursos Dictados: " + cursos.size());
    }
}
import java.util.ArrayList;
import java.util.List;

class Universidad {
    private String nombre;
    private List<Profesor> profesores;
    private List<Curso> cursos;

    public Universidad(String nombre) {
        this.nombre = nombre;
        this.profesores = new ArrayList<>();
        this.cursos = new ArrayList<>();
    }

    public void agregarProfesor(Profesor p) {
        profesores.add(p);
        System.out.println("Profesor agregado: " + p.getNombre());
    }

    public void agregarCurso(Curso c) {
        cursos.add(c);
        System.out.println("Curso agregado: " + c.getNombre());
    }

    public Profesor buscarProfesorPorId(String id) {
        for (Profesor p : profesores) {
            if (p.getId().equals(id)) {
                return p;
            }
        }
        return null;
    }

    public Curso buscarCursoPorCodigo(String codigo) {
        for (Curso c : cursos) {
            if (c.getCodigo().equals(codigo)) {
                return c;
            }
        }
        return null;
    }

    // --- Sincronización BIDIRECCIONAL ---

    // Usa setProfesor del Curso para sincronizar ambos lados.
    public void asignarProfesorACurso(String codigoCurso, String idProfesor) {
        Curso curso = buscarCursoPorCodigo(codigoCurso);
        Profesor profesor = buscarProfesorPorId(idProfesor);

        if (curso == null) {
            System.out.println("Asignación fallida: Curso con código " + codigoCurso + " no encontrado.");
            return;
        }
        if (profesor == null) {
            System.out.println("Asignación fallida: Profesor con ID " + idProfesor + " no encontrado.");
            return;
        }

        // Asignacion clave en la sincronización bidireccional
        curso.setProfesor(profesor); 
        System.out.println("Curso " + curso.getNombre() + " asignado a Prof. " + profesor.getNombre());
    }

    // Eliminar Curso: debe romper la relación con su profesor (llamando a setProfesor(null))
    public void eliminarCurso(String codigo) {
        Curso cursoAEliminar = buscarCursoPorCodigo(codigo);
        if (cursoAEliminar == null) {
            System.out.println("Eliminación fallida: Curso con código " + codigo + " no encontrado.");
            return;
        }
        
        // Romper la relación bidireccional antes de remover el objeto
        cursoAEliminar.setProfesor(null); 

        cursos.remove(cursoAEliminar);
        System.out.println("Curso " + cursoAEliminar.getNombre() + " eliminado de la universidad.");
    }

    // Eliminar Profesor: Antes de remover, dejar null los profesores de los cursos que dictaba.
    public void eliminarProfesor(String id) {
        Profesor profesorAEliminar = buscarProfesorPorId(id);
        if (profesorAEliminar == null) {
            System.out.println("Eliminación fallida: Profesor con ID " + id + " no encontrado.");
            return;
        }
        // Arma un ArrayList de los cursos del profesor que queremos eliminar en otra lista
        List<Curso> cursosADesvincular = new ArrayList<>(profesorAEliminar.getCursos());
        // Recorremos esta nueva lista y por cada curso seteamos el profesor a null
        for (Curso c : cursosADesvincular) {
            c.setProfesor(null); // Esto rompe la relación bidireccional
            System.out.println("Curso " + c.getCodigo() + " desvinculado de " + profesorAEliminar.getNombre());
        }
        // Eliminamos el profesor
        profesores.remove(profesorAEliminar);
        System.out.println("Profesor " + profesorAEliminar.getNombre() + " eliminado de la universidad.");
    }
    
    // --- Impresión ---

    public void listarProfesores() {
        System.out.println("\n--- LISTADO DE PROFESORES ---");
        for (Profesor p : profesores) {
            p.mostrarInfo();
        }
        System.out.println("-----------------------------\n");
    }

    public void listarCursos() {
        System.out.println("\n--- LISTADO DE CURSOS ---");
        for (Curso c : cursos) {
            c.mostrarInfo();
        }
        System.out.println("---------------------------\n");
    }
    
    public void mostrarReporteCursosPorProfesor() {
        System.out.println("\n--- REPORTE: CANTIDAD DE CURSOS POR PROFESOR ---");
        for (Profesor p : profesores) {
            System.out.println("Prof. " + p.getNombre() + ": " + p.getCursos().size() + " cursos.");
        }
        System.out.println("----------------------------------------------\n");
    }
}
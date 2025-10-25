
public class Main {
    public static void main(String[] args) {
        Universidad utn = new Universidad("Universidad Tecnonologica Nacional");
        System.out.println("--- GESTIÓN ACADÉMICA BIDIRECCIONAL (TP 6 - Ej. 3) ---");

        // 1. Crear al menos 3 profesores y 5 cursos.
        Profesor p1 = new Profesor("P101", "Dr. Alan Turing", "Algoritmos");
        Profesor p2 = new Profesor("P102", "Ing. Ada Lovelace", "Estructuras");
        Profesor p3 = new Profesor("P103", "Lic. Grace Hopper", "Bases de Datos");

        Curso c1 = new Curso("C201", "Programación II");
        Curso c2 = new Curso("C202", "Probabilidad y Estadistica");
        Curso c3 = new Curso("C203", "Arquitectura y S.O.");
        Curso c4 = new Curso("C204", "Matematica");
        Curso c5 = new Curso("C205", "Bases de Datos Relacionales");

        // 2. Agregar profesores y cursos a la universidad.
        System.out.println("\n===== TAREA 2: AGREGAR A LA UNIVERSIDAD =====");
        utn.agregarProfesor(p1);
        utn.agregarProfesor(p2);
        utn.agregarProfesor(p3);
        utn.agregarCurso(c1);
        utn.agregarCurso(c2);
        utn.agregarCurso(c3);
        utn.agregarCurso(c4);
        utn.agregarCurso(c5);
        
        // 3. Asignar profesores a cursos usando asignarProfesorACurso(...).
        System.out.println("\n===== TAREA 3: ASIGNAR PROFESORES Y SINCRONIZAR =====");
        utn.asignarProfesorACurso("C201", "P101"); // POO -> Turing
        utn.asignarProfesorACurso("C202", "P102"); // Estructuras -> Lovelace
        utn.asignarProfesorACurso("C203", "P101"); // Teoría -> Turing
        utn.asignarProfesorACurso("C205", "P103"); // BD Relacionales -> Hopper
        
        // 4. Listar cursos con su profesor y profesores con sus cursos.
        System.out.println("\n===== TAREA 4: LISTAR Y VERIFICAR BIDIRECCIONALIDAD =====");
        utn.listarCursos();
        utn.listarProfesores();
        
        // Verificación del lado Profesor
        System.out.println("\n--- VERIFICACIÓN DE LISTA DEL PROFESOR P101 (TURING) ---");
        p1.mostrarInfo();
        p1.listarCursos();

        // 5. Cambiar el profesor de un curso (C203) y verificar que ambos lados quedan sincronizados.
        System.out.println("\n===== TAREA 5: CAMBIAR PROFESOR Y SINCRONIZAR =====");
        System.out.println("Se cambia el profesor del curso C203 (Teoría) de Turing a Lovelace.");
        utn.asignarProfesorACurso("C203", "P102"); // Teoría -> Lovelace (C203 se quita de P101 y se agrega a P102)
        
        // Verificación de sincronización
        System.out.println("\n--- ESTADO FINAL DE LOS PROFESORES ---");
        p1.mostrarInfo(); // Debe tener solo 1 curso (POO)
        p2.mostrarInfo(); // Debe tener 2 cursos (Estructuras y Teoría)

        // 6. Remover un curso (C205) y confirmar que ya no aparece en la lista del profesor (P103).
        System.out.println("\n===== TAREA 6: REMOVER CURSO Y ROMPER RELACIÓN =====");
        utn.eliminarCurso("C205"); // C205 se desvincula de P103 antes de ser eliminado
        
        // Verificación del lado Profesor P103
        System.out.println("\n--- ESTADO DE PROFESOR P103 (HOPPER) DESPUÉS DE BAJA DE CURSO ---");
        p3.mostrarInfo(); 
        p3.listarCursos(); // Debe decir "No dicta cursos actualmente"

        // 7. Remover un profesor (P102) y dejar profesor = null en sus cursos.
        System.out.println("\n===== TAREA 7: REMOVER PROFESOR Y DESVINCULAR CURSOS =====");
        utn.eliminarProfesor("P102"); 
        
        // Verificación de los cursos C202 y C203
        System.out.println("\n--- ESTADO DE CURSOS DESPUÉS DE BAJA DE PROFESOR P102 ---");
        utn.buscarCursoPorCodigo("C202").mostrarInfo(); // Debe decir SIN ASIGNAR
        utn.buscarCursoPorCodigo("C203").mostrarInfo(); // Debe decir SIN ASIGNAR
        
        // 8. Mostrar un reporte: cantidad de cursos por profesor.
        System.out.println("\n===== TAREA 8: REPORTE FINAL =====");
        utn.mostrarReporteCursosPorProfesor();
    }
}
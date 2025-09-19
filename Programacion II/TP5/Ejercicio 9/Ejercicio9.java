
public class Ejercicio9 {
    public static void main(String[] args) {

      // 1. Creamos paciente y profesional
      Paciente paciente1 = new Paciente("Luis Torres", "OSDE");
      Profesional profesional1 = new Profesional("Dr. Mario Pérez", "Cardiología");

      // 2. Creamos una cita medica
      CitaMedica cita1 = new CitaMedica("22/09/2025", "15:30", paciente1, profesional1);
      
      System.out.println("=== Cita Médica ===");
      System.out.println("Fecha: " + cita1.getFecha());
      System.out.println("Hora: " + cita1.getHora());
      System.out.println("Paciente: " + cita1.getPaciente().getNombre() + " (" + cita1.getPaciente().getObraSocial() + ")");
      System.out.println("Profesional: " + cita1.getProfesional().getNombre() + " (" + cita1.getProfesional().getEspecialidad() + ")");
    }
}


class CitaMedica {
    private String fecha;
    private String hora;
    private Paciente paciente;          // ASOCIACION UNIDIRECCIONAL
    private Profesional profesional;    // ASOCIACION UNIDIRECCIONAL

    public CitaMedica(String fecha, String hora, Paciente paciente, Profesional profesional) {
        this.fecha = fecha;
        this.hora = hora;
        this.paciente = paciente;
        this.profesional = profesional;
    }

    public String getFecha() {
        return fecha;
    }

    public String getHora() {
        return hora;
    }

    // consigue datos del paciente
    public Paciente getPaciente() {
        return paciente;
    }

    // consigue datos del profesional
    public Profesional getProfesional() {
        return profesional;
    }
}
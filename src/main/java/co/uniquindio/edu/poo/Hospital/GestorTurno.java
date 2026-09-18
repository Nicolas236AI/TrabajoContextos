package co.uniquindio.edu.poo.Hospital;

public final class GestorTurno {

    private static GestorTurno instancia;
    private Turno turno;
    private Paciente paciente;

    private GestorTurno(Turno turno,Paciente paciente) {
        this.turno = turno;
        this.paciente=paciente;
    }

    public static  GestorTurno getInstancia() {
        if (instancia == null) {
            instancia = new GestorTurno(null,null);
        }
        return instancia;
    }

    public void asignarTurno() {
        if (this.turno != null) {
            this.turno.setEstado(EstadoTurno.ASIGNADO);
        }
    }

    public void cambiarEstadoTurno(EstadoTurno nuevoEstado) {
        if (this.turno != null) {
            this.turno.setEstado(nuevoEstado);
        }
    }

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
}
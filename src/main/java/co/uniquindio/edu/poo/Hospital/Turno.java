package co.uniquindio.edu.poo.Hospital;

public class Turno {

    private EstadoTurno estado;
    private String nombre;
    private String fecha;
    private String serial;
    private GestorTurno gestor;

    public Turno(EstadoTurno estado, String nombre, String fecha, String serial, GestorTurno gestor) {
        this.estado = estado;
        this.nombre = nombre;
        this.fecha = fecha;
        this.serial = serial;
        this.gestor = gestor;
    }

    public EstadoTurno getEstado() {
        return estado;
    }

    public void setEstado(EstadoTurno estado) {
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public GestorTurno getGestor() {
        return gestor;
    }

    public void setGestor(GestorTurno gestor) {
        this.gestor = gestor;
    }
}

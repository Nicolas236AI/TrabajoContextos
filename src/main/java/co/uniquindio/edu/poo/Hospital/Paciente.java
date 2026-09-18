package co.uniquindio.edu.poo.Hospital;

public class Paciente {

    private String nombre;
    private int id;
    private Turno turno;

    public Paciente(String nombre, int id, Turno turno) {
        this.nombre = nombre;
        this.id = id;
        this.turno = turno;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Turno getTurno() {
        return turno;
    }

    public void setTurnoAsignado(Turno turno) {
        this.turno = turno;
    }
}

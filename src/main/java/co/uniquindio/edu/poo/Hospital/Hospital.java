package co.uniquindio.edu.poo.Hospital;
import java.util.ArrayList;
import java.util.List;

public class Hospital {

    private String nombre;
    private List<Paciente> listaPacientes;
    private GestorTurno gestor;

    public Hospital(String nombre) {
        this.nombre = nombre;
        this.listaPacientes = new ArrayList<>();
        this.gestor = GestorTurno.getInstancia();
    }

    public void registrarPaciente(Paciente paciente) {
        this.listaPacientes.add(paciente);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Paciente> getListaPacientes() {
        return listaPacientes;
    }

    public GestorTurno getGestor() {
        return gestor;
    }
}
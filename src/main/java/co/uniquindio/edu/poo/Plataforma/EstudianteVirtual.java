package co.uniquindio.edu.poo.Plataforma;

public class EstudianteVirtual extends Estudiante {
    private String salon;

    public EstudianteVirtual(String nombre, String id, Perfil perfil, String salon) {
        super(nombre, id, perfil);
        this.salon = salon;
    }

    public String getSalon() { return salon; }
    public void setSalon(String salon) { this.salon = salon; }
}
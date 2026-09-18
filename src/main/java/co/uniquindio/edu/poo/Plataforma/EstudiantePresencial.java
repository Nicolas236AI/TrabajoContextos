package co.uniquindio.edu.poo.Plataforma;

public class EstudiantePresencial extends Estudiante {
    private String pagina;

    public EstudiantePresencial(String nombre, String id, Perfil perfil, String pagina) {
        super(nombre, id, perfil);
        this.pagina = pagina;
    }

    public String getPagina() { return pagina; }
    public void setPagina(String pagina) { this.pagina = pagina; }
}

package co.uniquindio.edu.poo.Biblioteca;

public class Libro implements Copiable {
    private String titulo;
    private String contenido;
    private String anotaciones;
    private String marcadores;
    private String resumen;

    public Libro(String titulo, String contenido) {
        this.titulo = titulo;
        this.contenido = contenido;
        this.anotaciones = "";
        this.marcadores = "";
        this.resumen = "";
    }

    public Libro(Libro target) {
        if (target != null) {
            this.titulo = target.titulo;
            this.contenido = target.contenido;
            this.anotaciones = target.anotaciones;
            this.marcadores = target.marcadores;
            this.resumen = target.resumen;
        }
    }

    public void agregarAnotacion(String anotacion) {
        this.anotaciones += (this.anotaciones.isEmpty() ? "" : "\n") + anotacion;
    }

    public void agregarMarcador(String marcador) {
        this.marcadores += (this.marcadores.isEmpty() ? "" : ", ") + marcador;
    }

    public void agregarResumen(String resumen) {
        this.resumen = resumen;
    }

    @Override
    public Copiable clonar() {
        return new Libro(this);
    }

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getContenido() { return contenido; }
    public void setContenido(String contenido) { this.contenido = contenido; }

    public String getAnotaciones() { return anotaciones; }
    public void setAnotaciones(String anotaciones) { this.anotaciones = anotaciones; }

    public String getMarcadores() { return marcadores; }
    public void setMarcadores(String marcadores) { this.marcadores = marcadores; }

    public String getResumen() { return resumen; }
    public void setResumen(String resumen) { this.resumen = resumen; }
}

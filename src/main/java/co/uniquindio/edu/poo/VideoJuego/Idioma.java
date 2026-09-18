package co.uniquindio.edu.poo.VideoJuego;

public class Idioma extends ConfiguracionGlobal {
    private String idioma;

    public Idioma(String configuracionNombre, String idioma) {
        super(configuracionNombre);
        this.idioma = idioma;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }
}

package co.uniquindio.edu.poo.VideoJuego;

public class Sonido extends ConfiguracionGlobal {
    private int nivel;

    public Sonido(String configuracionNombre, int nivel) {
        super(configuracionNombre);
        this.nivel = nivel;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
}

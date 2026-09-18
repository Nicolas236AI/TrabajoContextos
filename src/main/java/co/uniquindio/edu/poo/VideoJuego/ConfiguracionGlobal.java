package co.uniquindio.edu.poo.VideoJuego;

public abstract class ConfiguracionGlobal {
    private String configuracionNombre;

    public ConfiguracionGlobal(String configuracionNombre) {
        this.configuracionNombre = configuracionNombre;
    }

    public String getConfigurationNombre() {
        return configuracionNombre;
    }

    public void setConfiguracionNombre(String configuracionNombre) {
        this.configuracionNombre = configuracionNombre;
    }
}

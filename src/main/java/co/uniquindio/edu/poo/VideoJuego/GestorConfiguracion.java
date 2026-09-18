package co.uniquindio.edu.poo.VideoJuego;
import java.util.ArrayList;
import java.util.List;

public final class GestorConfiguracion {
    private static GestorConfiguracion instancia;
    private List<ConfiguracionGlobal> listaConfiguracion;

    private GestorConfiguracion() {
        this.listaConfiguracion = new ArrayList<>();
    }

    public static GestorConfiguracion obtenerInstancia() {
        if (instancia == null) {
            instancia = new GestorConfiguracion();
        }
        return instancia;
    }

    public void agregarConfiguracion(ConfiguracionGlobal configuracion) {
        this.listaConfiguracion.add(configuracion);
    }

    public List<ConfiguracionGlobal> getListaConfiguracion() {
        return listaConfiguracion;
    }

    public void setListaConfiguracion(List<ConfiguracionGlobal> listaConfiguracion) {
        this.listaConfiguracion = listaConfiguracion;
    }
}

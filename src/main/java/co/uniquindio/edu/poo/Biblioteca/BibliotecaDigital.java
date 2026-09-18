package co.uniquindio.edu.poo.Biblioteca;

import java.util.ArrayList;
import java.util.List;

public class BibliotecaDigital {
    private String nombre;
    private String corrreo;
    private List<Libro> listaLibros;

    public BibliotecaDigital(String nombre, String corrreo) {
        this.nombre = nombre;
        this.corrreo = corrreo;
        this.listaLibros = new ArrayList<>();
    }

    public void registrarLibro(Libro libro) {
        this.listaLibros.add(libro);
    }

    public Libro obtenerCopiaPersonalizada(Libro libroOriginal, String anotacionExtra) {
        ModuloPersonalizado modulo = new ModuloPersonalizado(libroOriginal);
        return modulo.personalizarCopia(libroOriginal, anotacionExtra);
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getCorrreo() { return corrreo; }
    public void setCorrreo(String corrreo) { this.corrreo = corrreo; }

    public List<Libro> getListaLibros() { return listaLibros; }
    public void setListaLibros(List<Libro> listaLibros) { this.listaLibros = listaLibros; }
}

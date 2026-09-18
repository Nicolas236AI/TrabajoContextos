package co.uniquindio.edu.poo.Biblioteca;

public class ModuloPersonalizado {
    private Copiable copiable;

    public ModuloPersonalizado(Copiable copiable) {
        this.copiable = copiable;
    }

    public Copiable copiaPersonnalizada(Copiable base) {
        return base.clonar();
    }

    public Libro personalizarCopia(Libro libroBase, String nuevaAnotacion) {
        Libro copia = (Libro) this.copiaPersonnalizada(libroBase);
        copia.agregarAnotacion(nuevaAnotacion);
        return copia;
    }

    public Copiable getCopiable() { return copiable; }
    public void setCopiable(Copiable copiable) { this.copiable = copiable; }
}
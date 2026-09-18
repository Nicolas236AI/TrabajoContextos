package co.uniquindio.edu.poo.EmpresaMovilidad;

public interface Construible {
    Construible setTipo(String tipo);
    Construible setPlaca(String placa);
    Construible setColor(String color);
    Construible setCapacidad(int capacidad);
    Construible agregarAccesorio(String accesorio);
}

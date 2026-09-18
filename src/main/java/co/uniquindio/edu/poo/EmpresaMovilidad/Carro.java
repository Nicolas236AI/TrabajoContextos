package co.uniquindio.edu.poo.EmpresaMovilidad;

public class Carro extends Vehiculo {

    public Carro(CarroBuilder builder) {
        super(builder);
    }

    public Carro(Carro target) {
        super(target);
    }

    @Override
    public Carro clone() {
        return new Carro(this);
    }

    @Override
    public Vehiculo clonar() {
        return null;
    }

    public static class CarroBuilder extends Builder {
        public CarroBuilder(String placa) {
            super("Carro", placa);
        }

        @Override
        public Carro build() {
            return new Carro(this);
        }
    }
}

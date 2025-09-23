package vehiculo;

public class Moto extends Vehiculo {
    public Moto(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void mover() {
        System.out.println("La moto " + getMarca() + " " + getModelo() + " se desplaza  por la carretera.");
    }
}
package vehiculo;

public class Carro extends Vehiculo implements Combustible {
    public Carro(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void mover() {
        System.out.println("El carro " + getMarca() + " " + getModelo() + " se está moviendo a gran velocidad.");
    }

    @Override
    public void recargar() {
        System.out.println("El carro " + getMarca() + " " + getModelo() + " está llenando su tanque de gasolina.");
    }
}
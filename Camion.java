package vehiculo;

public class Camion extends Vehiculo implements Combustible {
    public Camion(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void mover() {
        System.out.println("El camión " + getMarca() + " " + getModelo() + " avanza lentamente por su carril.");
    }

    @Override
    public void recargar() {
        System.out.println("El camión " + getMarca() + " " + getModelo() + " está cargando combustible diésel.");
    }
}
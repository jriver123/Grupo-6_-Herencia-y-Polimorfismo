package run;

import vehiculo.Vehiculo;
import vehiculo.Carro;
import vehiculo.Moto;
import vehiculo.Camion;
import vehiculo.Combustible;

public class Main {
    public static void main(String[] args) {
        Vehiculo[] vehiculos = new Vehiculo[3];
        vehiculos[0] = new Carro("Toyota", "Corolla");
        vehiculos[1] = new Moto("Chevrolet", "Groove");
        vehiculos[2] = new Camion("Nissan", "Frontier");

        System.out.println("Movimiento de los vehículos:");
        for (Vehiculo v : vehiculos) {
            v.mover();
        }

        System.out.println("\nRecarga de combustible:");
        for (Vehiculo v : vehiculos) {
            if (v instanceof Combustible) {
                ((Combustible) v).recargar();
            }
        }
    }
}
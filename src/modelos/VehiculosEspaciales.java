package modelos;

import interfaces.TipoDeMotor;
import servicios.Vehiculos;

public class VehiculosEspaciales extends Vehiculos implements TipoDeMotor {

    public VehiculosEspaciales(String nombre, int capacidad, String tamaño, int peso) {
        super(nombre, capacidad, tamaño, peso);
    }

    @Override
    public void informacionVehiculo() {
        System.out.println("se adapta a cualquier tipo de motor");
    }

    @Override
    public void tiposMotorDescripcion() {
        System.out.println("Vehiculo Terrestre " + getNombre());
        System.out.println("capacidad en pasajeros:  " + getCapacidad() +"pasajeros");
        System.out.println("tamaño: " + getTamaño());
        System.out.println("peso: " + getPeso() + "kolgramos");

        tiposMotorDescripcion();

    }
}

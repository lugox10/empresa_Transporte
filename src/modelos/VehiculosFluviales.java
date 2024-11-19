package modelos;

import interfaces.TipoDeMotor;
import servicios.Vehiculos;

public class VehiculosFluviales extends Vehiculos implements TipoDeMotor {



    public VehiculosFluviales(String nombre, int capacidad, String tamaño, int peso) {
        super(nombre, capacidad, tamaño, peso);
    }

    @Override
    public void tiposMotorDescripcion() {
        System.out.println("motor a Gasolina");
    }

    @Override
    public void informacionVehiculo() {
        System.out.println("Vehiculo acuatico " + getNombre());
        System.out.println("capacidad en pasajeros:  " + getCapacidad() +"pasajeros");
        System.out.println("tamaño: " + getTamaño());
        System.out.println("peso: " + getPeso() + "kilogramos");

        tiposMotorDescripcion();

    }
}

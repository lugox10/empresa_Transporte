package modelos;

import interfaces.TipoDeMotor;
import servicios.Vehiculos;

public class VehiculosTerresres extends Vehiculos implements TipoDeMotor {


    public VehiculosTerresres(String nombre, int capacidad, String tamaño, int peso) {
        super(nombre, capacidad, tamaño, peso);
    }

    @Override
    public void informacionVehiculo() {

        System.out.println("Vehiculo Terrestre " + getNombre());
        System.out.println("capacidad en pasajeros:  " + getCapacidad() +"pasajeros");
        System.out.println("tamaño: " + getTamaño());
        System.out.println("peso: " + getPeso() + "kolgramos");

        tiposMotorDescripcion();


    }

    @Override
    public void tiposMotorDescripcion() {
        System.out.println("este vehiculo puede tener cualquier tipo de motor");
    }


}

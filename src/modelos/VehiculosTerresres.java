package modelos;

import interfacesVehiculos.TipoDeMotor;
import modelsengines.TamañoVehiculo;
import servicios.Vehiculos;

public class VehiculosTerresres extends Vehiculos implements TipoDeMotor {


    public VehiculosTerresres(String nombre, int capacidad, int peso, TamañoVehiculo tamaño) {
        super(nombre, capacidad, peso, tamaño);
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

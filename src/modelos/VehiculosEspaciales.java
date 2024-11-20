package modelos;

import interfacesVehiculos.TipoDeMotor;
import modelsengines.TamañoVehiculo;
import servicios.Vehiculos;

public class VehiculosEspaciales extends Vehiculos implements TipoDeMotor {

    public VehiculosEspaciales(String nombre, int capacidad, int peso, TamañoVehiculo tamaño) {
        super(nombre, capacidad, peso, tamaño);
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

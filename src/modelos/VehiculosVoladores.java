package modelos;

import modelsengines.AirEngines;
import modelsengines.TamañoVehiculo;
import servicios.Vehiculos;

public class VehiculosVoladores extends Vehiculos {

    private TipoTransporte tipoTransporte;
    private AirEngines airEngines;

    public VehiculosVoladores(String nombre, int capacidad, int peso, TamañoVehiculo tamaño, TipoTransporte tipoTransporte, AirEngines airEngines) {
        super(nombre, capacidad, peso, tamaño);
        this.tipoTransporte = tipoTransporte;
        this.airEngines = airEngines;
    }

    @Override
    public void informacionVehiculo() {
        System.out.println("Vehiculo Aereo :" + getNombre());
        System.out.println("capacidad en pasajeros:  " + getCapacidad() + "pasajeros");
        System.out.println("tamaño: " + getTamaño());
        System.out.println("peso: " + getPeso() + "kolgramos");
        System.out.println("tipo de transporte :" + tipoTransporte);
        airEngines.informacionMotor();
    }
}

package modelos;

import interfaces.TipoDeMotor;
import servicios.Vehiculos;

public class VehiculosVoladores extends Vehiculos implements TipoDeMotor {

    private String tipoTransporte;

    public VehiculosVoladores(String nombre, int capacidad, String tamaño, int peso, String tipoTransporte) {
        super(nombre, capacidad, tamaño, peso);
        this.tipoTransporte = tipoTransporte;
    }

    @Override
    public void tiposMotorDescripcion() {
        System.out.println("cualquier tipo de motor ");
    }

    @Override
    public void informacionVehiculo() {

        System.out.println("Vehiculo volador tipo: " + getNombre());
        System.out.println("capacidad en pasajeros:  " + getCapacidad() +"pasajeros");
        System.out.println("tamaño: " + getTamaño());
        System.out.println("peso: " + getPeso() + "kolgramos");

        System.out.println(tipoTransporte);
       tiposMotorDescripcion();


    }

}

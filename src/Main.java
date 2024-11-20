import modelos.TipoTransporte;
import modelos.VehiculosVoladores;
import modelsengines.AirEngines;
import modelsengines.TamañoVehiculo;
import modelsengines.TiposCombustiblesMotor;
import servicios.ListaVehiculos;
import servicios.Vehiculos;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        ListaVehiculos mostrarLista = new ListaVehiculos();
        List<Vehiculos> lista = new ArrayList<>();

        Vehiculos volador = new VehiculosVoladores("avion", 100, 1000, TamañoVehiculo.grande, TipoTransporte.comercial,
                new AirEngines("general", "boing ", "737", 100, TiposCombustiblesMotor.gasolina_premium));


        mostrarLista.agregar(volador);



        mostrarLista.mostrarVehiculos();

        //mastervoy a tratar de meterle listas independientes

    }
}
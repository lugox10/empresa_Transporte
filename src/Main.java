import interfaces.CombustiblesParaMotor;
import interfaces.TipoDeMotor;
import modelsengines.AirEngines;
import modelsengines.CombustiblesMotor;
import modelsengines.Motor;
import servicios.FuncionesMotorElectrico;
import modelos.VehiculosTerresres;
import modelos.VehiculosVoladores;
import servicios.ListaVehiculos;
import servicios.Vehiculos;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        ListaVehiculos mostrarLista = new ListaVehiculos();
        List<Vehiculos> lista = new ArrayList<>();

        Vehiculos volador = new VehiculosVoladores("avion", 100, "grande", 50, "carga");
        Vehiculos TERRESTRE = new VehiculosTerresres("camion", 100, "grande", 10);








        // mostrarLista.agregar(volador);
        // mostrarLista.agregar(TERRESTRE);


        // mostrarLista.mostrarVehiculos();


    }
}
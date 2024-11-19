package servicios;

import java.util.ArrayList;
import java.util.List;

public class ListaVehiculos {

   private List<Vehiculos> vehiculosList = new ArrayList<>();

   public void agregar(Vehiculos vehiculos){
     vehiculosList.add(vehiculos);
    }

    public void mostrarVehiculos(){
       for(Vehiculos vehi : vehiculosList){
           vehi.informacionVehiculo();
           System.out.println("--------------");
       }
    }

}

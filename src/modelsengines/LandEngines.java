package modelsengines;

import interfaces.CombustiblesParaMotor;

public class LandEngines extends Motor{

    public LandEngines(String fabricante, String modelo, String marca, float peso, CombustiblesParaMotor combustiblesParaMotor) {
        super(fabricante, modelo, marca, peso, combustiblesParaMotor);
    }

    void GasolineinternalCombustionEngines() {
        System.out.println("motores a gasolina para Vehiculos medianos");
    }

    void dieselInternalCombustionEngines(){
        System.out.println("motores diesel para vehiculos grandes");
    }

    void electricMotors(){
        System.out.println("motores de corriente alterna");
    }

}

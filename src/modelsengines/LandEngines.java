package modelsengines;

public class LandEngines extends Motor{


    public LandEngines(String fabricanteMotor, String modeloMotor, String marcaMotor, float pesoMotor) {
        super(fabricanteMotor, modeloMotor, marcaMotor, pesoMotor);
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

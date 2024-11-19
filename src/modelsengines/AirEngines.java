package modelsengines;

import interfaces.CombustiblesParaMotor;

public class AirEngines extends Motor {
    private CombustiblesMotor combustibles;

    public AirEngines(String fabricante, String modelo, String marca, float peso,
                      CombustiblesParaMotor combustiblesParaMotor, CombustiblesMotor combustibles) {
        super(fabricante, modelo, marca, peso, combustiblesParaMotor);
        this.combustibles = combustibles;
    }

    void jetEngines() {
        System.out.println("Motor utilizado en aviones de carga y comerciales y militar");
        verFichaTecnica();
        combustiblesParaMotor.tipoCombustible("diesel");
    }

    void pistonEngines() {
        System.out.println("motores para aviones ligeros");
    }

    void AerialElectricMotors() {
        System.out.println("en desarrollo para aviones ligeros");
    }

    public CombustiblesMotor getCombustibles() {
        return combustibles;
    }

    public void setCombustibles(CombustiblesMotor combustibles) {
        this.combustibles = combustibles;
    }
}

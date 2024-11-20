package modelsengines;

import InterfacesMotores.MotoresAereos;

public class AirEngines extends Motor implements MotoresAereos {
    protected TiposCombustiblesMotor tiposCombustiblesMotor;


    public AirEngines(String fabricanteMotor, String modeloMotor, String marcaMotor, float pesoMotor, TiposCombustiblesMotor tiposCombustiblesMotor) {
        super(fabricanteMotor, modeloMotor, marcaMotor, pesoMotor);
        this.tiposCombustiblesMotor = tiposCombustiblesMotor;
    }

    @Override
    public void informacionMotor() {

        System.out.println("Nombre Fabricante Motor:" + getFabricanteMotor());
        System.out.println("Modelo Motor: " + getModeloMotor());
        System.out.println("Marca Motor: " + getMarcaMotor());
        System.out.println("Peso Motor: " + getPesoMotor() + "Kilogramos");
        System.out.println("Tipo Combustible: " + tiposCombustiblesMotor);
        jetEngines();

    }

    public TiposCombustiblesMotor getTiposCombustiblesMotor() {
        return tiposCombustiblesMotor;
    }

    public void setTiposCombustiblesMotor(TiposCombustiblesMotor tiposCombustiblesMotor) {
        this.tiposCombustiblesMotor = tiposCombustiblesMotor;
    }

    @Override
    public void jetEngines() {
        System.out.println("Motor utilizado en aviones de carga, comerciales y militares");
    }

    @Override
    public void pistonEngines() {
        System.out.println("motores para aviones ligeros");
    }

    @Override
    public void AerialElectricMotors() {
        System.out.println("en desarrollo para aviones ligeros");
    }
}

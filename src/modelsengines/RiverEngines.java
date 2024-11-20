package modelsengines;

public class RiverEngines extends Motor{


    public RiverEngines(String fabricanteMotor, String modeloMotor, String marcaMotor, float pesoMotor) {
        super(fabricanteMotor, modeloMotor, marcaMotor, pesoMotor);
    }

    void engineDisel(){
        System.out.println("motor con eficiencia y potencia ");
    }

    void outBoardMotor(){
        System.out.println("Motores Faciles de mantener, Para envarcaciones pequeñas ");
    }

    void marineGasTurbines(){
        System.out.println("motor con potencia y velocidad para envarcaciones militares o muy grandes");
    }
}

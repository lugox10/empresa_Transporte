package modelsengines;

import interfaces.CombustiblesParaMotor;

public class RiverEngines extends Motor{
    public RiverEngines(String fabricante, String modelo, String marca, float peso, CombustiblesParaMotor combustiblesParaMotor) {
        super(fabricante, modelo, marca, peso, combustiblesParaMotor);
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

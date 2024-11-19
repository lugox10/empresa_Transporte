package modelsengines;

import interfaces.CombustiblesParaMotor;

public class SpaceEngines extends Motor{
    public SpaceEngines(String fabricante, String modelo, String marca, float peso, CombustiblesParaMotor combustiblesParaMotor) {
        super(fabricante, modelo, marca, peso, combustiblesParaMotor);
    }

    void ionesEngines(){
        System.out.println("motor para largas distancias espaciales acelerada por iones");
    }

    void motoresPropulsionNuclear(){
        System.out.println("motor con autonomia energetica");
    }

}

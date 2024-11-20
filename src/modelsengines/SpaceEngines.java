package modelsengines;

public class SpaceEngines extends Motor{

    public SpaceEngines(String fabricanteMotor, String modeloMotor, String marcaMotor, float pesoMotor) {
        super(fabricanteMotor, modeloMotor, marcaMotor, pesoMotor);
    }

    void ionesEngines(){
        System.out.println("motor para largas distancias espaciales acelerada por iones");
    }

    void motoresPropulsionNuclear(){
        System.out.println("motor con autonomia energetica");
    }

}

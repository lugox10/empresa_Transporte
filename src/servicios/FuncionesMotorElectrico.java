package servicios;

import interfaces.FuncionesDeMotor;

public class FuncionesMotorElectrico implements FuncionesDeMotor {

String corrrienteAlterna;

    public FuncionesMotorElectrico(String corrrienteAlterna) {
        this.corrrienteAlterna = corrrienteAlterna;
    }

    @Override
    public String arrancar() {
        return "Encendiendo el motor...";
    }

    @Override
    public void detener() {
        System.out.println("apagar");
    }

    @Override
    public String cambioMarcha() {
        return "4 tiempos";
    }


}

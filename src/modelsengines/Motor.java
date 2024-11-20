package modelsengines;

public class Motor  {

    private String fabricanteMotor;
    private String modeloMotor;
    private String MarcaMotor;
    private float pesoMotor;

    public Motor(String fabricanteMotor, String modeloMotor, String marcaMotor, float pesoMotor) {
        this.fabricanteMotor = fabricanteMotor;
        this.modeloMotor = modeloMotor;
        MarcaMotor = marcaMotor;
        this.pesoMotor = pesoMotor;
    }


    public void informacionMotor() {

        System.out.println("Nombre Fabricante Motor:" + getFabricanteMotor());
        System.out.println("Modelo Motor: " + getModeloMotor());
        System.out.println("Marca Motor: " + getMarcaMotor());
        System.out.println("Peso Motor: " + getPesoMotor());

    }

    public String getFabricanteMotor() {
        return fabricanteMotor;
    }

    public void setFabricanteMotor(String fabricanteMotor) {
        this.fabricanteMotor = fabricanteMotor;
    }

    public String getModeloMotor() {
        return modeloMotor;
    }

    public void setModeloMotor(String modeloMotor) {
        this.modeloMotor = modeloMotor;
    }

    public String getMarcaMotor() {
        return MarcaMotor;
    }

    public void setMarcaMotor(String marcaMotor) {
        MarcaMotor = marcaMotor;
    }

    public float getPesoMotor() {
        return pesoMotor;
    }

    public void setPesoMotor(float pesoMotor) {
        this.pesoMotor = pesoMotor;
    }


}


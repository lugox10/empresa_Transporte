package modelsengines;

import interfaces.CombustiblesParaMotor;

public class Motor {

    private String fabricante;
    private String modelo;
    private String Marca;
    private float peso;
    protected CombustiblesParaMotor combustiblesParaMotor;

    public Motor(String fabricante, String modelo, String marca, float peso, CombustiblesParaMotor combustiblesParaMotor) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        Marca = marca;
        this.peso = peso;
        this.combustiblesParaMotor = combustiblesParaMotor;
    }


    public String verFichaTecnica() {
        return "Motor{" +
                "fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", Marca='" + Marca + '\'' +
                ", peso=" + peso + "toneladas"+
                ", combustiblesParaMotor=" + combustiblesParaMotor +
                '}';
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public CombustiblesParaMotor getCombustiblesParaMotor() {
        return combustiblesParaMotor;
    }

    public void setCombustiblesParaMotor(CombustiblesParaMotor combustiblesParaMotor) {
        this.combustiblesParaMotor = combustiblesParaMotor;
    }


}


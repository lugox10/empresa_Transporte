package servicios;

import modelsengines.TamañoVehiculo;

public abstract class Vehiculos {


    private String nombre;
    private int capacidad;
    private TamañoVehiculo tamaño;
    private int peso;

    public Vehiculos(String nombre, int capacidad, int peso, TamañoVehiculo tamaño) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.peso = peso;
        this.tamaño = tamaño;
    }

    public abstract void informacionVehiculo();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public TamañoVehiculo getTamaño() {
        return tamaño;
    }

    public void setTamaño(TamañoVehiculo tamaño) {
        this.tamaño = tamaño;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
}

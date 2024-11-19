package servicios;

public abstract class Vehiculos {


    private String nombre;
    private int capacidad;
    private String tamaño;
    private int peso;

    public Vehiculos(String nombre, int capacidad, String tamaño, int peso) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.tamaño = tamaño;
        this.peso = peso;
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

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
}

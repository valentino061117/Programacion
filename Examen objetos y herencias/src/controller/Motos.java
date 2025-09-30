package controller;

public class Motos extends Vehiculo {
    private String transmision;
    private double peso;

    public Motos() {
    }

    public Motos(String transmision, double peso) {
        this.transmision = transmision;
        this.peso = peso;
    }

    public String getTransmision() {
        return transmision;
    }

    public void setTransmision(String transmision) {
        this.transmision = transmision;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}

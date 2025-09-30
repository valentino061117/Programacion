package controller;

public class Patinetes extends Vehiculo {

    private int autonomia;

    public Patinetes() {
    }

    public Patinetes(int autonomia) {
        this.autonomia = autonomia;
    }

    public int getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(int autonomia) {
        this.autonomia = autonomia;
    }
}

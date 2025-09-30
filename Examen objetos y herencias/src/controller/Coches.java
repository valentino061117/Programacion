package controller;

public class Coches extends Vehiculo {

    private int cv, cc;

    public Coches() {
    }

    public Coches(int cv, int cc) {
        this.cv = cv;
        this.cc = cc;
    }

    public int getCv() {
        return cv;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }
}

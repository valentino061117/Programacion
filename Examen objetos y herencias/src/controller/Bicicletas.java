package controller;

public class Bicicletas extends Vehiculo {

    private String mtb, carretera, cross;

    public Bicicletas() {
    }

    public Bicicletas(String mtb, String carretera, String cross) {
        this.mtb = mtb;
        this.carretera = carretera;
        this.cross = cross;
    }

    public String getMtb() {
        return mtb;
    }

    public void setMtb(String mtb) {
        this.mtb = mtb;
    }

    public String getCarretera() {
        return carretera;
    }

    public void setCarretera(String carretera) {
        this.carretera = carretera;
    }

    public String getCross() {
        return cross;
    }

    public void setCross(String cross) {
        this.cross = cross;
    }
}

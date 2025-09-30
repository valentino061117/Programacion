package controller;

public class Vehiculo {
    private String  marca, modelo, estado;
    private int numeroSerie;
    private double precio;

    public void Vehiculo(){}

    public void Vehiculo(String marca, String modelo, String estado, int numeroSerie, double precio){
        this.marca = marca;
        this.modelo = modelo;
        this.estado = estado;
        this.numeroSerie = numeroSerie;
        this.precio = precio;
    }

    public void estadoVehiculo(){

    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(int numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}

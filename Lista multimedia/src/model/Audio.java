package model;

public class Audio extends Elemento{

    private double duracion;

    private String soporte;

    public Audio(double duracion, String soporte) {
        this.duracion = duracion;
        this.soporte = soporte;
    }

    public Audio(String identificador, String titulo, Persona autor, String tamaño, String formato, double duracion, String soporte) {
        super(identificador, titulo, autor, tamaño, formato);
        this.duracion = duracion;
        this.soporte = soporte;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public String getSoporte() {
        return soporte;
    }

    public void setSoporte(String soporte) {
        this.soporte = soporte;
    }
}

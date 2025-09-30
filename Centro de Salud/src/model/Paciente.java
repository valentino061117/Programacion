package model;

public class Paciente extends Persona {
    private int nss;
    private String dolencia;

    public Paciente(String nombre, String apellido) {
        super(nombre, apellido);
    }

    public Paciente() {
    }

    public Paciente(String nombre, String apellido, int nss, String dolencia) {
        super(nombre, apellido);
        this.nss = nss;
        this.dolencia = dolencia;
    }

    public Paciente(int nss, String dolencia) {
        this.nss = nss;
        this.dolencia = dolencia;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("nss = " + nss);
        System.out.println("dolencia = " + dolencia);
    }

    public int getNss() {
        return nss;
    }

    public void setNss(int nss) {
        this.nss = nss;
    }

    public String getDolencia() {
        return dolencia;
    }

    public void setDolencia(String dolencia) {
        this.dolencia = dolencia;
    }
}

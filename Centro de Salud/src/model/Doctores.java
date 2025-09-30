package model;

public class Doctores extends Persona {
    private int numColegiado;

    public Doctores(String nombre, String apellido) {
        super(nombre, apellido);
    }

    public Doctores() {
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("numColegiado = " + numColegiado);
    }

    public Doctores(String nombre, String apellido, int numColegiado) {
        super(nombre, apellido);
        this.numColegiado = numColegiado;
    }

    public Doctores(int numColegiado) {
        this.numColegiado = numColegiado;
    }

    public int getNumColegiado() {
        return numColegiado;
    }

    public void setNumColegiado(int numColegiado) {
        this.numColegiado = numColegiado;
    }
}

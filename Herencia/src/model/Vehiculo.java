package model;


public abstract class Vehiculo {

    private Motor motor;

    private String bastidor;

    public Vehiculo(){}

    public Vehiculo(Motor motor, String bastidor){
        this.motor = motor;
        this.bastidor = bastidor;
    }

    public String getBastidor() {
        return bastidor;
    }

    public void setBastidor(String bastidor) {
        this.bastidor = bastidor;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public void mostrarDatos(){
        System.out.println("Motor "+motor);
        System.out.println("Bastidor "+bastidor);
    }

}

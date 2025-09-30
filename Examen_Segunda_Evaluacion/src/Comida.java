public class Comida extends Consumiciones{
    private double numeroCalorias;

    public Comida() {
    }

    public Comida(String nombre, double precio) {
        super(nombre, precio);
    }

    public Comida(double numeroCalorias) {
        this.numeroCalorias = numeroCalorias;
    }

    public Comida(String nombre, double precio, double numeroCalorias) {
        super(nombre, precio);
        this.numeroCalorias = numeroCalorias;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("numeroCalorias = " + numeroCalorias);
    }

    public double getNumeroCalorias() {
        return numeroCalorias;
    }

    public void setNumeroCalorias(double numeroCalorias) {
        this.numeroCalorias = numeroCalorias;
    }
}

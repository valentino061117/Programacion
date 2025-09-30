public class Racion extends Consumiciones{
    private double cantPlato;

    public Racion() {
    }

    public Racion(String nombre, double precio) {
        super(nombre, precio);
    }

    public Racion(double cantPlato) {
        this.cantPlato = cantPlato;
    }

    public Racion(String nombre, double precio, double cantPlato) {
        super(nombre, precio);
        this.cantPlato = cantPlato;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("cantPlato = " + cantPlato);
    }

    public double getCantPlato() {
        return cantPlato;
    }

    public void setCantPlato(double cantPlato) {
        this.cantPlato = cantPlato;
    }
}

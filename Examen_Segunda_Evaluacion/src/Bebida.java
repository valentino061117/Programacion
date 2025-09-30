public class Bebida extends Consumiciones{
    private int contMililitros;

    public Bebida() {
    }

    public Bebida(String nombre, double precio) {
        super(nombre, precio);
    }

    public Bebida(int contMililitros) {
        this.contMililitros = contMililitros;
    }

    public Bebida(String nombre, double precio, int contMililitros) {
        super(nombre, precio);
        this.contMililitros = contMililitros;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("contMililitros = " + contMililitros);
    }

    public int getContMililitros() {
        return contMililitros;
    }

    public void setContMililitros(int contMililitros) {
        this.contMililitros = contMililitros;
    }
}

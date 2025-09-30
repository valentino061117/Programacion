public class Accionista extends Persona implements Beneficiario{
    public double acciones;

    public Accionista() {
    }

    public Accionista(String nombre, String apellido, int numeroSS) {
        super(nombre, apellido, numeroSS);
    }

    public Accionista(double acciones) {
        this.acciones = acciones;
    }

    public Accionista(String nombre, String apellido, int numeroSS, double acciones) {
        super(nombre, apellido, numeroSS);
        this.acciones = acciones;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("acciones = " + acciones);
    }

    @Override
    public void repartirBeneficiario(int beneficiario) {
        double beneficiarioTotal = beneficiario*acciones;
        System.out.println("El total del beneficio es "+beneficiarioTotal);
    }

    public double getAcciones() {
        return acciones;
    }

    public void setAcciones(double acciones) {
        this.acciones = acciones;
    }
}

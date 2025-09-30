public class Asalariado extends Trabajador implements Empleador, Sindicador{
    private double retencion;
    private int numeroPagas;

    private boolean contratados;

    public Asalariado() {
    }

    public Asalariado(String nombre, String apellido, int numeroSS) {
        super(nombre, apellido, numeroSS);
    }

    public Asalariado(double salario) {
        super(salario);
    }

    public Asalariado(String nombre, String apellido, int numeroSS, double salario) {
        super(nombre, apellido, numeroSS, salario);
    }

    public Asalariado(double retencion, int numeroPagas, boolean contratados) {
        this.retencion = retencion;
        this.numeroPagas = numeroPagas;
        this.contratados = contratados;
    }

    public Asalariado(String nombre, String apellido, int numeroSS, double retencion, int numeroPagas, boolean contratados) {
        super(nombre, apellido, numeroSS);
        this.retencion = retencion;
        this.numeroPagas = numeroPagas;
        this.contratados = contratados;
    }

    public Asalariado(double salario, double retencion, int numeroPagas, boolean contratados) {
        super(salario);
        this.retencion = retencion;
        this.numeroPagas = numeroPagas;
        this.contratados = contratados;
    }

    public Asalariado(String nombre, String apellido, int numeroSS, double salario, double retencion, int numeroPagas, boolean contratados) {
        super(nombre, apellido, numeroSS, salario);
        this.retencion = retencion;
        this.numeroPagas = numeroPagas;
        this.contratados = contratados;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("retencion = " + retencion);
        System.out.println("numeroPagas = " + numeroPagas);
    }

    @Override
    public void calcularSalarioMes() {
        double salarioMes = (getSalario()-(getSalario()+retencion))/numeroPagas;
        System.out.println("El salario mensual es: "+salarioMes);
    }

    @Override
    public boolean realizarTrabajo(int nHoras) {
        System.out.println("El asalariado se dispone a hacer el trabajo");
        return true;
    }

    @Override
    public void realizarHuelga() {
        if (realizarTrabajo((int) (Math.random()*10))){
            System.out.println("El trabajador se dispone a realizar la huelga");
        }else{
            System.out.println("Trabajo soportado, no hace huelga el asalariado");
        }
    }

    public double getRetencion() {
        return retencion;
    }

    public void setRetencion(double retencion) {
        this.retencion = retencion;
    }

    public int getNumeroPagas() {
        return numeroPagas;
    }

    public void setNumeroPagas(int numeroPagas) {
        this.numeroPagas = numeroPagas;
    }

    public boolean isContratados() {
        return contratados;
    }

    public void setContratados(boolean contratados) {
        this.contratados = contratados;
    }
}

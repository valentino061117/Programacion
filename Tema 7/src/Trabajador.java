abstract public class Trabajador extends Persona {
private double salario;

    public Trabajador() {
    }

    public Trabajador(String nombre, String apellido, int numeroSS) {
        super(nombre, apellido, numeroSS);
    }

    public Trabajador(double salario) {
        this.salario = salario;
    }

    public Trabajador(String nombre, String apellido, int numeroSS, double salario) {
        super(nombre, apellido, numeroSS);
        this.salario = salario;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("salario = " + salario);
    }

    public abstract void calcularSalarioMes();

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
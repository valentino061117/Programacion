public class Autonomo extends Trabajador implements Sindicador {
    private int coutaSS;
    private boolean contratados;

    public Autonomo() {
    }

    public Autonomo(String nombre, String apellido, int numeroSS) {
        super(nombre, apellido, numeroSS);
    }

    public Autonomo(double salario) {
        super(salario);
    }

    public Autonomo(String nombre, String apellido, int numeroSS, double salario) {
        super(nombre, apellido, numeroSS, salario);
    }

    public Autonomo(int coutaSS, boolean contratados) {
        this.coutaSS = coutaSS;
        this.contratados = contratados;
    }

    public Autonomo(String nombre, String apellido, int numeroSS, int coutaSS, boolean contratados) {
        super(nombre, apellido, numeroSS);
        this.coutaSS = coutaSS;
        this.contratados = contratados;
    }

    public Autonomo(double salario, int coutaSS, boolean contratados) {
        super(salario);
        this.coutaSS = coutaSS;
        this.contratados = contratados;
    }

    public Autonomo(String nombre, String apellido, int numeroSS, double salario, int coutaSS, boolean contratados) {
        super(nombre, apellido, numeroSS, salario);
        this.coutaSS = coutaSS;
        this.contratados = contratados;
    }

    @Override
    public void calcularSalarioMes() {
        double salarioMes = getSalario() - (coutaSS * 12);
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("coutaSS = " + coutaSS);
    }

    @Override
    public void realizarHuelga() {
        System.out.println("Haciendo huelga");
    }

    public int getCoutaSS() {
        return coutaSS;
    }

    public void setCoutaSS(int coutaSS) {
        this.coutaSS = coutaSS;
    }

    public boolean isContratados() {
        return contratados;
    }

    public void setContratados(boolean contratados) {
        this.contratados = contratados;
    }
}
public class Jefe extends Trabajador implements Empleador,Beneficiario {

    private double acciones;

    public Jefe() {
    }

    public Jefe(String nombre, String apellido, int numeroSS) {
        super(nombre, apellido, numeroSS);
    }

    public Jefe(double salario) {
        super(salario);
    }

    public Jefe(String nombre, String apellido, int numeroSS, double salario) {
        super(nombre, apellido, numeroSS, salario);
    }

    public Jefe(double salario, double acciones) {
        super(salario);
        this.acciones = acciones;
    }

    public Jefe(String nombre, String apellido, int numeroSS, double salario, double acciones) {
        super(nombre, apellido, numeroSS, salario);
        this.acciones = acciones;
    }

    public void calcularSalarioMes(){
        System.out.println("El salario mensual es = " + getSalario());
    }

    public boolean realizarTrabajo(int nHoras){
        System.out.println("El jefe se dispone a trabajar un numero de horas determinadas");
        if (nHoras>2){
            return false;
        }
        return true;
    }

    public double getAcciones() {
        return acciones;
    }

    public void setAcciones(double acciones) {
        this.acciones = acciones;
    }

    public void despedir(Trabajador trabajador){
        if (trabajador instanceof Asalariado){
            ((Asalariado)trabajador).setContratados(false);
        }else {
            ((Autonomo)trabajador).setContratados(false);
        }
    }

    public void repartirBeneficiario(int beneficiario){
        double beneficiarioTotal = acciones * beneficiario;
        setSalario(getSalario()+beneficiarioTotal);
    }

}
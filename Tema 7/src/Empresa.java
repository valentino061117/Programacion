import java.util.ArrayList;

public class Empresa {
    private int beneficio;
    private ArrayList<Persona> listaPersona;

    public Empresa() {
        listaPersona = new ArrayList<>();
    }

    public Empresa(int beneficio) {
        this.beneficio = beneficio;
        listaPersona = new ArrayList<>();
    }

    public void registrarTrabajador(Trabajador trabajador) {
        if (trabajador instanceof Jefe) {
            if (existeJefe()){
                System.out.println("Ya hay un jefe");
            }else {
                listaPersona.add(trabajador);
            }
        }else {
            listaPersona.add(trabajador);
        }
    }

    public void registrarAccionista(Accionista accionista){
        listaPersona.add(accionista);
    }

    public void repartirBeneficio(){
        for (Persona persona : listaPersona){
            if (persona instanceof Beneficiario){
                ((Beneficiario)persona).repartirBeneficiario(beneficio);
            }
        }
    }

    public Trabajador buscarTrabajador(int nss){
        for (Persona persona: listaPersona){
            if (persona.getNumeroSS() == nss && persona instanceof Trabajador){
                return (Trabajador) persona;
            }
        }
        return null;
    }

    public void despedirTrabajador(int dniJefe, int dniTrabajador){
        if (buscarTrabajador(dniJefe) instanceof Jefe){
            if (buscarTrabajador(dniTrabajador) instanceof Asalariado || buscarTrabajador(dniTrabajador) instanceof Autonomo);
            ((Jefe)(buscarTrabajador(dniJefe))).despedir(buscarTrabajador(dniTrabajador));
        }
    }

    private boolean existeJefe(){
        for (Persona persona : listaPersona){
            if (persona instanceof Jefe){
                return true;
            }
        }
        return false;
    }

}

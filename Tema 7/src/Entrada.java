import java.util.ArrayList;

public class Entrada {
    public static void main(String[] args) {
        Asalariado asalariado = new Asalariado("Valentino","Veselinov",12345,10000000000.00);
        Autonomo autonomo = new Autonomo("Hugo","Gallego", 23456, 1.01);
        Jefe jefe = new Jefe("Cristian","Veselinov", 56789,0.23);




        ArrayList<Trabajador> trabajadores = new ArrayList<>();
        trabajadores.add(asalariado);
        trabajadores.add(autonomo);
        trabajadores.add(jefe);

        for (Trabajador t: trabajadores){
            t.calcularSalarioMes();
            if (t instanceof Empleador){
                if (((Empleador)t).realizarTrabajo(4)){
                    System.out.println("Trabajo completado");
                }else {
                    System.out.println("El jefe no trabaja tanto");
                }
            }
            if (t instanceof Sindicador){
                ((Sindicador)t).realizarHuelga();
            }
        }
    }
}


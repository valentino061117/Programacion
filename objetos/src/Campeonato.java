import model.Carrera;
import model.Coche;

import java.util.Scanner;

public class Campeonato {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        Carrera carrera1= new Carrera(3,"Miami");
        carrera1.inscribirParticipante(new Coche("Ford1","Focus1","12345A",200));
        carrera1.inscribirParticipante(new Coche("Ford2","Focus2","678910B",200));
        carrera1.inscribirParticipante(new Coche("Ford3","Focus3","12345C",200));
        carrera1.inscribirParticipante(new Coche("Ford4","Focus4","678910D",200));
        carrera1.inscribirParticipante(new Coche("Ford5","Focus5","12345E",200));
        carrera1.inscribirParticipante(new Coche("Ford6","Focus6","678910F",200));
        carrera1.inscribirParticipante(new Coche("Ford7","Focus7","12345G",200));
        carrera1.inscribirParticipante(new Coche("Ford8","Focus8","678910H",200));
        carrera1.empezarCarrera();
        carrera1.mostrarClasificacion();
        carrera1.mostrarGanador();
    }
}

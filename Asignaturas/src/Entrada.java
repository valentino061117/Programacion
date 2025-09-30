import java.util.ArrayList;

public class Entrada {
    public static void main(String[] args) {
        //Como hacer para tener 5 alumnos
        // se mtricualen en las ismas asignaturas

        ArrayList<Asignatura> asignaturas = new ArrayList<>();
        asignaturas.add(new Asignatura(1));
        asignaturas.add(new Asignatura(2));
        asignaturas.add(new Asignatura(3));

        Asignatura sistemas = new Asignatura(asignaturas.get(0).getIdentificador());
        Asignatura lenguaje = new Asignatura(asignaturas.get(1).getIdentificador());
        Asignatura programacion = new Asignatura(asignaturas.get(2).getIdentificador());

        Alumno hugo = new Alumno(1,2,3);
        Alumno juan = new Alumno(1,2,3);
        // Alumno hugo1 = new Alumno(1,2,3);

        Profesor profesor = new Profesor();
        profesor.ponerNotas(hugo);
        profesor.ponerNotas(juan);
        System.out.println("La nota de la asignatura programacion es "+hugo.getAsignatura1().getCalificacion());
        System.out.println("La nota de la asignatura programacion es "+juan.getAsignatura1().getCalificacion());
        /* System.out.println("La nota de la asignatura sistemas es "+hugo.getAsignatura2().getCalificacion());
         System.out.println("La nota de la asignatura lenguaje es "+hugo.getAsignatura3().getCalificacion());*/
        System.out.println("La media del alumno es "+profesor.calcularMedia(hugo));
        System.out.println("La media del alumno es "+profesor.calcularMedia(juan));

    }
}
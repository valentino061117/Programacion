package ejercicio2.controllerclase;

import java.util.ArrayList;

public class Clase {
    private class clase{
        int numeroAlumnos;
        String nombresAlumnos;
        String confirmacionAlumnos;
        int calificacionAlumnos;

        public clase(int numeroAlumnos, String nombresAlumnos, String confirmacionAlumnos, int calificacionAlumnos){
            this.numeroAlumnos = numeroAlumnos;
            this.nombresAlumnos= nombresAlumnos;
            this.confirmacionAlumnos = confirmacionAlumnos;
            this.calificacionAlumnos = calificacionAlumnos;

        }
    }

    public static void alumnos(){
        new ArrayList<clase>();
    }
}

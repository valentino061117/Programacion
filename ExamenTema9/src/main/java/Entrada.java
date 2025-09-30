import dto.ProfesorDTO;
import model.Profesor;

import java.util.Scanner;

public class Entrada {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        ProfesorDTO profesorDTO = new ProfesorDTO();
        Profesor profesor = new Profesor();
        int opcion;
        System.out.println("1. Mostrar Profesores");
        System.out.println("2. Incorporar Profesor Temporal");
        System.out.println("3. Dar de Baja a Profesor Temporal");
        System.out.println("4. Exportar Datos a Base de Datos");
        System.out.println("5. Exportar Datos a CSV");
        System.out.println("6. Exportar Datos a Fichero OBJ");
        System.out.println("7. Salir");
        System.out.println("Elija una opcion por favor");
        opcion = scanner.nextInt();

        do {
            switch (opcion){
                case 1:
                    System.out.println("Mostrando los profesores en la base de datos");
                    profesorDTO.mostrarProfesores();
                    return;
                case 2:
                    System.out.println("Introduzca el dni del profesor");
                    String dni = scanner.next();
                    System.out.println("Introduzca el nombre del profesor");
                    String nombre = scanner.next();
                    System.out.println("Introduzca el salario del profesor");
                    int salario = scanner.nextInt();

                    profesorDTO.exportarDatosDB(profesor);
            }
        }while ()

    }
}

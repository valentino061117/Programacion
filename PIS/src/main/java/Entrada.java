import dto.ProfesorDTO;
import model.ProfesorExternos;
import model.ProfesorInterno;

import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        ProfesorDTO profesorDTO = new ProfesorDTO();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Mostrar profesores base datos");
            System.out.println("2. Incorporar profesor temporal");
            System.out.println("3. Dar de baja profesor temporal");
            System.out.println("4. Exportar datos a base de datos");
            System.out.println("5. Exportar datos a CSV");
            System.out.println("6. Exportar datos a fichero OBJ");
            System.out.println("7. Salir");
            System.out.print("Seleccione opción: ");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    profesorDTO.mostrarBD();
                    break;
                case 2:
                    System.out.println("Para incorporar este profesor necesitaremos sus datos y que tipo es:");
                    System.out.println("Tipo (1 = Interno, 2 = Externo");
                    int tipo = scanner.nextInt();
                    System.out.println("Nombre: ");
                    String nombre = scanner.next();
                    System.out.println("DNI: ");
                    String dni = scanner.next();
                    System.out.println("Salario base: ");
                    double salario = scanner.nextDouble();
                    if (tipo == 1) {
                        System.out.println("Complemento mensual:");
                        double complementoMensual = scanner.nextDouble();
                        profesorDTO.agregarProfesorTemporal(new ProfesorInterno(nombre, dni, salario, complementoMensual));
                        System.out.println("Profesor interno agregado correctamente");
                    } else if (tipo == 2) {
                        System.out.println("Numero horas:");
                        int numeroHoras = scanner.nextInt();
                        System.out.println("Precio horas:");
                        double precioHoras = scanner.nextDouble();
                        profesorDTO.agregarProfesorTemporal(new ProfesorExternos(nombre, dni, salario, numeroHoras, precioHoras));
                        System.out.println("Profesor externo agregado correctamente");
                    } else {
                        System.out.println("No se puede añadir otro tipo de profesor");
                    }
                    break;
                case 3:
                    System.out.println("Dni a eliminar:");
                    String eliminarDni = scanner.next();
                    if (profesorDTO.eliminarProfesorListado(eliminarDni)) {
                        System.out.println("Eliminado con exito");
                    } else {
                        System.out.println("No se ha encontrado a nadie con ese Dni");
                    }
                    break;
                case 4:
                    profesorDTO.exportarDatosLista();
                    break;
                case 5:
                    profesorDTO.exportarDatosFicherosCSV("src/main/java/sources/profesores.csv");
                    break;
                case 6:
                    profesorDTO.exportarDatosFicherosOBJ("src/main/java/sources/profesores.obj");
                    break;
                case 7:
                    System.out.println("Saliendo...");
            }
        } while (opcion != 7);

    }
}

import dto.ProfesoresDTO;
import model.Profesores;
import model.ProfesoresExternos;
import model.ProfesoresInterno;

import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        ProfesoresDTO profesoresDTO = new ProfesoresDTO();
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
            switch (opcion){
                case 1:
                    profesoresDTO.mostrarDB();
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
                    if (tipo == 1){
                        System.out.println("Complemento mensual:");
                        double complementoMensual = scanner.nextDouble();
                        profesoresDTO.agregarProfesTemporales(new ProfesoresInterno(nombre,dni,salario,complementoMensual));
                        System.out.println("Profesor interno agrefado correctamente");
                    } else if (tipo == 2) {
                        System.out.println("Numero horas:");
                        int numeroHoras = scanner.nextInt();
                        System.out.println("Precio horas:");
                        double precioHoras = scanner.nextDouble();
                        profesoresDTO.agregarProfesTemporales(new ProfesoresExternos(nombre,dni,salario,numeroHoras,precioHoras));
                        System.out.println("Profesor externo agregado correctamente");
                    }else {
                        System.out.println("Error");
                    }
                    break;
                case 3:
                    System.out.println("Dni a eliminar:");
                    String eliminarDni = scanner.next();
                    if (profesoresDTO.eliminarProfesorTemporal(eliminarDni)){
                        System.out.println("Eliminado con exito");
                    }else {
                        System.out.println("No se ha encontrado a nadie con ese dni");
                    }
                    break;
                case 4:
                    profesoresDTO.exportarDatosLista();
                    break;
                case 5:
                    profesoresDTO.exportarDatosFicherosCSV("src/main/java/sources/profesores.csv");
                    break;
                case 6:
                    profesoresDTO.exportarDatosFicherosOBJ("src/main/java/sources/profesores.obj");
                    break;
                case 7:
                    System.out.println("Saliendo...");
                    break;
            }
        }while (opcion!=7);
    }
}

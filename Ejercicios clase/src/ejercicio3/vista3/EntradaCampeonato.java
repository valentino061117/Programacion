package ejercicio3.vista3;

import ejercicio3.controller3.CampeonatoFormula1;

import java.util.Scanner;

public class EntradaCampeonato {
    public static void main(String[] args) {
        CampeonatoFormula1 campeonato = new CampeonatoFormula1();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- Menú Campeonato de Fórmula 1 ---");
            System.out.println("1. Agregar piloto");
            System.out.println("2. Actualizar puntos después de una carrera");
            System.out.println("3. Mostrar información de un piloto");
            System.out.println("4. Mostrar clasificación actual");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    if (campeonato.obtenerClasificacion().size() >= 10) {
                        System.out.println("Error: No se pueden agregar más pilotos.");
                        break;
                    }
                    System.out.print("Ingrese el nombre del piloto: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese el bastidor del coche: ");
                    String bastidor = scanner.nextLine();
                    if (campeonato.agregarPiloto(nombre, bastidor)) {
                        System.out.println("Piloto agregado correctamente.");
                    } else {
                        System.out.println("Error: Bastidor duplicado o límite de pilotos alcanzado.");
                    }
                    break;

                case 2:
                    if (campeonato.actualizarPuntos()) {
                        System.out.println("Puntos actualizados correctamente.");
                    } else {
                        System.out.println("Error: No se pueden realizar más carreras.");
                    }
                    break;

                case 3:
                    System.out.print("Ingrese el bastidor del coche para buscar: ");
                    String bastidorBuscar = scanner.nextLine();
                    var piloto = campeonato.obtenerInformacionPiloto(bastidorBuscar);
                    if (piloto != null) {
                        System.out.println("Información del piloto: " + piloto);
                    } else {
                        System.out.println("Error: Piloto no encontrado.");
                    }
                    break;

                case 4:
                    System.out.println("\n--- Clasificación Actual ---");
                    for (var p : campeonato.obtenerClasificacion()) {
                        System.out.println(p);
                    }
                    break;

                case 0:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    break;

                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
            }
        } while (opcion != 0);

        scanner.close();
    }
}


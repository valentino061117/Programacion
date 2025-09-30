package ejercicio2.vista2;

import ejercicio2.controller2.Restaurante;

import java.util.Scanner;

public class EntradaRestaurante {
    public static void main(String[] args) {
        Restaurante restaurante = new Restaurante();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- Menú Restaurante ---");
            System.out.println("1. Asignar mesa");
            System.out.println("2. Liberar mesa");
            System.out.println("3. Realizar pedido");
            System.out.println("4. Mostrar asignaciones actuales");
            System.out.println("5. Mostrar mesas ordenadas por precio");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del cliente: ");
                    String cliente = scanner.nextLine();
                    if (restaurante.asignarMesa(cliente)) {
                        System.out.println("Mesa asignada correctamente.");
                    } else {
                        System.out.println("Error: No hay mesas disponibles.");
                    }
                    break;

                case 2:
                    System.out.print("Ingrese el número de mesa a liberar: ");
                    int mesaLiberar = scanner.nextInt();
                    if (restaurante.liberarMesa(mesaLiberar)) {
                        System.out.println("Mesa liberada correctamente.");
                    } else {
                        System.out.println("Error: Mesa no ocupada o inexistente.");
                    }
                    break;

                case 3:
                    System.out.print("Ingrese el número de mesa: ");
                    int mesaPedido = scanner.nextInt();
                    scanner.nextLine(); // Limpiar el buffer
                    System.out.print("Ingrese el producto: ");
                    String producto = scanner.nextLine();
                    if (restaurante.realizarPedido(mesaPedido, producto)) {
                        System.out.println("Pedido realizado correctamente.");
                    } else {
                        System.out.println("Error: Mesa no ocupada o producto no encontrado.");
                    }
                    break;

                case 4:
                    System.out.println("\n--- Mesas Ocupadas ---");
                    for (var mesa : restaurante.listarMesasOcupadas()) {
                        System.out.println(mesa);
                    }
                    break;

                case 5:
                    System.out.println("\n--- Mesas Ordenadas por Precio ---");
                    for (var mesa : restaurante.listarMesasPorPrecio()) {
                        System.out.println(mesa);
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


package ejercicio1.vista;

import ejercicio1.controller.Hotel;

import java.util.Scanner;

public class EntradaHotel {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- MENÚ DE GESTIÓN DE RESERVAS DE HOTEL ---");
            System.out.println("1. Registrar reserva");
            System.out.println("2. Cancelar reserva");
            System.out.println("3. Mostrar reserva por DNI");
            System.out.println("4. Mostrar todas las reservas ordenadas");
            System.out.println("5. Mostrar todas las reservas actuales");
            System.out.println("6. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Número de habitación: ");
                    int numeroHabitacion = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Nombre del huésped: ");
                    String nombreHuesped = scanner.nextLine();

                    System.out.print("Teléfono del huésped: ");
                    String telefonoHuesped = scanner.nextLine();

                    System.out.print("DNI del huésped: ");
                    String dniHuesped = scanner.nextLine();

                    System.out.print("Número de personas: ");
                    int numeroPersonas = scanner.nextInt();

                    hotel.registrarReserva(numeroHabitacion, nombreHuesped, telefonoHuesped, dniHuesped, numeroPersonas);
                    break;

                case 2:
                    System.out.print("DNI del huésped para cancelar reserva: ");
                    String dniCancelar = scanner.nextLine();
                    hotel.cancelarReserva(dniCancelar);
                    break;

                case 3:
                    System.out.print("DNI del huésped para mostrar reserva: ");
                    String dniMostrar = scanner.nextLine();
                    hotel.mostrarReserva(dniMostrar);
                    break;

                case 4:
                    hotel.mostrarReservasOrdenadas();
                    break;

                case 5:
                    hotel.mostrarReservasActuales();
                    break;

                case 6:
                    System.out.println("Saliendo del sistema. ¡Hasta pronto!");
                    break;

                default:
                    System.out.println("Error: Opción no válida. Inténtalo de nuevo.");
            }
        } while (opcion != 6);

        scanner.close();
    }
}

package ejercicio1.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Hotel {
    // Clase interna para representar una Reserva
    private class Reserva {
        int numeroHabitacion;
        String nombreHuesped;
        String telefonoHuesped;
        String dniHuesped;
        int numeroPersonas;

        public Reserva(int numeroHabitacion, String nombreHuesped, String telefonoHuesped, String dniHuesped, int numeroPersonas) {
            this.numeroHabitacion = numeroHabitacion;
            this.nombreHuesped = nombreHuesped;
            this.telefonoHuesped = telefonoHuesped;
            this.dniHuesped = dniHuesped;
            this.numeroPersonas = numeroPersonas;
        }

        @Override
        public String toString() {
            return "Habitación: " + numeroHabitacion + ", Huésped: " + nombreHuesped +
                    ", DNI: " + dniHuesped + ", Teléfono: " + telefonoHuesped +
                    ", Personas: " + numeroPersonas;
        }
    }

    private ArrayList<Reserva> reservas;
    private final int NUMERO_HABITACIONES = 20;

    public Hotel() {
        reservas = new ArrayList<>();
    }


    public void registrarReserva(int numeroHabitacion, String nombreHuesped, String telefonoHuesped, String dniHuesped, int numeroPersonas) {
        if (numeroHabitacion < 1 || numeroHabitacion > NUMERO_HABITACIONES) {
            System.out.println("Error: El número de habitación debe estar entre 1 y " + NUMERO_HABITACIONES);
            return;
        }

        for (Reserva r : reservas) {
            if (r.dniHuesped.equals(dniHuesped)) {
                System.out.println("Error: El huésped con DNI " + dniHuesped + " ya tiene una reserva activa.");
                return;
            }
        }

        reservas.add(new Reserva(numeroHabitacion, nombreHuesped, telefonoHuesped, dniHuesped, numeroPersonas));
        System.out.println("Reserva registrada exitosamente.");
    }

    public void cancelarReserva(String dniHuesped) {
        boolean encontrada = false;

        for (Reserva r : reservas) {
            if (r.dniHuesped.equals(dniHuesped)) {
                reservas.remove(r);
                System.out.println("Reserva cancelada exitosamente.");
                encontrada = true;
                break;
            }
        }

        if (!encontrada) {
            System.out.println("Error: No se encontró una reserva con el DNI " + dniHuesped);
        }
    }

    public void mostrarReserva(String dniHuesped) {
        for (Reserva r : reservas) {
            if (r.dniHuesped.equals(dniHuesped)) {
                System.out.println(r);
                return;
            }
        }
        System.out.println("Error: No se encontró una reserva con el DNI " + dniHuesped);
    }

    public void mostrarReservasOrdenadas() {
        if (reservas.isEmpty()) {
            System.out.println("No hay reservas registradas.");
            return;
        }

        // Ordenar reservas por número de habitación
        ArrayList<Reserva> reservasOrdenadas = new ArrayList<>(reservas);
        Collections.sort(reservasOrdenadas, Comparator.comparingInt(r -> r.numeroHabitacion));

        System.out.println("Reservas ordenadas por número de habitación:");
        for (Reserva r : reservasOrdenadas) {
            System.out.println(r);
        }
    }

    public void mostrarReservasActuales() {
        if (reservas.isEmpty()) {
            System.out.println("No hay reservas registradas.");
            return;
        }

        System.out.println("Reservas actuales:");
        for (Reserva r : reservas) {
            System.out.println(r);
        }
    }
}
import java.util.ArrayList;
import java.util.Scanner;

public class Agenda {
    private ArrayList<Entrada> listaEntradas; // Lista para almacenar las entradas
    private Scanner scanner;

    // Constructor
    public Agenda() {
        listaEntradas = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public static void main(String[] args) {
        Agenda agenda = new Agenda(); // Crear una instancia de Agenda
        agenda.iniciarMenu();         // Iniciar el menú de opciones
    }

    
    public void iniciarMenu() {
        int opcion;

        do {
            mostrarMenu();
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    agregarEntrada();
                    break;
                case 2:
                    buscarEntrada();
                    break;
                case 3:
                    borrarEntrada();
                    break;
                case 4:
                    listarEntradas();
                    break;
                case 5:
                    System.out.println("Saliendo de la aplicación...");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        } while (opcion != 5);
    }

    // Mostrar las opciones del menú
    private void mostrarMenu() {
        System.out.println("\n---- Menú de Agenda ----");
        System.out.println("1. Agregar entrada");
        System.out.println("2. Buscar entrada");
        System.out.println("3. Borrar entrada");
        System.out.println("4. Listar entradas");
        System.out.println("5. Salir");
    }

    // Agregar una entrada a la lista
    private void agregarEntrada() {
        System.out.print("Introduce el nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Introduce el apellido: ");
        String apellido = scanner.nextLine();

        System.out.print("Introduce el teléfono: ");
        int telefono = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        System.out.print("Introduce el DNI: ");
        String dni = scanner.nextLine();

        Entrada nuevaEntrada = new Entrada(nombre, apellido, telefono, dni);
        listaEntradas.add(nuevaEntrada);
        System.out.println("Entrada agregada con éxito.");
    }

    // Buscar una entrada por su DNI
    private void buscarEntrada() {
        System.out.print("Introduce el DNI de la entrada a buscar: ");
        String dni = scanner.nextLine();

        boolean encontrada = false;
        for (Entrada entrada : listaEntradas) {
            if (entrada.getDni().equals(dni)) {
                System.out.println(entrada);
                encontrada = true;
                break;
            }
        }

        if (!encontrada) {
            System.out.println("No se encontró ninguna entrada con ese DNI.");
        }
    }

    // Borrar una entrada por su DNI
    private void borrarEntrada() {
        System.out.print("Introduce el DNI de la entrada a borrar: ");
        String dni = scanner.nextLine();

        boolean eliminada = false;
        for (int i = 0; i < listaEntradas.size(); i++) {
            if (listaEntradas.get(i).getDni().equals(dni)) {
                listaEntradas.remove(i);
                eliminada = true;
                System.out.println("Entrada eliminada con éxito.");
                break;
            }
        }

        if (!eliminada) {
            System.out.println("No se encontró ninguna entrada con ese DNI.");
        }
    }

    // Listar todas las entradas en la lista
    private void listarEntradas() {
        if (listaEntradas.isEmpty()) {
            System.out.println("No hay entradas en la lista.");
        } else {
            System.out.println("\nLista de entradas:");
            for (Entrada entrada : listaEntradas) {
                System.out.println(entrada);
            }
        }
    }
}

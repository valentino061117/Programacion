import java.util.ArrayList;
import java.util.Scanner;

public class SimulacroExamen {

    // Clase para representar un ingrediente
    static class Ingrediente {
        String nombre;
        double precio;

        public Ingrediente(String nombre, double precio) {
            this.nombre = nombre;
            this.precio = precio;
        }
    }

    // Clase para representar un pedido
    static class Pedido {
        int id;
        String nombreUsuario;
        String telefonoUsuario;
        Ingrediente[] ingredientes;
        double precioTotal;
        String estado;

        public Pedido(int id, String nombreUsuario, String telefonoUsuario, Ingrediente[] ingredientes, double precioTotal) {
            this.id = id;
            this.nombreUsuario = nombreUsuario;
            this.telefonoUsuario = telefonoUsuario;
            this.ingredientes = ingredientes;
            this.precioTotal = precioTotal;
            this.estado = "Pendiente"; // Estado inicial
        }

        public void mostrarPedido() {
            System.out.println("ID del pedido: " + id);
            System.out.println("Cliente: " + nombreUsuario);
            System.out.println("Teléfono: " + telefonoUsuario);
            System.out.println("Ingredientes:");
            for (Ingrediente ingrediente : ingredientes) {
                System.out.println(" - " + ingrediente.nombre + " ($" + ingrediente.precio + ")");
            }
            System.out.println("Precio Total: $" + precioTotal);
            System.out.println("Estado: " + estado);
            System.out.println("--------------------------");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Lista de ingredientes disponibles
        Ingrediente[] ingredientesDisponibles = {
                new Ingrediente("Queso", 1.50),
                new Ingrediente("Pepperoni", 2.00),
                new Ingrediente("Jamón", 2.50),
                new Ingrediente("Champiñones", 1.75),
                new Ingrediente("Piña", 1.25)
        };

        // Lista de pedidos
        ArrayList<Pedido> pedidosPendientes = new ArrayList<>();
        ArrayList<Pedido> pedidosServidos = new ArrayList<>();
        int idPedido = 1; // Contador de IDs de pedidos
        double totalCaja = 0.0; // Total acumulado en la caja

        int opcion; // Variable para manejar el menú

        do {
            // Mostrar el menú principal
            System.out.println("\n--- Menú Pizzería ---");
            System.out.println("1. Realizar pedido");
            System.out.println("2. Servir pedido");
            System.out.println("3. Mostrar pedidos pendientes");
            System.out.println("4. Mostrar caja");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1: // Realizar pedido
                    sc.nextLine(); // Limpiar buffer
                    System.out.print("Nombre de usuario: ");
                    String nombreUsuario = sc.nextLine();
                    System.out.print("Teléfono de usuario: ");
                    String telefonoUsuario = sc.nextLine();

                    System.out.print("Cantidad de ingredientes que desea añadir (mínimo 1): ");
                    int cantidadIngredientes = sc.nextInt();

                    while (cantidadIngredientes < 1) {
                        System.out.println("Debe seleccionar al menos un ingrediente.");
                        System.out.print("Cantidad de ingredientes: ");
                        cantidadIngredientes = sc.nextInt();
                    }

                    Ingrediente[] ingredientesSeleccionados = new Ingrediente[cantidadIngredientes];
                    double precioTotal = 0;

                    // Selección de ingredientes
                    for (int i = 0; i < cantidadIngredientes; i++) {
                        System.out.println("Seleccione el ingrediente " + (i + 1) + ":");
                        for (int j = 0; j < ingredientesDisponibles.length; j++) {
                            System.out.println((j + 1) + ". " + ingredientesDisponibles[j].nombre + " ($" + ingredientesDisponibles[j].precio + ")");
                        }
                        System.out.print("Ingrese el número del ingrediente: ");
                        int seleccion = sc.nextInt();

                        while (seleccion < 1 || seleccion > ingredientesDisponibles.length) {
                            System.out.println("Selección inválida. Intente de nuevo.");
                            System.out.print("Ingrese el número del ingrediente: ");
                            seleccion = sc.nextInt();
                        }

                        ingredientesSeleccionados[i] = ingredientesDisponibles[seleccion - 1];
                        precioTotal += ingredientesDisponibles[seleccion - 1].precio;
                    }

                    // Crear el pedido y añadirlo a la lista
                    Pedido nuevoPedido = new Pedido(idPedido++, nombreUsuario, telefonoUsuario, ingredientesSeleccionados, precioTotal);
                    pedidosPendientes.add(nuevoPedido);
                    System.out.println("Pedido realizado con éxito. ID del pedido: " + nuevoPedido.id);
                    break;

                case 2: // Servir pedido
                    if (pedidosPendientes.isEmpty()) {
                        System.out.println("No hay pedidos para servir.");
                    } else {
                        System.out.print("Ingrese el ID del pedido a servir: ");
                        int idServir = sc.nextInt();

                        boolean encontrado = false;
                        for (int i = 0; i < pedidosPendientes.size(); i++) {
                            if (pedidosPendientes.get(i).id == idServir) {
                                Pedido pedidoServido = pedidosPendientes.get(i);
                                pedidoServido.estado = "Servido";
                                totalCaja += pedidoServido.precioTotal; // Agregar el precio a la caja
                                pedidosServidos.add(pedidoServido); // Mover a la lista de servidos
                                pedidosPendientes.remove(i); // Eliminar de la lista de pendientes
                                System.out.println("Pedido con ID " + idServir + " servido con éxito.");
                                System.out.println("Cobro realizado: $" + pedidoServido.precioTotal);
                                encontrado = true;
                                break;
                            }
                        }

                        if (!encontrado) {
                            System.out.println("No se encontró un pedido con el ID especificado.");
                        }
                    }
                    break;

                case 3: // Mostrar pedidos pendientes
                    if (pedidosPendientes.isEmpty()) {
                        System.out.println("No hay pedidos pendientes.");
                    } else {
                        System.out.println("Pedidos pendientes:");
                        for (Pedido pedido : pedidosPendientes) {
                            System.out.println("Cliente: " + pedido.nombreUsuario);
                            System.out.println("Teléfono: " + pedido.telefonoUsuario);
                            System.out.println("Ingredientes:");
                            for (Ingrediente ingrediente : pedido.ingredientes) {
                                System.out.println(" - " + ingrediente.nombre);
                            }
                            System.out.println("--------------------------");
                        }
                    }
                    break;

                case 4: // Mostrar caja
                    System.out.println("Total de pizzas cobradas: $" + totalCaja);
                    break;

                case 5: // Salir
                    System.out.println("Gracias por usar el sistema de la pizzería. ¡Adiós!");
                    break;

                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 5);

    }
}

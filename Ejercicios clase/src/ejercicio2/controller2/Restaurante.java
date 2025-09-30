package ejercicio2.controller2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;

public class Restaurante {
    private final int NUMERO_MESAS = 10;
    private Mesa[] mesas;
    private HashMap<String, Double> carta;

    public Restaurante() {
        mesas = new Mesa[NUMERO_MESAS];
        carta = new HashMap<>();

        // Inicializar las mesas como disponibles
        for (int i = 0; i < NUMERO_MESAS; i++) {
            mesas[i] = new Mesa(i + 1);
        }

        // Inicializar la carta
        carta.put("Bocadillo", 5.50);
        carta.put("Hamburguesa", 7.00);
        carta.put("Ensalada", 6.00);
        carta.put("Cerveza", 3.50);
        carta.put("Agua", 1.50);
    }

    // Asignar mesa a un cliente
    public boolean asignarMesa(String cliente) {
        for (Mesa mesa : mesas) {
            if (!mesa.isOcupada()) {
                mesa.asignar(cliente);
                return true;
            }
        }
        return false; // No hay mesas disponibles
    }

    // Liberar mesa
    public boolean liberarMesa(int numeroMesa) {
        if (numeroMesa < 1 || numeroMesa > NUMERO_MESAS) {
            return false; // Mesa inválida
        }

        Mesa mesa = mesas[numeroMesa - 1];
        if (mesa.isOcupada()) {
            System.out.println("Liberando mesa " + numeroMesa + ":");
            System.out.println("Consumiciones: " + mesa.getConsumiciones());
            System.out.println("Precio total: " + mesa.calcularTotal() + "€");
            mesa.liberar();
            return true;
        }
        return false; // La mesa ya está libre
    }

    // Agregar un pedido a una mesa
    public boolean realizarPedido(int numeroMesa, String producto) {
        if (numeroMesa < 1 || numeroMesa > NUMERO_MESAS) {
            return false; // Mesa inválida
        }

        Mesa mesa = mesas[numeroMesa - 1];
        if (!mesa.isOcupada()) {
            return false; // La mesa no está ocupada
        }

        Double precio = carta.get(producto);
        if (precio != null) {
            mesa.agregarPedido(producto, precio);
            return true;
        }
        return false; // Producto no existe en la carta
    }

    // Mostrar asignaciones actuales
    public ArrayList<Mesa> listarMesasOcupadas() {
        ArrayList<Mesa> mesasOcupadas = new ArrayList<>();
        for (Mesa mesa : mesas) {
            if (mesa.isOcupada()) {
                mesasOcupadas.add(mesa);
            }
        }
        return mesasOcupadas;
    }

    // Mostrar mesas ordenadas por precio total
    public ArrayList<Mesa> listarMesasPorPrecio() {
        ArrayList<Mesa> mesasOcupadas = listarMesasOcupadas();
        mesasOcupadas.sort(Comparator.comparingDouble(Mesa::calcularTotal).reversed());
        return mesasOcupadas;
    }

    // Clase interna Mesa
    private static class Mesa {
        private int numero;
        private String cliente;
        private ArrayList<String> consumiciones;
        private ArrayList<Double> precios;
        private boolean ocupada;

        public Mesa(int numero) {
            this.numero = numero;
            this.consumiciones = new ArrayList<>();
            this.precios = new ArrayList<>();
            this.ocupada = false;
        }

        public void asignar(String cliente) {
            this.cliente = cliente;
            this.ocupada = true;
        }

        public void liberar() {
            this.cliente = null;
            this.consumiciones.clear();
            this.precios.clear();
            this.ocupada = false;
        }

        public void agregarPedido(String producto, Double precio) {
            consumiciones.add(producto);
            precios.add(precio);
        }

        public double calcularTotal() {
            return precios.stream().mapToDouble(Double::doubleValue).sum();
        }

        public boolean isOcupada() {
            return ocupada;
        }

        public String getCliente() {
            return cliente;
        }

        public ArrayList<String> getConsumiciones() {
            return consumiciones;
        }

        @Override
        public String toString() {
            return "Mesa " + numero + " - Cliente: " + cliente + " - Consumiciones: " + consumiciones +
                    " - Total: " + calcularTotal() + "€";
        }
    }
}

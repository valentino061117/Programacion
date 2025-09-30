package ejercicio3.controller3;

import java.util.*;

public class CampeonatoFormula1 {
    private Hashtable<String, Piloto> pilotos;
    private final int MAX_PILOTOS = 10;
    private final int MAX_CARRERAS = 7;
    private int carrerasRealizadas;

    public CampeonatoFormula1() {
        pilotos = new Hashtable<>();
        carrerasRealizadas = 0;
    }

    // Agregar un piloto
    public boolean agregarPiloto(String nombre, String bastidor) {
        if (pilotos.size() >= MAX_PILOTOS) {
            return false; // No se pueden agregar más pilotos
        }
        if (pilotos.containsKey(bastidor)) {
            return false; // Bastidor duplicado
        }
        pilotos.put(bastidor, new Piloto(nombre, bastidor));
        return true;
    }

    // Actualizar puntos después de una carrera
    public boolean actualizarPuntos() {
        if (carrerasRealizadas >= MAX_CARRERAS) {
            return false; // No se pueden realizar más carreras
        }
        List<Integer> puntosRepartidos = generarPuntosAleatorios();

        int i = 0;
        for (Piloto piloto : pilotos.values()) {
            piloto.sumarPuntos(puntosRepartidos.get(i));
            i++;
        }
        carrerasRealizadas++;
        return true;
    }

    // Mostrar información de un piloto
    public Piloto obtenerInformacionPiloto(String bastidor) {
        return pilotos.get(bastidor); // Retorna null si el piloto no existe
    }

    // Mostrar clasificación actual
    public List<Piloto> obtenerClasificacion() {
        List<Piloto> clasificacion = new ArrayList<>(pilotos.values());
        clasificacion.sort((p1, p2) -> Integer.compare(p2.getPuntos(), p1.getPuntos())); // Descendente
        return clasificacion;
    }

    // Método privado para generar puntos aleatorios
    private List<Integer> generarPuntosAleatorios() {
        List<Integer> puntos = new ArrayList<>();
        Random random = new Random();
        while (puntos.size() < pilotos.size()) {
            int punto = random.nextInt(12) + 1; // Entre 1 y 12
            if (!puntos.contains(punto)) {
                puntos.add(punto);
            }
        }
        return puntos;
    }

    // Clase interna Piloto
    private static class Piloto {
        private String nombre;
        private String bastidor;
        private int puntos;

        public Piloto(String nombre, String bastidor) {
            this.nombre = nombre;
            this.bastidor = bastidor;
            this.puntos = 0;
        }

        public void sumarPuntos(int puntos) {
            this.puntos += puntos;
        }

        public int getPuntos() {
            return puntos;
        }

        @Override
        public String toString() {
            return "Piloto: " + nombre + ", Bastidor: " + bastidor + ", Puntos: " + puntos;
        }
    }
}

public class Entrada {
    public static void main(String[] args) {
        Equipo equipo1= new Equipo("Madrid",90,80,82,0);
        Equipo equipo2= new Equipo("Atletico de Madrid",90,80,82,0);

        Jugador jugador1= new Jugador("Vinicius",91,"Delantero");
        equipo1.ficharJugador(jugador1);

        //jugador1.mostrarDatos();

        System.out.println(jugador1);
        System.out.println(equipo1);

        System.out.printf("El resultado final es de %s : %d - %s :%d"
                ,equipo1.getNombre(),equipo1.getGoles(),equipo2.getNombre(),equipo2.getGoles());
    }
}

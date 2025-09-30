import java.util.ArrayList;

public class Equipo {

    private ArrayList<Jugador> plantilla;

    private int nivelAtaque, nivelDefensa, nivelMedio;

    private int goles;

    private String nombre;

    public Equipo(ArrayList<Jugador> plantilla){
        this.plantilla = plantilla;
    }

    public Equipo(String nombre){
        this.nombre=nombre;
        this.nivelAtaque= (int) (Math.random()*101);
        this.nivelDefensa=(int) (Math.random()*101);
        this.nivelMedio=(int) (Math.random()*101);
        this.plantilla = new ArrayList<>();
    }

    public Equipo(String nombre, int ataque, int defensa, int medio, int goles){
        this.nombre=nombre;
        this.nivelAtaque=ataque;
        this.nivelDefensa=defensa;
        this.nivelMedio=medio;
        this.goles=goles;
        this.plantilla = new ArrayList<>();
    }

    public boolean atacar(){
        double resultado= (nivelAtaque*Math.random()*1)+(nivelMedio*Math.random()*1)/2;
        System.out.println("El resultado del ataque es "+resultado);
        if (resultado>90){
            goles ++;
            return true;
        }
        return false;
    }

    /*public void listarDelanteros(){
        for (Jugador item : plantilla){
            if (item.getPosicion().equalsIgnoreCase() == "medio") {
                return item;
            }
        }
    }*/

    public void mostrarDatos() {
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Nivel ataque: "+this.nivelAtaque);
        System.out.println("Nivel medio: "+this.nivelMedio);
        System.out.println("Nivel defensa: "+this.nivelDefensa);
        System.out.println("Goles: "+this.goles);
    }

    public void ficharJugador(Jugador jugador){
        this.plantilla.add(jugador);
    }

    public int getNivelAtaque() {
        return nivelAtaque;
    }

    public void setNivelAtaque(int nivelAtaque) {
        this.nivelAtaque = nivelAtaque;
    }

    public int getNivelDefensa() {
        return nivelDefensa;
    }

    public void setNivelDefensa(int nivelDefensa) {
        this.nivelDefensa = nivelDefensa;
    }

    public int getNivelMedio() {
        return nivelMedio;
    }

    public void setNivelMedio(int nivelMedio) {
        this.nivelMedio = nivelMedio;
    }

    public int getGoles() {
        return goles;
    }

    public void setGoles(int goles) {
        this.goles = goles;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
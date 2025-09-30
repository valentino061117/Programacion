public class Jugador {

    private String nombre, posicion;

    private boolean estrella;

    private int calidad;

    public Jugador(){}

    public Jugador (String nombre, int calidad, String posicion) {
        this.nombre = nombre;
        this.calidad = calidad;
        this.posicion = posicion;
        /*if (calidad >= 90) {
            this.estrella=true;
        }else{
            this.estrella=false;
        }*/
        //this.estrella = calidad>90 ? true:false;
        this.estrella = calidad>90;
    }

    public boolean isEstrella() {
        return estrella;
    }

    public void setEstrella(boolean estrella) {
        this.estrella = estrella;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public int getCalidad() {
        return calidad;
    }

    public void setCalidad(int calidad) {
        this.calidad = calidad;
    }

    public void mostrarDatos(){
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Posicion: "+this.posicion);
        System.out.println("Calidad: "+this.calidad);
        System.out.println("Estrella: "+this.estrella);
    }

    /*@Override
    public String toString() {
        return nombre+" "+posicion;
    }*/

    @Override
    public String toString() {
        return "Jugador{" +
                "nombre='" + nombre + '\'' +
                ", posicion='" + posicion + '\'' +
                ", estrella=" + estrella +
                ", calidad=" + calidad +
                '}';
    }
}
public class Asignatura {
    private int identificador;
    private double calificacion;

    public Asignatura(){}
    public Asignatura(int id){
        identificador=id;
    }

    public int getIdentificador() {
        return identificador;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }
}
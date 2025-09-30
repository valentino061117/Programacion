package model;

public class TareasOcio extends Tarea{
    private String ubicacion;
    private double presupuesto;

    public TareasOcio(int id, String titulo, String descripcion, String fecha, Prioridad prioridad, boolean completada, String ubicacion, double presupuesto) {
        super(id, titulo, descripcion, fecha, prioridad, completada);
        this.ubicacion = ubicacion;
        this.presupuesto = presupuesto;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    @Override
    public String toString() {
        return super.toString()+ "TareasOcio{" +
                "ubicacion='" + ubicacion + '\'' +
                ", presupuesto=" + presupuesto +
                '}';
    }
}

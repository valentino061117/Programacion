package model;

public class TareasTrabajo extends Tarea{
    private String proyecto;

    public TareasTrabajo(int id, String titulo, String descripcion, String fecha, Prioridad prioridad, boolean completada, String proyecto) {
        super(id, titulo, descripcion, fecha, prioridad, completada);
        this.proyecto = proyecto;
    }

    public String getProyecto() {
        return proyecto;
    }

    public void setProyecto(String proyecto) {
        this.proyecto = proyecto;
    }

    @Override
    public String toString() {
        return super.toString()+"TareasTrabajo{" +
                "proyecto='" + proyecto + '\'' +
                '}';
    }
}

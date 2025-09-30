package model;

public class TareaPersonal extends Tarea{
    private String ubicacion;

    public TareaPersonal(String titulo, String descripcion, int numeroPersonas, String ubicacion) {
        super(titulo, descripcion, numeroPersonas);
        this.ubicacion = ubicacion;
    }

    public TareaPersonal(String titulo, String descripcion, boolean prioritario, int numeroPersonas, String ubicacion) {
        super(titulo, descripcion, prioritario, numeroPersonas);
        this.ubicacion = ubicacion;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    @Override
    public void enviarRecordatorio() {
        System.out.println("Enviar un recordatorio para reservar sitio en "+ubicacion);
    }

    @Override
    public String toString() {
        return super.toString()+"TareaPersonal{" +
                "ubicacion='" + ubicacion + '\'' +
                '}';
    }
}

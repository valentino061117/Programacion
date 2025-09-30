public class Clientes {
    private String nombre, apellido;
    private int dni;

    public Clientes() {
    }

    public Clientes(String nombre, String apellido, int dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    public void mostrarDatos(){
        System.out.println("nombre = " + nombre);
        System.out.println("apellido = " + apellido);
        System.out.println("dni = " + dni);

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }
}

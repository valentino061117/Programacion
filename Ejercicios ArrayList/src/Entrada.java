public class Entrada {
    private String nombre;
    private String apellido;
    private int telefono;
    private String dni;

    // Constructor
    public Entrada(String nombre, String apellido, int telefono, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.dni = dni;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getTelefono() {
        return telefono;
    }

    public String getDni() {
        return dni;
    }


    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Apellido: " + apellido + ", Teléfono: " + telefono;
    }
}

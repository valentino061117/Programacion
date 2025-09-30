public class Usuarios {
    private String nombre, apellidos, correo;
    private int telefono;

    public Usuarios() {
    }

    public Usuarios(String nombre, String apellidos, String correo, int telefono) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.correo = correo;
        this.telefono = telefono;
    }

    public void mostrarDatos(){
        System.out.println("nombre = " + nombre);
        System.out.println("apellidos = " + apellidos);
        System.out.println("correo = " + correo);
        System.out.println("telefono = " + telefono);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}

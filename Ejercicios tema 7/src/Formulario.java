import utils.LetraException;
import utils.LongitudException;

import java.util.Scanner;

public class Formulario {
    private String nombre;
    private String apellidos;
    private String dni;

    public Formulario() {
    }

    public Formulario(String nombre, String apellidos, String dni) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
    }

    public void mostrarDatos(){
        if (nombre==null || apellidos==null || dni == null){
            throw new NullPointerException("Algunos de los datos no esta relleno");
        }else {
        System.out.println("nombre = " + nombre);
        System.out.println("apellidos = " + apellidos);
        System.out.println("dni = " + dni);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) throws LongitudException {
        this.nombre = nombre;
        if (nombre ==null || nombre.length()==0){
            throw new LongitudException("El nombre introducido no es valido");
        }
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) throws LongitudException {
        if (apellidos ==null || apellidos.length()==0){
            throw new LongitudException("El apellido introducido no es valido");
        }
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) throws LetraException, LongitudException {
        char ultimaLetra = dni.charAt(dni.length()-1);
        if (Character.isDigit(ultimaLetra)){
            throw new LetraException("El ultimo digito no es una letra");
        }
        if (dni.length() != 9){
            throw new LongitudException("EL tamaño del dni no es correcto");
        }
        this.dni = dni;
    }
}
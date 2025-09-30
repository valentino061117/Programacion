package ejercicio3.controllerusuario;

import java.util.ArrayList;

public class Usuario {
    private class usuarios{
        String nombreUsuario;
        String apellidoUsuario;
        int telefonoUsuario;
        String dniUsuario;
        boolean disponibilidadUsuario;

        public usuarios(String nombreUsuario, String apellidoUsuario, int telefonoUsuario, String dniUsuario, boolean disponibilidadUsuario){
            this.nombreUsuario = nombreUsuario;
            this.apellidoUsuario = apellidoUsuario;
            this.telefonoUsuario = telefonoUsuario;
            this.dniUsuario = dniUsuario;
            this.disponibilidadUsuario = disponibilidadUsuario;
        }

    }

    public static void Usuario(){
        new ArrayList<usuarios>();
    }
}

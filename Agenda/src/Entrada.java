import java.util.Scanner;

public class Entrada {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserta los siguientes cuatro datos");

        System.out.println("1. Introduzca su nombre");
        String nombre = scanner.next();
        System.out.println("2. Introduzca su apellido");
        String apellido = scanner.next();
        System.out.println("2. Introduzca su correo");
        String correo = scanner.next();
        System.out.println("2. Introduzca su telefono");
        int telefono = scanner.nextInt();

        Usuarios usuarios = new Usuarios(nombre,apellido,correo,telefono);
        System.out.println("Los datos introducidos son los siguientes");
        usuarios.mostrarDatos();
        System.out.println("Son correctos?S/N");
        String opcion = scanner.next();



    }

}

import utils.LetraException;
import utils.LongitudException;

import java.util.Scanner;

public class Entrada {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        Formulario formulario = new Formulario();

        int opcion = 0;
        do {
            System.out.println("1 - introduce el nombre");
            System.out.println("2 - introduce el apellido");
            System.out.println("3 - introduce el dni");
            System.out.println("4 - salir");
            System.out.println("Indica que quieres hacer");
            opcion = scanner.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Por favor introduce tu nombre");
                    String nombre = scanner.nextLine();
                    try {
                        formulario.setNombre(nombre);
                    }catch (LongitudException e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    System.out.println("Por favor introduce tu apellido");
                    String apellido = scanner.nextLine();
                    try {
                        formulario.setApellidos(apellido);
                    }catch (LongitudException e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    System.out.println("Por favor introduce el dni");
                    String dni = scanner.nextLine();
                    try {
                        formulario.setDni(dni);
                    }catch (LetraException | LongitudException e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    try {
                    formulario.mostrarDatos();
                    }catch (NullPointerException e){
                        System.out.println(e.getMessage());
                    }
                    break;
            }
        }while (opcion!=4);

    }
}

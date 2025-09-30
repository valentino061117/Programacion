import java.util.Scanner;

public class Ejercicio4 {
    /*4. Crea una aplicación que permita al usuario introducir un numero en base
        decimal. Una bez introducido, en el caso de que sea negativo, saltará un
        aviso de que nose puede hacer la operación. En el caso de que el numero
        sea positivo, saltará un menú para poder elegir el tipo de cambio de base
        a. Base 2
        b. Base 8
        c. Base 16.
        Cuando el usuario selecciona la base, se mostrará el resultado y volverá a
        salir el menu*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Introduce un número en base decimal:");
            int numero = scanner.nextInt();

            if (numero < 0) {
                System.out.println("No se puede realizar la operación con un número negativo.");
            }else {
                System.out.printf("1. Base 2\n" +
                        "2. Base 8\n" +
                        "3. Base 16\n" +
                        "4. Salir\n");
                System.out.println("Seleccione la base de conversión:");
                int opcion = scanner.nextInt();

                switch (opcion) {
                    case 1 -> System.out.println("Resultado en base 2: " + Integer.toBinaryString(numero));
                    case 2 -> System.out.println("Resultado en base 8: " + Integer.toOctalString(numero));
                    case 3 -> System.out.println("Resultado en base 16: " + Integer.toHexString(numero).toUpperCase());
                    case 4 -> {
                        System.out.println("Saliendo del programa.");
                        return;
                    }
                    default -> System.out.println("Opción no válida.");
                }
            }
        }
    }
}

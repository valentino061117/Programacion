import java.util.Scanner;

public class Ejercicio3 {
    /*3. Realiza un programa que permita abrir una caja fuerte. Para ello, crea una
        variable donde guardas la clave de apertura (número de 4 dígitos). A
        continuación, el sistema empieza a pedir números al usuario para que
        pueda abrir la caja. El usuario contará con 4 intentos. El programa podrá
        ejecutar los siguientes casos:
        a. Si el usuario falla en su intento y todavía no ha agotado intentos
        aparecerá el mensaje “Intento fallido, prueba de nuevo”
        b. b. Si el usuario falla en su intento apareceré le mensaje de “Lo siento,
        caja bloqueada”
        c. c. Si el usuario adivina la combinación en 4 intentos o menos
        aparecerá el mensaje “Perfecto, la caja ha sido abierta”*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int clave = 1234;
        int intentos = 4;

        while (intentos > 0) {
            System.out.println("Introduce la clave de 4 dígitos:");
            int intentoUsuario = scanner.nextInt();

            if (intentoUsuario == clave) {
                System.out.println("Perfecto, la caja ha sido abierta.");
                break;
            } else {
                intentos--;
                if (intentos > 0) {
                    System.out.println("Intento fallido, prueba de nuevo. Te quedan " + intentos + " intentos.");
                } else {
                    System.out.println("Lo siento, caja bloqueada.");
                }
            }
        }
    }
}

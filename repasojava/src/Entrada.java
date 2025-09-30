import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Primer programa de repaso");
        // variable -> guardar valor que sera utilizado
        final String Dni = "123123A";
        String nombre ;
        String correo; // null
        int edad = 18;
        // Array -> lista no dinamica -> final
        // Arraylist / Hashtable -> lista dinamica -> final

        System.out.println("Introduce tu nombre");
        nombre = scanner.next();
        System.out.println("Introduce tu edad");
        edad = scanner.nextInt();
        System.out.printf("Mi nombre es %s y tengo %d años",nombre,edad);


        }
}

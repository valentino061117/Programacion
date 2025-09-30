import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        ejercicio3();
    }
        static Scanner scanner = new Scanner(System.in);
    public static void ejercicio3(){
        System.out.println("Introduzca el precio del coche:");
        int precio = scanner.nextInt();
        System.out.println("Introduzca los plazos en los que pagara el coche:");
        int plazos = scanner.nextInt();
        int resultado = precio / plazos;
        System.out.println("Vas a pagar el coche de " +precio+ "€ en " +plazos+
                " meses, con un total de " +resultado+ "€ cada plazo ");


    }
}

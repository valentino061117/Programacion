import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        ejercicio1();
    }

    static Scanner scanner = new Scanner(System.in);

    public static void ejercicio1(){
        System.out.println("Introduzca su nombre y apellido");
        String nombreApellido = scanner.nextLine();
        System.out.println("Introduzca el dinero del que dispone");
        int dinero = scanner.nextInt();
        System.out.println("Introduzca el precio de la play 5 sin iva");
        int play = scanner.nextInt();
        System.out.println("Introduzca el precio del iphone 15 sin iva");
        int iphone = scanner.nextInt();
        System.out.println("Introduzca el iva actual");
        int iva = scanner.nextInt();

        int playIva = ((play * iva) / 100) + play;
        int iphoneIva = ((iphone * iva) / 100) + iphone;

        boolean compra1 = dinero >= 500;
        System.out.println("Te puedes comprar la play"+compra1);
        boolean compra2 = dinero >= 500;
        System.out.println("Te puedes comprar el iphone"+compra2);

        int total = playIva + iphoneIva;
        boolean compra = total <= dinero;
        System.out.println("Te puedes comprar el iphone"+compra);

    }

}

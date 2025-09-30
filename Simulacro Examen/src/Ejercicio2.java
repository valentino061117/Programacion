import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        ejercicio2();
    }

    static Scanner scanner = new Scanner (System.in);

    public static void ejercicio2(){
        System.out.println("Intoduzca su nombre");
        final String participante1 = scanner.next();
        System.out.println("Intoduzca el numero de jugadores que pose");
        final int jugadores1 = scanner.nextInt();
        System.out.println("Intoduzca el dinero que pose");
        final int dinero1 = scanner.nextInt();
        System.out.println("Intoduzca su nombre");
        final String participante2 = scanner.next();
        System.out.println("Intoduzca el numero de jugadores que pose");
        final int jugadores2 = scanner.nextInt();
        System.out.println("Intoduzca el dinero que pose");
        final int dinero2 = scanner.nextInt();
        System.out.println("Intoduzca su nombre");
        final String participante3 = scanner.next();
        System.out.println("Intoduzca el numero de jugadores que pose");
        final int jugadores3 = scanner.nextInt();
        System.out.println("Intoduzca el dinero que pose");
        final int dinero3 = scanner.nextInt();
        boolean j1 = jugadores1 == 11;
        System.out.println("El primer participante tiene 11 jugadores "+j1);
        boolean j2 = jugadores2 %2 ==0;
        System.out.println("El segundo participante tiene jugadores pares "+j2);
        boolean j3 = dinero3 >= 0;
        System.out.println("El tercer participante tiene presupuesto positivo "+j3);
        boolean liga = (jugadores1 == 11 && jugadores2 == 11 && jugadores3 == 11)
                && (dinero1 >= 0 && dinero2 >= 0 && dinero3 >= 0);
        System.out.println("La liga está preparada para empezar "+liga);

    }
}

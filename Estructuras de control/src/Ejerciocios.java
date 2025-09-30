import java.util.Scanner;

public class Ejerciocios {
    public static void main(String[] args) {
        ejercicio1();
        ejercicio2();
        //ejercicio3();
    }

    static Scanner scanner = new Scanner(System.in);

    public static void ejercicio1(){
    int a = scanner.nextInt();
    String s = null;
    if (a%2 == 0){
        s ="Es par";
    }

    }

    public static void ejercicio2(){
        System.out.println("Introduzca un numero:");
        int a = scanner.nextInt();
        if ((a%2 == 0) && (a < 10 || a < 100)){
            a=+1;
            System.out.println("Es par"+a);
        }

    }

}

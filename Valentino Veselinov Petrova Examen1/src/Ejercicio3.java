import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        ejercicio3();
    }

    static Scanner scanner = new Scanner(System.in);

    public static void ejercicio3(){
        System.out.println("Introzuca si quiere hacer un espresso, un latte o un capuchino");
        String cafe = scanner.nextLine();
        System.out.println("Cuantas cucharaditas de azucar desea introducir al cafe");
        int azucar = scanner.nextInt();
        System.out.println("De que tamaño desea el cafe");
        String tamaño = scanner.next();
        System.out.printf("Preparando un %s de tamaño %s " +
                "con %d cucharaditas de azucar",cafe,tamaño,azucar);
    }

}

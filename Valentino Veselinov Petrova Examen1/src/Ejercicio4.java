import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        ejercicio4();
    }

    static Scanner scanner = new Scanner(System.in);

    public static void ejercicio4(){
        System.out.println("Introduzca su nombre    ");
        String nombre = scanner.next();
        System.out.println("Introduzca su aplleido");
        String apellido = scanner.next();
        System.out.println("Introduzca el sueldo que desea recebir");
        int sueldo = scanner.nextInt();
        System.out.println("Introduzca su edad");
        int edad = scanner.nextInt();
        System.out.println("Introduzca el dia cumpleaños");
        int cumpleaños = scanner.nextInt();
        System.out.println("Diganos si tiene carnet de conducir o no");
        String carnet = scanner.next();

        boolean valido1 = edad < 50 && sueldo < 40000 && carnet.equalsIgnoreCase("Si");
        boolean valido2 = edad > 45 && sueldo < 20000 && cumpleaños%2 == 0 ;

        System.out.printf("Con los datos introducidos, el candidato cuyo nombre es %s\n",nombre +
                "tiene como resolución:"+valido1+valido2);
        }


}

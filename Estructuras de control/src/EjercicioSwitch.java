import java.util.Scanner;

public class EjercicioSwitch {
    public static void main(String[] args) {
        // ejercicio1();
        // ejercicio2();
        //ejercicio6();
        //ejercicio7();
        //ejercicio8();
        ejercicio9();
        ejercicio10();
    }

    static Scanner scanner = new Scanner(System.in);

    public static void ejercicio1(){
        System.out.println("Introduzca un numero de 1 al 7");
        int numero = scanner.nextInt();
        switch (numero){
            case 1:
                System.out.println("Es lunes");
                break;
            case 2:
                System.out.println("Es martes");
                break;
            case 3:
                System.out.println("Es miercoles");
                break;
            case 4:
                System.out.println("Es jueves");
                break;
            case 5:
                System.out.println("Es viernes");
                break;
            case 6:
                System.out.println("Es sabado");
                break;
            case 7:
                System.out.println("Es domingo");
                break;
        }
    }

    public static void ejercicio2(){
        System.out.println("Introduzca una vocal o una consonante");
        char letra = scanner.next().charAt(0);
        switch (letra){
            case 'a':
                System.out.println("Es una vocal");
                break;
            case 'e':
                System.out.println("Es una vocal");
                break;
            case 'i':
                System.out.println("Es una vocal");
                break;
            case 'o':
                System.out.println("Es una vocal");
                break;
            case 'u':
                System.out.println("Es una vocal");
                break;
            default:
                System.out.println("Es una consonante");
        }
    }

    public static void ejercicio6(){
        System.out.println("Introduzca un numero del uno al cuatro");
        int num = scanner.nextInt();
        switch (num){
            case 1:
                System.out.println("Opcion 1 play cinco");
                break;
            case 2:
                System.out.println("Opcion 2 iphone 15");
                break;
            case 3:
                System.out.println("Opcion 3 tele de plasma");
                break;
            case 4:
                System.out.println("Opcion cuatro Pc gamer");
        }
    }

    public static void ejercicio7(){
        System.out.println("Introduzca un numero del 1 al 5");
        int num = scanner.nextInt();
        switch (num){
            case 1:
                System.out.println("Suspendido");
                break;
            case 2:
                System.out.println("Aprobado");
                break;
            case 3:
                System.out.println("Notable");
                break;
            case 4:
                System.out.println("Sobresaliente");
                break;
            case 5:
                System.out.println("Matricula de honor");
                break;
        }
    }

    public static void ejercicio8() {
        System.out.println("Introduce un numero");
        int n2 = scanner.nextInt();
        System.out.println("Introduce un numero");
        int n3 = scanner.nextInt();
        System.out.println("Introduce un caracter (+, -, *, /)");
        char caracter = scanner.next().charAt(0);

        switch (caracter) {
            case '+':
                int total = n3 + n2;
                System.out.printf("La suma de: %d + %d = %d", n2, n3, total);
                break;
            case '-':
                int total1 = n3 - n2;
                System.out.printf("La suma de: %d - %d = %d", n2, n3, total1);
                break;
            case '*':
                int total2 = n3 * n2;
                System.out.printf("La multiplicacion de: %d * %d = %d", n2, n3, total2);
                break;
            case '/':
                int total3 = n3 / n2;
                System.out.printf("La division de: %d / %d = %d", n2, n3, total3);
                break;
            default:
                System.out.println("Non caracter foound\n" + "Ponlo bien goofy");


        }
    }

    public static void ejercicio9() {
        System.out.println("Introduce un numero(1 al 12):");
        int n1 = scanner.nextInt();
        switch (n1) {
            case 1, 2, 3:
                System.out.println("Invierno");
                break;
            case 4, 5, 6:
                System.out.println("Primavera");
                break;
            case 7, 8, 9:
                System.out.println("Verano");
                break;
            case 10, 11, 12:
                System.out.println("Otoño");
                break;
            default:
                System.out.println("Ponlo bien");

        }
    }

    public static void ejercicio10(){
        System.out.println("Introduzca el codigo del producto");
        String codigo = scanner.next();

    }

}

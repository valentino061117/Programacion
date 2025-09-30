import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        ejercicio2();
    }

    static Scanner scanner = new Scanner(System.in);

    public static void ejercicio2(){
        int loteria = (int)(Math.random()*9000)+1000;

        System.out.println("Introduzca una unidad entre 1000 y el 9000");
        int unidades = scanner.nextInt();
        System.out.println("Introduzca una decena entre 1000 y el 9000");
        int decenas = scanner.nextInt();
        System.out.println("Introduzca una centena entre 1000 y el 9000");
        int centenas = scanner.nextInt();
        System.out.println("Introduzca una centena entre 1000 y el 9000");
        int millares = scanner.nextInt();

        System.out.printf("EL numero que pusiste es %d%d%d%d",millares,centenas,decenas,unidades);

        boolean unidades1 = loteria == unidades;
        boolean decenas1 = loteria == decenas;
        boolean centenas1 = loteria == centenas;
        boolean millares1 = loteria == millares;

        System.out.println("Has acertado las unidades:")+unidades1;
        System.out.println("Has acertado las decenas:")+decenas1;
        System.out.println("Has acertado las centenas:")+centenas1;
        System.out.println("Has acertado las millares:")+millares1;

    }

}

import java.util.Random;
import java.util.Scanner;

public class Ejercicio2 {

    /*2. Desarrolla un programa que tenga las siguientes funcionalidades
    - Pedir al usuario la cantidad de datos que se quieren guardar
    - Rellene automáticamente la lista con números aleatorios entre 0 y 20
    - Una vez relleno se deberán de hacer automáticamente las siguientes acciones
    - System.out.println("** mostrar extremos"); Mostrará el elemento más grande
    y el elemento más pequeño
    - System.out.println("** mostrar par/impar"); Mostrará cuantos elementos son
    pares y cuantos impares
    - System.out.println("** mostrar repeticiones"); Pedirá un número por teclado y
    mostrará el número de veces que aparece en la lista*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Ingrese la cantidad de datos que desea guardar:");
        int cantidad = scanner.nextInt();
        int[] array = new int[cantidad];

        for (int i = 0; i < cantidad; i++) {
            array[i] = random.nextInt(21);
        }

        System.out.println("** Mostrar extremos:");
        int max = array[0], min = array[0];
        for (int num : array) {
            if (num > max) max = num;
            if (num < min) min = num;
        }
        System.out.println("Máximo: " + max + ", Mínimo: " + min);

        System.out.println("** Mostrar par/impar:");
        int pares = 0, impares = 0;
        for (int num : array) {
            if (num % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }
        System.out.println("Pares: " + pares + ", Impares: " + impares);

        System.out.println("** Mostrar repeticiones:");
        System.out.println("Ingrese un número para verificar cuántas veces aparece:");
        int buscar = scanner.nextInt();
        int repeticiones = 0;
        for (int num : array) {
            if (num == buscar) {
                repeticiones++;
            }
        }
        System.out.println("El número " + buscar + " aparece " + repeticiones + " veces.");
    }
}

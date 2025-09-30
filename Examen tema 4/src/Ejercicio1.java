import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio1 {

    /*1. Crear una aplicación que sea capaz de rellenar un array de 15 elementos sin que se
    repita ninguno de ellos. Para ello, los números que se meterán son aleatorios entre 0 y
    16. Una vez hecho esto:
    - Muestra los elementos del array sin ordenar.
    - Muestra los elementos del array ordenados.
    - Muestra solo los elementos que están en posiciones pares
    - Muestra solo los elementos que son pares*/

    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[15];
        boolean[] used = new boolean[17];

        int index = 0;
        while (index < array.length) {
            int num = random.nextInt(17);
            if (!used[num]) {
                array[index] = num;
                used[num] = true;
                index++;
            }
        }

        System.out.println("Elementos del array sin ordenar:");
        System.out.println(Arrays.toString(array));

        System.out.println("Elementos del array ordenados:");
        int[] sortedArray = array.clone();
        Arrays.sort(sortedArray);
        System.out.println(Arrays.toString(sortedArray));

        System.out.println("Elementos en posiciones pares:");
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();

        System.out.println("Elementos pares:");
        for (int num : array) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }
}



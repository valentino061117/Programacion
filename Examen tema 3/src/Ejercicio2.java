import java.util.Random;
import java.util.Scanner;

public class Ejercicio2 {
    /*2. Crea una aplicación que pronostique los números de la bonoloto. Lo primero
        que pasará es que se le pide al usuario un número. A continuación, el
        sistema generará de forma automática 10 números entre 1 y 100. Una vez
        generados, se mostrará:
        a. El número más grande generado
        b. El número más pequeño generado
        c. El número medio generado
        d. La suma de todos los números
        e. Si el numero introducido por el usuario es alguno de los generados*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];

        System.out.println("Introduce un número:");
        int numeroUsuario = scanner.nextInt();

        System.out.println("Números generados:");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 100) + 1;
            System.out.print(numeros[i] + " ");
        }
        System.out.println();

        int max = numeros[0];
        int min = numeros[0];
        int suma = 0;
        boolean encontrado = false;

        for (int num : numeros) {
            if (num > max) max = num;
            if (num < min) min = num;
            suma += num;
            if (num == numeroUsuario) encontrado = true;
        }

        double promedio = (double) suma / numeros.length;

        System.out.println("Número más grande: " + max);
        System.out.println("Número más pequeño: " + min);
        System.out.println("Número medio: " + promedio);
        System.out.println("Suma de todos los números: " + suma);
        System.out.println(encontrado ? "El número ingresado está entre los generados" : "El número ingresado no está entre los generados");

    }
}

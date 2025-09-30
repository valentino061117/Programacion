import java.util.Scanner;

public class Ejercicio3 {

    /*3. Desarrollar un programa que tenga las siguientes funcionalidades sobre un
    array de 20 números, mediante un menú ofrezca las siguientes posibilidades
    a. Registrar posiciones; pedirá por teclado una a una las posiciones del
    array.
    b. Obtener elementos de una posición pedirá por teclado una posición y
    mostrará el dato asociado a dicha posición.
    c. Mostrar el array completo; listará el array completo, elemento a
    elemento
    d. Mostrar el array ordenado (con el algoritmo de la burbuja; lista el
    array completo ordenado de menor a mayor
    e. Rotar el array mueve todas las posiciones del array en una dirección (la
    que tu elijas) y lo muestra*/

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int[] array = new int[20];
            boolean filled = false;

            while (true) {
                System.out.println("Menú:");
                System.out.println("a. Registrar posiciones");
                System.out.println("b. Obtener elementos de una posición");
                System.out.println("c. Mostrar array completo");
                System.out.println("d. Mostrar array ordenado (burbuja)");
                System.out.println("e. Rotar el array");
                System.out.println("f. Salir");

                String opcion = scanner.nextLine();

                switch (opcion) {
                    case "a":
                        System.out.println("Ingrese los elementos del array:");
                        for (int i = 0; i < array.length; i++) {
                            System.out.print("Elemento " + i + ": ");
                            array[i] = scanner.nextInt();
                        }
                        filled = true;
                        break;

                    case "b":
                        if (!filled) {
                            System.out.println("Primero debe registrar posiciones.");
                            break;
                        }
                        System.out.print("Ingrese la posición a consultar: ");
                        int pos = scanner.nextInt();
                        if (pos >= 0 && pos < array.length) {
                            System.out.println("Elemento en posición " + pos + ": " + array[pos]);
                        } else {
                            System.out.println("Posición inválida.");
                        }
                        break;

                    case "c":
                        if (!filled) {
                            System.out.println("Primero debe registrar posiciones.");
                            break;
                        }
                        System.out.println("Array completo:");
                        for (int num : array) {
                            System.out.print(num + " ");
                        }
                        System.out.println();
                        break;

                    case "d":
                        if (!filled) {
                            System.out.println("Primero debe registrar posiciones.");
                            break;
                        }
                        System.out.println("Array ordenado (burbuja):");
                        int[] sortedArray = array.clone();
                        for (int i = 0; i < sortedArray.length - 1; i++) {
                            for (int j = 0; j < sortedArray.length - i - 1; j++) {
                                if (sortedArray[j] > sortedArray[j + 1]) {
                                    int temp = sortedArray[j];
                                    sortedArray[j] = sortedArray[j + 1];
                                    sortedArray[j + 1] = temp;
                                }
                            }
                        }
                        for (int num : sortedArray) {
                            System.out.print(num + " ");
                        }
                        System.out.println();
                        break;

                    case "e":
                        if (!filled) {
                            System.out.println("Primero debe registrar posiciones.");
                            break;
                        }
                        System.out.println("Array rotado hacia la derecha:");
                        int last = array[array.length - 1];
                        for (int i = array.length - 1; i > 0; i--) {
                            array[i] = array[i - 1];
                        }
                        array[0] = last;
                        for (int num : array) {
                            System.out.print(num + " ");
                        }
                        System.out.println();
                        break;

                    case "f":
                        System.out.println("Saliendo...");
                        return;

                    default:
                        System.out.println("Opción inválida.");
                }
            }
        }
}

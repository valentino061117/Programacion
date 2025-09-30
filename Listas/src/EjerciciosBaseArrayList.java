import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class EjerciciosBaseArrayList {
    private static Scanner teclado = new Scanner(System.in);
    private static Random aleatorio = new Random();
    public static void main(String[] args) {
        //ejer1();
        //ejer2();
        //ejercicio3();
        //ejercicio4();
        ejercicio5();
    }

    public static void ejer1(){
        //1. Crea un ArrayList de String y realiza las siguientes acciones
        //- Guarda manualmente 10 palabras
        //- Imprime por pantalla todas las palabras del arraylist
        ArrayList<String> listaPalabras = new ArrayList<>(10);
        listaPalabras.add("Manzana");
        listaPalabras.add("Banana");
        listaPalabras.add("Cereza");
        listaPalabras.add("Durazno");
        listaPalabras.add("Uva");
        listaPalabras.add("Piña");
        listaPalabras.add("Fresa");
        listaPalabras.add("Mango");
        listaPalabras.add("Sandía");
        listaPalabras.add("Melón");

        for (String item:listaPalabras) {
            System.out.print(item+",\t");
        }

    }
    public static void ejer2(){
        ArrayList<Integer>listaNumeros = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int numeroAleatorio = aleatorio.nextInt(101);
            listaNumeros.add(numeroAleatorio);
        }
        int suma = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int num :listaNumeros) {
            suma += num;
            if (num > max){
                max =num;
            }
            if (num<min){
                min =num;
            }

        }
        System.out.println("Números aleatorios generados: " + listaNumeros);
        System.out.println("Suma: " + suma);
        System.out.println("Media: " + (double)suma/listaNumeros.size());
        System.out.println("Máximo: " + max);
        System.out.println("Mínimo: " + min);
    }
    /*
        Crea un programa que cree un ArrayList con los nombres de todos los compañeros de clase.
        Una vez creado, sacará el nombre de uno de los compañeros (aleatorio)
    */
    public static void ejercicio3(){
        ArrayList<String> listaCompaneros = new ArrayList<>(10);
        listaCompaneros.add("Alumno1");
        listaCompaneros.add("Alumno2");
        listaCompaneros.add("Alumno3");
        listaCompaneros.add("Alumno4");
        listaCompaneros.add("Alumno5");
        listaCompaneros.add("Alumno6");
        listaCompaneros.add("Alumno7");
        listaCompaneros.add("Alumno8");
        listaCompaneros.add("Alumno9");
        listaCompaneros.add("Alumno10");
        System.out.println("La lista de compañeros\n"+listaCompaneros);
        int numeroAleatorio = (int) (Math.random() * listaCompaneros.size());


        String companeroSeleccionado = listaCompaneros.get(numeroAleatorio);
        System.out.println("Alumno generado aleatoriamente\n"+companeroSeleccionado);
    }
    /*
    Crea dos ArrayList de números y guarda de forma aleatorio 20 números
    sin decimales en cada uno de ellos. Una vez hecho esto comprueba cuantos
    números de los dos arraylist son iguales (mismo número en la misma posición).
    Tras hacer la comprobación indica cuantos números han sido iguales
    */
    public static void ejercicio4(){
        ArrayList <Integer> listaNumeros1 = new ArrayList<>();
        ArrayList <Integer> listaNumeros2 = new ArrayList<>();
        int incremento=0;
        for (int i = 0; i < 20; i++) {
            int numeroAleatorio = (int)(Math.random()*21);
            listaNumeros1.add(numeroAleatorio);
            numeroAleatorio = (int)(Math.random()*21);
            listaNumeros2.add(numeroAleatorio);
        }

        System.out.println("Array lista 1 "+listaNumeros1);
        System.out.println("Array lista 2 "+listaNumeros2);

        for (int i = 0; i < listaNumeros1.size(); i++) {
            if (listaNumeros1.get(i) == i) {
                incremento++;
            }
        }
        for (int i = 0; i < listaNumeros2.size(); i++) {
            if (listaNumeros2.get(i) == i) {
                incremento++;
            }
        }
        System.out.println("El numero de veces repetido es "+incremento);
    }
    /*
    Crea un programa que cree un ArrayList de palabras, introduce en él 10 palabras
    cualquiera. Muestra el número de letras de todas las palabras,
    la palabra con más letras y la palabra con menos letra
    */
    public static void ejercicio5(){
        ArrayList<String> listaPalabras = new ArrayList<>(10);
        listaPalabras.add("Hola");
        listaPalabras.add("Ladrido");
        listaPalabras.add("Hexagono");
        listaPalabras.add("Caballo");
        listaPalabras.add("Sol");
        listaPalabras.add("Cafe");
        listaPalabras.add("Dias");
        listaPalabras.add("Buenas");
        listaPalabras.add("Adios");
        listaPalabras.add("Tardes");
        int totalLetras=0;
        for (int i = 0; i < listaPalabras.size(); i++) {
            totalLetras++;
            System.out.println("Array completo\n"+listaPalabras+
                    "\n Y las letras son:"+totalLetras);
        }
    }
}

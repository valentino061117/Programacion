import java.util.Scanner;

public class EjerciciosArray {
    public static void main(String[] args) {
        //ejercicio1();
        //ejercicio2();
        //ejercicio3();//error
        //ejercicio4();
        //ejercicio5();
        //ejercicio6();
        //ejercicio7();
    }
    public static void ejercicio1(){
        Scanner scanner =new Scanner(System.in);
        int [] numeros=new int [10];
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introduce un numero");
            numeros[i]=scanner.nextInt();
            System.out.println("Tu numero en la posicion "+(i+1)+" es "+numeros[i]);
        }

    }
    public static void ejercicio2(){
        int puntos=0;
        int [] aleatorios=new int[30];
        for (int i = 0; i < aleatorios.length ; i++) {
            int aleatorio=(int)(Math.random()*11);
            System.out.println(aleatorio);
            puntos+=aleatorio;
        }
        System.out.println("El total de puntos es "+puntos);
        System.out.println("El total de puntos es "+((double)puntos/30));
    }
    public static void ejercicio3(){
        Scanner scanner=new Scanner(System.in);
        int [] numeros=new int[10];
        for (int i = 0; i < 10 ; i++) {
            System.out.println("Introduce un numero");
            numeros[i]=scanner.nextInt();
        }
        // ERROR ME SALEN 9 Y NO 10
        for (int i = numeros.length-1; i >0  ; i--) {
            System.out.println("En orden inverso es "+numeros[i]+"\n");
        }
        for (int item:numeros) {
            System.out.println("En orden normal es "+item);
        }
    }
    public static void ejercicio4(){
        Scanner scanner=new Scanner(System.in);
        int [] numero= new int [20];
        int [] cuadrado= new int [20];
        int [] cubo= new int [20];
        for (int i = 0; i < 20; i++) {
            numero[20]=(int)(Math.random()*101);

        }
    }
    public static void ejercicio5(){
        Scanner scanner=new Scanner(System.in);
        int [] numero= new int [8];
        for (int i = 0; i < numero.length; i++) {
            System.out.println("Introduce tu numero:");
            numero[i]=scanner.nextInt();
            if (numero[i] %2==0) {
                System.out.println("Es par");
            }else {
                System.out.println("Es impar");
            }
        }

    }
    public static void ejercicio6(){
        int [] numero= new int [20];
        int contador=0;
        for (int i = 0; i < numero.length; i++) {
            numero[i]=(int)(Math.random()*31);
            //System.out.println(numero[i]); -----> Comprobación
            if (numero[i] ==6) {
                numero[i]=8;
                contador++;
            }
            if (numero[i]==7){
                numero[i]=15;
                contador++;
            }
            if (numero[i] == 20) {
                numero[i]=10;
                contador++;
            }
        }
        System.out.println("Hemos tenido "+contador+" modificaciones");
    }
    public static void ejercicio7(){
        Scanner scanner=new Scanner(System.in);
        String [] palabras=new String[10];
        String totalPalabras="";
        String menosLetras="";
        String masLetras="";

        int opcion;

        for (int i = 0; i <10 ; i++) {
            System.out.println("Introduce una palabra");
            palabras[i]=scanner.next();
            totalPalabras+=palabras[i];
            if (totalPalabras.length()>menosLetras.length()) {
                menosLetras=totalPalabras;
                System.out.println("Prueba"+menosLetras.length());
            }
        }
        do {
            System.out.println("1. Ver todas las palabras\n" +
                    "2. Obtener una palabra al azar\n" +
                    "3. Ver número de letras\n" +
                    "4. Ver media de letras\n" +
                    "5. Ver palabra con más letras\n" +
                    "6. Ver palabra con menos letras\n" +
                    "7. Salir");
            System.out.println("Que quieres hacer?");
            opcion=scanner.nextInt();
            switch (opcion){
                case 1:
                    System.out.println(totalPalabras);
                    break;
                case 2:
                    int numeroAzar=(int)(Math.random()*10);
                    System.out.println(palabras[numeroAzar]);
                    break;
                case 3:
                    System.out.println(totalPalabras.length());
                    break;
                case 4:
                    System.out.println(totalPalabras.length()/2);
                    break;
                case 5:
                    System.out.println("FALTA POR HACER");
                    break;
                case 6:
                    System.out.println("FALTA POR HACER x2");
                    break;
                case 7:
                    System.out.println("Saliendo ...");
                    break;
                default:
                    System.out.println("la opcion no esta en el rango");
                    break;
            }

        }while (opcion!=7);
    }
}

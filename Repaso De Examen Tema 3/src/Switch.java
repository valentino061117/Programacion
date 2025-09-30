import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        //ejercicio1();
        //ejercicio2();
        //ejercicio3();
        ejercicio4();
    }

    static Scanner scanner = new Scanner(System.in);

    public static void ejercicio1(){
        System.out.println("Introduzca un numero del 1 al 7");
        int num = scanner.nextInt();
        switch (num) {
            case 1:
                System.out.println("Es Lunes");
                break;
            case 2:
                System.out.println("Es Martes");
                break;
            case 3:
                System.out.println("Es Miercoles");
                break;
            case 4:
                System.out.println("Es Jueves");
                break;
            case 5:
                System.out.println("Es Viernes");
                break;
            case 6:
                System.out.println("Es Sabado");
                break;
            case 7:
                System.out.println("Es Domingo");
                break;
        }
    }

    public static void ejercicio2(){
        System.out.println("Introduce una letra");
        char letra = scanner.next().charAt(0);
        switch (letra){
            case 'a':
                System.out.println("Introduciste una vocal");
                break;
            case 'e':
                System.out.println("Introduciste una vocal");
                break;
            case 'i':
                System.out.println("Introduciste una vocal");
                break;
            case 'o':
                System.out.println("Introduciste una vocal");
                break;
            case 'u':
                System.out.println("Introduciste una vocal");
                break;
            default:
                System.out.println("Introduciste una consonante");
        }
    }

    public static void ejercicio3(){
        System.out.println("Introduzca un numero");
        int num = scanner.nextInt();
        switch (num % 2) {
            case 0:
                System.out.println("El numero es par");
                break;
            case 1:
                System.out.println("El numero es impar");
                break;
            case -1:
                System.out.println("El numero es impar");
                break;
        }
    }

public static void ejercicio4(){
    int numero = 0;
    int acumuladorPares = 0, acumuladorImpares = 0;
    int incrementadorPares = 0, incrementadorImpares = 0, incrementadorCeros=0;
    while (numero>-1){
        System.out.println("Introduce un numero");
        numero = scanner.nextInt();
        if (numero>-1){
            if (numero % 2 == 0){
                acumuladorPares += numero;
                incrementadorPares++;
            }else {
                acumuladorImpares += numero;
                incrementadorImpares++;
            }if (numero == 0){
                incrementadorCeros++;
            }
        }
        int opcion;
    } do {
        System.out.println("1. Suma de pares");
        System.out.println("2. Pares media");
        System.out.println("3. Impares media");
        System.out.println("4. Numero numeros");
        System.out.println("5. Numeros detalle");
        System.out.println("6. Salir");
        opcion = scanner.nextInt();
        switch (opcion) {}
    } while (){

    }
}

}

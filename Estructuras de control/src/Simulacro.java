import java.util.Scanner;

public class Simulacro {
    public static void main(String[] args) {
        ejercicio1();
        ejercicio2();
        ejercicio3();
        ejercicio4();
    }

       /*
     realizar un programa que permita números mayores o iguales
     a cero por teclado hasta que se introduzca un número
     negativo y nos visualice el siguiente menú:
    1-Suma de los números pares introducidos. -> acumulador
    2-Media de los números pares introducidos con dos decimales. -> acumulador / incrementados
    3-Media de los números impares introducidos con dos decimales. -> acumulador / incrementados
    4-Cuántos números hemos introducido. incrementador
    5-Cuantos números de los introducidos han sido ceros, cuántos han sido pares y cuantos impares. incrementador
    6.-Salir.
    */

    public static void ejercicio1() {
        Scanner scanner = new Scanner(System.in);

        // introduce numero hasta que se meta un negativo
        int numero = 0;
        int acumuladorPares = 0, acumuladorImpares = 0;
        int incrementadorPares = 0, incrementadorImpares = 0, incrementadorCeros=0;

        while (numero > -1) {
            System.out.println("Introduce numero");
            numero = scanner.nextInt();
            if (numero > -1) {
                if (numero % 2 == 0) {
                    acumuladorPares += numero;
                    incrementadorPares++;
                }else {
                    acumuladorImpares += numero;
                    incrementadorImpares++;
                }
                if (numero==0){
                    incrementadorCeros++;
                }
            }
        }
        int opcion;
        do {
            System.out.println("1. Suma de pares");
            System.out.println("2. Pares media");
            System.out.println("3. Impares media");
            System.out.println("4. Numero numeros");
            System.out.println("5. Numeros detalle");
            System.out.println("6. Salir");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("La suma de los pares es "+acumuladorPares);
                    break;
                case 2:
                    System.out.println("La media de los pares es "+(double)acumuladorPares/incrementadorPares);
                    break;
                case 3:
                    System.out.println("La media de los impares es "+(double)acumuladorImpares/incrementadorImpares);
                    break;
                case 4:
                    System.out.println("El numero de numeros introducidos es de "+(acumuladorPares+acumuladorImpares));
                    break;
                case 5:
                    System.out.println("El numero de pares es "+incrementadorPares);
                    System.out.println("El numero de impares es "+incrementadorImpares);
                    System.out.println("El numero de ceros es "+incrementadorCeros);
                    break;
                case 6:
                    System.out.println("Saliendo.....");
                    break;
                default:
                    System.out.println("No es valida, intenta de nuevo");
            }
        } while (opcion != 6);
    }

    public static void ejercicio2() {
        Scanner scanner = new Scanner(System.in);
        // cuantos ss -> incrementador
        int numeroSS = 0;
        int sumaNotas =0;
        for (int i = 0; i < 20; i++) {
            System.out.println("Introduce nota:");
            int nota = scanner.nextInt();
            sumaNotas +=nota;
            if (nota<5){
                numeroSS++;
            }
        }

        System.out.println("El numero de SS es de "+numeroSS);
        // y nota media -> sumario / 20
        System.out.println("La media de las notas es "+(double)sumaNotas/20);
    }

    public static void ejercicio3() {
        Scanner scanner = new Scanner(System.in);
        final int PIN = 1111;
        double saldo = 0;
        // sacar dinero
        // meter dinero
        // consultar dinero
        // salir
        int opcion = 0;
        int pinUsuario=0;
        do {
            System.out.println("1. Ingresar");
            System.out.println("2. Sacar");
            System.out.println("3. Consultar");
            System.out.println("4. Salir");
            System.out.println("Que quieres hacer");
            opcion = scanner.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Dime el pin de la cuenta");
                    pinUsuario = scanner.nextInt();
                    if (pinUsuario==PIN){
                        System.out.println("Que cantidad quieres ingresar");
                        int cantidad = scanner.nextInt();
                        if (cantidad>0){
                            saldo+=cantidad;
                            System.out.println("Saldo actualizado");
                        } else {
                            System.out.println("Cantidad invalida");
                        }
                    } else {
                        System.out.println("No es el pin");
                    }

                    break;
                case 2:
                    System.out.println("Dime el pin de la cuenta");
                    pinUsuario = scanner.nextInt();
                    if (pinUsuario==PIN){
                        System.out.println("Que cantidad quieres sacar");
                        int cantidad = scanner.nextInt();
                        if (cantidad>0 && saldo>=cantidad){
                            saldo-=cantidad;
                            System.out.println("Saldo actualizado");
                        } else {
                            System.out.println("Cantidad invalida");
                        }
                    } else {
                        System.out.println("No es el pin");
                    }

                    break;
                case 3:
                    System.out.println("El saldo de la cuenta es "+saldo);
                    break;
                case 4:
                    System.out.println("Saliendo");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }

        }while (opcion!=4);

    }

    public static void ejercicio4() {
        /*
        a. Si su longitud es menor de 4, transformar todas sus letras en mayúsculas
        b. Si su longitud es mayor igual que 4 pero menor que 8, transformar sus letras en
        minúsculas
        c. Si su longitud es mayor igual que 8 pero menor que 11, todas las vocales deberán
        estar acentuadas
        d. Si la longitud es mayor igual a 11 se deberá dar la vuelta a la palabra
         */
        String palabraInversa = "";
        Scanner scanner = new Scanner(System.in);
        String palabra = scanner.next();
        if (palabra.length() < 4) {
            palabra = palabra.toUpperCase();
        } else if (palabra.length() < 8) {
            palabra = palabra.toLowerCase();
        } else if (palabra.length() < 11) {
            palabra = palabra.replaceAll("a", "á")
                    .replaceAll("e", "é")
                    .replaceAll("i", "í")
                    .replaceAll("o", "ó")
                    .replaceAll("u", "ú");
        } else {
            palabraInversa = "";
            for (int i = palabra.length()-1; i >=0 ; i--) {
                palabraInversa += palabra.charAt(i);
            }
        }

        if (palabra.length()>=11){
            System.out.println(palabraInversa);
        } else {
            System.out.println(palabra);
        }



    }

}

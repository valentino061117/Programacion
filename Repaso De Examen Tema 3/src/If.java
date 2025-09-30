import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        //ejercicio1();
        //ejercicio2();
        //ejercicio3();
        //ejercicio4();
        //ejercicio5();
        //ejercicio6();
        ejercicio7();
    }

    static Scanner scanner = new Scanner(System.in);

    public static void ejercicio1(){
        System.out.println("Intro duzca dos numero enteros");
        int num1= scanner.nextInt();
        int num2= scanner.nextInt();
        if (num1>num2){
            System.out.println("El primero es mayor que el segundo");
        }else {
            System.out.println("El primero no es mayor que el segundo");
        }
    }

    public static void ejercicio2(){
        System.out.println("Introduces tres numero enteros positivos:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        if (num1 == num2 + num3){
            System.out.println(num1 + "=" + num2 + "+" + num3);
        } else if (num2 == num1 + num3) {
            System.out.println(num2 + "=" + num1 + "+" + num3);
        } else if (num3 == num1 + num2) {
            System.out.println(num3 + "=" + num1 + "+" + num2);
        } else {
            System.out.println("Ninguno es suma de los otros dos");
        }
    }

    public static void ejercicio3(){
        System.out.println("Inroduzca un numero entero:");
        int num = scanner.nextInt();
        boolean multiplo20 = num % 20 == 0;
        boolean rango = num >= -100 && num <= 100;
        if (multiplo20 && rango){
            System.out.println("Es múltiplo de 20 y está entre -100 y 100");
        } else if (multiplo20 && !rango) {
            System.out.println("Es múltiplo de 20 y no está entre -100 y 100");
        } else if (!multiplo20 && rango) {
            System.out.println("No es múltiplo de 20 y está entre -100 y 100");
        } else {
            System.out.println("No es múltiplo de 20 y no está entre -100 y 100");
        }
    }

    public static void ejercicio4(){
        System.out.println("Introduzca un año");
        int año = scanner.nextInt();
        if ((año % 4 == 0 && año % 10 != 0) || (año % 400 == 0)){
            System.out.println("El año es bisiesto");
        } else {
            System.out.println("El año no es bisiesto");
        }
    }

    public static void ejercicio5(){
        System.out.println("Introduzca un numero de 4 digitos:");
        int num = scanner.nextInt();
        if (num<1000 || num>9999) {
            System.out.println("El numero no tiene 4 digitos");
        }else {
            int mil = num / 1000;
            int centenas = (num / 100) % 10;
            int decimales = (num / 10) % 10 ;
            int unidades = num % 10;
            if (mil == unidades && decimales == centenas) {
                System.out.println("Es capicua");
            }else {
                System.out.println("No es capicua");
            }
        }
    }

    public static void ejercicio6(){
        System.out.println("Introduzca tres numeros entre -100 y 100");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        if ((num1>=-100 && num1<=100)&&
            (num2>=-100 && num2<=100)&&
            (num3>=-100 && num3<=100)){
            double sumaInversa = 0;
            if (num1 !=0) sumaInversa += 1.0 / num1;
            if (num2 !=0) sumaInversa += 1.0 / num2;
            if (num3 !=0) sumaInversa += 1.0 / num3;
            System.out.printf("La suma de los inversores es: %.5f\n", sumaInversa);
        }else {
            System.out.println("Alguno de lo numeros no esta entre -100 y 100");
        }
    }

    public static void ejercicio7(){
        System.out.println("Introduzca un numero de 3 cifras");
        int num = scanner.nextInt();
        if (num<100 || num>999) {
            System.out.println("El numero no tiene tres digitos");
        } else {
            int centenas = num / 100;
            int decenas = (num / 10) % 10;
            int unidades = num % 10;

            int numero = (int) (Math.pow(centenas,3) + Math.pow(decenas,3) + Math.pow(unidades,3));

            if (numero == num) {
                System.out.println("Es un numero Armstrong");
            }else {
                System.out.println("No es un numero Armstrong");
            }

        }
    }

}




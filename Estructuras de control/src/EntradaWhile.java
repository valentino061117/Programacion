import java.util.Scanner;

public class EntradaWhile {

    public static void main(String[] args) {
        //ejercicio1();
        //ejercicio2();
        //ejercicio3();
        //ejercicio4();
        //ejercicio5();
        ejercicio7();
    }
    static Scanner scanner=new Scanner(System.in);

    public static void ejercicio1(){
        int acumulador=0;
        int numero=-1;
        while (numero!=0){
            System.out.println("Introduce un numero");
            numero=scanner.nextInt();
            if (numero<0){
                System.out.println("El numero introducido es negativo. Introduce otro numero :");
                numero=scanner.nextInt();
            }else {
                acumulador+=numero;
            }
        }
        System.out.println("La suma de los numeros positivos es: "+acumulador);
    }

    public static void ejercicio2(){
        // Calcúlese el mínimo común múltiplo de dos números entre 1 y 100.

        System.out.println("Introduce un numero para saber su mcm ");
        int numero1=scanner.nextInt();

        System.out.println("Introduce otro numero ");
        int numero2=scanner.nextInt();
        int resultado=numero1;
        int multiplicador=1;
        while (resultado%numero2!=0){
            multiplicador++;
            resultado=numero1*multiplicador;
        }
        System.out.println("El Mínimo Común Múltiplo de " + numero1 + " y " + numero2 + " es: " + resultado);
    }

    public static void ejercicio3(){
        int num1=(int)(Math.random()*100);
        int num2=(int)(Math.random()*100);
        while (num1!=0 && num2!=0){
            num1=(int)(Math.random()*100);
            num2=(int)(Math.random()*100);
            int maximos=Math.max(num1,num2);
            System.out.printf("Tu numero maximo entre %d y %d es: %d\n ",num1,num2,maximos);
        }

    }

    public static void ejercicio4(){
        int numero;
        do {
            System.out.println("Introduce un entero no negativo," +
                    " para convertirlo en binario,octal" +
                    " y hexadecimal");
            numero=scanner.nextInt();
            String binario=Integer.toBinaryString(numero);
            String octal=Integer.toOctalString(numero);
            String hexadecimal=Integer.toHexString(numero);
            System.out.println("Tu numero en binario es: "+binario);
            System.out.println("Tu numero en octal es: "+octal);
            System.out.println("Tu numero en hexadecimal es: "+hexadecimal.toUpperCase());
        }
        while (numero>1);


        //10 y en binario 1010
        // 10 / 2 = 5 resto 0.
        // 5 / 2 = 2 resto 1.
        // 2 / 2 = 1 resto 0.
        // para sacarlo dividmos entre 2 hasta que no se pueda mas
        // los restos son mis numeros binarios


    }

    public static void ejercicio5() {
        int numero=(int)(Math.random()*20);
        int intentos=1;
        System.out.println("Por favor introduce un numero que coincida con el aleatorio");
        int numeroUsuario=scanner.nextInt();
        while (numero!=numeroUsuario){
            intentos++;
            System.out.println("Lo siento, intentalo de nuevo:");
            numeroUsuario=scanner.nextInt();
        }
        System.out.printf("Enhorabuena, has acertado el número en %d intentos",intentos);

    }

    public static void ejercicio7(){

    }
}


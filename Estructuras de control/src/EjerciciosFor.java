import java.util.Scanner;

public class EjerciciosFor {

    public static void main(String[] args) {
        //ejercicio1();
        //ejercicio3();
        //ejercicio4();
        //ejercicio5();
        //ejercicio6();
        //ejercicio7();
        //ejercicio8();
        //ejercicio9();
        //ejercicio10();
        //ejercicio11();
        //ejercicio12();
        //ejercicio13();
        //ejercicio14();
        //ejercicio15();
        ejercicio16();
    }
    public static Scanner scanner=new Scanner(System.in);
    public static void ejercicio1(){
        System.out.println("Cuantas temperaturas quieres introducir: ");
        int nTemperaturas=scanner.nextInt();
        int temperatura=0;

        //acumulador
        int sumatorio=0;

        if (nTemperaturas<=0){
            nTemperaturas=10;
        }
        for (int i=0; i<nTemperaturas; i++){
            System.out.println("Introduce la temperatura: ");
            temperatura =scanner.nextInt();
            sumatorio += temperatura;
        }
        System.out.println("La media es "+(float)sumatorio/2);
    }

    public static void ejercicio3(){
        for (int i = 0; i < 11; i++) {
            System.out.println("Tabla de multiplicar del "+i);
            for (int j = 0; j < 11; j++){
                System.out.printf("%d * %d = %d\n",i,j,i*j);
            }
        }

    }

    public static void ejercicio4(){
        System.out.println("Dime cual es el numero inicial: ");
        int numeroInicial=scanner.nextInt();
        System.out.println("Dime cual es el numero final: ");
        int numeroFinal=scanner.nextInt();

        if (numeroInicial>=numeroFinal){
            System.out.println("No se puede proceder a la ejecución");
        }else {
            for (int i = numeroInicial; i < numeroFinal; i++) {
                System.out.println("Tabla de multiplicar del " + i);
                for (int j = 0; j < 11; j++) {
                    System.out.printf("%d * %d = %d\n", i, j, i * j);
                }
            }
        }
    }

    public static void ejercicio5(){
        System.out.println("Introduce un numero de 0 al 5, este será tu base: ");
        int base=scanner.nextInt();
        System.out.println("Introduce un numero de 0 al 5, este será tu exponente: ");
        int exponente=scanner.nextInt();
        int total=1;
        if (base == 0) {
            System.out.println("No se calculan potencias en base 0");
        } else if (exponente == 0) {
            System.out.println("El resultado de la potencia es 1");
        }else {
            for (int i = 0; i <exponente ; i++) {
                total*=base;
            }
            System.out.println(base+" ^ "+exponente+" = "+total);
        }
    }

    public static void ejercicio6(){
        //Mostrar todos los números pares comprendidos entre dos dados.
        int numeroTotal=13;
        int numero=1;
        System.out.println("Numero pares entre "+numero+" y "+numeroTotal+" : " );
        for (int i = numero; i < numeroTotal; i++) {
            if (i%2 ==0) {
                System.out.println("Tu numero es "+i +" y es par");
            }
        }
    }

    public static void ejercicio7(){
        //Simúlese el lanzamiento de un dado. Se introducirá el número de veces que se lanza el dado (de no ser positivo, se establecerá a 100).
        System.out.println("¿Cuantas veces quieres lanzar el dado?");
        int dado=scanner.nextInt();
        if (dado < 1) {
            dado=100;
            System.out.println("El numero introducido no era positivo por lo que tu numero ahora es "+dado);
        }
        for (int i = 1; i < dado+1; i++) {
            System.out.println("Es la "+i+" vez que lanzas el dado y tu num es: "+(int)(Math.random()*6+1));
        }
    }

    public static void ejercicio8() {
        //Pedir 10 números.
        int numeros=0;
        int acumulador = 0;
        for (int i = 1; i < 11; i++) {
            System.out.println("Introduce " + i + " numero:");
            numeros = scanner.nextInt();
            acumulador += numeros;
        }
        //Mostrar la media de los números positivos, la media de los números negativos y
        if (numeros < 0) {
            System.out.println("La media de los numeros negativos introducidos es " + acumulador / 2);
        } else {
            System.out.println("La media de los numeros positivos introducidos es " + acumulador / 2);
        }
        //La cantidad de ceros



    }

    public static void ejercicio9() {
        //Pedir 10 sueldos. Mostrar su suma, media
        int sumatorio=0;
        int sueldo=0;
        int contadorMayores=0;
        for (int i = 1; i < 11; i++) {
            System.out.println("Tu "+i+" sueldo es: ");
            sueldo=scanner.nextInt();
            sumatorio+=sueldo;
            if (sueldo > 1000) {
                contadorMayores++;
            }
        }
        System.out.println("La suma total de sueldos es de : "+sumatorio);
        System.out.println("La media total de sueldos es de : "+sumatorio/2);
        System.out.println("Sueldos mayores de 1000: "+contadorMayores);
        //cuantos hay mayores de 1000€.

    }

    public static void ejercicio10() {
        //Pedir 6 notas escribir la cantidad de alumnos aprobados, condicionados (=4) y suspensos.
        int aprobado = 0;
        int condicionado = 0;
        int suspenso = 0;
        for (int i = 1; i < 11; i++) {
            System.out.println("Tu nota " + i + " es: ");
            int notas = scanner.nextInt();
            if (notas > 4) {
                aprobado++;
            } else if (notas == 4) {
                condicionado++;
            } else {
                suspenso++;
            }

        }
        System.out.println("Aprobados "+aprobado);
        System.out.println("Condicionados "+condicionado);
        System.out.println("Suspensos "+suspenso);
    }

    public static void ejercicio11(){
        System.out.println("De que lado quieres el cuadrado");
        int lado = scanner.nextInt();
        for (int i = 0;i < lado; i++) {
            //System.out.println("\t+\t");
            for (int j = 0; j< lado; j++) {
                if (i==0 || i == lado - 1) {
                    System.out.println("\t+\t");
                }
                else if (j == 0 || j == lado - 1) {
                    System.out.println("\t+\t");
                }
                else
                    System.out.println("\t+\t");
            }
            System.out.println("");
        }
    }

    public static void ejercicio12(){
        String p1 = "Hola que tal";
        String p2 = "Hola que tal";
        boolean iguales = p1.equals(p2);
        boolean igualesCAP = p1.equalsIgnoreCase(p2);
        System.out.println(p1);
        boolean contienes = p1.contains("que");
        p1.length();
        p1.charAt(0);
        for (int i = 0; i < p1.length(); i++) {
        }
        System.out.println("El numero de letras es; "+p1.length());
    }

    public static void ejercicio13(){
        System.out.println("Introduzca una palabra");
        String palabra = scanner.next();
    for (int i = 0; i < palabra.length(); i++) {
        char letras = palabra.charAt(i);
    }
    }

    public static void ejercicio14(){
        System.out.println("Dime de que palabra quieres comprobar si es palindromo");
        // String palabra = scanner.next();
        String palabra = "Ejecúción";
        // NO SE TIENEN EN CUENTA MAYUSCULAS NI ACENTOS
        palabra = palabra.toLowerCase().replaceAll("ó", "o")
                .replaceAll("á", "a")
                .replaceAll("í", "i")
                .replaceAll("ú", "u")
                .replaceAll("é", "e");
        String palabraInversa = "";

       boolean palindromo = true;

        for (int i = 0; i < palabra.length()/2; i++) {
            if (palabra.charAt(i) != palabra.charAt(palabra.length()-1-i)){


                palindromo=false;
                break;
            }

        }
        if (palindromo){
            System.out.println("Tu palabra es palindromo");
        }else{
            System.out.println("Tu palabra no es palindromo");
        }
        //EJEMPLOS PALINDROMOS CORTO (USAR)
        //for (int i = 0; i <palabra.length()/2 ; i++) {
        //    palabra=palabra.charAt(i); }
    }

    public static void ejercicio15(){
        String frase = "Esta frase vale para poder aprender el for. Esta manera de trabajar me garantiza que encuente el" +
                "problema. Que todo el mundo este atento";
        //numero de letras
        int numeroLetras = frase.length();
        //numero de letras sin espacios ni puntos
        int numeroSinCosas = frase.replaceAll(" ","")
                                    .replaceAll(".","").length();
        //numero de palabras
        //numero de oraciones
        int numeroOraciones=0, numeroPalabras=0;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i)=='.'){
                numeroOraciones++;
            }
            else if (frase.charAt(i) == ' '){
                numeroPalabras++;
            }
        }
        System.out.println("El numero de frases "+numeroOraciones);
        System.out.println("El numero de palabras "+numeroPalabras);
        System.out.println("El numero de letras "+numeroLetras);
        System.out.println("El numero de letras sin cosas "+numeroSinCosas);
    }

    public static void ejercicio16(){
        System.out.println("Dime que numero quieres calcular el factorial");
        int numero = scanner.nextInt();
        int factorial = 1;
        if (numero<1){
            System.out.println("No puedo calcular su factorial");
        }else {
            for (int i = 0; i <=numero; i++) {
                factorial = factorial * i;
            }
            System.out.printf("EL factorial de %d es %d",numero,factorial);
        }
    }

}

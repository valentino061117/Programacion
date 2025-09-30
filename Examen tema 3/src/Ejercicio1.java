import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        /*
        1. Realiza una aplicación que permita, mediante un menú iterativo realizar
        operaciones matemáticas. Para ello, el flujo del programa será el siguiente:
        a. Usuario podrá introducir por consola los dos operandos
        b. En el caso de que ambos números sean positivos, se mostrará un
        menú ofreciendo las opciones de suma, resta, multiplicación y
        división
        c. En el caso de que alguno de los números sea negativo, aparecerá un
        mensaje avisando de que no se pueden realizar operaciones sobre
        números negativos*/
        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int resultadoSuma , resultadoResta , resultadoMultiplicacion , resultadoDivision ;
        int opciones ;
        while (true){
            System.out.println("Introduce dos numeros");
            num1 = scanner.nextInt();
            num2 = scanner.nextInt();
            if (num1 < 0 || num2< 0){
                System.out.println("No se pueden realizar operaciones sobre numeros negativos");
            }else {
                System.out.printf("1. Suma\n" +
                                    "2. Resta\n" +
                                    "3. Multiplicacion\n" +
                                    "4. Division\n" +
                                    "5. Salir\n");
                System.out.println("Que opcion quieres elegir?");
                opciones = scanner.nextInt();
                switch (opciones){
                    case 1-> {resultadoSuma = num1 + num2;
                        System.out.println("El resultado de la suma es "+resultadoSuma);}
                    case 2-> {resultadoResta = num1 - num2;
                        System.out.println("El resultado de la resta es "+resultadoResta);}
                    case 3-> {resultadoMultiplicacion = num1 * num2;
                        System.out.println("El resultado de la multiplicacion es "+resultadoMultiplicacion);}
                    case 4-> {resultadoDivision = num1 / num2;
                        System.out.println("El resultado de la division es "+(double)resultadoDivision);}
                    case 5-> {
                        System.out.println("Saliendo del programa.");
                        return;
                    }
                    default -> System.out.println("Opción no válida.");
                }
            }
        }
    }
}

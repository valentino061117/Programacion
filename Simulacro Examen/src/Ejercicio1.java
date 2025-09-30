import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        ejercicio1();
    }
        static Scanner scanner= new Scanner(System.in);
    public static void ejercicio1(){
    String nombre= scanner.nextLine();
    String apellido= scanner.nextLine();
    int edad= scanner.nextInt();
    float altura= scanner.nextFloat();
    float peso= scanner.nextFloat();
    char sexo= scanner.next().charAt(0);
    float imc = calculoIMC(peso,altura);
    System.out.printf("Hola %s tu IMC "+ "teniendo encuenta tu altura de %.2fm y " +
            "tu peso de %.2fkg, tiene un valor de %.2fm y\n",nombre,altura,peso,imc);
    }

    public static float calculoIMC(float peso, float altura){
        return (float) (peso / Math.pow(altura,2));
    }

}

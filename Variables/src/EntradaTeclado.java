import java.util.Scanner;

public class EntradaTeclado {

    static Scanner lectorTeclado = new Scanner(System.in);

    public static void main(String[] args) {
        /*
         String nombre; // null
         System.out.println("Por favor introduce tu nombre");
         el usuario introduzca el nombre por el teclado
         nombre = lectorTeclado.next();
         System.out.println("Mi nombre es "+nombre);
         Mi nombre es XXX(Borja) tengo XX(40) mido XXX(1.74) y tengo experiencia XXX(true)
        */
        String nombre;
        System.out.println("Introduzca su nombre");
        int edad = lectorTeclado.nextInt();
        System.out.println("Introduzca su edad");
        float estatura;
        boolean experiencia;
        System.out.println("Introduzca su altura");
        System.out.println("Tiene experiencia trabajando?");
        System.out.println("Mi nombre es %s y tengo %d años y mido %.2f cm y tengo experiencia %o",+nombre, +edad, +estatura, +experiencia);
    }
}

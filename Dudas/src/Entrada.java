import model.Sabores;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor introduce cuantos helados quieres");
        int cantidad=0;
        try {
            cantidad = scanner.nextInt();
            if (cantidad<=0){
                throw new ArithmeticException("Error en la cantidad introducida");
            }
        }catch (InputMismatchException e){
            System.out.println("Datos incorrectos");
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        finally {

        }
        //Sabores sabores1 = Sabores.Fresa;
        System.out.println("La cantidad seleccionada es "+cantidad);

    }
}

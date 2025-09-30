package vista;

import controller.Vehiculo;

import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
    Vehiculo vehiculo = new Vehiculo();
    Scanner scanner = new Scanner(System.in);

        do {
        System.out.println("Bienvenido al menu\n" +
                            "1. Agregar vehiculo para stock\n" +
                            "2. Buscar en stock\n" +
                "3. Vender vehículo\n" +
                "4. Reparar vehículo y agregarlo al stock\n" +
                "5. Ver resultado caja");

        int opcion = scanner.nextInt();

            switch (opcion){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
            }
        }while ();
    }
}

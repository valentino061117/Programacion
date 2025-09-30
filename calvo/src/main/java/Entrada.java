import dto.CocheDTO;
import model.Coche;

import java.util.Scanner;

public class Entrada {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        //Connection connection = DBConnection.getConnection();
        Coche coche = new Coche();
        CocheDTO cocheDTO = new CocheDTO();
        int opcion;
        do {
            System.out.println("1. Agregar coche");
            System.out.println("2. Borrar coche por id");
            System.out.println("3. Consultar el  coche por id");
            System.out.println("4. Listado de coches");
            System.out.println("5. Terminar el  programa");
            System.out.println("Elige una opcion");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Inserta el coche que qieres agregar; ");
                    System.out.println("ID");
                    int id = scanner.nextInt();
                    System.out.println("Marca");
                    String marca = scanner.next();
                    System.out.println("Modelo");
                    String modelo = scanner.next();
                    System.out.println("Color");
                    String color = scanner.next();
                    System.out.println("Matricula");
                    String matricula = scanner.next();
                    System.out.println("Precio");
                    int precio = scanner.nextInt();

                    cocheDTO.insertarCoche(new Coche(id,marca,modelo,color,matricula,precio));

                    break;
                case 2:
                    System.out.println("Que coche deseas borrar, pon su id; ");
                    int borrarId = scanner.nextInt();

                    cocheDTO.borrarCoche(borrarId);
                    break;
                case 3:
                    System.out.println("Introduce el id que quires ver; ");
                    int consultarId = scanner.nextInt();

                    Coche cocheConsultado = cocheDTO.consultarCochePorId(consultarId);
                    if (cocheConsultado != null){
                        cocheConsultado.mostrarDatos();
                    } else {
                        System.out.println("No se encontro nigun coche");
                    }
                    break;
                case 4:
                    cocheDTO.listarCoches();
                    break;
                case 5:
                    System.out.print("Saliendo...");
                    break;

            }
        } while (opcion != 5);
    }
}

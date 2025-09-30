import dto.ProductosDTO;
import model.Productos;

import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        ProductosDTO productosDTO = new ProductosDTO();
        Productos productos = new Productos();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("---MENU---");
            System.out.println("1. Importar productos de fichero");
            System.out.println("2. Crear producto");
            System.out.println("3. Leer informacion de producto");
            System.out.println("4. Actualizar informacion");
            System.out.println("5. Eliminar producto");
            System.out.println("6. Mostrar todos los productos");

            opcion = scanner.nextInt();
            switch (opcion){
                case 1:

                    break;
                case 2:
                    System.out.println("Introduzca el id");
                    int id = scanner.nextInt();
                    System.out.println("Introduzca el nombre");
                    String nombre = scanner.next();
                    System.out.println("Introduzca el precio");
                    double precio = scanner.nextDouble();
                    System.out.println("Introduzca la cantidad");
                    int cantidad = scanner.nextInt();

                    productosDTO.crearProductoDB();
                    break;
                case 3:
                    System.out.println("Introduzca el id del producto que desea leer");
                    id = scanner.nextInt();
                    productosDTO.leerProductoPorId(id);
                    break;
                case 4:
                    System.out.println("Introduzca el id del producto que desea acutalizar");
                    id = scanner.nextInt();
                    System.out.println("Introduzca el nombre");
                    nombre = scanner.next();
                    System.out.println("Introduzca el precio");
                    precio = scanner.nextDouble();
                    System.out.println("Introduzca la cantidad");
                    cantidad = scanner.nextInt();

                    productosDTO.actualizarInformacionProductoPorId(cantidad);
                    break;
                case 5:
                    System.out.println("Introduzca el id del producto que desea eliminar");
                    id = scanner.nextInt();

                    productosDTO.eleminarProductoPorId(id);
                    break;
                case 6:
                    productosDTO.leerBaseDatos();
                    break;
                case 7:
                    System.out.println("Saliendo...");
                    break;
            }
        }while(opcion!=7);
    }
}

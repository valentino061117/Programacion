import java.util.Scanner;

public class Ejercicio4 {
    /*4. Realizar una aplicación que gestione usuarios mediante array multidimensional
    donde se podrán guardar 10 elementos, donde los cuales constan de nombre
    (string), apellido (string), teléfono (int) y dni (string): La funcionalidad de la
    aplicación se guiará por un menú con las siguientes opciones:
    - Agregar persona: Pedirá los datos de nombre, apellido, teléfono y dni. Una vez
    pedidos agregará la persona en la lista. En el caso de no poder agregar más por
    estar la lista llena saltará un aviso.
    - Buscar persona: Pedirá un dni y sacará por pantalla todos los datos de la
    persona asociada con el formato Nombre: XXX, Apellido: XXX, Teléfono: XXX
    - Listar personas: Listará todos los elementos existentes en la lista con el
    formatoNombre: XXX, Apellido: XXX, Teléfono: XXX*/

    public static void main(String[] args) {
        String[][] usuarios = new String[10][4];
        int contador = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenú de opciones:");
            System.out.println("1. Agregar persona");
            System.out.println("2. Buscar persona por DNI");
            System.out.println("3. Listar todas las personas");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:

                    if (contador >= usuarios.length) {
                        System.out.println("No se pueden agregar más personas. Lista llena.");
                    } else {
                        System.out.println("Ingrese los datos del usuario:");
                        System.out.print("Nombre: ");
                        String nombre = scanner.nextLine();
                        System.out.print("Apellido: ");
                        String apellido = scanner.nextLine();
                        System.out.print("Teléfono: ");
                        String telefono = scanner.nextLine();
                        System.out.print("DNI: ");
                        String dni = scanner.nextLine();


                        usuarios[contador][0] = nombre;
                        usuarios[contador][1] = apellido;
                        usuarios[contador][2] = telefono;
                        usuarios[contador][3] = dni;
                        contador++;
                        System.out.println("Persona agregada con éxito.");
                    }
                    break;

                case 2:
                    System.out.print("Ingrese el DNI de la persona a buscar: ");
                    String dniBuscado = scanner.nextLine();
                    boolean encontrado = false;

                    for (int i = 0; i < contador; i++) {
                        if (usuarios[i][3].equals(dniBuscado)) {
                            System.out.println("Persona encontrada:");
                            System.out.println("Nombre: " + usuarios[i][0]);
                            System.out.println("Apellido: " + usuarios[i][1]);
                            System.out.println("Teléfono: " + usuarios[i][2]);
                            encontrado = true;
                            break;
                        }
                    }

                    if (!encontrado) {
                        System.out.println("No se encontró ninguna persona con el DNI proporcionado.");
                    }
                    break;

                case 3:
                    if (contador == 0) {
                        System.out.println("No hay personas registradas.");
                    } else {
                        System.out.println("Lista de personas registradas:");
                        for (int i = 0; i < contador; i++) {
                            System.out.println("Nombre: " + usuarios[i][0] + ", Apellido: " + usuarios[i][1] +
                                    ", Teléfono: " + usuarios[i][2] + ", DNI: " + usuarios[i][3]);
                        }
                    }
                    break;

                case 4:
                    System.out.println("Saliendo del programa...");
                    return;

                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        }
    }

}

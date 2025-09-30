import java.util.ArrayList;

public class Entrada {

    private static ArrayList<Integer> listaNumeros = new ArrayList();

    public static void main(String[] args) {
        System.out.println("Utilizando lista");
        System.out.println("El tamoño inicial de la lista es : "+listaNumeros.size());
        añadirNumero((int) (Math.random()+21));
        añadirNumero((int) (Math.random()+21));
        añadirNumero((int) (Math.random()+21));
        obtenerDatos();

    }

    public static void añadirNumero(int numero){
        listaNumeros.add(numero);
        System.out.println("Numero añadido correctamente");
        System.out.println("Lista actualizada con un size de "+listaNumeros.size());
    }

    public static void obtenerDatos(){
        System.out.println("El ultimo elemento del array es "+listaNumeros.get(listaNumeros.size() -1));
        for ( int item : listaNumeros){
            System.out.println(item);
        }
    }

}

public class Entrada {
    public static void main(String[] args) {
        OperacionesFicheros operacionesFicheros = new OperacionesFicheros();
        //operacionesFicheros.crearDirectorio("src/sources/Hugogay");
        //operacionesFicheros.crearFichero("src/sources/Hugogay/hugo_gay.txt");
        //operacionesFicheros.escribirFichero("src/sources/Hugogay/hugo_gay.txt");
        operacionesFicheros.leerFichero("src/sources/Hugogay/hugo_gay.txt");
    }
}

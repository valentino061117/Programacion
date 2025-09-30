public class EjerciciosMultidimensionales {
    public static void main(String[] args) {
        //definir array con filas 5 y columnas aleatorias entre 2-6
        int filas = (int)((Math.random()*4)+2);
        int [][] numeros= new int[5][filas];

        // rellenar el array (entero) con aleatorios
        for (int i = 0; i <numeros.length ; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                numeros[i][j] = (int) (Math.random() * 10);
                System.out.print(numeros[i][j] + "\t");
            }
            System.out.println();
        }
        imprimirArray(numeros);
        posicionMenos(numeros);
    }

    //Modificar e imprimir el array 8 veces, donde
    //cada vez el usuario indica cuantas unidades se quitan

    public static void imprimirArray(int[][] array){
        for (int[] row : array) {
            for (int element : row) {
                System.out.print(element+"\t");
            }
            System.out.println();
        }
    }

    public static void posicionMenos(int[][] array){
        for (int[] row : array) {
            for (int element : row) {
                System.out.print(element-1+"\t");
            }
            System.out.println();
        }
    }

}

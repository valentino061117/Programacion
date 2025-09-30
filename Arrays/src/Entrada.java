public class Entrada {
    public static void main(String[] args) {
        int [] numeros = new int[4];
        //0 0 0 0
        // Cuantas posiciones tienes
        System.out.println(numeros.length);
        //0 0 0 7
        numeros[3] = 7;
        System.out.println("numero en la ultima posiciones"+numeros[numeros.length-1]);

        String[] palabras = {"Hola","Que","tal","Estas"};
        System.out.println("La palabra en la ultima posicion es "+palabras[palabras.length-1]);

       /* for (int i = 0; i < palabras.length; i++) {
            System.out.println(palabras[i]);
        }

        for (int i = 0; i < palabras.length; i++) {
            numeros[i] = (int) (Math.random() +101);
        }

        for (int i = 0; i < numeros.length; i++) {
            if (i%2==0){
                System.out.println(numeros[i]);
            }
        }*/
        for (int item :numeros){
            if (item % 2 ==0){
                System.out.println(item);
            }
            if (item==50){

            }
        }
    }
}

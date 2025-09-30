import java.util.Scanner;

public class EjerciciosArrayMultidimensionales {
    public static void main(String[] args) {
        //ejercicio1();
        //ejercicio2();
        //ejercicio3();
        //ejercicio4();
        ejercicio5();
    }
    static Scanner scanner=new Scanner(System.in);
    public static void ejercicio1(){
        /*1. MultiplicarArray
         Crear un array de 5 posiciones:
        - se le pedirá al usuario que introduzca cada unos de los elementos del array
        - Multiplica cada elemento del array * 2 y vuelve a guardar su valor
        - Saca por consola la suma de todos los números
        - Saca la media de todos los elementos
        */
        int [] numeros= new int [5];
        int numeroMultiplicados=0, numeroSumados=0;
        for (int i = 0; i < numeros.length ; i++) {
            System.out.println("Introduce numero");
            numeros[i]=scanner.nextInt();
        }

        for (int i = 0; i < numeros.length ; i++) {
            numeros[i]*=2;
            numeroSumados+=numeros[i];
        }

        System.out.println("Los numeros obtenidos son: ");
        for(int item: numeros){
            System.out.println(item);
        }

        System.out.println("La suma de todos es "+numeroSumados);
        double media= (double)numeroSumados/numeros.length;
        System.out.println("La media es "+media);
    }
    public static void ejercicio2(){
        /*2. (MayorArray)
        Crea una aplicación que realice lo siguiente:
        - pida por pantalla la longitud del array de enteros
        - crea el array de enteros con la longitud introducida
        - pida al usuario que introduzca todos los datos del array
        - saque por pantalla el elemento mayor y el elemento menor
        */
        System.out.println("Introduce la longitud de tu Array");
        int cantidadArray=scanner.nextInt();
        int [] numeros=new int[cantidadArray];

        for (int i = 0; i < numeros.length ; i++) {
            System.out.println("Introduce los valores de tu Array");
            numeros[i]=scanner.nextInt();
        }
        //OPCION FACIL PARA ARRAYS MAYORES O MENORES
        /*
        Arrays.sort(numeros);
        System.out.println("El numero mas pequeño es "+numeros[0]);
        System.out.println("El numero mas grande es "+numeros[numeros.length-1]);
        */
        //OPCION DIFICIL (ACTUAL)
        int mayor=numeros[0];
        int menor=numeros[0];
        for (int item: numeros){
            if (item < menor) {
                menor = item;
            }
            if (item > mayor) {
                mayor = item;
            }
        }
    }
    public static void ejercicio3(){
        /*3. (SumaArrays)
        Crear una aplicación que:
        - pida la longitud de dos arrays de enteros
        - crea los array de enteros con las longitudes introducidas
        - rellena ambos arrays con números aleatorios
        - crea un tercer array de la misma longitud que los dos anteriores
        - rellena el tercer array con la suma de las posiciones (Array1.posicion1 + array2.posicion = array3.posicion)
        */
        System.out.println("Introduce la cantidad de tus 2 Arrays");
        int cantidadArray1=scanner.nextInt();

        int [] numeros1=new int[cantidadArray1];
        int [] numeros2=new int[numeros1.length];
        for (int i = 0; i < numeros1.length; i++) {
            numeros1[i]=(int)(Math.random()*11);
            numeros2[i]=(int)(Math.random()*11);
        }
        int [] numeros3=new int[numeros1.length];
        for (int i = 0; i <numeros3.length ; i++) {

        }
    }
    public static void ejercicio4(){
        /*4. (PosicionesArray)
        Crea una aplicación que:
        - pida por teclado la longitud de un array
        - cree el array de enteros de la longitud introducida
        - pida al usuario que introduzca todos los datos del array
         */
        System.out.println("Introduce la longitud de tu Array");
        int longitudArray=scanner.nextInt();

        int [] numeros=new int[longitudArray];
        for (int i = 0; i <numeros.length ; i++) {
            System.out.println("Introduce los valores de tu Array");
            numeros[i]=scanner.nextInt();
        }
        // ARRAY ORIGINAL
        for (int item:numeros){
            System.out.println("Array original: "+item);
        }
        /*
          - mueva una posición todos los elementos.
          el elemento de la posición 0 pasa a la posición 1 y así sucesivamente.
            El elemento que está en la última posición pasa a la primera
         */
        int moverDerecha=numeros[numeros.length-1]; // Guardamos el ultimo elemento
        for (int i = numeros.length-1; i >0 ; i--) {
            numeros[i]=numeros[i-1];
        }
        // COLOCAMOS EL UlTIMO ELEMENTO EN LA 1ª posicion
        numeros[0]=moverDerecha;
        for (int item:numeros){
            System.out.println("Despues de mover a la derecha "+item);
        }
        /*- realizar la tarea anterior pero al contrario.
            El elemento que está en la primera posición pasa a la última y así sucesivamente
         */
        int moverIzquierda= numeros[0];
        for (int i = 0; i < numeros.length -1; i++) {
            numeros[i] =numeros[i+1];
        }
        numeros[numeros.length-1]=moverIzquierda;
        for (int item:numeros){
            System.out.println("Despues de mover a la izquierda "+item);
        }
    }
    public static void ejercicio5() {
        /*5. (OperacionesArray) Crear un array con 10 posiciones y
            asígnale números enteros entre 0 y 9,
            ambos inclusive (de forma automática). Se mostrarán los datos separados
            por una coma y un espacio. Una vez hecho esto se modificará el array del
            de la manera indicada en cada apartado, y se mostrará de nuevo.

        */
        int[] numero = new int[10];
        for (int i = 0; i < numero.length; i++) {
            numero[i] = (int) (Math.random() * 10);
        }
        for (int item : numero) {
            System.out.print(item + ", ");
        }
        System.out.println();
        /* - Incrementar en 1 los valores pares y en -1 los impares.*/
        for (int i = 0; i < numero.length; i++) {
            if (numero[i] % 2 == 0) {
                numero[i]++;
            } else {
                numero[i]--;
            }
        }
        for (int item : numero) {
            System.out.print(item + ", ");
        }
        System.out.println();
        /*- Duplicar los valores positivos menores que 5*/
        for (int i = 0; i < numero.length; i++) {
            if (numero[i] < 5 && numero[i] > 0) {
                numero[i] *= 2;
            }
        }
        for (int item : numero) {
            System.out.print(item + ", ");
        }
        System.out.println();
        /*- Sumar a cada valor un valor entero aleatorio entre -5 y 5.*/
        for (int i = 0; i < numero.length; i++) {
            numero[i] = (int) (Math.random() * 5) - 5;
        }
        for (int item : numero) {
            System.out.print(item + ", ");
        }
        System.out.println();
        /*- Mover los datos una posición hacia la derecha (el primero pasa al segundo, el
                segundo al tercero, ..., y el último al primero).*/
        int moverDerecha = numero[numero.length - 1];
        for (int i = numero.length - 1; i > 0; i--) {
            numero[i] = numero[i - 1];
        }
        numero[0] = moverDerecha;
        for (int item : numero) {
            System.out.println("Despues de mover a la derecha " + item);
        }
        /*- Intercambiar el primero con el segundo, el tercero con el cuarto, ..., el penúltimo con el último.*/
        for (int i = 0; i < numero.length - 1; i += 2) {
            int temp2 = numero[i];
            numero[i] = numero[i + 1];
            numero[i + 1] = temp2;
        }
        for (int item : numero) {
            System.out.println("Despues del intercambio " + item);
        }
        /* - Invertir el array*/
        for (int i = 0; i < numero.length / 2; i++) {
            int temp3 = numero[i];
            numero[i] = numero[numero.length - 1 - i];
            numero[numero.length - 1 - i] = temp3;
        }
        for (int item : numero) {
            System.out.println("Invertido " + item);
        }
        /*- Mostrar la posición del primer par y del último impar.*/
    }

}

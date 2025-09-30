import java.util.Scanner;

public class Ejercicios {
    static Scanner lectorTeclado = new Scanner(System.in);

    public static void main(String[] args) {
        // ejercicio1();
        // ejercicio2();
        // ejercicio3();
        // ejercicio4();
        // ejercicio5();
        // ejercicio6();
        //ejercicio7();
        //ejercicio8();
        //ejercicio9();
        //ejercicio10();
        //ejercicio11();
        //ejercicio12();
        //ejercicio13();
        //ejercicio14();
        ejercicio15();
    }
    public static void ejercicio1(){

        final String NOMBRE = "Borja Martin Herrera";
        final String DIRECCION = "C/Estocolmo 1";
        final int PORTAL = 1;
        final int PISO = 1;
        final char LETRA = 'A';
        final int CODIGO = 28942;
        final String POBLACION = "Alcorcon";
        final String PROVINCIA = "Madrid";
        final String PAIS = "España";

        System.out.println(NOMBRE);
        System.out.printf("%s \tnº%d\t\t %d%c\n",DIRECCION,PORTAL,PISO,LETRA);
        System.out.printf("%d,\t\t\t%s %s\n",CODIGO, POBLACION, PROVINCIA);
        System.out.println(PAIS);

    }
    public static void ejercicio2(){
        System.out.println("Por favor introduce tu nombre completo");
        String nombre = lectorTeclado.nextLine();
        System.out.println("Por favor introduce tu edad");
        int edad = lectorTeclado.nextInt();
        System.out.println("Te llamas "+nombre);
        System.out.printf("Tienes %d años\n",edad);
    }
    public static void ejercicio3(){
        System.out.println("Por favor introduce el primer operando");
        int operando1 = lectorTeclado.nextInt();
        System.out.println("Por favor introduce el segundo operando");
        int operando2 = lectorTeclado.nextInt();
        int suma = operando1+operando2;
        int resta = operando1-operando2;
        int multi = operando1*operando2;
        int divInt = operando1/operando2;
        float divReal = (float) operando1/operando2;
        int modul = operando1%operando2;
        float modulReal = (float)operando1%operando2;

        System.out.printf("El resultado de sumar %d y %d es %d\n",operando1,operando2,suma);
        System.out.printf("El resultado de resta %d y %d es %d\n",operando1,operando2,resta);
        System.out.printf("El resultado de multi %d y %d es %d\n",operando1,operando2,multi);
        System.out.printf("El resultado de divInt %d y %d es %d\n",operando1,operando2,divInt);
        System.out.printf("El resultado de divReal %d y %d es %f\n",operando1,operando2,divReal);
        System.out.printf("El resultado de mod %d y %d es %d\n",operando1,operando2,modul);
        System.out.printf("El resultado de modReal %d y %d es %f\n",operando1,operando2,modulReal);

    }
    public static void ejercicio4(){
        System.out.println("Por favor dime cuantos bocatas quieres");
        int nBocadillos = lectorTeclado.nextInt();
        System.out.println("Por favor dime cuantas bebidas quieres");
        int nBebidas = lectorTeclado.nextInt();
        System.out.println("Cuanto vas a pagar por los bocatas");
        float precioBocata = lectorTeclado.nextFloat();
        System.out.println("Cuanto vas a pagar por los bebidas");
        float precioBebidas = lectorTeclado.nextFloat();
        float total = (nBocadillos*precioBocata)+(nBebidas*precioBebidas);
        System.out.println("Coste total "+total);
    }
    public static void ejercicio5(){
        // resuelvo el ejercicio1
        Scanner lectorTeclado = new Scanner(System.in);
        System.out.println("Por favor dime cuantos segundos quieres pasar");
        int segundosTotales = lectorTeclado.nextInt();
        int horas = segundosTotales/3600;
        segundosTotales = segundosTotales%3600;
        int minutos = segundosTotales/60;
        //System.out.println("segundo restantes: "+segundosTotales);
        segundosTotales = segundosTotales%60;
        System.out.println("horas: "+horas);
        System.out.println("minutos: "+minutos);
        System.out.println("segundos: "+segundosTotales);

    }
    public static void ejercicio6(){
        System.out.println("Cuanto te ha costado el articulo");
        float precioArticulo = lectorTeclado.nextFloat();
        System.out.println("Cuanto IVA has pagado");
        int iva = lectorTeclado.nextInt();
        // 400 -> 400 - (400*21%)
        float ivaPagado = precioArticulo * ((float) iva/100);
        float precioNeto = precioArticulo - ivaPagado;
        System.out.println("IVA: "+ivaPagado);
        System.out.println("Producto sin IVA: "+precioNeto);
    }
    public static void ejercicio7(){
        System.out.println("Escribe un radio entero: ");
        int radio = lectorTeclado.nextInt();
        //double longitud = valor * (Math.PI * 2);
        double longitud = 2 * Math.PI * radio;
        System.out.println("Longitud de la circunferencia: "+longitud);
        //double area = Math.PI * valor * 2;
        double area = Math.PI * Math.pow(radio, 2);
        System.out.println("Area de circulo: "+area);
    }
    public static void ejercicio8(){
        System.out.println("Escribe los grados centígrados");
        float centigrados = lectorTeclado.nextFloat();
        float fara= ((9*centigrados)/5)+32;
        float kelvin= centigrados + 273.15F;
        System.out.printf("Farenheit: %.2f Kelvin: %.2f\n",fara,kelvin);
        System.out.println("Escribe los grados Kelvin");
        kelvin = lectorTeclado.nextFloat();
        centigrados = kelvin - 273.15F;
        fara = ((9*centigrados)/5)+32;
        System.out.printf("Centigrados: %.2f Faranheit: %.2f",centigrados,fara);
    }
    public static void ejercicio9(){
        System.out.println("Numero de bebidas (entre 0 y 20)");
        int bebida= lectorTeclado.nextInt();
        System.out.println("Numero de bocadillo (entre 0 y 20)");
        int bocadillo= lectorTeclado.nextInt();
        System.out.println("Precio de bebidas (entre 0,00 y 3,00)");
        float costeBebida= lectorTeclado.nextFloat();
        System.out.println("Precio de bocadillos (entre 0,00 y 3,00)");
        float costeBocadillos= lectorTeclado.nextFloat();
        System.out.println("Numero de alumnos (entre 1 y 10)");
        int alumnos= lectorTeclado.nextInt();
        float totalBebidas= bebida*costeBebida;
        float totalBocadillos= bocadillo*costeBocadillos;
        float total=totalBocadillos + totalBebidas;
        System.out.printf("ARTICULO\t CANTIDAD\t PRECIO\t\t COSTE\n " +
                        "=========\t =========\t =======\t ========\n" +
                        "Bebida\t\t\t\t %d\t %.2f\t\t %.2f\n" +
                        "Bocadillo\t\t\t %d\t %.2f\t\t %.2f\n" +
                        "TOTAL\t\t\t\t\t\t\t\t %.2f"
                ,bebida,costeBebida,totalBebidas,bocadillo,costeBocadillos,totalBocadillos,
                total);

    }
    public static void ejercicio10(){
        System.out.println("Decenas de mil:");
        int decenasMil= lectorTeclado.nextInt();
        System.out.println("Unidades de mil:");
        int unidadesMil= lectorTeclado.nextInt();
        System.out.println("Centenas:");
        int centenas= lectorTeclado.nextInt();
        System.out.println("Decenas:");
        int decenas= lectorTeclado.nextInt();
        System.out.println("Unidades:");
        int unidades= lectorTeclado.nextInt();
        System.out.printf("Numero introducido:%d%d%d%d%d",decenasMil,unidadesMil,centenas,decenas,unidades);
    }
    public static void ejercicio11(){
        System.out.println("Escribe un entero entre 0 y 100:");
        int numero= lectorTeclado.nextInt();
        int p=numero%2;
        boolean par= p == 0;
        System.out.println("Es par: "+par);
        boolean mayor=numero>50;
        System.out.println("Mayor que 50: "+mayor);
    }
    public static void ejercicio12(){
        System.out.println("Escribe una palabra: ");
        String palabraUno=lectorTeclado.next();
        System.out.println("Escribe una palabra: ");
        String palabraDos=lectorTeclado.next();

        boolean comparador= palabraUno.equalsIgnoreCase(palabraDos);
        System.out.println("Son iguales: "+comparador);

        comparador= !palabraUno.equalsIgnoreCase(palabraDos);
        System.out.println("Son distintas: "+comparador);

        int numeroP1=palabraUno.length();
        int numeroP2=palabraDos.length();
        boolean menor= numeroP1<numeroP2;
        System.out.println("Es menor la primera palabra que la segunda: "+menor);

    }
    public static void ejercicio13(){
        System.out.println("Escribe un número entre 0 y 9: ");
        int numeroUno=lectorTeclado.nextInt();
        System.out.println("Escribe un número entre 0 y 9: ");
        int numeroDos=lectorTeclado.nextInt();
        boolean comparar1= (numeroUno%2)==0 && (numeroDos%2)==1;
        System.out.println("El primero es par y el segundo impar: "+comparar1);
        boolean comparar2= numeroUno>(numeroDos*2) && numeroUno<8;
        System.out.println("El primero es superior al doble del segundo e inferior a 8: "+comparar2);
        boolean comparar3=(numeroUno-numeroDos)<2;
        System.out.println("Son iguales o la diferencia entre el primero y el segundo es inferior a 2: "+comparar3);
    }
    public static void ejercicio14(){
        System.out.println("Edad: ");
        short edad=lectorTeclado.nextShort();
        System.out.println("Nivel de estudios: ");
        short estudios=lectorTeclado.nextShort();
        System.out.println("Ingresos: ");
        short ingresos=lectorTeclado.nextShort();
        boolean comparar= edad>40 && estudios>=5 && estudios<=8 && ingresos<15000;
        System.out.println("Más de "+edad+" y estudios entre 5 y 8 y gana menos de "
                +ingresos+" :"+comparar);
    }
    public static void ejercicio15(){
        System.out.println("Entero: ");
        int numero=lectorTeclado.nextInt();
        numero +=5;
        System.out.println("Incrementar en 5 unidades: "+numero);
        numero -=3;
        System.out.println("Decrementar en 3 unidades: "+numero);
        numero *=10;
        System.out.println("Multiplica por 10: "+numero);
        numero /=2;
        System.out.println("Dividir en 2 unidades: "+numero);
    }

}

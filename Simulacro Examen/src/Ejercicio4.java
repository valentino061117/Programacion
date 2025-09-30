public class Ejercicio4 {
    public static void main(String[] args) {
        ejercicio4();
    }

    public static void ejercicio4(){
        final int precio = 30000;
        final float plazos = 3.5f;
        float interes = 3.5f;
        float resultado = precio * 0.035f;
        System.out.printf("El interés pagado %.2f en el primer mes es de %.2f\n ",interes,resultado);
        interes = 3.5f * 2;
        resultado = (25000*interes)/100;
        System.out.printf("El interés pagado %.2f en el primer mes es de %.2f\n ",interes,resultado);
        interes += 3.5f;
        resultado = (20000*interes)/100;
        System.out.printf("El interés pagado %.2f en el primer mes es de %.2f\n ",interes,resultado);
        interes += 3.5f;
        resultado = (15000*interes)/100;
        System.out.printf("El interés pagado %.2f en el primer mes es de %.2f\n ",interes,resultado);
        interes += 3.5f;
        resultado = (10000*interes)/100;
        System.out.printf("El interés pagado %.2f en el primer mes es de %.2f\n ",interes,resultado);
        interes += 3.5f;
        resultado = (5000*interes)/100;
        System.out.printf("El interés pagado %.2f en el primer mes es de %.2f\n ",interes,resultado);
    }
}

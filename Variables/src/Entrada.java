public class Entrada {

    static int edadClase = 50;

    // mod_acc mod_adional mod_ret nombre (argumetos) { cuerpo }

    public static void main (String [] args){

            System.out.println("Proyecto de variables");

            // Tipo nombre = valor (el valor es opcional)
            String nombre = "Borja";
            final String CIF = "B12345";

            char letra = 'A';

            short numeroPequenio = 23; // numero pequeño (-255,255)
            int edad = 40; // numeros sin decimal (-65.435, 65.435)
            System.out.println("Mi edad es "+edad);
            edad = 41;
            System.out.println("Cambiando edad");
            System.out.println("Mi edad es "+edad);
            long telefono = 123456789;
            Long telefonoComplejo = 123123123L;

            float altura = 3.14f;
            Float alturaCompleja= 4.123123123F;

            double decimalesDetallados = 3.141516234;
            Double decimalesComplejo;

            boolean carnet = true; // false
            Boolean carnetComplejo;

    }

    public static void miMetodo(){
        String nombre = "Julia";
        int edad = 40;
        edadClase=80;
    }

    public static void otroMetodo(){
    edadClase =90;
    }
}



public class Entrada {
    public static void main(String[] args) {
        int nota = -6;
        // if -> nota correcta
        String mensaje = null;
        if (nota >=0 && nota<=10){
            mensaje = "nota perfecta";
            //decido que tipo de nota es
            //ss-> 0-4.99
            //ap -> 5-6.99
            //nt -> 7-8.99
            //sb -> 9-9.99
            //mt -> 10
            System.out.println("La nota es perfecta");
        }
        else {
            System.out.println("La nota no es correcta");
        }
        System.out.println("Terminando ejecucion");
    }
}

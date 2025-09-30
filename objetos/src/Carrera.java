import model.Coche;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Carrera {
    public static void main(String[] args) {
        ArrayList<Coche> listaCoches = new ArrayList<>();
        ArrayList<Coche> participantes = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        /*listaCoches.add(new model.Coche("Ford","Focus","Plata"));
        listaCoches.add(new model.Coche("Seat","Ibiza","Blanco"));
        listaCoches.add(new model.Coche("Mercedes","AMG",300));*/

        /*
        Un coche tiene un atributo KM,
        los cuales pueden decir la distancia que ha recorrido un coche
        Para poder hacer una carrera, es necesario que se pida por consola
        los datos de 6 participantes, donde se debe indicar marca, modelo,
        matricula, cv.
        Una vez indicados todos los participantes, es necesario indicar cuantas
        vueltas consta la carrera
        Una vez indica el nº de vueltas, la carrera comienza. Para ello en cada vuelta
        cada coche recorre un numero de km aleatorio (50-75)
        Una vez se terminan las vueltas el sistema mostrara:

        El ganado es el coche XXXX XXXX XXXXX
        La clasificacion final es:
        1- XXXX XXXX XXXX XX
        2- XXXX XXXX XXXX XX
         */

        for (int i = 0; i <6 ; i++) {
            System.out.println("Introduce tu "+(i+1)+" participante" );
            System.out.println("Indica la marca de tu coche: " );
            String marca= scanner.next();
            System.out.println("Indica el modelo de tu coche: " );
            String modelo= scanner.next();
            System.out.println("Indica la matricula de tu coche: " );
            String matricula= scanner.next();
            System.out.println("Indica el cv de tu coche: " );
            int cv= scanner.nextInt();
            Coche coche = new Coche(marca,modelo,matricula,cv);
            participantes.add(coche);
        }
        System.out.println("¿Cuantas vueltas quieres dar? ");
        int vueltas= scanner.nextInt();
        for (int i = 0; i <vueltas ; i++) {
            for (Coche coche : participantes) {
                int kmAletorio = (int) ((Math.random() * 26) + 50);
                coche.Setkm(kmAletorio);
            }
        }


        // Determinar ganador y clasificación final
        participantes.sort(new Comparator<Coche>() {
            @Override
            public int compare(Coche o1, Coche o2) {
                if (o1.getKm() > o2.getKm()) {
                    return -1;
                }else if (o1.getKm() < o2.getKm()) {
                    return 1;
                }
                return 0;
            }
        });
        // Mostrar resultados
        System.out.println("El ganador es: " + participantes.get(0).getMarca() + " " + participantes.get(0).getModelo() + " con " + participantes.get(0).getKm() + " km.");

        System.out.println("\nClasificación final:");
        for (Coche coche : participantes) {
            System.out.printf(" Matricula %s Modelo %s km %d\n",  coche.getMatricula(),coche.getMarca(),coche.getKm());
        }
    }
}
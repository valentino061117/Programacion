package model;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.function.Predicate;

public class Carrera {
    private int vueltas;
    private String nombre;
    private Coche ganador;
    private ArrayList<Coche> participantes;
    private Scanner scanner = new Scanner(System.in);


    public Carrera(int vueltas,String nombre){
        this.nombre =nombre;
        this.vueltas =vueltas;
        participantes = new ArrayList<>();
    }
    public Carrera(){
        this.nombre="Sin definir";
    }

    private Coche buscarCoche(String matricula){
        for (Coche item : participantes)
            if (item.getMatricula().equalsIgnoreCase(matricula)) {
                return item;
            }
        return null;
    }

    private void ordenarParticipantes(){
        participantes.sort(new Comparator<Coche>() {
            @Override
            public int compare(Coche o1, Coche o2) {
                if (o1.getKm()> o2.getKm()) {
                    return -1;
                }else if(o1.getKm()<o2.getKm()){
                    return 1;
                }else{
                    return 0;
                }
            }
        });
    }
    public void mostrarClasificacion(){
        // la lista debe estar ordenada
        if (participantes.isEmpty() ) {
            System.out.println("No se ha escrito nadie");
        }else{
            ordenarParticipantes();
            int posicion=1;
            for (Coche item: participantes){
                System.out.printf("%d -%s %s %s km : %d\n ",
                        posicion,item.getMarca(),item.getModelo(),item.getMatricula(),item.getKm());
                posicion++;
            }}
    }
    public void empezarCarrera(){
        // vueltas y que tenga 8 partipicantes como maximo
        if (participantes.size() == 8 && vueltas>0) {
            for (int i = 0; i <vueltas ; i++) {
                for (Coche coche: participantes){
                    int aleatorio= (int)(Math.random()*26)+50;
                    coche.Setkm(aleatorio);
                }
                System.out.println("Clasificiacion en la vuelta "+(i+1));
                mostrarClasificacion();
                // para el programa durante X segundos
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
    public void mostrarGanador(){
        // ordernar lista
        ordenarParticipantes();
        System.out.println("El ganador es: "+participantes.getFirst().getMatricula());
    }

    public void descalificarParticipante (String matricula){
        /*if (buscarCoche(matricula) != null) {
            // esta en la lista por lo que eliminamos
            participantes.remove(buscarCoche(matricula));
            System.out.println("Coche borrado");
        }else {
            System.out.println("No esta partcipante");
        }*/
        if(participantes.removeIf(new Predicate<Coche>() {
            @Override
            public boolean test(Coche coche) {
                /*if (coche.getMatricula().equalsIgnoreCase(matricula)) {
                    return true;
                }
                return false;}
                */
                return coche.getMatricula().equalsIgnoreCase(matricula);
            }
        })){
            System.out.println("Borrado correctamente");
        }else{
            System.out.println("No esta en la lista");

        }
    }

    public void inscribirParticipante(Coche coche){
        if (participantes.size()== 8 ||
                coche.getCv()>=300 ||
                buscarCoche(coche.getMatricula())!=null)
        //falta el porque no puedo añadirlo si tiene misma matricula
        {
            System.out.println("Lo siento no puedes inscribir");
        }else {
            participantes.add(coche);
        }
    }


    public int getVueltas() {
        return vueltas;
    }

    public void setVueltas(int vueltas) {
        this.vueltas = vueltas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Coche getGanador() {
        return ganador;
    }

    public void setGanador(Coche ganador) {
        this.ganador = ganador;
    }

}

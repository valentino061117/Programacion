package garaje_hash;

import java.util.ArrayList;

public class Garaje {
    //LOGICA (como se controla la app)
    private ArrayList<Object[]> listaCoches = new ArrayList<>();

    public void anadirCoche(String marca, String modelo, int cv, String matricula){
        Object[] coche =new Object[]{marca,modelo,cv,matricula};
        listaCoches.add(coche);
    }
    public void mostrarCoches(){
        for (Object[] coche : listaCoches) {
            System.out.println(coche[3] + " - " + coche[0] + " - " + coche[1]); //Las posiciones del Object son 3 Matricula,0 marca, 1 modelo
        }
    }
}

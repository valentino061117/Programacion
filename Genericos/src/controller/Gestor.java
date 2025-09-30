package controller;

import modelo.Coche;
import modelo.Gestionable;

import java.util.ArrayList;

public class Gestor<S,G,Y> {

    private ArrayList<S> listado;

    public void anadirElemento(S dato){
        this.listado.add(dato);
    }

}

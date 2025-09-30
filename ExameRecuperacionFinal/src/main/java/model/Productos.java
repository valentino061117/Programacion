package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor

public class Productos {
    private int id;
    private String nombre;
    private double precio;
    private int cantidad;

    public void mostrarDatos(){
        System.out.println("id = " + id);
        System.out.println("nombre = " + nombre);
        System.out.println("precio = " + precio);
        System.out.println("cantidad = " + cantidad);
    }
}

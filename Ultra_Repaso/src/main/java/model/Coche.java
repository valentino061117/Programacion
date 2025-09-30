package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Coche {

    private int id,precio;
    private String marca,modelo,color,matricula;

    public void mostrarDatos(){
        System.out.println("id = " + id);
        System.out.println("precio = " + precio);
        System.out.println("marca = " + marca);
        System.out.println("modelo = " + modelo);
        System.out.println("color = " + color);
        System.out.println("matricula = " + matricula);
    }

}

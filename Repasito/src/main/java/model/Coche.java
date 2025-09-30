package model;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Coche {

    private int id;
    private String marca, modelo, color,matricula;
    private  int precio;

    public void mostrarDatos(){
        System.out.println("id = " + id);
        System.out.println("marca = " + marca);
        System.out.println("modelo = " + modelo);
        System.out.println("color = " + color);
        System.out.println("matricula = " + matricula);
        System.out.println("precio = " + precio);
    }
}


package model;

import lombok.*;

import java.io.Serializable;
@Getter
@AllArgsConstructor
@Setter
@NoArgsConstructor
public abstract class Profesores  implements Serializable {
    private String nombre,dni;
    private double salarioBase;

    public abstract double calcularSalarioTotal();

    @Override
    public String toString(){
        return "Nombre:"+nombre+"Dni"+dni+"Salrio base" +salarioBase;
    }
}

package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor

public abstract class Profesor {
    private String nombre,dni;
    private double salarioBase;

    public abstract double calcularSalarioTotal();

    @Override
    public String toString(){
        return nombre+" "+dni+" "+salarioBase+" ";
    }
}

package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter

public abstract class Profesor implements Serializable {
    private String nombre;
    private String dni;
    private  double salarioBase;

    public abstract double calcularSalarioTotal();

    @Override
    public String toString(){
        return nombre+" "+dni+" "+salarioBase+" ";
    }
}

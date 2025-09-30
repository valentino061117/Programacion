package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class ProfesorInterno extends Profesor {
    private double complementoMensual;

    public  ProfesorInterno(String nombre, String dni, double salarioBase, double complementoMensual){
        super(nombre,dni,salarioBase);
        this.complementoMensual = complementoMensual;
    }

    @Override
    public double calcularSalarioTotal(){
        return getSalarioBase() +(complementoMensual*12);
    }

}

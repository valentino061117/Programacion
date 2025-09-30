package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Getter
@NoArgsConstructor
@Setter

public class ProfesorInterno extends Profesor{

    private double complementoMensual;

    public ProfesorInterno(String nombre,String dni,double salarioBase,double complementoMensual){
        super(nombre,dni,salarioBase);
        this.complementoMensual = complementoMensual;
    }

    @Override
    public double calcularSalarioTotal() {
        return 0;
    }
}

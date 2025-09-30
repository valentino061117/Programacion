package model;

import lombok.*;

@Getter
@NoArgsConstructor
@Setter
@AllArgsConstructor

public class ProfesoresInterno extends Profesores{

    private double complementoFijo;

    public ProfesoresInterno(String nombre, String dni, double salarioBase, double complementoFijo) {
        this.complementoFijo = complementoFijo;
    }

    @Override
    public double calcularSalarioTotal() {
        return  getSalarioBase()+(complementoFijo*12);
    }


}

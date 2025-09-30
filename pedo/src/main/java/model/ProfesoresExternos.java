package model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class ProfesoresExternos extends Profesores{

    private int horas;
    private double precioHoras;

    public ProfesoresExternos(String nombre, String dni, double salarioBase, int horas, double precioHoras) {
        super(nombre, dni, salarioBase);
        this.horas = horas;
        this.precioHoras = precioHoras;
    }


    @Override
    public double calcularSalarioTotal() {
        return getSalarioBase()+(horas*precioHoras);
    }


}

package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter

public class ProfesorExterno extends Profesor {
    private int horas;
    private double precioHoras;

    public ProfesorExterno(String nombre, String dni, double salarioBase, int horas, double precioHoras){
        super(nombre,dni,salarioBase);
        this.horas = horas;
        this.precioHoras = precioHoras;
    }

    @Override
    public double calcularSalarioTotal(){
        return  getSalarioBase() +(precioHoras*horas);
    }
}

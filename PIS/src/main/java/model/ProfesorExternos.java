package model;

import lombok.Data;

@Data

public class ProfesorExternos extends Profesor{

    private int horas;
    private double precioHoras;

    public ProfesorExternos(String nombre, String dni, double salarioBase, int horas, double precioHoras) {
        super(nombre, dni, salarioBase);
        this.horas = horas;
        this.precioHoras = precioHoras;
    }

    @Override
    public double calcularSalarioTotal() {
        return 0;
    }
}

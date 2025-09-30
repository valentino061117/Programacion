package model;

import lombok.Data;

@Data

public class ProfesorInterno extends Profesor{

    private double complementoMensual;

    public ProfesorInterno(String nombre, String dni, double salarioBase, double complementoMensual) {
        super(nombre, dni, salarioBase);
        this.complementoMensual = complementoMensual;
    }

    @Override
    public double calcularSalarioTotal() {
        return 0;
    }
}

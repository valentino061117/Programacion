package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@AllArgsConstructor
@Getter

public class ProfesorExterno extends Profesor{
    int horas, precioHora;

    public void mostarDatos(){
        System.out.println("horas = " + horas);
        System.out.println("precioHora = " + precioHora);
    }

    public void sueldoTotal(){
        int salarioTotal = (horas * precioHora) + salario;
    }

}

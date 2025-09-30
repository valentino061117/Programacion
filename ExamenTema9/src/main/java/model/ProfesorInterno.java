package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class ProfesorInterno extends Profesor{
    int complementoFijo;

    public void mostrarDatos(){
        System.out.println("complementoFijo = " + complementoFijo);
    }

    public void totalidadSalario(){
        int salarioTotal = complementoFijo +salario *12;
    }

}

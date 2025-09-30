package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Profesor {
    String dni,nombre;
    int salario;

    public void mostrarDatos(){
        System.out.println("dni = " + dni);
        System.out.println("nombre = " + nombre);
        System.out.println("salario = " + salario);
    }
}

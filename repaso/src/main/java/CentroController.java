import dto.AlumnoDto;
import model.Alumno;

public class CentroController {

    private AlumnoDto alumnoDto;

    public CentroController(){
        alumnoDto = new AlumnoDto();
    }

    public void insertarUsuario(Alumno alumno){
        alumnoDto.insertarUsuario(alumno);
    }
}

public class Partido {

    private Equipo equipoLocal, equipoVisitante;
    private int parte=1;
    private boolean jugado;

    private int golesLocales, golesVisitantes;

    public Partido(){}

    public Partido(Equipo equipoLocal, Equipo equipoVisitante){
        this.equipoLocal=equipoLocal;
        this.equipoVisitante=equipoVisitante;
    }

    public void iniciarPartido(){
        for (equipoVisitante!= null && equipoLocal != null) {
            for (int i = parte; i <3 ; i++) {

            }
            jugado=true;
        }
    }
}

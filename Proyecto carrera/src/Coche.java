public class Coche {
    private int cv;
    private int velocidad;
    private String matricula;
    private String modelo;
    private double km;

    public Coche() {
        this.cv = 0;
        this.velocidad = 0;
        this.matricula = "0000AAA";
        this.modelo = "sin especificar";
        this.km = 0.0;
    }
    public Coche(String modelo, String matricula, int cv){
        this.modelo=modelo;
        this.matricula=matricula;
        this.cv=cv;
    }
    public void acelerar(int incremento){
        this.velocidad+=incremento;
        if (this.velocidad > 180) {
            this.velocidad=180;
            System.out.println("La velocidad maxima ha sido " +
                    "superada por lo que tu velocidad es: "+this.velocidad);
        }
        this.km=this.velocidad*(this.cv*(Math.random()*11)+1);
    }
    public void frenar(int decremento){
        this.velocidad-=decremento;
        if (this.velocidad <0 ) {
            this.velocidad=0;
            System.out.println("La velocidad minima ha sido supera por lo que tu velocidad es: "+
                    this.velocidad);
        }
    }
    public void parar(){
        this.velocidad=0;
    }
    public void resetear(){
        this.velocidad=0;
        this.km=0.0;
    }
    public void mostraDatos(){
        System.out.printf("\nMatrícula: %s Modelo: %s CV: %d Velocidad: %d" +
                "  Kilómetros: %.2f\n",matricula,modelo,cv,velocidad,km);
    }

    public int getCv() {
        return cv;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getKm() {
        return km;
    }

    public void setKm(double km) {
        this.km = km;
    }
}
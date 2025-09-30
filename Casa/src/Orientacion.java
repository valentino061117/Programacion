public enum Orientacion {

    Norte(1.1),
    Sur(1.1),
    Este(1.05),
    Oeste(1.05);

    double revaloracion;

    Orientacion(double revaloracion) {
        this.revaloracion = revaloracion;
    }

    public double getRevaloracion() {
        return revaloracion;
    }

    public void setRevaloracion(double revaloracion) {
        this.revaloracion = revaloracion;
    }
}

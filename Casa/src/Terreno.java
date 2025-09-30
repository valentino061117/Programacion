public class Terreno {
    private ClaseCasa casa;
    private int m2;
    private double valoracion;
    private Orientacion orientacion;

    public Terreno() {
    }

    public Terreno( int m2, double valoracion,Orientacion orientacion) {
        this.m2 = m2;
        this.valoracion = valoracion;
        this.orientacion = orientacion;
    }

    public void mostrarDatos(){
        System.out.println("orientacion = " + orientacion);
        System.out.println("m2 = " + m2);
        System.out.println("valoracion = " + valoracion);
    }

    public void construirCasa(int m2){
        if (casa==null && this.m2>m2){
            casa = new ClaseCasa();
        }
    }

    public void revalorizarCasa(){

    }

    public Orientacion getOrientacion() {
        return orientacion;
    }

    public void setOrientacion(Orientacion orientacion) {
        this.orientacion = orientacion;
    }

    public ClaseCasa getCasa() {
        return casa;
    }

    public void setCasa(ClaseCasa casa) {
        this.casa = casa;
    }

    public int getM2() {
        return m2;
    }

    public void setM2(int m2) {
        this.m2 = m2;
    }

    public double getValoracion() {
        return valoracion;
    }

    public void setValoracion(double valoracion) {
        this.valoracion = valoracion;
    }

    public class ClaseCasa{
        private int m2, habitacion;
        private boolean piscina;
        private Orientacion orientacion;

        public ClaseCasa() {
        }

        public ClaseCasa(int m2, int habitacion, boolean piscina, Orientacion orientacion) {
            this.m2 = m2;
            this.habitacion = habitacion;
            this.piscina = piscina;
            this.orientacion = orientacion;
            casa = this;
        }

        public int getM2() {
            return m2;
        }

        public void setM2(int m2) {
            this.m2 = m2;
        }

        public int getHabitacion() {
            return habitacion;
        }

        public void setHabitacion(int habitacion) {
            this.habitacion = habitacion;
        }

        public boolean isPiscina() {
            return piscina;
        }

        public void setPiscina(boolean piscina) {
            this.piscina = piscina;
        }

        public Orientacion getOrientacion() {
            return orientacion;
        }

        public void setOrientacion(Orientacion orientacion) {
            this.orientacion = orientacion;
        }
    }

}

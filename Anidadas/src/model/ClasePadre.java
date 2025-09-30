package model;

public class ClasePadre {

    private String nombrePadre;

    private String apellidoPadre;

    private int edadPadre;

    private String correoPadre;

    private claseHija hija;

    public ClasePadre() {
    }

    public ClasePadre(String nombrePadre, String apellidoPadre, int edadPadre, String correoPadre) {
        this.nombrePadre = nombrePadre;
        this.apellidoPadre = apellidoPadre;
        this.edadPadre = edadPadre;
        this.correoPadre = correoPadre;
    }

    public void mostrarDatos(){
        System.out.println("nombrePadre = " + nombrePadre);
        System.out.println("apellidoPadre = " + apellidoPadre);
        System.out.println("edadPadre = " + edadPadre);
        System.out.println("correoPadre = " + correoPadre);
        System.out.println("Y tengo una hija con los siguientes datos");
        hija.mostrarDatos();
    }

    public claseHija getHija() {
        return hija;
    }

    public void setHija(claseHija hija) {
        this.hija = hija;
    }

    public String getNombrePadre() {
        return nombrePadre;
    }

    public void setNombrePadre(String nombrePadre) {
        this.nombrePadre = nombrePadre;
    }

    public String getApellidoPadre() {
        return apellidoPadre;
    }

    public void setApellidoPadre(String apellidoPadre) {
        this.apellidoPadre = apellidoPadre;
    }

    public int getEdadPadre() {
        return edadPadre;
    }

    public void setEdadPadre(int edadPadre) {
        this.edadPadre = edadPadre;
    }

    public String getCorreoPadre() {
        return correoPadre;
    }

    public void setCorreoPadre(String correoPadre) {
        this.correoPadre = correoPadre;
    }

    public class claseHija {
        private String nombreHija;

        private String apellidoHija;

        private int edadHija;

        private String correoHija;

        public claseHija() {
        }

        public claseHija(String nombreHija, String apellidoHija, int edadHija, String correoHija) {
            this.nombreHija = nombreHija;
            this.apellidoHija = apellidoHija;
            this.edadHija = edadHija;
            this.correoHija = correoHija;
            hija = this;
        }

        public void mostrarDatos(){
            System.out.println("nombreHija = " + nombreHija);
            System.out.println("apellidoHija = " + apellidoHija);
            System.out.println("edadHija = " + edadHija);
            System.out.println("correoHija = " + correoHija);
        }

        public String getNombreHija() {
            return nombreHija;
        }

        public void setNombreHija(String nombreHija) {
            this.nombreHija = nombreHija;
        }

        public String getApellidoHija() {
            return apellidoHija;
        }

        public void setApellidoHija(String apellidoHija) {
            this.apellidoHija = apellidoHija;
        }

        public int getEdadHija() {
            return edadHija;
        }

        public void setEdadHija(int edadHija) {
            this.edadHija = edadHija;
        }

        public String getCorreoHija() {
            return correoHija;
        }

        public void setCorreoHija(String correoHija) {
            this.correoHija = correoHija;
        }
    }

}

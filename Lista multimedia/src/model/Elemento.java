package model;

public class Elemento {

    private String identificador;

    private String titulo;

    private Persona autor;

    private String tamaño;

    private String formato;

    public Elemento(){}

    public Elemento(String identificador, String titulo, Persona autor, String tamaño, String formato) {
        this.identificador = identificador;
        this.titulo = titulo;
        this.autor = autor;
        this.tamaño = tamaño;
        this.formato = formato;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Persona getAutor() {
        return autor;
    }

    public void setAutor(Persona autor) {
        this.autor = autor;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }
}

package model;

public class Coche {
    // primero las propiedades
    private String marca, modelo, color, matricula, bastidor;
    private double precio;
    private int cv, par,km;

    // metodos constructores -> por defecto tengo el constructo vacio sin escribir nada
    public Coche()  {
        // me sirve para inicializar el objeto y por ende todos los atributos de este
        matricula="sin definir";
        modelo="sin definir";
        marca="sin definir";
        bastidor="sin definir";
        color ="sin definir";
    }
    public Coche(String marca, String modelo, String color){
        this.marca=marca;
        this.modelo=modelo;
        this.color=color;
    }

    public Coche(String marca, String modelo, int cv){
        this.marca=marca;
        this.modelo=modelo;
        this.cv=cv;
        par=(int) Math.pow(cv*2,2);
    }
    //inizializo el coche con parametros de referencia
    //par -> se calcula como antes
    //precio -> lo que te dan + 15%
    public Coche(String marca, String modelo, String color,
                 String matricula,int cv,
                 double precio, String bastidor,int km){
        this.marca=marca;
        this.modelo=modelo;
        this.color=color;
        this.matricula=matricula;
        this.cv=cv;
        this.par=(int)Math.pow(cv*2,2);
        this.precio=precio+(precio+0.15);
        this.bastidor=bastidor;
        this.km=km;
    }

    public Coche(String marca, String modelo,String matricula,int cv){
        this.marca=marca;
        this.modelo=modelo;
        this.matricula=matricula;
        this.cv=cv;
        this.par=(int)Math.pow(cv*2,2);
    }
    //  luego los metodos
    public void mostrarDatos(){
        System.out.println("La marca es: "+marca);
        System.out.println("El modelo es: "+modelo);
        System.out.println("El color es: "+color);
        System.out.println("Los caballos son: "+cv);
        System.out.println("El par es: "+par);
        System.out.println("El numero de bastidor es: "+bastidor);
        System.out.println("La matricula es: "+matricula);
        System.out.println("El precio es: "+precio);
        System.out.println("Los km es: "+km);
    }

    // metodos especiales
    public void setMarca(String marca){
        this.marca=marca;
    }
    public String getMarca(){
        return this.marca;
    }
    public String getModelo(){
        return this.modelo;
    }
    public String getMatricula(){
        return this.matricula;
    }
    public int getPar(){
        return this.par;
    }
    public void SetPar(int par){
        this.par=par;
    }
    public int getKm(){
        return this.km;
    }
    public void Setkm(int km){
        this.km=this.km + km;
    }
    public int getCv(){
        return this.cv;
    }
    public void setCv(int cv){
        this.km=cv;
    }


}
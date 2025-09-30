package model;

public enum Sabores {

    Fresa(40,50,150),
    Vainilla(80,60,250),
    Mango(40,50,150),
    Chocolate(90,100,350);

    private int calorias;
    private int precio;
    private int grasas;
    private int azucar;

    Sabores(int precio, int grasas, int azucar, int calorias){
        this.grasas = grasas;
        this.azucar = azucar;
        this.precio = precio;
        this.calorias = calorias;
    }

    Sabores(int grasas, int azucar, int calorias){
        this.grasas = grasas;
        this.azucar = azucar;
        this.calorias = calorias;
    }

    public int getCalorias() {
        return calorias;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getGrasas() {
        return grasas;
    }

    public void setGrasas(int grasas) {
        this.grasas = grasas;
    }

    public int getAzucar() {
        return azucar;
    }

    public void setAzucar(int azucar) {
        this.azucar = azucar;
    }
}

package ParteSistema;

import java.util.ArrayList;

public class Inventario <T>{
    private ArrayList<T> ListaElementos;
    private Producto producto;

    public Inventario() {
    }

    public void mostrarDatos(){
        System.out.println("producto = " + producto);
    }

    public void agregarProducto(T elemento){
        ListaElementos.add((T) producto.nombre);
    }

    public Inventario(ArrayList<T> listaElementos, Producto producto) {
        ListaElementos = listaElementos;
        this.producto = producto;
    }

    public ArrayList<T> getListaElementos() {
        return ListaElementos;
    }

    public void setListaElementos(ArrayList<T> listaElementos) {
        ListaElementos = listaElementos;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public class Producto{
        private String nombre;
        private double precio;
        private int stock;

        public Producto() {
        }

        public Producto(String nombre, double precio, int stock) {
            this.nombre = nombre;
            this.precio = precio;
            this.stock = stock;
        }

        public void mostrarDatos(){
            System.out.println("nombre = " + nombre);
            System.out.println("precio = " + precio);
            System.out.println("stock = " + stock);
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public double getPrecio() {
            return precio;
        }

        public void setPrecio(double precio) {
            this.precio = precio;
        }

        public int getStock() {
            return stock;
        }

        public void setStock(int stock) {
            this.stock = stock;
        }
    }
}

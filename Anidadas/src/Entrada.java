import model.ClasePadre;

public class Entrada {
    public static void main(String[] args) {
        ClasePadre clasePadre = new ClasePadre("Valentino", "Veselinov", 18,
                "valentino061117@gmail.com");
        ClasePadre.claseHija hija = clasePadre.new claseHija("Hermana esteban","Guarra",3,
                "puta@gmail.com");
        clasePadre.mostrarDatos();

    }
}

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        System.out.println("Introduzca el parametro a:");
        int p1 = scanner.nextInt();
        System.out.println("Introduzca el parametro b:");
        int p2 = scanner.nextInt();
        int area = areaTriangulo(p1,p2);
        System.out.printf("El area del triangulo es %d ",area);

        System.out.println("Introduzco el radio del circulo:");
        int r = scanner.nextInt();
        int areaC = areaCirculo(r);
        System.out.printf("El radio del circulo es %d \n",areaC);

        System.out.println("Introduzca la altura del triangulo");
        int altura = scanner.nextInt();
        System.out.println("Introduzca el primer base del triangulo");
        int base = scanner.nextInt();
        System.out.println("Introduzca el segundo lado del triangulo");
        int l = scanner.nextInt();
        System.out.printf("El área del triángulo con altura %d y base %d es %d ",altura,base,l);
        boolean isosceles = (altura == base || altura == l || base == l) && (altura != base || altura != l);
        System.out.println("El triangulo es isosceles"+isosceles);
        boolean equilatero = altura == base && base == l;
        System.out.println("El triangulo es equilatero"+equilatero);

        System.out.println("Introduzca el radio del circulo");
        float r2 = scanner.nextFloat();
        double areaC2 = (r2 * r2) * Math.PI;
        System.out.printf("El area del circulo es %.3f ",areaC2);
    }

    static Scanner scanner = new Scanner(System.in);

    public static int areaTriangulo (int p1, int p2){return ((p1*p2)/2);}

    public static int areaCirculo(int r){return (int)((r*r)*Math.PI);
    }
}

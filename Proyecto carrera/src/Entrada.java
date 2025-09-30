public class Entrada {
    public static void main(String[] args) {

        Coche cocheA = new Coche();
        Coche cocheB = new Coche("Audi","1234A",100);

        cocheA.mostraDatos();
        cocheB.mostraDatos();

        cocheA.setModelo("Mercedes");
        cocheA.setMatricula("5678B");
        cocheA.setCv(130);

        cocheA.setVelocidad((int)(Math.random()*21)+10);
        cocheB.setVelocidad((int)(Math.random()*21)+10);

        cocheA.mostraDatos();
        cocheB.mostraDatos();

        if (cocheA.getKm() > cocheB.getKm()) {
            System.out.printf("El ganador es el Coche A con \n " +
                    "- Modelo: %s\n" +
                    "- Matricula: %s\n" +
                    "- Km: %.2f",cocheA.getModelo(),cocheA.getMatricula(),cocheA.getKm());
        }else{
            System.out.printf("El ganador es el Coche B con \n" +
                    "- Modelo: %s\n" +
                    "- Matricula: %s\n" +
                    "- Km: %.2f",cocheB.getModelo(),cocheB.getMatricula(),cocheB.getKm());
        }
    }
}

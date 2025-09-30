package ParteFicheros;

import java.io.*;

public class OperacionFicheros implements Serializable {
    private static final long serialVisualUid= 1231441L;
    public void leerFichero(String path){
        File file = new File(path);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String linea = null;
            while ((linea = bufferedReader.readLine())!=null){
            String[] codigos = linea.split(" ");
                for (String codigo : codigos){
                    int codigoDescifrado = Integer.valueOf(codigo);
                    System.out.println((char)codigoDescifrado);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error en encontrar el archivo");
        } catch (IOException e) {
            System.out.println("Error en la i/o");
        }finally {
            try {
                bufferedReader.close();
            } catch (IOException | NullPointerException e) {
                System.out.println("Error en el cerrado");
            }
        }

    }

}

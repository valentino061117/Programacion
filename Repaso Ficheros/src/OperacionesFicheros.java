import java.io.*;

public class OperacionesFicheros {
    public void crearDirectorio(String path){
        File file = new File(path);
        if (!file.exists()){
            file.mkdir();
        }
    }

    public void crearFichero(String path){
        File file = new File(path);
        if (!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException | NullPointerException e) {
                System.out.println("error");
            }
        }
    }

    public void escribirFichero(String path){
        File file = new File(path);
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(file,true);
            fileWriter.write("Hugo es muy gay");
        } catch (IOException | NullPointerException e) {
            System.out.println("Error");
        }finally {
            try {
                fileWriter.close();
            } catch (IOException | NullPointerException e) {
                System.out.println("Error");
            }
        }
    }

    public void leerFichero(String path){
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(path);
            bufferedReader = new BufferedReader(fileReader);
            String linea =bufferedReader.readLine();
            System.out.println("La linea leuda es: "+linea);
            linea =bufferedReader.readLine();
            System.out.println("La linea leuda es: "+linea);
        } catch (FileNotFoundException e) {
            System.out.println("Error");
        } catch (IOException e) {
            System.out.println("Error en la i/o");
        }finally {
            try {
                bufferedReader.close();
            } catch (IOException | NullPointerException e) {
                System.out.println("error en el cerrado");
            }
        }
    }

}

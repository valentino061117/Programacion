import java.io.*;

public class OperacionesFicheros {

    public void leerInformacion(){
        File file = new File("C:\\CesJuanpablosegundo\\Programacion");
        System.out.println(file.exists());
        //file.list();
        //file.listFiles();
        for (File fichero :file.listFiles()){
           recorerDirectory(fichero);
        }
    }

    public void recorerDirectory(File fichero){
        System.out.println(fichero.getName());
        if (fichero.isDirectory()){
            for(File f : fichero.listFiles()){
                recorerDirectory(f);
            }
        }
    }

    public void crearDirectorio(String path){
        //src/recursos/lectura
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
            } catch (IOException e) {
                System.out.println("Fallo en la escritura del fichero");
            }
        }
    }

    public void lecturaUnitaria(String path){
        File file = new File(path);
            //hago lectura
            FileReader fileReader = null;
            try {
                fileReader = new FileReader(file);
                int lectura = -1;
                while ((lectura = fileReader.read())!=-1){
                    //System.out.println("lectura = "+lectura+ "asociado a la letra "+(char)lectura);
                    System.out.print((char)lectura);
                }
                /*System.out.println("lectura = " + lectura);
                lectura = fileReader.read();
                System.out.println("lectura = " + lectura);*/
            } catch (FileNotFoundException e) {
                System.out.println("El fichero no existe");
            } catch (IOException e) {
                System.out.println("Error en la lectura");
            }finally {
                System.out.println("Terminando lectura");
                try {
                    fileReader.close();
                } catch (IOException | NullPointerException e) {
                    System.out.println("Error en el cierre del fichero");
                }
            }
    }

    public void lecturaCodigoCompleta(String path){
        File file = new File(path);
        //hago lectura
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String linea = null;
            while ((linea = bufferedReader.readLine())!=null){
                //System.out.println(linea);
               /* String[] letras = linea.split(" ");
                for (String letra : letras) {
                    System.out.println("letra = " + letra);
                    int letraNumero = Integer.parseInt(letra);
                    System.out.println((char) letraNumero);
                }*/
            }

            /*String linea =bufferedReader.readLine();
            System.out.println("La linea leuda es: "+linea);
            linea =bufferedReader.readLine();
            System.out.println("La linea leuda es: "+linea);*/


                /*System.out.println("lectura = " + lectura);
                lectura = fileReader.read();
                System.out.println("lectura = " + lectura);*/
        } catch (FileNotFoundException e) {
            System.out.println("El fichero no existe");
        } catch (IOException e) {
            System.out.println("Error en la lectura");
        }finally {
            System.out.println("Terminando lectura");
            try {
                fileReader.close();
            } catch (IOException | NullPointerException e) {
                System.out.println("Error en el cierre del fichero");
            }
        }
    }

    //Crear un metodo que me pida por consola mis datos personales,
    //ademas de un mensaje

    //Todos los datos y el mensaje deberan guardarse
    //en el fichero datos.txt

    public void escribirFichero(String path){
        File file = new File(path);
        FileWriter fileWriter = null;

        try {
            fileWriter = new FileWriter(file,false);
            fileWriter.write(105);
        } catch (IOException e) {
            System.out.println("Error en escritura");
        }finally {
            try {
                fileWriter.close();
            } catch (IOException | NullPointerException e) {
                System.out.println("Error en el cerrado");
            }
        }
    }

    public void escrituraFicheroCompleta(String path){
        File file = new File(path);
        FileWriter fileWriter = null;
        PrintWriter printWriter = null;

        try {
            fileWriter = new FileWriter(file);
            printWriter = new PrintWriter(fileWriter);
            // realizo la escritura
            printWriter.println("Esta primera linea es la escritura completa");
            printWriter.println("Esta segunda linea se ha incorporado de forma automatica");
            printWriter.print(69);
        } catch (IOException e) {
            System.out.println("Error en la entrada / salida");
        }finally {
            try {
            printWriter.close();
            }catch (Exception e){
                System.out.println("Error en el cerrado");
            }
        }


    }

}

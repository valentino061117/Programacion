import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class OperacionesFicheros {

    public void escribirUsuario(String path, Usuarios usuarios){
        File file = new File(path);
        PrintWriter printWriter = null;
        try {
            printWriter = new PrintWriter(new FileWriter(file,true));
            printWriter.println(usuarios.toString());
            // escribe nombre,
        } catch (IOException e) {
            System.out.println("error i/o");
        }finally {
            try {
            printWriter.close();
            }catch (Exception e){
                System.out.println("error");
            }
        }
    }
}

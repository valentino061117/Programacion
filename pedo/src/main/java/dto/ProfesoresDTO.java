package dto;

import database.DBConnection;
import database.SchemaDB;
import model.Profesores;

import java.io.*;
import java.sql.*;
import java.util.ArrayList;

public class ProfesoresDTO {
    private final ArrayList<Profesores> listaProfesores = new ArrayList<>();
    private Connection connection;
    private Statement statement;
    private PreparedStatement preparedStatement;
    private ResultSet resultSet;

    public ProfesoresDTO(){
        DBConnection.getConnection();
    }

    public void mostrarDB(){
        try {
            statement = DBConnection.getConnection().createStatement();

            String query = "SELECT * FROM %s";
            String queryFormateada = String.format(query, SchemaDB.TAB_USER);

            resultSet = statement.executeQuery(queryFormateada);
            while (resultSet.next()){
                System.out.println(resultSet.getString(SchemaDB.COL_NAME)+
                        resultSet.getString(SchemaDB.COL_DNI)+resultSet.getString(SchemaDB.COL_SALARIO));
            }
            resultSet.close();
            statement.close();
        } catch (SQLException e) {
            System.out.println("Error en la query");
            System.out.println(e.getMessage());
        }
    }

    public void agregarProfesTemporales(Profesores profesores){
        listaProfesores.add(profesores);
    }

    public boolean eliminarProfesorTemporal(String dni){
        return
        listaProfesores.removeIf(profesorEliminado -> profesorEliminado.getDni().equalsIgnoreCase(dni));
    }

    public void mostrarLista(){
        for (Profesores listarProfesores : listaProfesores){
            System.out.println(listarProfesores);
        }
    }

    public void exportarDatosLista(){
        for (Profesores listaProfesores : listaProfesores){
            try {
                statement = DBConnection.getConnection().createStatement();

                String query = "INSERT INTO %s(%s,%s,%s) VALUES ('%s','%s','%s')";
                String queryFormateada = String.format(query,SchemaDB.TAB_USER,SchemaDB.COL_NAME,SchemaDB.COL_DNI,
                        SchemaDB.COL_SALARIO,listaProfesores.getNombre(),listaProfesores.getDni(),listaProfesores.getSalarioBase());
                statement.execute(queryFormateada);
            } catch (SQLException e) {
                System.out.println("Error en la query");
                System.out.println(e.getMessage());
            }
        }
    }

    public void exportarDatosFicherosCSV(String path){
        PrintWriter printWriter = null;

        try {
            printWriter = new PrintWriter(new FileWriter(path));
            for (Profesores listaProfesores : listaProfesores){
                System.out.println("Dni:"+listaProfesores.getDni()+"Nombre"+listaProfesores.getNombre()+
                        "Salario base anual"+listaProfesores.getSalarioBase());
            }
        } catch (IOException e) {
            System.out.println("Error en la i / o");
        }finally {
            assert printWriter != null;
            printWriter.close();
        }
    }

    public void exportarDatosFicherosOBJ(String path){
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;

        try {
            fileOutputStream = new FileOutputStream(path);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(listaProfesores);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                objectOutputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }


}

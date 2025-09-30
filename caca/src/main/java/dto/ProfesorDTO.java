package dto;

import database.DBConnection;
import database.SchemaDB;
import model.Profesor;

import java.io.*;
import java.sql.*;
import java.util.ArrayList;

public class ProfesorDTO {
    private final ArrayList<Profesor> listasProfesores = new ArrayList<>();

    private Connection connection;
    private Statement statement;
    private PreparedStatement preparedStatement;
    private ResultSet resultSet;

    public ProfesorDTO(){
        DBConnection.getConnection();
    }

    public void mostrarDB(){
        try {
            statement = DBConnection.getConnection().createStatement();
        String query = "SELECT * FROM %s";
        String queryFormateada = String.format(query, SchemaDB.TAB_USER);

        resultSet = statement.executeQuery(queryFormateada);
        while (resultSet.next()){
            System.out.println(resultSet.getString(SchemaDB.COL_NAME)+" "+
                    resultSet.getString(SchemaDB.COL_DNI)+" "+
                    resultSet.getString(SchemaDB.COL_SALARIIO));
        }
        resultSet.close();
        statement.close();
        } catch (SQLException e) {
            System.out.println("Error en la query");
            System.out.println(e.getMessage());
        }
    }

    public void agregarProfesorTemporal(Profesor profesor){
        listasProfesores.add(profesor);
    }

    public boolean eliminarProfesorListado(String dni){
        return
        listasProfesores.removeIf(profesorEliminar -> profesorEliminar.getDni().equalsIgnoreCase(dni));
    }

    public void mostrarLista(){
        for (Profesor listaProfesores : listasProfesores){
            System.out.println(listaProfesores);
        }
    }

    public void exportarDatosLista(){
        for (Profesor listaProfesores : listasProfesores){
            try {
                statement = DBConnection.getConnection().createStatement();

                String query = "INSERT INTO %s(%s,%s,%s) VALUES ('%s','%s','%s')";
                String queryFormateada = String.format(query,SchemaDB.TAB_USER,SchemaDB.COL_NAME,SchemaDB.COL_DNI,
                        SchemaDB.COL_SALARIIO,listaProfesores.getNombre(),listaProfesores.getDni(),listaProfesores.getSalarioBase());

                statement.execute(queryFormateada);
            } catch (SQLException e) {
                System.out.println("Error en la query");
                System.out.println(e.getMessage());
            }
        }
    }

    public void exportarDatosFicheroCSV(String path){
        PrintWriter printWriter = null;

        try {
            printWriter = new PrintWriter(new FileWriter(path));
            for (Profesor listaProfesores : listasProfesores){
                printWriter.println("Dni:"+listaProfesores.getDni()+"Nombre:"+listaProfesores.getNombre()+
                        "Salario base anual"+listaProfesores.getSalarioBase());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            assert printWriter !=null;
            printWriter.close();
        }
    }

    public void exportarDatosFicherosOBJ(String path){
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;

        try {
            fileOutputStream = new FileOutputStream(path);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(listasProfesores);
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

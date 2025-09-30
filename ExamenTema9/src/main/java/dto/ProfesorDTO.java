package dto;

import database.DBConnection;
import database.SchemaDB;
import model.Profesor;

import java.sql.*;

public class ProfesorDTO {
    private static Connection connection;
    private static Statement statement;
    private static PreparedStatement preparedStatement;
    private static ResultSet resultSet;

    public ProfesorDTO(){
        DBConnection.getConnection();
    }

    public void exportarDatosDB(Profesor profesor){
        try {
            connection.createStatement();

            String query = "INSERT INTO %s (%s, %s, %s) VALUES ('%s', '%s', '%d')";
            String queryFormateada= String.format(query, SchemaDB.TAB_Name,SchemaDB.COL_Dni,
                    SchemaDB.COL_Nombre,SchemaDB.COL_Salario,profesor.getDni(),profesor.getNombre(),profesor.getSalario());

            statement.executeQuery(queryFormateada);
        } catch (SQLException e) {
            System.out.println("Error en la exportacion");
            System.out.println(e.getMessage());
        }
    }

    public void mostrarProfesores(String dni){
        Profesor profesor = null;
        try {
            connection.createStatement();

            String query = "SELECT * FROM %s WHERE %s = %s";
            String queryFormateada = String.format(query,SchemaDB.TAB_Name,SchemaDB.COL_Dni,dni);
            int fila = statement.executeUpdate(queryFormateada);
            while (fila > 0){
                profesor = new Profesor();
                System.out.printf("DNI: %s | NOMBRE: %s | SALARIO: %d\n",
                    profesor.getDni(),
                    profesor.getNombre(),
                    profesor.getSalario());
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

}

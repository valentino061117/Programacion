package dto;

import database.DBConnection;
import database.SchemaDB;
import model.Coche;

import java.sql.*;

public class CocheDTO {

    private Connection connection;
    private Statement statement;
    private PreparedStatement preparedStatement;
    private ResultSet resultSet;

    public CocheDTO(){
        connection = DBConnection.getConnection();
    }

    public void insertarCoches(Coche coche){
        try {
            statement = connection.createStatement();

            String query = "INSERT INTO %s (%s, %s, %s, %s, %s, %s) VALUES (%d, %s, s, %s, %s, %d)";
            String queryFormateada= String.format(query, SchemaDB.TAB_USER, SchemaDB.COL_ID,SchemaDB.COL_MARCA,
                    SchemaDB.COL_MODELO,SchemaDB.COL_COLOR,SchemaDB.COL_MATRICULA,SchemaDB.COL_PRECIO,
                    coche.getId(),coche.getMarca(),coche.getModelo(),coche.getColor(),coche.getMatricula(), coche.getPrecio());
            statement.execute(queryFormateada);
        } catch (SQLException e) {
            System.out.println("Error en la query");
            System.out.println(e.getMessage());
        }
    }

    public void borrarCochePorId(int id){
        try {
            statement = connection.createStatement();

            String query = "DELETE FROM %s WHERE %s = %d";
            String queryFormateada = String.format(query,SchemaDB.TAB_USER,SchemaDB.COL_ID,id);
            int filas = statement.executeUpdate(queryFormateada);
            if (filas>0){
                System.out.println("Coche eliminado");
            }else {
                System.out.println("No se encontro ningun coche con ese ID.");
            }
        } catch (SQLException e) {
            System.out.println("Error al borrar el coche");
            throw new RuntimeException(e);
        }
    }

    public Coche consultarCochePorId(int id){
        Coche coche = null;

        try {
            statement = connection.createStatement();

            String query = "SELECT * FROM %s WHERE %s = %d";
            String queryFormateada = String.format(query, SchemaDB.TAB_USER,SchemaDB.COL_ID,id);

            resultSet = statement.executeQuery(queryFormateada);

            if (resultSet.next()){
                coche = new Coche(
                        resultSet.getInt(SchemaDB.COL_ID),
                        resultSet.getString(SchemaDB.COL_MARCA),
                        resultSet.getString(SchemaDB.COL_MODELO),
                        resultSet.getString(SchemaDB.COL_COLOR),
                        resultSet.getString(SchemaDB.COL_MATRICULA),
                        resultSet.getInt(SchemaDB.COL_PRECIO)
                );
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return coche;
    }

    public void listarCoches(){
        try {
            statement = connection.createStatement();

            String query = "SELECT * FROM %s";
            String queryFormateada = String.format(query, SchemaDB.TAB_USER);

            resultSet = statement.executeQuery(queryFormateada);

            System.out.println("Lestado de coches:");
            while (resultSet.next()){
                System.out.printf("ID: %d | MARCA: %s | MODELO %s | COLOR: %s | MATRICULA %S | PRECIO %d\n",
                        resultSet.getInt(SchemaDB.COL_ID),
                        resultSet.getString(SchemaDB.COL_MARCA),
                        resultSet.getString(SchemaDB.COL_MODELO),
                        resultSet.getString(SchemaDB.COL_COLOR),
                        resultSet.getString(SchemaDB.COL_MATRICULA),
                        resultSet.getInt(SchemaDB.COL_PRECIO));
            }
        } catch (SQLException e) {
            System.out.println("Error al listar coches");
            throw new RuntimeException(e);
        }
    }

}

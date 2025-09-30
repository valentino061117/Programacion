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

    public void insertarCoches(Coche coche) {
        try {
            statement = connection.createStatement();

            String query = "INSERT INTO %s (%s, %s, %s, %s, %s, %s) VALUES (%d,'%s','%s','%s','%s',%d)";
            String queryFormateado = String.format(query, SchemaDB.TAB_USER,
                    SchemaDB.COL_ID, SchemaDB.COL_MARCA, SchemaDB.COL_MODELO, SchemaDB.COL_COLOR, SchemaDB.COL_MATRICULA,SchemaDB.COL_PRECIO,
                    coche.getId(), coche.getMarca(), coche.getModelo(), coche.getColor(), coche.getMatricula(),coche.getPrecio());
            statement.execute(queryFormateado);

        } catch (SQLException e) {
            System.out.println("Error en la query");
            System.out.println(e.getMessage());
        } finally {
            DBConnection.closeConnection();
        }
    }

    public void borrarCochePorId(int id) {
        try {
            statement = connection.createStatement();

            String query = "DELETE FROM %s WHERE %s = %d";
            String queryFormateada = String.format(query,
                    SchemaDB.TAB_USER,
                    SchemaDB.COL_ID,
                    id);

            int filas = statement.executeUpdate(queryFormateada);
            if (filas > 0) {
                System.out.println("Coche eliminado correctamente.");
            } else {
                System.out.println("No se encontró ningún coche con ese ID.");
            }

        } catch (SQLException e) {
            System.out.println("Error al borrar el coche");
            System.out.println(e.getMessage());
        } finally {
            DBConnection.closeConnection();
        }
    }

    public Coche consultarCochePorId(int id) {
        Coche coche = null;
        try {
            statement = connection.createStatement();

            String query = "SELECT * FROM %s WHERE %s = %d";
            String queryFormateada = String.format(query,
                    SchemaDB.TAB_USER,
                    SchemaDB.COL_ID,
                    id);

            resultSet = statement.executeQuery(queryFormateada);

            if (resultSet.next()) {
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
            System.out.println("Error al consultar el coche");
            System.out.println(e.getMessage());
        }

        return coche;
    }

    public void listarCoches() {
        try {
            statement = connection.createStatement();

            String query = "SELECT * FROM %s";
            String queryFormateada = String.format(query, SchemaDB.TAB_USER);

            resultSet = statement.executeQuery(queryFormateada);

            System.out.println("Listado de coches:");
            while (resultSet.next()) {
                System.out.printf("ID: %d | Marca: %s | Modelo: %s | Color: %s | Matrícula: %s | Precio: %d\n",
                        resultSet.getInt(SchemaDB.COL_ID),
                        resultSet.getString(SchemaDB.COL_MARCA),
                        resultSet.getString(SchemaDB.COL_MODELO),
                        resultSet.getString(SchemaDB.COL_COLOR),
                        resultSet.getString(SchemaDB.COL_MATRICULA),
                        resultSet.getInt(SchemaDB.COL_PRECIO));
            }

        } catch (SQLException e) {
            System.out.println("Error al listar coches");
            System.out.println(e.getMessage());
        }
    }


}


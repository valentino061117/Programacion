package dto;

import database.DBConnection;
import database.SchemaDB;
import model.Productos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;

public class ProductosDTO {
    Productos productos = new Productos();
    private Connection connection;
    private Statement statement;
    private PreparedStatement preparedStatement;
    private ResultSet resultSet;

    public ProductosDTO(){
        DBConnection.getConnection();
    }

    public void crearProductoDB(){
        try {
            statement = DBConnection.getConnection().createStatement();

            String query = "INSERT INTO %s(%s,%s,%s,%s) VALUES ('%d','%s','%s','%d')";
            String queryFormateada = String.format(query, SchemaDB.TAB_USER,SchemaDB.COL_ID,
                    SchemaDB.COL_NAME,SchemaDB.COL_PRECIO,SchemaDB.COL_CANTIDAD,productos.getId(),
                    productos.getNombre(),productos.getPrecio(),productos.getCantidad());
            statement.execute(queryFormateada);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void leerProductoPorId(int id){
        try {
            statement = DBConnection.getConnection().createStatement();

            String query = "SELECT * FROM %s WHERE %s = %d";
            String queryFormateada = String.format(query,SchemaDB.TAB_USER,
                    SchemaDB.COL_ID,id);

            resultSet = statement.executeQuery(queryFormateada);
                while (resultSet.next()){
                    System.out.println(resultSet.getInt(SchemaDB.COL_ID)+
                            resultSet.getString(SchemaDB.COL_NAME)+
                            resultSet.getString(SchemaDB.COL_PRECIO)+
                            resultSet.getInt(SchemaDB.COL_CANTIDAD));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void actualizarInformacionProductoPorId(int id){
        try {
            statement = DBConnection.getConnection().createStatement();

            String query = "UPDATE FROM %s WHERE %s = %d";
            String queryFormateada = String.format(query,SchemaDB.TAB_USER,
                    SchemaDB.COL_ID,id);

            resultSet = statement.executeQuery(queryFormateada);
            while (resultSet.next()){

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void eleminarProductoPorId(int id){
        try {
            statement = DBConnection.getConnection().createStatement();

            String query = "DELETE FROM %s WHERE %s = %d";
            String queryFormateada = String.format(query,SchemaDB.TAB_USER,
                    SchemaDB.COL_ID,id);

            resultSet = statement.executeQuery(queryFormateada);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void leerFichero(String path){
        FileReader fileReader = null;

        try {
            fileReader = new FileReader(path);
            int linea = 0;
            while (linea > -1){
                fileReader.read();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void leerBaseDatos(){
        try {
            statement = DBConnection.getConnection().createStatement();

            String query = "SHOW FROM %s";
            String queryFormateada = String.format(query,SchemaDB.TAB_USER);

            int filas = statement.executeUpdate(queryFormateada);
            while (filas >0){
                System.out.println("Id: "+productos.getId()+"Nombre: "+productos.getNombre()+
                        "Precio: "+productos.getPrecio()+"Cantidad: "+productos.getCantidad());
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private final static String URL = "jdbc:mysql://localhost:3306/profesores";
    private final static String ROOT= "root";
    private final static String PASS= "Tino201020";
    private static Connection connection;

    public static void createConnection(){
        try {
            connection = DriverManager.getConnection(URL,ROOT,PASS);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static Connection getConnection(){
        if (connection == null){
            createConnection();
        }
        return connection;
    }

    public static void closeConnection(){
        try {
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

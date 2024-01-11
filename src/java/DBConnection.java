/**
 *
 * @author moniguar
 */
// Clase de conexión a la base de datos: DBConnection.java
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    public static Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/pruebabloques";
        String usuario = "root";
        String contraseña = "server*123";

        return DriverManager.getConnection(url, usuario, contraseña);
    }
    
    
}



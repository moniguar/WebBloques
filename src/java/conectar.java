/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author moniguar
 */
import java.sql.Connection;
import java.sql.DriverManager;
 
public class conectar {
    public static final String URL = "jdbc:mysql://localhost:3306/pruebabloques";
    public static final String USER = "root";
    public static final String CLAVE = "server*123";
     
    public Connection getConexion(){
        Connection con = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(URL, USER, CLAVE);
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        return con;
    }
}
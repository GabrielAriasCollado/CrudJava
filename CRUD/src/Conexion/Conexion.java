
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    
    Connection con;
    
    public Conexion(){
        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_pooii","root","");
            
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("Error:"+e);
        }
    }
    
    public Connection getConnection(){
        return con;
    }
    
}

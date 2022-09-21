
package connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    Connection  connection;
    static String bd = "movie_star";
    static String port = "3306";
    static String login = "root";
    static String password = "admin";
    
    public DBConnection(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:"+this.port+"/"+this.bd;
            connection = DriverManager.getConnection(url,this.login,this.password);
            System.out.println("Conexión Establecida con la BD");
        } catch (Exception ex) {
            System.out.println("Error en la conexión");
        }
    }
    
    public Connection getConection(){
     return connection;  
     
    }
    
    public void desconectar(){
    connection = null;
    }
}
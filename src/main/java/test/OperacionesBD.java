
package test;
import beans.Pelicula;
import connection.DBConnection;
import java.sql.ResultSet;
import java.sql.Statement;

public class OperacionesBD {
    public static void main(String[] args) {
        listarPelicula();
    }
    

    
    public static void listarPelicula() {
        DBConnection con = new DBConnection();
        String sql = "SELECT * FROM pelicula";
        try {
            Statement st = con.getConection().createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                int id = rs.getInt("id");
                String titulo = rs.getString("titulo");
                String duracion = rs.getString("duracion");
                String pais = rs.getString("pais");
                String direccion = rs.getString("direccion");
                String genero = rs.getString("genero");
                String imagen = rs.getString("imagen");
                
                Pelicula peliculas = new Pelicula (id, titulo, duracion, pais, direccion, genero, imagen);
                 System.out.println(peliculas.toString());        
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        finally {
            con.desconectar();
        }
        
    }
    
}

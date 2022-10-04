package test;

import beans.Pelicula;
import connection.DBConnection;
import java.sql.ResultSet;
import java.sql.Statement;

public class OperacionesBD {

    public static void main(String[] args) {
       
             // insertarPelicula();
     //insertarPelicula(2, "Interstelar", "169", "Estados Unidos", "Christopher Nolan", "Ciencia Ficción", "https://m.media-amazon.com/images/I/A1JVqNMI7UL._SL1500_.jpg");
    }

    public static void modificarPelicula(int id, String titulo) {
        DBConnection con = new DBConnection();
        String sql = "UPDATE pelicula SET titulo = '" + titulo + "' WHERE id = " + id;
        try {
            Statement st = con.getConnection().createStatement();
            st.executeUpdate(sql);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            con.desconectar();
        }
    }

    public static void insertarPelicula(int id, String titulo, String duracion, String pais, String direccion, String genero, String imagen) {
        DBConnection con = new DBConnection();
        String sql = ("INSERT INTO pelicula (id,titulo,duracion,pais,direccion,genero,imagen) VALUES  ('" + id + "','" + titulo + "','" + duracion + "','" + pais + "','" + direccion + "','" + genero + "','" + imagen + "')");
        try {
            Statement st = con.getConnection().createStatement();
            st.executeUpdate(sql);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            con.desconectar();
        }
    }

    public static void eliminarPelicula(int id) {
        DBConnection con = new DBConnection();
        String sql = "DELETE FROM pelicula WHERE id = " + id;
        try {
            Statement st = con.getConnection().createStatement();
            st.executeUpdate(sql);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            con.desconectar();
        }
    }

    public static void consultarPelicula() {
        DBConnection con = new DBConnection();
        String sql = "SELECT * FROM pelicula";
        try {
            Statement st = con.getConnection().createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                int id = rs.getInt("id");
                String titulo = rs.getString("titulo");
                String duracion = rs.getString("duracion");
                String pais = rs.getString("pais");
                String direccion = rs.getString("direccion");
                String genero = rs.getString("genero");
                String imagen = rs.getString("imagen");

                Pelicula peliculas = new Pelicula(id, titulo, duracion, pais, direccion, genero, imagen);
                System.out.println(peliculas.toString());
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            con.desconectar();
        }

    }

}

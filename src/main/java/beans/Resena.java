
package beans;

import java.sql.Date;


public class Resena {
   
    private int id;
    private String username;
    private String resena;
    private int calificacion;
    private Date fecha;

    public Resena(int id, String username, String resena, int calificacion, Date fecha) {
        this.id = id;
        this.username = username;
        this.resena = resena;
        this.calificacion = calificacion;
        this.fecha = fecha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getResena() {
        return resena;
    }

    public void setResena(String resena) {
        this.resena = resena;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Resena{" + "id=" + id + ", username=" + username + ", resena=" + resena + ", calificacion=" + calificacion + ", fecha=" + fecha + '}';
    }
    
    
    
    
    
    
}

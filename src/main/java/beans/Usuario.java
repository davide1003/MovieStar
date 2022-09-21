
package beans;



public class Usuario {
    
   private String username;
   private String contrasena;
   private String email;

    public Usuario(String username, String contrasena, String email) {
        this.username = username;
        this.contrasena = contrasena;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Usuario{" + "username=" + username + ", contrasena=" + contrasena + ", email=" + email + '}';
    }

  
   
   
    
}

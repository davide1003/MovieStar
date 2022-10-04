package controller;

import java.util.Map;

public interface IUsuarioController {

    public String login(String username, String contrasena);

    public String register(String username, String contrasena,
            String email);

    public String pedir(String username);

    public String modificar(String username, String nuevaContrasena,
             String nuevoEmail);

   public String eliminar(String username);

}

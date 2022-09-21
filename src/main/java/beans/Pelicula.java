
package beans;


public class Pelicula {
    private int id;
    private String titulo;
    private String duracion;
    private String pais;
    private String direccion;
    private String genero;
    private String imagen;

    public Pelicula(int id, String titulo, String duracion, String pais, String direccion, String genero, String imagen) {
        this.id = id;
        this.titulo = titulo;
        this.duracion = duracion;
        this.pais = pais;
        this.direccion = direccion;
        this.genero = genero;
        this.imagen = imagen;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "id=" + id + ", titulo=" + titulo + ", duracion=" + duracion + ", pais=" + pais + ", direccion=" + direccion + ", genero=" + genero + ", imagen=" + imagen + '}';
    }
  
    
    
}



package Clases;

public class Plan {

  
   private String nombre;
   private String descripcion;
   private int precio;

    public Plan(String nombre, String descripcion, int precio) {
       
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }
   
   
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
}

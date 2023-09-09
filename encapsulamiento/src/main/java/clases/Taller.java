/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Yesid Farfan
 */
public class Taller extends la_abstracta{
    String nombre;
    String direccion;

    public void reparar(Vehiculo v1){
        System.out.println("Estoy reparando el vehiculo"+v1.getMarca());}
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public void abrir() {
        System.out.println("El local se abrío");
    }
    
    
    
}

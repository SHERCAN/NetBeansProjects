/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;
import modelo.Datos;

/**
 *
 * @author Yesid Farfan
 */
public class Cliente extends Datos_persona{
    private Mascota mascota;

    public Cliente(String identificacion, String nombres, String apellidos, String direccion, String telefono,
        int cod,int edad,String especie,String nombre,int peso,String plan) {
        super(identificacion, nombres, apellidos, direccion, telefono);
        this.mascota =new Mascota(cod,nombre,edad,peso,especie);
                
    }
    public Cliente(String identificacion, String nombres, String apellidos, String direccion, String telefono) {
        super(identificacion, nombres, apellidos, direccion, telefono);
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }
   
    
}

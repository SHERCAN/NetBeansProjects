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
public class Camion extends Vehiculo{
    float capacidad_carga;
    float cilindraje;
    
    public static void cargar() {
        System.out.println("Este camion carga");
    }

    public float getCapacidad_carga() {
        return capacidad_carga;
    }

    public void setCapacidad_carga(float capacidad_carga) {
        this.capacidad_carga = capacidad_carga;
    }

    public float getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(float cilindraje) {
        this.cilindraje = cilindraje;
    }
    
}

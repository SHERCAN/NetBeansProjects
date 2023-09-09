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
public class Bus extends Vehiculo{
    private String empresa;
    private float cilindraje;

    public Bus() {
    }

    public Bus(String empresa, float cilindraje, String color, String marca, int kilometraje) {
        super(color, marca, kilometraje);
        this.empresa = empresa;
        this.cilindraje = cilindraje;
    }
    
    public void TransportarPasajeros() {
        
    }

    /**
     * @return the empresa
     */
    public String getEmpresa() {
        return empresa;
    }

    /**
     * @param empresa the empresa to set
     */
    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    /**
     * @return the cilindraje
     */
    public float getCilindraje() {
        return cilindraje;
    }

    /**
     * @param cilindraje the cilindraje to set
     */
    public void setCilindraje(float cilindraje) {
        this.cilindraje = cilindraje;
    }
    
}

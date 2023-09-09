package clases;

import interfac.inter_new;

public class Vehiculo implements inter_new{
    String color;
    private String marca;
    private int kilometraje;
    Taller t1;

    public Taller getT1() {
        return t1;
    }

    public void setT1(Taller t1) {
        this.t1 = t1;
    }

    public Vehiculo(String color, String marca, int kilometraje) {
        this.color = color;
        this.marca = marca;
        this.kilometraje = kilometraje;
    }

    public Vehiculo() {
    }
    
    public void acelerar(){
        System.out.println("Acelerando");
    }
    public void frenar(){
        System.out.println("Frenando");
    }
    public void pitar(){
        System.out.println("Pitando");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(java.lang.Integer kilometraje) {
        this.kilometraje = kilometraje;
    }

    @Override
    public void prender() {
        System.out.println("Me enciendo");
    }
}

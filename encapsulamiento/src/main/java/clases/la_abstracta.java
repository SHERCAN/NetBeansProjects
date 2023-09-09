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
public abstract class la_abstracta {
    int salir;
    public abstract void abrir();//Si no se implementa se pone la palabra abstract
    public void cerrar(){System.out.println("Cerrando");};//si esta implementado no se pone la palabra abstract
}

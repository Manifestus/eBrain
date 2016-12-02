/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stark_travel;

import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class Constelacion {

    private String Nombre;
    private Estrella Estrellas;
    private Constelacion next;
    private Adyacencia adyacencia;

    public Constelacion(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public Estrella getEstrellas() {
        return Estrellas;
    }

    public void setEstrellas(Estrella Estrellas) {
        this.Estrellas = Estrellas;
    }

    public Constelacion getNext() {
        return next;
    }

    public void setNext(Constelacion next) {
        this.next = next;
    }

    public Adyacencia getAdyacencia() {
        return adyacencia;
    }

    public void setAdyacencia(Adyacencia adyacencia) {
        this.adyacencia = adyacencia;
    } 

    @Override
    public String toString() {
        return  Nombre;
    }

}

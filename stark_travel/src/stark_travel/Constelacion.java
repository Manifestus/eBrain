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
    private ArrayList<Estrella> Estrellas;
    private ArrayList<Adyacencia> Adj;

    public Constelacion(String Nombre, ArrayList<Estrella> Estrellas, ArrayList<Adyacencia> Adj) {
        this.Nombre = Nombre;
        this.Estrellas = Estrellas;
        this.Adj = Adj;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public ArrayList<Estrella> getEstrellas() {
        return Estrellas;
    }

    public void setEstrellas(ArrayList<Estrella> Estrellas) {
        this.Estrellas = Estrellas;
    }

    public ArrayList<Adyacencia> getAdj() {
        return Adj;
    }

    public void setAdj(ArrayList<Adyacencia> Adj) {
        this.Adj = Adj;
    }

    @Override
    public String toString() {
        return "Constelacion{" + "Nombre=" + Nombre + ", Estrellas=" + Estrellas + ", Adj=" + Adj + '}';
    }

}

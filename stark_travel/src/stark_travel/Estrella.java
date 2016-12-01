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
public class Estrella {

    private String Nombre;
    private ArrayList<Adyacencia> Adj;

    public Estrella(String Nombre, ArrayList<Adyacencia> Adj) {
        this.Nombre = Nombre;
        this.Adj = Adj;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public ArrayList<Adyacencia> getAdj() {
        return Adj;
    }

    public void setAdj(ArrayList<Adyacencia> Adj) {
        this.Adj = Adj;
    }

    @Override
    public String toString() {
        return "Estrella{" + "Nombre=" + Nombre + ", Adj=" + Adj + '}';
    }
}

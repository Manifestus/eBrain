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
    private Adyacencia next;

    public Estrella(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public Adyacencia getNext() {
        return next;
    }

    public void setNext(Adyacencia next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return Nombre;
    }
    
}

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
    private String Name_Const;
    private Adyacencia Adj;
    private Estrella Next;
    private boolean Visitado;

    public Estrella(String Nombre, boolean Visitado) {
        this.Nombre = Nombre;
        this.Visitado = Visitado;
    }

    public Estrella() {
    }

    public boolean isVisitado() {
        return Visitado;
    }

    public void setVisitado(boolean Visitado) {
        this.Visitado = Visitado;
    }
    
    public String getName_Const() {
        return Name_Const;
    }

    public void setName_Const(String Name_Const) {
        this.Name_Const = Name_Const;
    }

    public Adyacencia getAdj() {
        return Adj;
    }

    public void setAdj(Adyacencia Adj) {
        this.Adj = Adj;
    }

    public Estrella getNext() {
        return Next;
    }

    public void setNext(Estrella Next) {
        this.Next = Next;
    }
     
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /*@Override
    public String toString() {
        return Nombre;
    }*/

    @Override
    public String toString() {
        return Nombre + "(" + Adj + "),";
    }
    
    
}

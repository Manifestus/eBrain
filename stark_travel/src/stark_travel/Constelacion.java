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
    private Adyacencia adyacencia;

    public Constelacion(String Nombre) {
        this.Nombre = Nombre;
    }

    public Constelacion() {
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
    
    public Constelacion First(Constelacion V){
        return V.getAdyacencia().getCosntelacion();
    }
    public Estrella Next(Constelacion v,int i){
        Estrella Estrella = v.getEstrellas();
        if (i==0) {  
            if (Estrella.getNext().equals(null) == false) {
                return null;
            }else{
                return Estrella.getNext();
            }
        }else{
            try {
                for (int j = 0; j < i + 1; j++) {
                    if (Estrella.getNext().equals(null)) {
                    } else {
                    Estrella = Estrella.getNext();
                    }
                }
            } catch (Exception e) {
                System.out.println("No existe posicion a buscar");
            }
        } 
        return Estrella;
    }
    public Estrella getVertex(Constelacion Vertex,int i){
        Estrella Estrella = Vertex.getEstrellas();
        if (i==0) {  
            if (Estrella.getNext().equals(null) == false) {
                return null;
            }else{
                return Estrella.getNext();
            }
        }else{
            try {
                for (int j = 0; j < i; j++) {
                    if (Estrella.getNext().equals(null)) {
                    } else {
                    Estrella = Estrella.getNext();
                    }
                }
            } catch (Exception e) {
                System.out.println("No existe posicion a buscar");
            }
        } 
        return Estrella;
    }
    public void Add(Constelacion v,Constelacion w){
        
    }
    public void Remove(Constelacion v,Constelacion w){
        
    }
}

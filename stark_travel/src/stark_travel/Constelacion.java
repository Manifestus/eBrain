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
    public Constelacion Next(Constelacion v,int i){
        Constelacion recorre=v.getAdyacencia().getCosntelacion();
        int cont=0;
        if (i==0) {  
            return recorre;
        }else{
            for (int j = 0; j < i; j++) {
                //v=
                //if()
            }
        }           
    }
    public Constelacion getVertex(Constelacion c,int i){
        return new Constelacion();
    }
    public void Add(Constelacion v,Constelacion w){
        
    }
    public void Remove(Constelacion v,Constelacion w){
        
    }
}

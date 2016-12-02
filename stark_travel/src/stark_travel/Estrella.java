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

    public Estrella(String Nombre) {
        this.Nombre = Nombre;
    }

    public Estrella() {
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

    @Override
    public String toString() {
        return Nombre;
    }
    public Estrella First(Estrella V){
        return new Estrella();
    }
    public Estrella Next(Estrella v,int i){
        //Constelacion recorre=v.getAdyacencia().getCosntelacion();
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

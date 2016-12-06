/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stark_travel;

/**
 *
 * @author Romero
 */
public class Adyacencia {
    private Adyacencia next;
    private Constelacion cosntelacion;
    private Estrella estrella;
    private Estrella origen;
    private boolean camino_kruskal;
    private int peso;

    public Adyacencia(Constelacion cosntelacion, int peso) {
        this.cosntelacion = cosntelacion;
        this.peso = peso;
    }

    public Adyacencia(Estrella estrella, Estrella origen, boolean camino_kruskal, int peso) {
        this.estrella = estrella;
        this.origen = origen;
        this.camino_kruskal = camino_kruskal;
        this.peso = peso;
    }

    public Adyacencia() {
    }

    public boolean isCamino_kruskal() {
        return camino_kruskal;
    }

    public void setCamino_kruskal(boolean camino_kruskal) {
        this.camino_kruskal = camino_kruskal;
    }

    public Adyacencia getNext() {
        return next;
    }

    public void setNext(Adyacencia next) {
        this.next = next;
    }

    public Estrella getOrigen() {
        return origen;
    }

    public void setOrigen(Estrella origen) {
        this.origen = origen;
    }
    
    public Constelacion getCosntelacion() {
        return cosntelacion;
    }

    public void setCosntelacion(Constelacion cosntelacion) {
        this.cosntelacion = cosntelacion;
    }

    public Estrella getEstrella() {
        return estrella;
    }

    public void setEstrella(Estrella estrella) {
        this.estrella = estrella;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        if (next==null) {
            return  "("+origen.getNombre()+"-"+peso+"->"+estrella.getNombre()+")";
        }else
        return  "("+origen.getNombre()+"-"+peso+"->"+estrella.getNombre()+"),"+next;
    }

    
    
    
}

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
    private Object Node;
    private ArrayList<Adyacencia> Adj;

    public Constelacion(Object Node, ArrayList<Adyacencia> Adj) {
        this.Node = Node;
        this.Adj = Adj;
    }

    public Object getNode() {
        return Node;
    }

    public void setNode(Object Node) {
        this.Node = Node;
    }

    public ArrayList<Adyacencia> getAdj() {
        return Adj;
    }

    public void setAdj(ArrayList<Adyacencia> Adj) {
        this.Adj = Adj;
    }

    @Override
    public String toString() {
        return "Constelacion{" + "Node=" + Node + ", Adj=" + Adj + '}';
    }
}

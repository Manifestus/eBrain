
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
class MapaMental {
    Node Palabra;
    ArrayList<Edge> Adyacencias;

    public MapaMental() {
    }

    public Node getPalabra() {
        return Palabra;
    }

    public void setPalabra(Node Palabra) {
        this.Palabra = Palabra;
    }

    public ArrayList<Edge> getAdyacencias() {
        return Adyacencias;
    }

    public void setAdyacencias(ArrayList<Edge> Adyacencias) {
        this.Adyacencias = Adyacencias;
    }

    @Override
    public String toString() {
        return "MapaMental{" + '}';
    }
    
}

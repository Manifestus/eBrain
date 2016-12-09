/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class ArbolGenealogico {
    Perfil Head;

    public ArbolGenealogico(Perfil Head) {
        this.Head = Head;
    }

    public ArbolGenealogico() {
    }
    
    public Perfil getHead() {
        return Head;
    }

    public void setHead(Perfil Head) {
        this.Head = Head;
    }

    @Override
    public String toString() {
        return "ArbolGenealogico{" + "Head=" + Head + '}';
    }
    
}

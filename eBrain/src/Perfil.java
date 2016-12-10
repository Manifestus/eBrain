
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
public class Perfil {
    String Nombre;
    String Fecha_Nacimiento;
    String Genero;
    String Raza;
    String Observaciones;
    
    ArrayList<Perfil> Hijos = new ArrayList();
    ArrayList<Perfil> Mapas = new ArrayList();

    public Perfil(String Nombre, String Fecha_Nacimiento, String Genero, String Raza, String Observaciones) {
        this.Nombre = Nombre;
        this.Fecha_Nacimiento = Fecha_Nacimiento;
        this.Genero = Genero;
        this.Raza = Raza;
        this.Observaciones = Observaciones;
    }

    public Perfil() {
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getFecha_Nacimiento() {
        return Fecha_Nacimiento;
    }

    public void setFecha_Nacimiento(String Fecha_Nacimiento) {
        this.Fecha_Nacimiento = Fecha_Nacimiento;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public String getRaza() {
        return Raza;
    }

    public void setRaza(String Raza) {
        this.Raza = Raza;
    }

    public String getObservaciones() {
        return Observaciones;
    }

    public void setObservaciones(String Observaciones) {
        this.Observaciones = Observaciones;
    }

    public ArrayList<Perfil> getHijos() {
        return Hijos;
    }

    public void setHijos(ArrayList<Perfil> Hijos) {
        this.Hijos = Hijos;
    }

    public ArrayList<Perfil> getMapas() {
        return Mapas;
    }

    public void setMapas(ArrayList<Perfil> Mapas) {
        this.Mapas = Mapas;
    }

    @Override
    public String toString() {
        return Nombre;
    }
}

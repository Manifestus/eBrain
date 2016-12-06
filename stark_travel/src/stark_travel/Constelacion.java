/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stark_travel;

/**
 *
 * @author admin
 */
public class Constelacion {

    private String Nombre;
    private Estrella Estrellas;
    private Adyacencia adyacencia;

    public Constelacion(String Nombre, Estrella Estrellas, Adyacencia adyacencia) {
        this.Nombre = Nombre;
        this.Estrellas = Estrellas;
        this.adyacencia = adyacencia;
    }

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
        return Nombre;
    }

    public Constelacion First(Constelacion V) {
        return V.getAdyacencia().getCosntelacion();
    }

    public Estrella Next(Constelacion v, int i) {
        Estrella Estrella = v.getEstrellas();
        if (i == 0) {
            if (Estrella == null) {
            } else {
                return Estrella.getNext();
            }
        } else {
            try {
                for (int j = 0; j < i + 1; j++) {
                    if (Estrella == null) {
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

    public Estrella getVertex(Constelacion Vertex, int i) {
        Estrella Estrella = Vertex.getEstrellas();
        if (i == 0) {
            if (Estrella == null) {
            } else {
                return Estrella.getNext();
            }
        } else {
            try {
                for (int j = 0; j < i; j++) {
                    if (Estrella == null) {
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

    public void Add(Estrella Inicio, Estrella Final) {
        int contador = 0;
        while (Inicio != null) {
            contador++;
            Inicio = Inicio.getNext();
        }
        if (contador == 0) {
            Inicio.setNext(Final);
        } else {
            try {
                for (int j = 0; j < contador; j++) {
                    if (Inicio == null) {
                    } else {
                        Inicio = Inicio.getNext();
                    }
                }
                Inicio.setNext(Final);
            } catch (Exception e) {
            }
        }
    }

    public void Remove(Estrella Inicio, int pos) {
        int contador = 0;
        while (Inicio != null) {
            contador++;
            Inicio = Inicio.getNext();
        }
        if (contador == 0) {
            Inicio = null;
        } else {
            try {
                for (int j = 0; j < pos; j++) {
                    if (Inicio == null) {
                    } else {
                        Inicio = Inicio.getNext();
                    }
                }
                if (Inicio != null) {
                    Inicio = Inicio.getNext();
                } else {

                }
            } catch (Exception e) {
            }
        }
    }

    public int size() {
        int contador = 0;
        Estrella temp = Estrellas;
        while (temp != null) {
            contador++;

            temp = temp.getNext();
        }
        return contador;
    }

    public Estrella GrupoEstrella(Estrella Lista) {

        Estrella tempContador;
        Estrella tempLista;
        Estrella tempFinal = new Estrella();
        tempContador = Lista;
        tempLista = Lista;

        int contador = 0;

        while (tempContador != null) {
            contador++;
            tempContador = tempContador.getNext();
        }

        for (int i = 0; i < contador; i++) {
            if (tempLista != null) {
                if (tempFinal == null) {
                    if (tempLista.getName_Const().equals(Nombre)) {
                        tempFinal = tempLista;
                    }
                } else if (tempLista.getName_Const().equals(Nombre)) {
                    tempFinal.setNext(tempLista);
                    tempFinal = tempFinal.getNext();
                }
                tempLista = tempLista.getNext();
            }
        }
        return tempFinal;
    }

    public int[] GrupoEstrellaPeso(Estrella Lista) {

        Estrella tempContador;
        Estrella tempLista;
        tempContador = Lista;
        tempLista = Lista;

        int contador = 0;

        while (tempContador != null) {
            contador++;
            tempContador = tempContador.getNext();
        }

        Adyacencia tempAdj = tempLista.getAdj();

        int[] Pesos = new int[contador];

        for (int i = 0; i < contador; i++) {
            if (tempAdj != null) {
                Pesos[i] = tempAdj.getPeso();
                tempAdj = tempAdj.getNext();
            }            
        }

        return Pesos;
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Parte1Examen;

/**
 *
 * @author ubuntu
 */
public  class Nodo {

    Nodo siguiente;

    public String getCancion() {
        return Cancion;
    }

    public void setCancion(String Cancion) {
        this.Cancion = Cancion;
    }

    public int getGenero() {
        return genero;
    }

    public void setGenero(int genero) {
        this.genero = genero;
    }

    public Nodo(String Cancion, int genero) {
        this.Cancion = Cancion;
        this.genero = genero;
    }
    String Cancion;
    int genero;
    
}

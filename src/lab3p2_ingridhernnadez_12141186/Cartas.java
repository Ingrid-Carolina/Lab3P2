/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3p2_ingridhernnadez_12141186;

/**
 *
 * @author incah
 */
public class Cartas {
    private int elixir;
    private int veloc;
    private String nombre;

    public Cartas() {
    }

    public Cartas(int elixir, int veloc, String nombre) {
        this.elixir = elixir;
        this.veloc = veloc;
        this.nombre = nombre;
    }

    public int getElixir() {
        return elixir;
    }

    public void setElixir(int elixir) {
        this.elixir = elixir;
    }

    public int getVeloc() {
        return veloc;
    }

    public void setVeloc(int veloc) {
        this.veloc = veloc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Cartas{" + "elixir=" + elixir + ", veloc=" + veloc + ", nombre=" + nombre + '}';
    }
    
    
}

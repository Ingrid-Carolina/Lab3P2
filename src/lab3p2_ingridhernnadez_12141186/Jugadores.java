/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3p2_ingridhernnadez_12141186;

import java.util.ArrayList;

/**
 *
 * @author incah
 */
public class Jugadores {
    private String nombre;
    private ArrayList<Cartas> cartas;
    private ArrayList<Torres> torres;

    public Jugadores() {
    }

    public Jugadores(String nombre, ArrayList<Cartas> cartas, ArrayList<Torres> torres) {
        this.nombre = nombre;
        this.cartas = cartas;
        this.torres = torres;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Cartas> getCartas() {
        return cartas;
    }

    public void setCartas(ArrayList<Cartas> cartas) {
        this.cartas = cartas;
    }

    public ArrayList<Torres> getTorres() {
        return torres;
    }

    public void setTorres(ArrayList<Torres> torres) {
        this.torres = torres;
    }
    public String lC(){
        String temp =" ";
        for (int i = 0; i < cartas.size(); i++) {
            temp += " "+i+"-"+cartas.get(i)+"\n";
        }
        return temp;
    }
    public String lA(){
        String temp =" ";
        for (int i = 0; i < torres.size(); i++) {
            if(torres.get(i) instanceof TorreArquera ){
            temp += " "+i+"-"+cartas.get(i)+"\n";
        }
        }
        return temp;
    }
    public String lR(){
        String temp =" ";
        for (int i = 0; i < torres.size(); i++) {
            if(torres.get(i) instanceof TorreRey ){
            temp += " "+i+"-"+cartas.get(i)+"\n";
        }
        }
        return temp;
    }
    public String lT(){
        String temp =" ";
        for (int i = 0; i < torres.size(); i++) {
            temp += " "+i+"-"+torres.get(i)+"\n";
        }
        return temp;
    }

    @Override
    public String toString() {
        return "Jugadores{" + "nombre=" + nombre + ", cartas=" + cartas + ", torres=" + torres + '}';
    }
    
}

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
public class Legendarias  extends Cartas{
    private int ataque;
    private int vida;

    public Legendarias() {
        super();
    }

    public Legendarias(int ataque, int vida) {
        this.ataque = ataque;
        this.vida = vida;
    }

    public Legendarias(int ataque, int vida, int elixir, int veloc, String nombre) {
        super(elixir, veloc, nombre);
        this.ataque = ataque;
        this.vida = vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    @Override
    public String toString() {
        return "Legendarias{" +super.toString()+ "ataque=" + ataque + ", vida=" + vida + '}';
    }
    
}

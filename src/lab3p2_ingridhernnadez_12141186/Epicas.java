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
public class Epicas  extends Cartas {
    private int Ataque;

    public Epicas() {
        super();
    }

    public Epicas(int Ataque) {
        this.Ataque = Ataque;
    }

    public Epicas(int Ataque, int elixir, int veloc, String nombre) {
        super(elixir, veloc, nombre);
        this.Ataque = Ataque;
    }

    public int getAtaque() {
        return Ataque;
    }

    public void setAtaque(int Ataque) {
        this.Ataque = Ataque;
    }

    @Override
    public String toString() {
        return "Epicas{" +super.toString()+ "Ataque=" + Ataque + '}';
    }
    
    
}

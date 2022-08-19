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
public class TorreArquera extends Torres {
    private int ataque;

    public TorreArquera() {
        super();
    }

    public TorreArquera(int ataque) {
        this.ataque = ataque;
    }

    public TorreArquera(int ataque, int vida) {
        super(vida);
        this.ataque = ataque;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    @Override
    public String toString() {
        return "TorreArquera{" + super.toString()+"ataque=" + ataque + '}';
    }
    
}

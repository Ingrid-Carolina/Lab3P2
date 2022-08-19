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
public class Torres {
   private int vida; 

    public Torres() {
    }

    public Torres(int vida) {
        this.vida = vida;
    }
    

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    @Override
    public String toString() {
        return "Torres{" + "vida=" + vida + '}';
    }
    
    
}

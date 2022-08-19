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
public class TorreRey extends Torres {
    private String nombreReino;

    public TorreRey() {
        super();
    }

    public TorreRey(String nombreReino) {
        this.nombreReino = nombreReino;
    }

    public TorreRey(String nombreReino, int vida) {
        super(vida);
        this.nombreReino = nombreReino;
    }

    public String getNombreReino() {
        return nombreReino;
    }

    public void setNombreReino(String nombreReino) {
        this.nombreReino = nombreReino;
    }

    @Override
    public String toString() {
        return "TorreRey{" +super.toString()+ "nombreReino=" + nombreReino + '}';
    }
    
}

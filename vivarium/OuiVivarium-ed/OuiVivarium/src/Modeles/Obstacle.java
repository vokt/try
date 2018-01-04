/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modeles;

/**
 *
 * @author Administrator
 */
public class Obstacle {
    private int idObst,x,y,longueur,largeur;
    
    public Obstacle(int idObst,int x,int y,int longueur,int largeur){
        this.idObst = idObst;
        this.x = x;
        this.y = y;
        this.longueur = longueur;
        this.largeur = largeur;
    }
    
    @Override
    public String toString(){
        return "Obstacle"+idObst;
    }
}

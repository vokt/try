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
public class Nourriture {
    
    Vecteur positionN;
    
    public Nourriture(int x, int y){
        
        positionN = new Vecteur(x, y);
        
    }

    public Vecteur getPositionN() {
        return positionN;
    }

    public void setPosition(Vecteur position) {
        this.positionN = position;
    }
    
    
    
    
    
    
}

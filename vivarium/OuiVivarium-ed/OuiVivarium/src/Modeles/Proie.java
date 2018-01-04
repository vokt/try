/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modeles;

/**
 *
 * @author Administrator
 * 
 */

public class Proie extends Animal {
    
    private String nom;

    public Proie(int idProi,int x, int y, int dir,int especeX, int especeY) {
        super(x,y,dir,Map.TAILLE_PROIE,Map.VITESSE_PROIE,especeX,especeY,Map.CONSOMAIR_PROIE);
        this.nom = "Proie"+idProi;
    }
    
    @Override
    public String getType(){
        return "Proie";
    }
    
    public void remove(){
        
    }
    
    @Override
    public String toString(){
        return nom;
    }
    
    
        public int getConsomAir() {
        return consomAir;
    }


    /*public int getNiveauFaim() {
        return niveauFaim;  
    }

    public void setNiveauFaim(int niveauFaim) {
        this.niveauFaim = niveauFaim;
    }*/
    
    
    
    /*public void augmenterFaim(){
    // s'il mange
    
    }
    
    public void diminuerFaim(){
        // au bout d'une minute faim diminue
    
    }
    */
    
        
}

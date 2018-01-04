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
public class Joueur {
    //private int id;
    private String pseudo;    //nom du joueur
    
    public Joueur(String pseudo){
        this.pseudo = pseudo;
    }
    
    //change le statut de jeu
    public boolean controleJeu(boolean etatJeu){
        return !etatJeu;
    }
    
    @Override
    public String toString(){
        String s = "Je suis "+ pseudo;
        return s;
    }
}

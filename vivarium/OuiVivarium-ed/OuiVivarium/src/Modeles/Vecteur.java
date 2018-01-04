/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modeles;

/**
 *
 * @author bonbo
 */
public class Vecteur {
    protected double abscisse;
    protected double ordonnee;
    
    public Vecteur() {
        this.abscisse = 0.;
        this.ordonnee = 0.;
    }
    
    public Vecteur(double x, double y) {
        this.abscisse = x;
        this.ordonnee = y;
    }

    public double getAbscisse() {
        return abscisse;
    }

    public void setAbscisse(double abscisse) {
        this.abscisse = abscisse;
    }

    public double getOrdonnee() {
        return ordonnee;
    }

    public void setOrdonnee(double ordonnee) {
        this.ordonnee = ordonnee;
    }
    
    public void remove(){
    
    }

}

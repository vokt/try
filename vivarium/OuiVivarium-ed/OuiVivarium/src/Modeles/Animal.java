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
public abstract class Animal {
    
    //Vecteur position;
    int x,y,dir,vitesse,taille,longueur,largeur;    //(x,y) - position de l'animal, (longueur,largeur) - espece de vivarium
    int consomAir;
    static final int left_up=0,right_up=1,left_down=2,right_down=3;  
    int niveauFaim;
    
    
    public Animal(int x,int y,int dir,int taille,int vitesse,int longueur,int largeur,int consomAir){
        this.x = x;
        this.y = y;
        this.dir = dir;
        this.taille = taille;
        this.vitesse = vitesse;
        this.longueur = longueur;
        this.largeur = largeur;
        this.consomAir = consomAir;
        this.niveauFaim = 0;
    }
    
    public void move(){                      //deplacement
        switch (this.dir) {
        case left_up:
            x-=vitesse;y-=vitesse;
            if(x<=0)dir=right_up;
            else if(y<=0)dir=left_down;
            System.out.println("Je bouge left_up");
            break;
        case right_up:
            x+=vitesse;y-=vitesse;
            if(x>=largeur-taille)dir=left_up;
            else if(y<=0)dir=right_down;
            System.out.println("Je bouge right_up");
            break;
        case left_down:  
            x-=vitesse;y+=vitesse;
            if(x<=0)dir=right_down;
            else if(y>=longueur-taille)dir=left_up;
            System.out.println("Je bouge left_down");
            break;
        case right_down:
            x+=vitesse;y+=vitesse;
            if(x>=largeur-taille)dir=left_down;
            else if(y>=longueur-taille)dir=right_up;
            System.out.println("Je bouge right_down");
            break;
        }  
    }
    
    public abstract String getType();
    
    public void manger(Nourriture food){
        
       //lorsqu'il rencontre la nourriture elle disparait 
       food.getPositionN().remove();
       
    }

    public int getVitesse() {
        return vitesse;
    }

    public void setVitesse(int vitesse) {
        this.vitesse = vitesse;
    }

    public int getTaille() {
        return taille;
    }

    public void setTaille(int taille) {
        this.taille = taille;
    }

    public int getConsomAir() {
        return consomAir;
    }

    public void setConsomAir(int consomAir) {
        this.consomAir = consomAir;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    
    
    
    
}

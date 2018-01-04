/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controleur;

import Modeles.Animal;

/**
 *
 * @author Administrator
 */
public class RencontreCtrl {
    public int animdestroy(Animal a,Animal b){         //verifier si les deux animaux sont rencontrer
        int ret=0;
        if(a.getClass()==b.getClass()) return ret;      //si tous les deux sont meme predateur ou meme proie, il ne detruit pas
        
        int x1=a.getX()+a.getTaille()/2;
        int y1=a.getY()+a.getTaille()/2;
        int x2=b.getX()+b.getTaille()/2;
        int y2=b.getY()+b.getTaille()/2;
        double dis= Math.sqrt( (x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
        if(dis<=a.getTaille()/2+b.getTaille()/2)ret=1;
        return ret;
    }
}

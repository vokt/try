/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modeles;

import java.util.List;
import java.util.ArrayList;
//import java.util.Scanner;
import Controleur.RencontreCtrl;


public class Vivarium {
    
    private int longueur, largeur, nbPred, nbProi, nbObst;
    private int quantAir;
    private List<Animal> listAnim = new ArrayList<Animal>();
    private List<Obstacle> listObst = new ArrayList<Obstacle>();
    private List<Nourriture> listNour = new ArrayList<Nourriture>();
    
    public Vivarium(int longueur, int largeur){
        //taille de vivarium - a modifier (taille de la fenetre)
        this.longueur = longueur;
        this.largeur = largeur;
        nbPred = 0;
        nbProi = 0;
    }
    
   
     //ajouter aleatoirement les nourritures - quand jeu est lance
    
    /*Timeline loop = new Timeline(new KeyFrame(Duration.millis(40), new EventHandler<ActionEvent>() {
           
                    @Override
                    public void handle(ActionEvent actionEvent) {
                       
                        
                    }
                })
        );
        loop.setCycleCount(Timeline.INDEFINITE);
        loop.play(); */        
    //ajouter les obstacles
    //...
        
    //ajouter les animaux
    public void ajouter(int choix){     //obtenir la valeur venant de boutton
        
        //position aleatoire
        int x=(int) (Math.random()*700);    //position x
        int y=(int) (Math.random()*500);    //position y
        int dir=(int) (Math.random()*4);    //orientation de deplacement
        
        switch(choix){
            case 1:
                System.out.println("Ajouter Obstacle");
                nbObst++;
                listObst.add(new Obstacle(nbObst,x,y,longueur,largeur));
            break;
            //ajouter un predateur
            case 2:
                System.out.println("Ajouter Predateur");
                nbPred++;
                listAnim.add(new Predateur(nbPred,x,y,dir,longueur,largeur));
            break;
            //ajouter un proie
            case 3:
                System.out.println("Ajouter Proie");
                nbProi++;
                listAnim.add(new Proie(nbProi,x,y,dir,longueur,largeur));
            break;
        }
    }
    
    public void sup_obst(){
        
    }
    
    public void run_run(){  
        new Thread(){  
            @Override
            public void run(){  
                while(true){  
                    for(int i=1;i<listAnim.size();i++){               //tous les animaux se deplacent
                        Animal b=listAnim.get(i);
                        b.move(); 
                    }  
                    for(int i=0;i<listAnim.size()-1;i++){           //verifier si les deux sont rencontres
                        Animal b1=listAnim.get(i);
                        for(int j=i+1;j<listAnim.size();j++){
                            Animal b2=listAnim.get(j);
                        RencontreCtrl bab=new RencontreCtrl();
                            if(bab.animdestroy(b1, b2)==1){        //se rencontrent
                                nbProi--;
                                if(b1.getType() == "Predateur"){       //si b1 est predateur, b2 est mange par b1
                                    listAnim.remove(j);
                                    break;  
                                }  
                                else if(b1.getType() == "Proie"){ 
                                    listAnim.remove(i);
                                    break;  
                                }  
                            }
                        }  
                    }  
                    //repaint();                        //mettre en oevure sur le vue paint()  
                    try {  
                        Thread.sleep(30);            //mettre en pause
                    } catch (InterruptedException e) {  
                    e.printStackTrace();  
                }  
                }  
            }  
        }.start();  
    }
    
    @Override
    public String toString(){
        String s = "Vivarium :\n  Animal:";
        for(Animal anim : listAnim){
            s += anim.toString()+" ";
        }
        s+="\n  Obstacle:";
        for(Obstacle obst : listObst){
            s += obst.toString()+" ";
        }
        return s;
    }
}

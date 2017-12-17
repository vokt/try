/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filrouge;

/**
 *
 * @author ornei
 */
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Fenetre extends JFrame{
    

private Panneau pan = new Panneau();
private JButton bouton = new JButton("mon bouton");
private JPanel container = new JPanel();

    public Fenetre(){
        
        this.setTitle("Animation");
        this.setSize(300, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setContentPane(pan);
        this.setVisible(true);
        go();
        
    } 
    private void go(){
        for(; ;){
            int x = pan.getPosX(), y = pan.getPosY();
            //Le booléen pour savoir si l'on recule ou non sur l'axe x = null
            boolean backX = false;
            //Le booléen pour savoir si l'on recule ou non sur l'axe y
            boolean backY = false;
            //Dans cet exemple, j'utilise une boucle while
            //Vous verrez qu'elle fonctionne très bien
            while(true){
            //Si la coordonnée x est inférieure à 1, on avance
            if(x < 1)
                backX = false;
            //Si la coordonnée x est supérieure à la taille du Panneau
            //moins la taille du rond, on recule
            if(x > pan.getWidth()-50)
                backX = true;
            //Idem pour l'axe y
            if(y < 1)
                backY = false;
            if(y > pan.getHeight()-50)
                backY = true;
            //Si on avance, on incrémente la coordonnée
            //backX est un booléen, donc !backX revient à écrire
            //if (backX == false)
            if(!backX)
                pan.setPosX(++x);
            //Sinon, on décrémente
            else
                pan.setPosX(--x);
            //Idem pour l'axe Y
            if(!backY)
                pan.setPosY(++y);
            else
                pan.setPosY(--y);

            pan.repaint();
            
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            /*Si nos coordonnées arrivent au bord de notre composant
            //On réinitialise
            if(x == pan.getWidth() || y == pan.getHeight()){
            pan.setPosX(-50);
            pan.setPosY(-50);
            }
            */
        }

    }

   public static void main(String[] args) {
        // TODO code application logic here
          Fenetre fen = new Fenetre ();  
    }

}
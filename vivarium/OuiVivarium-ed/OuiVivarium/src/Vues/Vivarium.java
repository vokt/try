/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vues;

import javafx.animation.FadeTransition;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;
import vivarium.Utils;

/**
 *
 * @author bonbo
 */
public class Vivarium extends Application {
    
    private Scene scene;
    
    @Override
    public void start(Stage primaryStage) {
        Text titre = new Text(Utils.TITRE_TEXT);
        titre.setFont(Font.font("Verdana", FontWeight.BOLD, 40));
        titre.setUnderline(true);
        
        FadeTransition ft = new FadeTransition(Duration.millis(2000), titre);
        ft.setFromValue(0.1);
        ft.setToValue(1.0);
        ft.setCycleCount(1);
        //ft.setAutoReverse(true);
        ft.play();
        
        Text nouvellePartieText = new Text(Utils.NOUVELLE_PARTIE_TEXT);
        setFontToMenuChoices(nouvellePartieText);
        setTextUnderlinedOnMouseHover(nouvellePartieText);
        
        Text chargerVivariumText = new Text(Utils.CHARGER_VIVARIUM_TEXT);
        setFontToMenuChoices(chargerVivariumText);
        setTextUnderlinedOnMouseHover(chargerVivariumText);
        
        Text scoreText = new Text(Utils.SCORE_TEXT);
        setFontToMenuChoices(scoreText);
        setTextUnderlinedOnMouseHover(scoreText);
        
        Text quitterText = new Text(Utils.QUITTER_TEXT);
        setFontToMenuChoices(quitterText);
        setTextUnderlinedOnMouseHover(quitterText);
        quitterText.setOnMouseClicked((MouseEvent event) -> {
            primaryStage.close();
        });
        
        VBox vBox = new VBox(20, titre, nouvellePartieText, chargerVivariumText, scoreText, quitterText);
        vBox.setAlignment(Pos.CENTER);
        
        scene = new Scene(vBox, 800, 600);
        
        primaryStage.setScene(scene);
        primaryStage.setTitle(Utils.TITRE_TEXT);
        primaryStage.show();
    }
    
    /**
     * Pour souligner le texte lorsque la souris passe au dessus
     * et faire disparaître le trait de soulignement le cursor quitte le texte
     * @param text représente l'objet Text à survoler
     */
    private void setTextUnderlinedOnMouseHover(Text text) {
        text.setOnMouseEntered((MouseEvent event) -> {
            text.setUnderline(true);
            scene.setCursor(Cursor.HAND);
        });
        text.setOnMouseExited((MouseEvent event) -> {
            text.setUnderline(false);
            scene.setCursor(Cursor.DEFAULT);
        });
        text.setOnMouseClicked(e -> {
            showDialog();
        });
    }
    
    private void showDialog() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION, "Good job", ButtonType.OK);
        alert.setTitle("Information");
        alert.setHeaderText(null);
        alert.showAndWait();
    }
    
    private void setFontToMenuChoices(Text text) {
        text.setFont(Font.font("Verdana", FontWeight.LIGHT, 25));
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}

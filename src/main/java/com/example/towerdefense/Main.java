package com.example.towerdefense;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Ottieni le dimensioni dello schermo
        double screenWidth = Screen.getPrimary().getBounds().getWidth();
        double screenHeight = Screen.getPrimary().getBounds().getHeight();

        // ciao
        // Crea l'area di gioco (Pane)
        Pane gameArea = new Pane();
        gameArea.setPrefSize(screenWidth, screenHeight); // Imposta la dimensione dell'area di gioco a tutto lo schermo

        // Crea la scena e imposta la finestra principale
        Scene scene = new Scene(gameArea, screenWidth, screenHeight);

        primaryStage.setTitle("Tower Defense Game");  // Titolo della finestra
        primaryStage.setScene(scene);  // Imposta la scena
        primaryStage.setMaximized(true);  // Massimizza la finestra (opzionale, per forzare la dimensione massima)
        primaryStage.show();  // Mostra la finestra
    }

    public static void main(String[] args) {
        launch(args);  // Avvia l'applicazione
    }
}
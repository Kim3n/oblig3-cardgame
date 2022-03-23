package no.ntnu.idatx2001.oblig3.cardgame;

import java.io.IOException;
import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;

public class MainApp extends Application {


  @Override
  public void start(Stage primaryStage) {
    Parent root = null;
    try {
      root = FXMLLoader.load(getClass().getResource("CardGame.fxml"));
      primaryStage.setTitle("Card game");
      primaryStage.setScene(new Scene(root, 600, 500));
      primaryStage.setResizable(false);
      primaryStage.show();
    } catch (IOException e) {
      System.out.println("ERROR: " + e.getMessage());
    }
  }


  @Override
  public void stop() {
    System.exit(0);
  }

  public static void main(String[] args) {
    launch(args);
  }

}

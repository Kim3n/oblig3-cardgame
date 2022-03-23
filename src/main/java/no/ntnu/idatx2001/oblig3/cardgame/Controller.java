package no.ntnu.idatx2001.oblig3.cardgame;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class Controller {
  private DeckOfCards deck = new DeckOfCards();
  private Hand hand = new Hand();

  @FXML
  public Button checkButton;


  @FXML
  public void drawNewHand(ActionEvent actionEvent) {
    hand.setHand(deck.dealHand(5));
    bottomText.setText(hand.printHand());
    checkButton.setVisible(true);
  }

  @FXML
  public Text bottomText;

  @FXML
  public void checkHand(ActionEvent actionEvent){
   if(hand.allSuitMatch() == true){
     FlushField.setText("True");
   }
   else{
     FlushField.setText("False");
   }
   HeartsField.setText(hand.findHearts());

   SumField.setText(hand.findSumOfHand() + "");

    if(hand.checkForQueenSpades() == true){
      QueenOfSpades.setText("True");
    }
    else{
      QueenOfSpades.setText("False");
    }



  }

  @FXML
  public TextField SumField;
  @FXML
  public TextField FlushField;
  @FXML
  public TextField HeartsField;
  @FXML
  public TextField QueenOfSpades;

  @FXML
  public void exit(ActionEvent actionEvent){
    System.exit(0);
  }

  @FXML
  public MenuItem MenuClose;
}

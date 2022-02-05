package me.adamcraftmaster.rockpaperscissors;

import java.util.Random;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class RpsController {
  @FXML
  private Button rock;
  @FXML
  private Button paper;
  @FXML
  private Button scissors;
  @FXML
  private Label status;

  private int action;

  @FXML
  protected void onRockSelected() {
    action = 0;
    startGame(action);
  }

  @FXML
  protected void onPaperSelected() {
    action = 1;
    startGame(action);
  }

  @FXML
  protected void onScissorsSelected() {
    action = 2;
    startGame(action);
  }

  protected void startGame(int action) {
    Random rand = new Random();

    int enemyChoice = rand.nextInt(3);
    if (enemyChoice == 0) {
      if (action == 0) {
        status.setText("Tie! You both chose rock.");
      }
      if (action == 1) {
        status.setText("Win! You chose paper and the enemy chose rock.");
      }
      if (action == 2) {
        status.setText("Lose! You chose scissors and the enemy chose rock.");
      }
    }
    if (enemyChoice == 1) {
      if (action == 0) {
        status.setText("Lose! You chose rock and the enemy chose paper.");
      }
      if (action == 1) {
        status.setText("Tie! You both chose paper.");
      }
      if (action == 2) {
        status.setText("Win! You chose scissors and the enemy chose paper.");
      }
    }
    if (enemyChoice == 2) {
      if (action == 0) {
        status.setText("Win! You chose rock and the enemy chose scissors.");
      }
      if (action == 1) {
        status.setText("Lose! You chose paper and the enemy chose scissors.");
      }
      if (action == 2) {
        status.setText("Tie! You both chose scissors.");
      }
    }
  }

}

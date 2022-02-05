package me.adamcraftmaster.rockpaperscissors;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class RpsApplication extends Application {

  public static void main(String[] args) {
    launch();
  }

  @Override
  public void start(Stage primaryStage) throws IOException {
    FXMLLoader fxmlLoader = new FXMLLoader(RpsApplication.class.getResource("rps-view.fxml"));
    Scene scene = new Scene(fxmlLoader.load());
    primaryStage.setTitle("Rock Paper Scissors");
    primaryStage.setScene(scene);
    primaryStage.show();
  }
}

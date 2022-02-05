module me.adamcraftmaster.rockpaperscissors {
  requires javafx.controls;
  requires javafx.fxml;

  opens me.adamcraftmaster.rockpaperscissors to javafx.fxml;
  exports me.adamcraftmaster.rockpaperscissors;
}
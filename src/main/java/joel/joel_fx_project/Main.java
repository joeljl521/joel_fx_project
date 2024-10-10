package joel.joel_fx_project;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    // Entry point for JavaFX application
    @Override
    public void start(Stage primaryStage) throws Exception {
        // Load the FXML file for the UI layout
        Parent root = FXMLLoader.load(getClass().getResource("/joel/joel_fx_project/Main.fxml"));

        // Create a scene, set the width to 600 and height to 400
        Scene scene = new Scene(root, 600, 400);

        // Add external CSS stylesheet to the scene
        scene.getStylesheets().add(getClass().getResource("/css/styles.css").toExternalForm());

        // Set the title of the main window (stage)
        primaryStage.setTitle("JavaFX Application with CSS");

        // Set the scene for the primary stage and display
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    // Main method to launch the JavaFX application
    public static void main(String[] args) {
        launch(args);
    }
}

package JavaFX_Basic;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource("scene.fxml"));

        primaryStage.setTitle("Data Editor");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();

    }

}

/**
 * Setup für eine JavaFX Anwendung:
 *
 * 1. checken ob die richtige JDK eingestellt ist:
 *  -Unter "File -> Project Structure -> Project -> SDK" eine JDK die funktioniert auswählen
 *  -Unter "File -> Project Structure -> Project -> Language Level" SDK Default auswählen
 *
 * 2.
 *
 */
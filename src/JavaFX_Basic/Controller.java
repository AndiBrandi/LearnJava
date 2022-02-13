package JavaFX_Basic;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {


    /**
     * Durch Alt + Enter erzeugte Funktion
     * Führt Code aus wenn der button geklickt wird
     *
     * @param actionEvent
     */

    public Label helloLabel;
    public TextField textField;
    public Button button;

    public void buttonClicked(ActionEvent actionEvent) {

        int x = 0;
        x = Integer.parseInt(textField.getText());

    }
}

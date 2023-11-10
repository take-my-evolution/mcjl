package application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.KeyEvent;

public class SampleController {

    @FXML
    private Button Button1;

    @FXML
    void Pressed(KeyEvent event) {
    	Button1.relocate(30, 30);
    }

}

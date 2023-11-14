package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextField;
import javafx.scene.control.TextFormatter;
import javafx.util.converter.IntegerStringConverter;


public class StartController {

    @FXML
    private ProgressBar Validating;

    @FXML
    private Button btnAdd_mod;

    @FXML
    private Button btnCreate;

    @FXML
    private Button btnDel_mod;

    @FXML
    private Button btnDelete;

    @FXML
    private Button btnSettings;

    @FXML
    private Button btnStart;

    @FXML
    private TextField fldJarg;

    @FXML
    private TextField fldJpath;

    @FXML
    private TextField fldMemory;

    @FXML
    private TextField fldServer;

    @FXML
    private TextField fldUser;
    
    @FXML
    private ComboBox<> instances;
    
    @FXML
    void initialize() {
        TextFormatter<Integer> textFormatter = new TextFormatter<>(new IntegerStringConverter(), 0,
                c -> {
                    if (c.isContentChange()) {
                        String newText = c.getControlNewText();
                        if (newText.matches("\\d*")) {
                            return c;
                        } else {
                            return null; 
                        }
                    }
                    return c;
                });

        fldMemory.setTextFormatter(textFormatter);
    }
    
    @FXML
    void CreateButtonClick(ActionEvent event) {
    	Instance instance = new Instance("sdsd");
    	
    	
    	int a = 02;
    }
    
}

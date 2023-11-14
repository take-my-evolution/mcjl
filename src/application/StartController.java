package application;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextField;

public class StartController implements Initializable {
    @FXML
    private ComboBox<String> comb;


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
    private Button btnJPath;

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
    private ComboBox<String> instnse;

    @FXML
    void Select(ActionEvent event) {
        String s = instnse.getSelectionModel().getSelectedItem().toString();

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ObservableList<String> list = FXCollections.observableArrayList("JavaFX","SceneBuilder","Laravel","Python");
        instnse.setItems(list);
    }
}

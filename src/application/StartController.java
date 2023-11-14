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
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextField;


public class StartController implements Initializable {

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

    private ObservableList<Instance> instancesList = FXCollections.observableArrayList();
    @FXML
    void Select(ActionEvent event) {
        String s = instnse.getSelectionModel().getSelectedItem().toString();

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ObservableList<String> list = FXCollections.observableArrayList();
        instnse.setItems(list);
    }

    @FXML
    void onSelect(ActionEvent event) {
        String selectedInstanceName = instnse.getSelectionModel().getSelectedItem();
        // Можно здесь добавить дополнительную логику при выборе элемента в ComboBox
    }

    @FXML
    void onCreate(ActionEvent event) {
        String instanceName = instnse.getEditor().getText().trim();

        if (!instanceName.isEmpty()) {
            // Проверяем, что объект с таким именем еще не создан
            if (instancesList.stream().noneMatch(instance -> instance.getInstanceName().equals(instanceName))) {
                Instance newInstance = new Instance(instanceName);
                instancesList.add(newInstance);
                instnse.getItems().add(instanceName);
            } else {
                // Обработка ошибки, если объект с таким именем уже существует
                System.out.println("Объект с таким именем уже существует!");
            }
        } else {
            // Обработка ошибки, если поле пустое
            System.out.println("Поле пустое! Введите имя объекта.");
        }
    }

    @FXML
    void onDelete(ActionEvent event) {
        String selectedInstanceName = instnse.getSelectionModel().getSelectedItem();

        if (selectedInstanceName != null) {
            instancesList.removeIf(instance -> instance.getInstanceName().equals(selectedInstanceName));
            instnse.getItems().remove(selectedInstanceName);
            instnse.getSelectionModel().clearSelection();
        } else {
            // Обработка ошибки, если не выбран элемент для удаления
            System.out.println("Выберите объект для удаления!");
        }
    }
}
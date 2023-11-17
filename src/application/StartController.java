package application;

import java.io.File;
import java.io.FilenameFilter;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextField;
import javafx.scene.control.TextInputDialog;


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
    private NumericTextField fldMemory = new NumericTextField();

    @FXML
    private TextField fldServer;

    @FXML
    private TextField fldUser;

    @FXML
    private ComboBox<Instance> instance = new ComboBox<>();

    private String config_folder_path = "configs"; 
    
    @FXML
    void ComboBoxSelect(ActionEvent event) {
    	 Instance selectedInstance = instance.getValue();
    	 if (selectedInstance == null) return;
    	 
    	 fldUser.setText(selectedInstance.getUser());
    	 fldMemory.setInt(selectedInstance.getMemory());
    	 fldJpath.setText(selectedInstance.getJavaPath());
    	 ///TODO допилять остальные поля.
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    	File[] files = FileSearch.GetFiles(config_folder_path, ".conf");
        if (files == null) return;
        
		for (File file : files) {
			Instance inst = Instance.deserialize(config_folder_path + "/" + file.getName());
			instance.getItems().add(inst);
		}
		
		///////////////////
		 fldMemory.textProperty().addListener((observable, oldValue, newValue) -> {
			 Instance selectedInstance = instance.getValue();
	    	 if (selectedInstance == null) return;
	    	 
	    	 selectedInstance.setMemory(fldMemory.getInt());
	    	 selectedInstance.serialize(config_folder_path + "/" + selectedInstance.getUUID() + ".conf");
	        });
		/////////////////////
		 //TODO: Всех остальных дружков так же сделать.
		
		
    }

    @FXML
    void onCreate(ActionEvent event) {
    	  TextInputDialog dialog = new TextInputDialog();
          dialog.setTitle("Введите название сборки.");
          dialog.setContentText("Название сборки:");

          Optional<String> result = dialog.showAndWait();
          if (!result.isPresent()) return;
          
          Instance new_born = new Instance(result.get());
          instance.getItems().add(new_born);
          new_born.serialize(config_folder_path + "/" + new_born.getUUID() + ".conf");
    }

    @FXML
    void onDelete(ActionEvent event) {
    	Instance value = instance.getValue();
    	if(value == null) return;

    	instance.getItems().remove(value);
    	value.Delete();
    }

    @FXML
    void onStart(ActionEvent event) {
    	if(!checkAllFields()) return;
    	
    	//startgame
    	
    }
    
    boolean checkAllFields()
    {
    	//TODO тут реализовать чекер который если что то не так подсвечивает все ошибочные поле красным и возвращает файлс если плохо и тру если ок
    	
    	return true;
    }
        
}

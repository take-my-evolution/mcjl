package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class SettingsController {

    @FXML
    private Button btnAdd_mod;

    @FXML
    private Button btnDel_mod;

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

    private Stage settingsStage; // Добавляем переменную для хранения ссылки на Stage

    // Метод для установки Stage
    public void setSettingsStage(Stage settingsStage) {
        this.settingsStage = settingsStage;
    }

    // Метод, который будет вызываться при закрытии окна
    @FXML
    void clcSettings(ActionEvent event) {
        // Можно добавить здесь дополнительные действия по обработке нажатия на кнопку
        // Например, сохранение введенных данных или другие настройки

        // Закрываем окно
        settingsStage.close();
    }

    // Дополнительные методы и обработчики событий, если необходимо
}

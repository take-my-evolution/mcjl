package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressBar;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import java.io.IOException;

public class StartController {

    @FXML
    private ProgressBar Validating;

    @FXML
    private Button btnCreate;

    @FXML
    private Button btnDelete;

    @FXML
    private Button btnSettings;

    @FXML
    private Button btnStart;

    // Добавляем ссылку на Stage
    private Stage primaryStage;

    // Метод для установки Stage
    public void setPrimaryStage(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }

    @FXML
    void clcSettings(ActionEvent event) {
        try {
            // Загружаем fxml файл
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Settings.fxml"));
            Parent root = loader.load();

            // Создаем новый Stage
            Stage settingsStage = new Stage();
            settingsStage.setTitle("Settings");
            settingsStage.setScene(new Scene(root));

            // Устанавливаем Stage, чтобы он мог быть закрыт в будущем
            ((SettingsController)loader.getController()).setSettingsStage(settingsStage);

            // Показываем новое окно
            settingsStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
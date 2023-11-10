package application;
	
import java.io.IOException;
import java.security.NoSuchAlgorithmException;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.fxml.FXMLLoader;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("Sample.fxml"));
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		Config config = Config.deserialize("config.conf");
		
		if(config == null){
			config = new Config();
			config.serialize("config.conf");
		}
		//System.getProperty("java.home")
		
		
		try{FolderCreator.create("minecraft");}
		catch (Exception e)
		{
			if(e.getMessage() == "Не удалось создать папку.") {
				///Даже хз что делать
			}
		}
		
		try {
			String md5 = MD5FolderCalculator.calculateMD5ForFolder("minecraft");
		} catch (NoSuchAlgorithmException e) {
	
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		launch(args);
	}
}

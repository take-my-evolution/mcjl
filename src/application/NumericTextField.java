package application;

import javafx.scene.control.TextField;

public class NumericTextField extends TextField {

    public NumericTextField() {
        super();
        
        this.textProperty().addListener((observable, oldValue, newValue) -> {
            if (!newValue.matches("\\d*")) {
                setText(newValue.replaceAll("[^\\d]", ""));
            }
        });
    }
    
    public void setInt(int value)
    {
    	this.setText(String.valueOf(value));
    }
    
    public int getInt()
    {
    	return Integer.valueOf(this.getText());
    }
}
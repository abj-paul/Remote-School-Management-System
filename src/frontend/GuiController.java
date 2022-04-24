package frontend;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.io.FileWriter;  
import java.io.IOException;
import java.io.InputStream;

import javafx.fxml.FXML;

public class GuiController {

	@FXML
	public TextField parameterListTextArea;
	@FXML
	public Button mySubmitButton;
	
	public void submitData(){
		//System.out.println(parameterListTextArea.getText());
		try {
      		//FileWriter myWriter = new FileWriter("input.txt");
			FileWriter myWriter = new FileWriter("/networking/input.txt"v);
     		myWriter.write(parameterListTextArea.getText());
      		myWriter.close();
      		System.out.println("Successfully wrote to the file.");
    		} catch (IOException e) {e.printStackTrace();}
	}
	
	public GuiController(){}
}
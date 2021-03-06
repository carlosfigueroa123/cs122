package com.cs122.classlabs.chap4;

import javafx.event.ActionEvent;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;

public class AgePane extends GridPane{
	private Label result;
    private TextField yearOfBirth;
    private TextField wrongFormat;
    
    public AgePane()
    {
        Font font = new Font(12);
        
        Label inputLabel = new Label("Year of birth:");
        inputLabel.setFont(font);
        GridPane.setHalignment(inputLabel, HPos.LEFT);
        
        Label outputLabel = new Label("Age:");
        outputLabel.setFont(font);
        GridPane.setHalignment(outputLabel, HPos.LEFT);
        
        result = new Label("---");
        result.setFont(font);
        GridPane.setHalignment(result, HPos.CENTER);
        
        yearOfBirth = new TextField();
        yearOfBirth.setFont(font);
        yearOfBirth.setPrefWidth(50);//here we resize the window where we put the input 
        yearOfBirth.setAlignment(Pos.CENTER);
        yearOfBirth.setOnAction(this::processReturn);
        
        setAlignment(Pos.CENTER);
        setHgap(20);
        setVgap(10);
        setStyle("-fx-background-color: white");
        
        add(inputLabel, 0, 0);
        add(yearOfBirth, 1, 0);
        add(outputLabel, 0, 1);
        add(result, 1, 1);
    }
    
    //--------------------------------------------------------------------
    //  Computes and displays the converted temperature when the user
    //  presses the return key while in the text field.
    //--------------------------------------------------------------------
    public void processReturn(ActionEvent event)//try catch should be right here
    {
    		int birthTemp = Integer.parseInt(yearOfBirth.getText());
            int ageTemp = 2020 - birthTemp;
            result.setText(ageTemp + "");	
    }
}
//catch these errors
// please enter a number// or if age is greater than 100, print good job, you lived for more than a century. for exceptions.

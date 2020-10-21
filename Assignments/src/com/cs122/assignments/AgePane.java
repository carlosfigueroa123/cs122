package com.cs122.assignments;


import javafx.event.ActionEvent;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class AgePane extends GridPane{
	private Label result;
	private Label except;
    private TextField yearOfBirth;

    
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
        
        except = new Label("");
        except.setFont(font);
        except.setTextFill(Color.RED);
	     GridPane.setHalignment(except, HPos.CENTER);
        
        
	    
        yearOfBirth = new TextField();
        yearOfBirth.setFont(font);
        yearOfBirth.setPrefWidth(100);//here we resize the window where we put the input 
        yearOfBirth.setAlignment(Pos.CENTER);
        yearOfBirth.setOnAction(event -> {
			try {
				processReturn(event);
			} catch (CentenaryException e) {
				result.setText("Good job, you lived more than a century");
			}
		});
       
       
        setAlignment(Pos.CENTER);
        setHgap(20);
        setVgap(10);
        setStyle("-fx-background-color: white");
        
        add(inputLabel, 0, 0);
        add(yearOfBirth, 1, 0);
        add(outputLabel, 0, 1);
        add(result, 1, 1);
        add(except, 0, 2);
    }
  
    public void processReturn(ActionEvent event) throws CentenaryException//try catch should be right here
    {
    	except.setText("");
    	try {
    		int birthTemp = Integer.parseInt(yearOfBirth.getText());
            int ageTemp = 2020 - birthTemp;
            result.setText(ageTemp + "");	
            
            CentenaryException problem = new CentenaryException("");
            
            if (ageTemp >= 100) 
            {
            	throw problem;
            }
    	}
    	catch (NumberFormatException exception)
    	{
    		except.setText("Invalid input. Must be an integer");
    		
        }
    }
}
//catch these errors
// please enter a number// or if age is greater than 100, print good job, you lived for more than a century. for exceptions.

package com.cs122.assignments;


import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.scene.text.Font;



public class StyleOptionsPane extends VBox
{
    private Text phrase;
    private CheckBox CheckBox1, CheckBox2, CheckBox3, CheckBox4, CheckBox5, CheckBox6;


    public StyleOptionsPane()
    {
        phrase = new Text("This is the sample text!");
        phrase.setFill(Color.AQUAMARINE);
        phrase.setFont(new Font ("Georgia", 12));
        
        CheckBox1 = new CheckBox("24");
        CheckBox1.setTextFill(Color.WHITE);
        CheckBox1.setOnAction(this::processCheckBoxAction);
        
        CheckBox2 = new CheckBox("60");
        CheckBox2.setTextFill(Color.WHITE);
        CheckBox2.setOnAction(this::processCheckBoxAction);
        
        CheckBox3 = new CheckBox("Times");
        CheckBox3.setTextFill(Color.WHITE);
        CheckBox3.setOnAction(this::processCheckBoxAction);
        
        CheckBox4 = new CheckBox("Courier");
        CheckBox4.setTextFill(Color.WHITE);
        CheckBox4.setOnAction(this::processCheckBoxAction);
        
        CheckBox5 = new CheckBox("Yellow");
        CheckBox5.setTextFill(Color.WHITE);
        CheckBox5.setOnAction(this::processCheckBoxAction);
        
        CheckBox6 = new CheckBox("White");
        CheckBox6.setTextFill(Color.WHITE);
        CheckBox6.setOnAction(this::processCheckBoxAction);
        
        HBox options = new HBox(CheckBox1, CheckBox2);
        options.setAlignment(Pos.CENTER);
        options.setSpacing(20);
        
        HBox options2 = new HBox(CheckBox3, CheckBox4);
        options2.setAlignment(Pos.CENTER);
        options2.setSpacing(20);
        
        HBox options3 = new HBox(CheckBox5, CheckBox6);
        options3.setAlignment(Pos.CENTER);
        options3.setSpacing(20);
        
        
        
        setSpacing(20);  // between the text and the check boxes
        getChildren().addAll(phrase, options, options2, options3);
    }
    

    public void processCheckBoxAction(ActionEvent event)
    {       
    	double size = 12;
    	String family = "Georgia";
        
        if (CheckBox1.isSelected()) {
        	size = 24;
        }
        if (CheckBox2.isSelected()) {
        	size = 60;
        }
        if (CheckBox3.isSelected()) {
        	family = "Times";
        }
        
        if (CheckBox4.isSelected()) {
        	family = "Courier";
        }
        
        if (CheckBox5.isSelected()) {
        	phrase.setFill(Color.YELLOW);
        }
        else if (CheckBox6.isSelected()) {
        	phrase.setFill(Color.WHITE);
        }
        else {
        	phrase.setFill(Color.AQUAMARINE);
        }
        
        phrase.setFont(Font.font(family, size));
        
    }
}

package com.cs122.classlabs.chap4;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

//************************************************************************
//  PushCounter.java       Author: Lewis/Loftus
//
//  Demonstrates JavaFX buttons and event handlers.
//************************************************************************

public class PushCounter extends Application
{
    private int count;
    private Text countText;
    
    //--------------------------------------------------------------------
    //  Presents a GUI containing a button and text that displays
    //  how many times the button is pushed.
    //--------------------------------------------------------------------
    public void start(Stage primaryStage)
    {
        count = 0;
        countText = new Text("Pushes: 0");

        Button push = new Button("Push Me!"); //we could define this at the beginning
        push.setOnAction(this::processButtonPress);//refers to this specific method

        FlowPane pane = new FlowPane(push, countText);//not stackpane
        pane.setAlignment(Pos.CENTER); //the bottom is on the center
        pane.setHgap(20);// h is horizontal v is vertical
        pane.setStyle("-fx-background-color: cyan");

        Scene scene = new Scene(pane, 300, 100);
        
        primaryStage.setTitle("Push Counter");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    //--------------------------------------------------------------------
    //  Updates the counter and text when the button is pushed.
    //--------------------------------------------------------------------
    public void processButtonPress(ActionEvent event)//this parameter is very important
    {
        count++;//here is where we shoudl put the uses of the bottom
        countText.setText("Pushes: " + count);
    }
    
    public static void main(String[] args)
    {
        launch(args);
    }
}

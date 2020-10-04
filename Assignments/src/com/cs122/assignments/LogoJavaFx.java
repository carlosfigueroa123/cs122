package com.cs122.assignments;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.text.*;

public class LogoJavaFx extends Application
{

    public void start(Stage primaryStage)
    {
        Text name = new Text(40, 60, "Plastics of the Andes");
      
        name.setFill(Color.YELLOW);
        name.setFont(new Font(25));
        
        Text moto = new Text(95, 270, "Everthing in plastics.");
        
        Rectangle bag = new Rectangle(100, 120, 100, 110);
        bag.setFill(Color.ANTIQUEWHITE);
        
        Rectangle hand1 = new Rectangle(100, 90, 20, 60);
        hand1.setFill(Color.ANTIQUEWHITE);
        
        Rectangle hand2 = new Rectangle(180, 90, 20, 60);
        hand2.setFill(Color.ANTIQUEWHITE);
        
        Circle circle = new Circle(150, 170, 30);
        circle.setFill(Color.CORNFLOWERBLUE);
        
        Text PA = new Text(140, 175, "P/A");
        PA.setFill(Color.YELLOW);
        
        Group logo = new Group(bag, hand1, hand2, circle, PA);
        Group root = new Group(name, moto, logo);
        Scene scene = new Scene(root, 300, 300, Color.CADETBLUE);
        
        primaryStage.setTitle("A JavaFX Program");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    

    public static void main(String[] args)
    {
        launch(args);
    }
}

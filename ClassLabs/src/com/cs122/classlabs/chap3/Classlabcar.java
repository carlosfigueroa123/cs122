package com.cs122.classlabs.chap3;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;


public class Classlabcar extends Application{
	 public void start(Stage primaryStage)
	    {
	       
	        Rectangle body = new Rectangle(100, 150, 400, 235);
	        body.setFill(Color.YELLOW);
	        
	        Rectangle ground = new Rectangle(0, 410, 600, 600);
	        ground.setFill(Color.GREY);
	        
	        Rectangle window1 = new Rectangle(110, 180, 60, 100);
	        window1.setFill(Color.BLACK);
	        
	        Rectangle window2 = new Rectangle(190, 180, 60, 100);
	        window2.setFill(Color.BLACK);
	        
	        Rectangle window3 = new Rectangle(270, 180, 60, 100);
	        window3.setFill(Color.BLACK);
	        
	        Rectangle window4 = new Rectangle(350, 180, 60, 100);
	        window4.setFill(Color.BLACK);
	        
	        Rectangle window5 = new Rectangle(430, 180, 60, 100);
	        window5.setFill(Color.BLACK);
	        
	        Circle wheel1 = new Circle(150, 400, 35);
	        wheel1.setFill(Color.BLACK);
	        
	        Circle wheel2 = new Circle(450, 400, 35);
	        wheel2.setFill(Color.BLACK);
	        
	        
	        Group wheels = new Group(wheel1, wheel2);
	        Group windows = new Group(window1, window2, window3, window4, window5);
	        Group bus = new Group(body, windows, wheels);
	        Group root = new Group(ground, bus);
	        Scene scene = new Scene(root, 600, 550, Color.SLATEBLUE);
	        
	        
	        primaryStage.setTitle("A bus");
	        primaryStage.setScene(scene);
	        primaryStage.show();
	    }
	  
	    public static void main(String[] args)
	    {
	        launch(args);
	    }
}

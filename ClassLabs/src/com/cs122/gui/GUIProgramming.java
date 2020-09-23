package com.cs122.gui;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class GUIProgramming extends Application {
	
	 public void start(Stage primaryStage)
	    {
	        Text text1 = new Text(200, 400, "I am learning GUI");
	        text1.setFill(Color.WHITE);
	        
	        Circle circle = new Circle(250, 250, 250);
	        circle.setFill(Color.BLACK);
	        
	        Rectangle rectangle = new Rectangle(100, 100, 150, 50);
	        rectangle.setFill(Color.BLUE);
	        
	        Rectangle rectangle1 = new Rectangle(0,0,500,500);
	        rectangle1.setFill(null);
	        rectangle1.setStroke(Color.BLACK);
	        rectangle1.setWidth(20);
	       
	        
	        Group root = new Group(circle, rectangle, text1, rectangle1);
	        Scene scene = new Scene(root, 500, 500, Color.WHITE);
	        primaryStage.setTitle("GUI programming");
	        primaryStage.setScene(scene);
	        primaryStage.show();
	    }
	    //--------------------------------------------------------------------
	    //  Launches the JavaFX application. This method is not required
	    //  in IDEs that launch JavaFX applications automatically.
	    //--------------------------------------------------------------------
	    public static void main(String[] args)
	    {
	        launch(args);
	    }
}

package com.cs122.assignments;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AgeConverter extends Application {

	
	public void start(Stage primaryStage) throws Exception{
		
		Scene scene = new Scene(new AgePane(), 450, 350);
       
        primaryStage.setTitle("Age Converter");
        primaryStage.setScene(scene);
        primaryStage.show();
	}
	
	public static void main(String[] args) {
		
		launch(args);
	}


}

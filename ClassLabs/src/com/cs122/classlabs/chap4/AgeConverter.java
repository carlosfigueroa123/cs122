package com.cs122.classlabs.chap4;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AgeConverter extends Application {

	
	public void start(Stage primaryStage) throws Exception {
		
		Scene scene = new Scene(new AgePane(), 300, 150);
        
        primaryStage.setTitle("Age Converter");
        primaryStage.setScene(scene);
        primaryStage.show();
	}
	
	public static void main(String[] args) {
		
		launch(args);
	}


}

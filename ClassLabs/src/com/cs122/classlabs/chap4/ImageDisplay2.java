package com.cs122.classlabs.chap4;


import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

//************************************************************************
//  ImageDisplay.java       Author: Lewis/Loftus
//
//  Demonstrates a the use of Image and ImageView objects.
//************************************************************************

public class ImageDisplay2 extends Application
{
    //--------------------------------------------------------------------
    //  Displays an image centered in a window.
    //--------------------------------------------------------------------
    public void start(Stage primaryStage)
    {
        Image img = new Image("https://preview.redd.it/4c83otppoql31.jpg?width=648&format=pjpg&auto=webp&s=c941b163da8a225bfa429d074bca8bdf2ca3a976");
        ImageView imgView = new ImageView(img);

        StackPane pane = new StackPane(imgView);
        pane.setStyle("-fx-background-color: BLUE");
        imgView.setViewport(new Rectangle2D(20, 20, 600, 650));
        
        Scene scene = new Scene(pane, 800, 700);

        primaryStage.setTitle("Image Display");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String[] args)
    {
        launch(args);
    }
}

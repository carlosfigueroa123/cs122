package com.cs122.classlabs.chap7;


import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

//************************************************************************
//  AlienDirection.java       Author: Lewis/Loftus
//
//  Demonstrates the handling of keyboard events.
//************************************************************************

public class AlienDirection extends Application
{
    public final static int JUMP = 10;
    
    private ImageView imageView;

    //--------------------------------------------------------------------
    //  Displays an image that can be moved using the arrow keys.
    //--------------------------------------------------------------------
    public void start(Stage primaryStage)
    {
        Image alien = new Image("https://images-na.ssl-images-amazon.com/images/I/71J6UxizXyL._AC_SL1500_.jpg");
        imageView = new ImageView(alien);
        imageView.setX(-20);
        imageView.setY(-20);
        imageView.setScaleX(0.20);
        imageView.setScaleY(0.20);
        
        //checked for ways to read the url
        
        Group root = new Group(imageView);

        Scene scene = new Scene(root, 400, 200, Color.GREEN);
        scene.setOnKeyPressed(this::processKeyPress);

        primaryStage.setTitle("Alien Direction");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    //--------------------------------------------------------------------
    //  Modifies the position of the image view when an arrow key is
    //  pressed.
    //--------------------------------------------------------------------
    public void processKeyPress(KeyEvent event)
    {
        switch (event.getCode())
        {
            case W:
                imageView.setY(imageView.getY() - JUMP);//what is jump? 
                break;
            case S:
                imageView.setY(imageView.getY() + JUMP);
                break;
            case D:
                imageView.setX(imageView.getX() + JUMP);
                break;
            case A:
                imageView.setX(imageView.getX() - JUMP);
                break;
            default:
                break;  // do nothing if it's not an arrow key
        }
    }
    
    public static void main(String[] args)
    {
        launch(args);
    }
}

package com.cs122.classlabs.chap6;


import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.transform.Shear;
import javafx.stage.Stage;

//************************************************************************
//  Robots.java       Author: Lewis/Loftus
//
//  Demonstrates graphical transformations.
//************************************************************************

public class Robots extends Application
{
    //--------------------------------------------------------------------
    //  Displays three robot faces, applying various transformations.
    //--------------------------------------------------------------------
    public void start(Stage primaryStage)
    {
        RobotFace robot1 = new RobotFace();
        robot1.setTranslateX(25);
        robot1.setTranslateY(270);
        robot1.setRotate(-30);
        
        RobotFace robot2 = new RobotFace();
        robot2.setTranslateX(370);
        robot2.setTranslateY(30);
        robot2.setRotate(30);

        RobotFace robot3 = new RobotFace();
        robot3.setTranslateX(190);
        robot3.setTranslateY(140);
        robot3.setScaleX(2.0);
        robot3.setScaleY(2.0);
        robot3.getTransforms().add(new Shear(0.3, 0.2));
        
        Group root = new Group(robot1, robot2, robot3);
        
        Scene scene = new Scene(root, 500, 380, Color.AQUAMARINE);
                
        primaryStage.setTitle("Robots");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String[] args)
    {
        launch(args);
    }
}

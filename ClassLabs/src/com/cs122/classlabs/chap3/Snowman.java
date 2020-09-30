package com.cs122.classlabs.chap3;


//************************************************************************
//  Snowman.java       Author: Lewis/Loftus
//
//  Demonstrates the translation of a set of shapes.
//************************************************************************

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.text.Text;

public class Snowman extends Application
{
    //--------------------------------------------------------------------
    //  Presents a snowman scene.
    //--------------------------------------------------------------------
    public void start(Stage primaryStage)
    {        
        Ellipse base = new Ellipse(80, 210, 80, 60);
        base.setFill(Color.WHITE);

        Ellipse middle = new Ellipse(80, 130, 50, 40);
        middle.setFill(Color.WHITE);

        Text message = new Text(425, 85, "NASA");
        
        Ellipse ship = new Ellipse(80, 160, 50, 20);
        ship.setFill(Color.GREY);
        
        Circle window = new Circle(80, 150, 30);
        window.setFill(Color.FORESTGREEN);
        
        Circle light1 = new Circle(65, 160, 5);
        light1.setFill(Color.YELLOW);
        
        Circle light2 = new Circle(95, 160, 5);
        light2.setFill(Color.YELLOW);
         
        Group aliens = new Group(window, ship, light1, light2, message);
        
        Circle head = new Circle(80, 70, 30);
        head.setFill(Color.WHITE);

        Circle rightEye = new Circle(70, 60, 5);
        Circle leftEye = new Circle(90, 60, 5);
        Line mouth = new Line(70, 80, 90, 80);
        
        Circle nose = new Circle(80, 70, 5);
        nose.setFill(Color.ORANGE);

        Circle topButton = new Circle(80, 120, 6);
        topButton.setFill(Color.RED);
        Circle bottomButton = new Circle(80, 140, 6);
        bottomButton.setFill(Color.RED);

        Line leftArm = new Line(110, 130, 160, 130);
        leftArm.setStrokeWidth(3);
        Line rightArm = new Line(50, 130, 0, 100);
        rightArm.setStrokeWidth(3);
        

        Rectangle stovepipe = new Rectangle(60, 0, 40, 50);
        Rectangle brim = new Rectangle(50, 45, 60, 5);
        Group hat = new Group(stovepipe, brim);
        hat.setTranslateX(10);
        hat.setRotate(15);

        Group snowman = new Group(base, middle, head, leftEye, rightEye,
            mouth, topButton, bottomButton, leftArm, rightArm, hat, nose);
        snowman.setTranslateX(170);
        snowman.setTranslateY(50);

        Circle sun = new Circle(50, 50, 30);
        sun.setFill(Color.GOLD);
        
        Circle moon = new Circle(440, 80, 40);
        moon.setFill(Color.ANTIQUEWHITE);
        
        
        Rectangle sign = new Rectangle(240, 60, 20, 30);
        sign.setFill(Color.BLUEVIOLET);
        Circle first = new Circle(250, 74, 7);
        first.setFill(Color.YELLOW);
        Circle second = new Circle(250, 74, 3);
        second.setFill(Color.PURPLE);
        Group hatDec = new Group(sign, first, second);
        hatDec.setTranslateX(10);
        hatDec.setRotate(15);

        Rectangle ground = new Rectangle(0, 250, 500, 100);
        ground.setFill(Color.STEELBLUE);
        
        Rectangle laser = new Rectangle(145, 163, 3, 87);
        laser.setFill(Color.RED);
        laser.setRotate(-40);

        Group root = new Group(ground, sun, moon, snowman, hatDec, aliens, laser);
        Scene scene = new Scene(root, 500, 350, Color.LIGHTBLUE);

        primaryStage.setTitle("Snowman");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args)
    {
        launch(args);
    }
}

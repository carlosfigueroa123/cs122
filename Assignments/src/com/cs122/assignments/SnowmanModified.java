package com.cs122.assignments;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.text.Text;

public class SnowmanModified extends Application {
	public void start(Stage primaryStage)
    {        
        Ellipse base = new Ellipse(120, 210, 80, 60);
        base.setFill(Color.WHITE);

        Ellipse middle = new Ellipse(120, 130, 50, 40);
        middle.setFill(Color.WHITE);

        Text message = new Text(465, 85, "NASA");
        
        Ellipse ship = new Ellipse(120, 160, 50, 20);
        ship.setFill(Color.GREY);
        
        Circle window = new Circle(120, 150, 30);
        window.setFill(Color.FORESTGREEN);
        
        Circle light1 = new Circle(105, 160, 5);
        light1.setFill(Color.YELLOW);
        
        Circle light2 = new Circle(135, 160, 5);
        light2.setFill(Color.YELLOW);
         
        Group aliens = new Group(window, ship, light1, light2, message);
        
        Circle head = new Circle(120, 70, 30);
        head.setFill(Color.WHITE);

        Circle rightEye = new Circle(110, 60, 5);
        Circle leftEye = new Circle(130, 60, 5);
        Line mouth = new Line(110, 80, 130, 80);
        
        Circle nose = new Circle(120, 70, 5);
        nose.setFill(Color.ORANGE);

        Circle topButton = new Circle(120, 120, 6);
        topButton.setFill(Color.RED);
        Circle bottomButton = new Circle(120, 140, 6);
        bottomButton.setFill(Color.RED);

        Line leftArm = new Line(150, 130, 200, 130);
        leftArm.setStrokeWidth(3);
        Line rightArm = new Line(90, 130, 40, 100);
        rightArm.setStrokeWidth(3);
        

        Rectangle stovepipe = new Rectangle(100, 0, 40, 50);
        Rectangle brim = new Rectangle(90, 45, 60, 5);
        Group hat = new Group(stovepipe, brim);
        hat.setTranslateX(10);
        hat.setRotate(15);

        Group snowman = new Group(base, middle, head, leftEye, rightEye,
            mouth, topButton, bottomButton, leftArm, rightArm, hat, nose);
        snowman.setTranslateX(170);
        snowman.setTranslateY(50);

        Circle sun = new Circle(90, 50, 30);
        sun.setFill(Color.GOLD);
        
        Circle moon = new Circle(480, 80, 40);
        moon.setFill(Color.ANTIQUEWHITE);
        
        
        Rectangle sign = new Rectangle(280, 60, 20, 30);
        sign.setFill(Color.BLUEVIOLET);
        Circle first = new Circle(290, 74, 7);
        first.setFill(Color.YELLOW);
        Circle second = new Circle(290, 74, 3);
        second.setFill(Color.PURPLE);
        Group hatDec = new Group(sign, first, second);
        hatDec.setTranslateX(10);
        hatDec.setRotate(15);

        Rectangle ground = new Rectangle(40, 250, 500, 100);
        ground.setFill(Color.STEELBLUE);
        
        Rectangle laser = new Rectangle(185, 163, 3, 87);
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

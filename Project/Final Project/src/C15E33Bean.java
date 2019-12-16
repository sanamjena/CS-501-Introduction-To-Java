/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.Toolkit;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * @author Sanam Sritam Jena (10454295)
 * Stevens Institute of Technology
 * 
 * (Game: bean-machine animation)
 * Write a program that animates the bean machine introduced in
 * Programming Exercise 7.21. The animation terminates after ten
 * balls are dropped, as shown in Figure 15.36b and c.
 */
public class C15E33Bean extends Application {
    
        @Override
    public void start(Stage primaryStage) {

        TBeanMachinePane pane = new TBeanMachinePane(8, 600, 600);

        Text text = new Text(20, 20, "");

        pane.setOnMouseMoved(e -> {
            text.setText("x = " + e.getX() + "\n" + "y = " + e.getY());
        });

        Scene scene = new Scene(new StackPane(pane));

        primaryStage.setScene(scene);
        pane.getChildren().add(text);
        primaryStage.setTitle("Bean Machine");
        primaryStage.show();

        for (int i = 0; i < 10; i++) {
            pane.dropBall();
        }

    }

    public static void main(String[] args) {

        Application.launch(args);

    }
}

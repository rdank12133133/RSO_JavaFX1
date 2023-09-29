package com.example.rso_java_majdonko;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        User user = new User("Maj", "Donko", "geslo");

        Group root = new Group();
        Scene scene = new Scene(root, 320, 240);

        // Create a Text object to display user data
        Text text = new Text();
        text.setX(40);
        text.setY(40);

        // Set the text to display user data using getter methods
        text.setText("Prijavljeni kot " + user.getIme() + " " + user.getPriimek());

        // Add the Text object to the root group


        TextField textField = new TextField();
        textField.setPromptText("Enter text here");


        textField.setOnAction(e -> {
            String userInput = textField.getText();
            text.setText("Method nekaj() called with argument: " + userInput);
        });

        root.getChildren().addAll(text, textField);
        stage.setTitle("Program");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}

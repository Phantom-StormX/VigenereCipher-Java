package com.phantomstormx.vigenerecipherjava;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Objects;

// combines all classes together, then launcher uses start to start the app

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Vigenere-view.fxml"))); // yoinks all the information from the fxml (includes the control, idk how tho don't ask me)
        primaryStage.setTitle("Vigenere Cipher"); // sets actual app title
        primaryStage.setScene(new Scene(root, 500, 500));
        primaryStage.show();
    }
}

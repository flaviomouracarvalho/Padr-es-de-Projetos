package com.example.myapp;

import com.example.myapp.view.MainScene;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    private Stage stage;
    @Override
    public void start(Stage stage) throws IOException {
        this.stage = stage;
        Scene scene = new MainScene(this);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public void setScene(Scene scene) {
        this.stage.setScene(scene);
    }

    public static void main(String[] args) {
        launch();
    }
}
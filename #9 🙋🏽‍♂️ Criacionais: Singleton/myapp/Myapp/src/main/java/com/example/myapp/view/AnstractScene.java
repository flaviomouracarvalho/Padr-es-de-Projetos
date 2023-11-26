package com.example.myapp.view;

import com.example.myapp.HelloApplication;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.TilePane;

public abstract class AnstractScene extends Scene {
    public AnstractScene(HelloApplication helloApplication) {
        super(new TilePane(), 644, 480);
    }
}

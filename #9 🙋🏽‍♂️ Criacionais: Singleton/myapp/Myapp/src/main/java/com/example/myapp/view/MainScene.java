package com.example.myapp.view;

import com.example.myapp.HelloApplication;
import javafx.scene.control.Button;
import javafx.scene.layout.TilePane;

public class MainScene extends AnstractScene {
    public MainScene(HelloApplication helloApplication) {
        super(helloApplication);
        var btnRelatorios = new Button("Relatórios");
        var btnConfig = new Button("Configurações");
        setRoot(new TilePane(btnRelatorios, btnConfig));

        btnRelatorios.setOnAction(event -> helloApplication.setScene(new RelatoriosScene(helloApplication)));
        btnConfig.setOnAction(event -> helloApplication.setScene(new ConfigScene(helloApplication)));
    }
}

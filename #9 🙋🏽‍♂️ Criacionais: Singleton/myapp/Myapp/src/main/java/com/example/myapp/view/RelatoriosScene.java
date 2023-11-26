package com.example.myapp.view;

import com.example.myapp.HelloApplication;
import com.example.myapp.model.Config;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.TilePane;

public class RelatoriosScene extends AnstractScene {
    private final Config config = Config.getInstance();
    public RelatoriosScene(HelloApplication helloApplication) {
        super(helloApplication);
        var label = new Label("Formato de relatórios = " + config.getFormatoRelatorios());
        var btnVoltar = new Button("Voltar");
        setRoot(new TilePane(label, btnVoltar));

        btnVoltar.setOnAction(event -> helloApplication.setScene(new MainScene(helloApplication)));
    }
}

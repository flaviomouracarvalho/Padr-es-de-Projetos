package com.example.myapp.view;

import com.example.myapp.HelloApplication;
import com.example.myapp.model.Config;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;

public class ConfigScene extends AnstractScene {
    private final Config config = Config.getInstance();
    public ConfigScene(HelloApplication helloApplication) {
        super(helloApplication);
        var label1 = new Label("Formato de Relatórios");
        var fieldFormatoRelatorios = new TextField(config.getFormatoRelatorios());
        var label2 = new Label("Tipo de graficos");
        var fieldTipoGraficos = new TextField(config.getTipoGraficos());
        var btnOk = new Button("OK");
        setRoot(new VBox(label1, fieldFormatoRelatorios, label2, fieldTipoGraficos, btnOk));

        btnOk.setOnAction(event -> {
            config.setFormatoRelatorios(fieldFormatoRelatorios.getText());
            config.setTipoGraficos(fieldTipoGraficos.getText());
            helloApplication.setScene(new MainScene(helloApplication));
        });
    }
}

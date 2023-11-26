package com.example.myapp.model;

public class Config {
    String formatoRelatorios = "Html";
    String tipoGraficos = "Pizza";
    private static final Config instance = new Config();

    private Config(){

    }

    public static Config getInstance(){
        return instance;
    }

    public String getFormatoRelatorios() {
        return formatoRelatorios;
    }

    public void setFormatoRelatorios(String formatoRelatorios) {
        this.formatoRelatorios = formatoRelatorios;
    }

    public String getTipoGraficos() {
        return tipoGraficos;
    }

    public void setTipoGraficos(String tipoGraficos) {
        this.tipoGraficos = tipoGraficos;
    }
}

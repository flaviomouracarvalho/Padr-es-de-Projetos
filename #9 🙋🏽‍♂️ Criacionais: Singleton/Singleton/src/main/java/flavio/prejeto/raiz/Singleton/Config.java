package flavio.prejeto.raiz.Singleton;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("singleton") o escopo singleto é padrão    
public class Config {
    private static Config instance = new Config();

    public  Config() {
    }

    @Override
    public String toString() {
        return "Config{" +
                "formatoRelatorios='" + formatoRelatorios + '\'' +
                ", tipoGraficos='" + tipoGraficos + '\'' +
                '}';
    }

    public static Config getInstance() {
        return instance;
    }

    //    private static synchronized Config getIntance(){
//        if(instance == null){
//            instance = new Config();
//        }
//        return instance;
//    }

    private String formatoRelatorios = "pdf";
    private String tipoGraficos = "barras";

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

//    public static void main(String[] args) {
//        var config1 = Config.getIntance();
//        var config2 = Config.getIntance();
//        config1.formatoRelatorios = "xml";
//        config1.tipoGraficos = "Pizza";
//        System.out.println(config1);
//        System.out.println(config2);
//        if (config1 ==config2)
//            System.out.println("Objetos iguais");
//        else System.out.println("Objetos diferentes");
//    }
}

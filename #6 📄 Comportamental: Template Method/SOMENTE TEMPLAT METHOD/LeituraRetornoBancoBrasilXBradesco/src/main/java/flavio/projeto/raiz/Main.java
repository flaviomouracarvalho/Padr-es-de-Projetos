package flavio.projeto.raiz;

import java.net.URI;
import java.net.URISyntaxException;

public class Main {
    public static void main(String[] args) throws URISyntaxException {
        var processar1 = new LeituraRetornoBancoBrasil();
        processar1.processarBoletos(new URI("file:////home/flavio/Documentos/OFICIAL/EU/6/LeituraRetornoBancoBrasilXBradesco/LeituraRetornoBancoBrasilXBradesco/banco-brasil-1.csv"));
        var processar2 = new LeituraRetornoBancoBradesco();
        processar2.processarBoletos(new URI("file:////home/flavio/Documentos/OFICIAL/EU/6/LeituraRetornoBancoBrasilXBradesco/LeituraRetornoBancoBrasilXBradesco/bradesco-1.csv"));
    }
}
package flavio.projeto.raiz;

import java.net.URI;
import java.net.URISyntaxException;

public class Main {
    public static void main(String[] args) throws URISyntaxException {
        var processador = new ProcessarBoletos(LeituraRetornoBancoBrasil::lerArquivo);
        processador.processar(new URI("file://///home/flavio/Documentos/OFICIAL/EU/3/LeituraRetornoBancoBrasilXBradesco/LeituraRetornoBancoBrasilXBradesco/banco-brasil-1.csv"));
        processador.setLeituraRetorno(LeituraRetornoBancoBradesco::lerArquivo);
        processador.processar(new URI("file://///home/flavio/Documentos/OFICIAL/EU/3/LeituraRetornoBancoBrasilXBradesco/LeituraRetornoBancoBrasilXBradesco/bradesco-1.csv"));
    }
}
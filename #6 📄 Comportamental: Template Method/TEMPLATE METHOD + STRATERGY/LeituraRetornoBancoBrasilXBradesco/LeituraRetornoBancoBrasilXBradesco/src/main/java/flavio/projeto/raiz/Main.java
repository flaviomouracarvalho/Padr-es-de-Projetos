package flavio.projeto.raiz;

import java.net.URI;
import java.net.URISyntaxException;

public class Main {
    public static void main(String[] args) throws URISyntaxException {
        var leituraBB = new LeituraRetornoBancoBrasil();
        var processadorBB = new ProcessarBoletos(leituraBB);
        processadorBB.processar(new URI("file:////home/flavio/Documentos/OFICIAL/EU/6/LeituraRetornoBancoBrasilXBradesco/LeituraRetornoBancoBrasilXBradesco/banco-brasil-1.csv"));
    }
}
package flavio.projeto.raiz;

import java.net.URI;
import java.net.URISyntaxException;

public class Main {
    public static void main(String[] args) throws URISyntaxException {
        var leituraRetornoBB = new LeituraRetornoBancoBrasil();
        var processadorBB = new ProcessarBoletos(leituraRetornoBB);
        var leituraRetornoBD = new LeituraRetornoBancoBradesco();
        var processadorBD = new ProcessarBoletos(leituraRetornoBD);
        processadorBB.processar(new URI("file://///home/flavio/Documentos/OFICIAL/EU/3/LeituraRetornoBancoBrasilXBradesco/LeituraRetornoBancoBrasilXBradesco/banco-brasil-1.csv"));
        processadorBD.processar(new URI("file://///home/flavio/Documentos/OFICIAL/EU/3/LeituraRetornoBancoBrasilXBradesco/LeituraRetornoBancoBrasilXBradesco/bradesco-1.csv"));
    }
}
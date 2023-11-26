package flavio.projeto.raiz;

import java.net.URI;
import java.util.List;
import java.util.function.Function;

public class ProcessarBoletos {
    private Function<URI, List<Boleto>> leituraRetorno;

    public ProcessarBoletos(Function< URI, List<Boleto> > leituraRetorno){
        this.leituraRetorno =leituraRetorno;
    }
    public final void processar(URI nomeArquivo){
        List<Boleto> boletos = leituraRetorno.apply(nomeArquivo);
        for (Boleto boleto : boletos) {
            System.out.println(boleto);
        }
    }

    public void setLeituraRetorno(Function< URI, List<Boleto> > leituraRetorno){
        this.leituraRetorno = leituraRetorno;
    }
}

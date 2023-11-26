package flavio.projeto.raiz;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class ProcessarBoletos  {
    private LeituraRetorno leituraRetorno;

    public ProcessarBoletos(LeituraRetorno leituraRetorno) {
        this.leituraRetorno = leituraRetorno;
    }

    public final void processar(URI nomeArquivo){
        var boletos = new ArrayList<Boleto>();
        try {
            var lista = Files.readAllLines(Paths.get(nomeArquivo));
            for (var linha: lista){
                var vetor = linha.split(";");
                var boleto = leituraRetorno.processarLinhaArquivo(vetor);
                boletos.add(boleto);
            }
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
        boletos.forEach(System.out::println);
    }

    public void setLeituraRetorno(LeituraRetorno leituraRetorno) {
        this.leituraRetorno = leituraRetorno;
    }
}

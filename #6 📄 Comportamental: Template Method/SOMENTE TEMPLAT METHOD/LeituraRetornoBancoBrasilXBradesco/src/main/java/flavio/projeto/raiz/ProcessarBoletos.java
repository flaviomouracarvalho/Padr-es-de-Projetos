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

public abstract class ProcessarBoletos {
    public static final DateTimeFormatter FORMATO_DATA = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    public static final DateTimeFormatter FORMATO_DATA_HORA = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    public final void processarBoletos(URI nomeArquivo){
        var boletos = new ArrayList<Boleto>();
        try {
            var lista = Files.readAllLines(Paths.get(nomeArquivo));
            System.out.println("----------------Banco do Brasil------------------");
            for (var linha: lista){
                var vetor = linha.split(";");
                var boleto = processardorLinhaArquivo(vetor);
                boletos.add(boleto);
            }
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
        boletos.forEach(System.out::println);
    }

    abstract Boleto processardorLinhaArquivo(String[] vetor);

}

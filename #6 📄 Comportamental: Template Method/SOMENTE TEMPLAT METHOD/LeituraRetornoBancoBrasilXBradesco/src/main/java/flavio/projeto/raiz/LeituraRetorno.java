package flavio.projeto.raiz;

import java.net.URI;
import java.time.format.DateTimeFormatter;
import java.util.List;

public interface LeituraRetorno {
    // No lugar de String pode se usar a String
    public List<Boleto> lerArquivo(URI nomeArquivo);
}

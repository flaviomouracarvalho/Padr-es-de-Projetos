package flavio.projeto.raiz;

import java.net.URI;
import java.time.format.DateTimeFormatter;
import java.util.List;

public interface LeituraRetorno {
    public static final DateTimeFormatter FORMATO_DATA = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    public static final DateTimeFormatter FORMATO_DATA_HORA = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    // No lugar de String pode se usar a String
    Boleto processarLinhaArquivo(String[] vetor);
}

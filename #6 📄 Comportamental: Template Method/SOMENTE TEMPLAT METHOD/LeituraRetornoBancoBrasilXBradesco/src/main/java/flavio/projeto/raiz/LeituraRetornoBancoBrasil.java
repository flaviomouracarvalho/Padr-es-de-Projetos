package flavio.projeto.raiz;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class LeituraRetornoBancoBrasil extends ProcessarBoletos{
    @Override
     Boleto processardorLinhaArquivo(String[] vetor) {
        Boleto boleto = new Boleto();
        boleto.setId(Integer.parseInt(vetor[0]));
        boleto.setCodBanco(vetor[1]);
        boleto.setDataVencimento(LocalDate.parse(vetor[2], FORMATO_DATA));
        //boleto.setDataPagamento(LocalDateTime.parse(vetor[3], FORMATO_DATA).toLocalDate().atTime(0, 0));
        boleto.setDataPagamento(LocalDate.parse(vetor[3], FORMATO_DATA).atTime(0, 0));
        boleto.setCpfCliente(vetor[4]);
        boleto.setValor(Double.parseDouble(vetor[5]));
        boleto.setJuros(Double.parseDouble(vetor[6]));
        boleto.setMulta(Double.parseDouble(vetor[7]));
        return boleto;
    }
}

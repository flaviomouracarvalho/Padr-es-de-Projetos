package flavio.projeto.raiz;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class LeituraRetornoBancoBradesco implements LeituraRetorno {
    @Override
    public Boleto processarLinhaArquivo(String[] vetor) {
        Boleto boleto = new Boleto();
        boleto.setId(Integer.parseInt(vetor[0]));
        boleto.setCodBanco(vetor[1]);
        boleto.setAgencia(vetor[2]);
        boleto.setContaBancaria(vetor[3]);
        boleto.setDataVencimento(LocalDate.parse(vetor[4], FORMATO_DATA));
        boleto.setDataPagamento(LocalDateTime.parse(vetor[5], FORMATO_DATA_HORA));
        boleto.setCpfCliente(vetor[6]);
        boleto.setValor(Double.parseDouble(vetor[7]));
        boleto.setJuros(Double.parseDouble(vetor[8]));
        boleto.setMulta(Double.parseDouble(vetor[9]));
        return boleto;
    }
}

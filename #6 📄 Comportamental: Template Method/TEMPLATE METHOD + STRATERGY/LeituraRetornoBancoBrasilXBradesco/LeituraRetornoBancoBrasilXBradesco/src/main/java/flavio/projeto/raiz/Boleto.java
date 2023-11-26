package flavio.projeto.raiz;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Boleto {
    private int id;
    private String codBanco;
    private LocalDate dataVencimento;
    private LocalDateTime dataPagamento;
    private String cpfCliente;
    private Double valor;
    private Double multa;
    private Double juros;
    private String agencia;
    private String contaBancaria;

    public Boleto() {
    }

    public Boleto(int id, String codBanco, LocalDate dataVencimento, LocalDateTime dataPagamento, String cpfCliente,
                  Double valor, Double multa, Double juros, String agencia, String contaBancaria) {
        this.id = id;
        this.codBanco = codBanco;
        this.dataVencimento = dataVencimento;
        this.dataPagamento = dataPagamento;
        this.cpfCliente = cpfCliente;
        this.valor = valor;
        this.multa = multa;
        this.juros = juros;
        this.agencia = agencia;
        this.contaBancaria = contaBancaria;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodBanco() {
        return codBanco;
    }

    public void setCodBanco(String codBanco) {
        this.codBanco = codBanco;
    }

    public LocalDate getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(LocalDate dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public LocalDateTime getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(LocalDateTime dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public String getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Double getMulta() {
        return multa;
    }

    public void setMulta(Double multa) {
        this.multa = multa;
    }

    public Double getJuros() {
        return juros;
    }

    public void setJuros(Double juros) {
        this.juros = juros;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getContaBancaria() {
        return contaBancaria;
    }

    public void setContaBancaria(String contaBancaria) {
        this.contaBancaria = contaBancaria;
    }

    @Override
    public String toString() {
        return "Boleto - " +
                "id=" + id ;
    }
}

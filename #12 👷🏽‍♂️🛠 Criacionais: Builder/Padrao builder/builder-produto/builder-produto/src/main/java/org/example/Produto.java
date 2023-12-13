package org.example;

import lombok.Builder;
import lombok.Data;

import java.util.Objects;

@Builder @Data
public final class Produto {
    private Long id;
    private String titulo;
    private String descricao;
    private String marca;
    private String modelo;
    private int estoque;
    private double preco;
    private String url;

    public Produto(Long id, String titulo, String descricao, String marca, String modelo, int estoque, double preco, String url) {
        this.setId(id);
        this.setTitulo(titulo);
        this.setDescricao(descricao);
        this.setMarca(marca);
        this.setModelo(modelo);
        this.setEstoque(estoque);
        this.setPreco(preco);
        this.setUrl(url);
    }

    public Long getId() {
        return id;
    }

    public void setTitulo(String titulo) {
        this.titulo = Objects.requireNonNull(titulo, "Titulo não pode ser null");
    }

    public void setModelo(String modelo) {
        if(marca== null){
            throw new IllegalStateException("Instancie marca antes");
        }
        this.modelo = modelo;
    }

}

package org.example;

public class Main {
    public static void main(String[] args) {
        var produto =
                Produto.builder()
                        .descricao("TV Grande")
                        .titulo("TV")
                        .id(1L)
                        .modelo("123x")
                        .marca("LG")
                        .build();
        System.out.println(produto);
    }
}
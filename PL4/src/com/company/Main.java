package com.company;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
	    LinhaEncomenda linha = new LinhaEncomenda();
        linha.setReference("referencia");
        linha.setDescription("descricao");
        linha.setdiscount(0.12);
        linha.setimposto(1.5);
        linha.setPrice(20);
        linha.setQuantity(50);

        int ano = 2013;
        int mes = 4;
        int dia = 13;
        LocalDate date = LocalDate.of(ano,mes,dia);

        Encomendas encomendas = new Encomendas("Joao",12345,"Rua ...", 1234, date);
        encomendas.adicionaLinhaEncomenda(linha);
        System.out.println(encomendas.calculaValorTotal());
        System.out.println(encomendas.calculaValorDesconto());
        System.out.println(encomendas.numeroTotalProdutos());
        System.out.println(encomendas.existeProdutoEncomenda("referencia"));
        encomendas.adicionaLinhaEncomenda(linha);
        encomendas.removeProduto("referencia");
        System.out.println(encomendas.toString());

    }
}

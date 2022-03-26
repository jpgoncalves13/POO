package com.company;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Ponto p1 = new Ponto(4,8);
        Ponto p2 = new Ponto(5,6);

        Circulo c1 = new Circulo(p1,12);
        Circulo c2 = new Circulo(p2,15);
        //Scanner sc = new Scanner(System.in);
        /*System.out.println("Diga um valor para o x, para o y e para o raio");

        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double raio = sc.nextDouble();

        circ.setX(x);
        circ.setY(y);
        circ.setRaio(raio);

        System.out.println(circ.getX());
        System.out.println(circ.getY());
        System.out.println(circ.getRaio());

        /*circ.alteraCentro(1,2);

        System.out.println("As novas coordenadas do centro do crirsulo são");

        System.out.println(circ.getX());
        System.out.println(circ.getY());*/

       /* System.out.println("A area do circulo é ");

        System.out.println(circ.calculaArea());

        System.out.println("O perímetro do circulo é ");

        System.out.println(circ.calculaPer());

        Circulo novo = circ.clone();
        System.out.println(circ.equals(novo));*/

        /**************************************************************************************************/
        LinhaEncomenda enc = new LinhaEncomenda("referencia","descrição",1,100,1,0.5);
        LinhaEncomenda enc2 = new LinhaEncomenda("ola","descrição",1,100,1,0.5);
        LinhaEncomenda enc3 = new LinhaEncomenda("xau","descrição",1,100,1,0.5);

        System.out.println(enc.toString2());

        /*Object enc2 = enc.clone();
        System.out.println(enc.equals(enc2));*/

        double valorVenda = enc.calculaValorLinhaEnc();
        System.out.println(valorVenda);

        double valordesc = enc.calculaValorDesconto();
        System.out.println(valordesc);

        /*****************************************************************************************************/

        // Fazer exercício 8

        int ano = 2013;
        int mes = 3;
        int dia = 13;
        LocalDate date = LocalDate.of(ano,mes,dia);
        LinhaEncomenda[] encomendas = new LinhaEncomenda[3];
        encomendas[0] = enc;
        encomendas[1] = enc2;
        encomendas[2] = enc3;

        Encomendas encomenda = new Encomendas("Joao",12345,"Rua da Fonte",123,date,encomendas);

        String nomeCliente = encomenda.getNomeCliente();
        int numFiscal = encomenda.getNumFiscal();
        String morada = encomenda.getMorada();
        int numEncomenda = encomenda.getNumEncomenda();
        LocalDate dataEncomenda = encomenda.getDataEncomenda();

        /*String Encomendas = new String();
        for(int i = 0; i < linhaEncomenda.length; i++){
            if (linhaEncomenda[i] != null) {
                Encomendas += linhaEncomenda[i].toString2() + " ";
            }
        }*/

        //System.out.println(nomeCliente + " " + numFiscal + " " + morada + " " + numEncomenda + " " + dataEncomenda + " " + Encomendas);

        double valorTotal = encomenda.calculaValorTotal();
        System.out.println("O valor total é " + valorTotal);

        double valorDesconto = encomenda.calculaValorDesconto();
        System.out.println("O valor do desconto total é " + valorDesconto);

        int quantidade = encomenda.numeroTotalProdutos();
        System.out.println("O valor total de produtos é " + quantidade);

        Boolean verifica = encomenda.existeProdutoEncomenda("ola");
        System.out.println(verifica);

        encomenda.adicionaLinha(enc);

        LinhaEncomenda[] linhaEncomenda = encomenda.getEncomendas();

        System.out.println(linhaEncomenda.length);

        String Encomendas = new String();
        for(int i = 0; i < linhaEncomenda.length; i++){
            if (linhaEncomenda[i] != null) {
                Encomendas += linhaEncomenda[i].toString2() + " ";
            }
        }

        System.out.println(Encomendas);

        encomenda.removeProduto("referencia");

        String Encomendas2 = new String();

        for(int i = 0; i < linhaEncomenda.length; i++){
            if (linhaEncomenda[i] != null) {
                Encomendas2 += linhaEncomenda[i].toString2() + " ";
            }
        }

        System.out.println(Encomendas2);

    }
}

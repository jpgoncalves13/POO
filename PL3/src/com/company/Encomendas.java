package com.company;

import java.lang.Object;
import java.lang.String;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Objects;

public class Encomendas {
    private String nomeCliente;
    private int numFiscal;
    private String morada;
    private int numEncomenda;
    private LocalDate dataEncomenda;
    private LinhaEncomenda[] encomendas;

    public Encomendas(String nomeCliente, int numFiscal, String morada, int numEncomenda, LocalDate dataEncomenda, LinhaEncomenda[] encomendas) {
        this.nomeCliente = nomeCliente;
        this.numFiscal = numFiscal;
        this.morada = morada;
        this.numEncomenda = numEncomenda;
        this.dataEncomenda = dataEncomenda;
        this.encomendas = encomendas;
    }

    public Encomendas(Encomendas encomendas){
        this.nomeCliente = encomendas.getNomeCliente();
        this.numFiscal = encomendas.getNumFiscal();
        this.morada = encomendas.getMorada();
        this.numEncomenda = encomendas.getNumEncomenda();
        this.dataEncomenda = encomendas.getDataEncomenda();
        this.encomendas = encomendas.getEncomendas();
    }

    public Object clone(){
        return new Encomendas(this);
    }

    public String getNomeCliente() {
        return this.nomeCliente;
    }

    public int getNumFiscal() {
        return this.numFiscal;
    }

    public String getMorada() {
        return this.morada;
    }

    public int getNumEncomenda() {
        return this.numEncomenda;
    }

    public LocalDate getDataEncomenda() {
        return this.dataEncomenda;
    }

    public LinhaEncomenda[] getEncomendas() {
        return this.encomendas;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public void setNumFiscal(int numFiscal) {
        this.numFiscal = numFiscal;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    public void setNumEncomenda(int numEncomenda) {
        this.numEncomenda = numEncomenda;
    }

    public void setDataEncomenda(LocalDate dataEncomenda) {
        this.dataEncomenda = dataEncomenda;
    }

    public void setEncomendas(LinhaEncomenda[] encomendas) {
        this.encomendas = encomendas;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Encomendas)) return false;
        Encomendas that = (Encomendas) o;
        return getNumFiscal() == that.getNumFiscal() && getNumEncomenda() == that.getNumEncomenda() && Objects.equals(getNomeCliente(), that.getNomeCliente()) && Objects.equals(getMorada(), that.getMorada()) && Objects.equals(getDataEncomenda(), that.getDataEncomenda()) && Arrays.equals(getEncomendas(), that.getEncomendas());
    }

    /*public int hashCode() {
        int result = Objects.hash(getNomeCliente(), getNumFiscal(), getMorada(), getNumEncomenda(), getDataEncomenda());
        result = 31 * result + Arrays.hashCode(getEncomendas());
        return result;
    }*/

    //8.b)
    public double calculaValorTotal(){
        int i, res = 0;
        for(i = 0; i < this.encomendas.length; i++){
            if (this.encomendas[i] != null){
                res += this.encomendas[i].calculaValorLinhaEnc();
            }
        }
        return res;
    }

    //c)
    public double calculaValorDesconto(){
        int i;
        double res = 0;
        for(i = 0; i < this.encomendas.length; i++){
            if (this.encomendas[i] != null){
                res += this.encomendas[i].calculaValorDesconto();
            }
        }
        return res;
    }

    //d)
    public int numeroTotalProdutos(){
        int i, res = 0;
        for(i = 0; i < this.encomendas.length; i++){
            if (this.encomendas[i] != null){
                res += this.encomendas[i].getQuantity();
            }
        }
        return res;
    }

    //e)
    public boolean existeProdutoEncomenda(String refProduto){
        int i;
        for(i = 0; i < this.encomendas.length; i++){
            if (this.encomendas[i] != null){
                if (refProduto.compareTo(encomendas[i].getReference()) == 0) return true;
            }
        }
        return false;
    }

    //f)
    public void adicionaLinha(LinhaEncomenda linha){
        int i;
        int tam = this.encomendas.length;
        for(i = 0; i < tam; i++){
            if (this.encomendas[i] == null) {
                this.encomendas[i] = linha;
                break;
            }
        }
        if (i == tam) {
            LinhaEncomenda[] encomendasNew = new LinhaEncomenda[tam+1];
            System.arraycopy(encomendas,0,encomendasNew,0,tam);
            this.encomendas = Arrays.copyOf(encomendasNew,tam+1);
            this.encomendas[tam] = linha;
        }
    }

    public void removeProduto(String codProd){
        int i;
        int tam = this.encomendas.length;
        for (i = 0; i<tam; i++){
            if (encomendas[i] != null) {
                if (encomendas[i].getReference().compareTo(codProd) == 0) {
                    encomendas[i] = null;
                }
            }
        }
    }
}

package com.company;

import java.lang.Object;
import java.lang.String;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Encomendas {
    private String nomeCliente;
    private int numFiscal;
    private String morada;
    private int numEncomenda;
    private LocalDate dataEncomenda;
    private List<LinhaEncomenda> encomendas;

    public Encomendas(String nomeCliente, int numFiscal, String morada, int numEncomenda, LocalDate dataEncomenda) {
        this.nomeCliente = nomeCliente;
        this.numFiscal = numFiscal;
        this.morada = morada;
        this.numEncomenda = numEncomenda;
        this.dataEncomenda = dataEncomenda;
        this.encomendas = new ArrayList<LinhaEncomenda>();
    }

    public Encomendas(Encomendas encomendas){
        this.nomeCliente = encomendas.getNomeCliente();
        this.numFiscal = encomendas.getNumFiscal();
        this.morada = encomendas.getMorada();
        this.numEncomenda = encomendas.getNumEncomenda();
        this.dataEncomenda = encomendas.getDataEncomenda();
        this.encomendas = encomendas.getEncomendas();
    }

    public List<LinhaEncomenda> get_encomendas(){
        List<LinhaEncomenda> res = new ArrayList<>();
        for(LinhaEncomenda l : this.encomendas) res.add((LinhaEncomenda) l.clone());
        return res;
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

    public List getEncomendas() {
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

    public void setEncomendas(ArrayList encomendas) {
        this.encomendas = encomendas;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Encomendas)) return false;
        Encomendas that = (Encomendas) o;
        return getNumFiscal() == that.getNumFiscal() && getNumEncomenda() == that.getNumEncomenda() && Objects.equals(getNomeCliente(), that.getNomeCliente()) && Objects.equals(getMorada(), that.getMorada()) && Objects.equals(getDataEncomenda(), that.getDataEncomenda()) && Objects.equals(getEncomendas(),that.getEncomendas());
    }

    public void adicionaLinhaEncomenda(LinhaEncomenda linha){
        this.encomendas.add((LinhaEncomenda) linha.clone());
    }

    /*public int hashCode() {
        int result = Objects.hash(getNomeCliente(), getNumFiscal(), getMorada(), getNumEncomenda(), getDataEncomenda());
        result = 31 * result + Arrays.hashCode(getEncomendas());
        return result;
    }*/

    //8.b)
    public double calculaValorTotal(){
        int res=0;
        for(LinhaEncomenda enc: this.encomendas) res+=enc.calculaValorLinhaEnc();
        return res;
    }

    //c)
    public double calculaValorDesconto(){
        int res=0;
        for(LinhaEncomenda enc: this.encomendas) res+=enc.calculaValorDesconto();
        return res;
    }

    //d)
    public int numeroTotalProdutos(){
        int res = 0;
        for(LinhaEncomenda enc: this.encomendas){
            if (enc != null){
                res += enc.getQuantity();
            }
        }
        return res;
    }

    //e)
    public boolean existeProdutoEncomenda(String refProduto){
        for(LinhaEncomenda enc: this.encomendas){
            if (enc != null){
                if (refProduto.compareTo(enc.getReference()) == 0) return true;
            }
        }
        return false;
    }

    public void removeProduto(String codProd){
        int i=0;
        if (this.encomendas == null);
        else {
            for (LinhaEncomenda enc : this.encomendas) {
                if (enc != null) {
                    if (enc.getReference().compareTo(codProd) == 0) {
                        encomendas.remove(i);
                    }
                }
                i++;
            }
        }
    }

    @Override
    public String toString() {
        return "Encomendas{" +
                "nomeCliente='" + nomeCliente + '\'' +
                ", numFiscal=" + numFiscal +
                ", morada='" + morada + '\'' +
                ", numEncomenda=" + numEncomenda +
                ", dataEncomenda=" + dataEncomenda +
                ", encomendas=" + encomendas.toString() +
                '}';
    }
}

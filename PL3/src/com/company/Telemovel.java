package com.company;

import java.lang.Object;
import java.lang.String;
import java.util.Objects;

public class Telemovel {
    private String marca;
    private String modelo;
    private String display;
    private String arm_mesg;
    private String arm_fotos;
    private String aplicacoes;
    private byte espaco;
    private int fotos;
    private int num_aplic;
    private String nome;

    public String getMarca() {
        return this.marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public String getDisplay() {
        return this.display;
    }

    public String getArm_mesg() {
        return this.arm_mesg;
    }

    public String getArm_fotos() {
        return this.arm_fotos;
    }

    public String getAplicacoes() {
        return this.aplicacoes;
    }

    public byte getEspaco() {
        return this.espaco;
    }

    public int getFotos() {
        return this.fotos;
    }

    public int getNum_aplic() {
        return this.num_aplic;
    }

    public String getNome() {
        return this.nome;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public void setArm_mesg(String arm_mesg) {
        this.arm_mesg = arm_mesg;
    }

    public void setArm_fotos(String arm_fotos) {
        this.arm_fotos = arm_fotos;
    }

    public void setAplicacoes(String aplicacoes) {
        this.aplicacoes = aplicacoes;
    }

    public void setEspaco(byte espaco) {
        this.espaco = espaco;
    }

    public void setFotos(int fotos) {
        this.fotos = fotos;
    }

    public void setNum_aplic(int num_aplic) {
        this.num_aplic = num_aplic;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Telemovel(){
        this.marca = null;
        this.modelo = null;
        this.display = null;
        this.arm_mesg = null;
        this.arm_fotos = null;
        this.aplicacoes = null;
        this.espaco = 0;
        this.fotos = 0;
        this.num_aplic = 0;
        this.nome = null;
    }

    public Telemovel(String marca, String modelo, String display, String arm_mesg, String arm_fotos, String aplicacoes, byte espaco, int fotos, int num_aplic, String nome) {
        this.marca = marca;
        this.modelo = modelo;
        this.display = display;
        this.arm_mesg = arm_mesg;
        this.arm_fotos = arm_fotos;
        this.aplicacoes = aplicacoes;
        this.espaco = espaco;
        this.fotos = fotos;
        this.num_aplic = num_aplic;
        this.nome = nome;
    }

    public Telemovel(Telemovel telemovel){
        this.marca=telemovel.getMarca();
        this.modelo=telemovel.getModelo();
        this.display=telemovel.getDisplay();
        this.arm_mesg=telemovel.getArm_mesg();
        this.arm_fotos=telemovel.getArm_fotos();
        this.aplicacoes=telemovel.getAplicacoes();
        this.espaco=telemovel.getEspaco();
        this.fotos = telemovel.getFotos();
        this.num_aplic = telemovel.getNum_aplic();
        this.nome = telemovel.getNome();
    }

    public String toString() {
        return "Telemovel{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", display='" + display + '\'' +
                ", arm_mesg='" + arm_mesg + '\'' +
                ", arm_fotos='" + arm_fotos + '\'' +
                ", aplicacoes='" + aplicacoes + '\'' +
                ", espaco=" + espaco +
                ", fotos=" + fotos +
                ", num_aplic=" + num_aplic +
                ", nome='" + nome + '\'' +
                '}';
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Telemovel)) return false;
        Telemovel telemovel = (Telemovel) o;
        return getEspaco() == telemovel.getEspaco() && getFotos() == telemovel.getFotos() && getNum_aplic() == telemovel.getNum_aplic() && Objects.equals(getMarca(), telemovel.getMarca()) && Objects.equals(getModelo(), telemovel.getModelo()) && Objects.equals(getDisplay(), telemovel.getDisplay()) && Objects.equals(getArm_mesg(), telemovel.getArm_mesg()) && Objects.equals(getArm_fotos(), telemovel.getArm_fotos()) && Objects.equals(getAplicacoes(), telemovel.getAplicacoes()) && Objects.equals(getNome(), telemovel.getNome());
    }

    public Telemovel clone(){
        return new Telemovel(this);
    }

    public int hashCode() {
        return Objects.hash(getMarca(), getModelo(), getDisplay(), getArm_mesg(), getArm_fotos(), getAplicacoes(), getEspaco(), getFotos(), getNum_aplic(), getNome());
    }

    /**
     * método que valida se um determinado conteúdo pode ser carregado
     * para o telefone
     */

    public boolean existeEspaco(int numeroBytes){
        if ((Integer.parseInt((this.getArm_fotos()) + Integer.parseInt(this.getArm_mesg()) + Integer.parseInt(this.getAplicacoes())) - this.getEspaco() ) >= numeroBytes) return true;
        else return false;
    }

    public void instalaApp(String nome, int tamanho){
        this.num_aplic++;
        Integer a = tamanho;
        byte tam = a.byteValue();
        this.espaco += tam;
        this.nome = this.nome + " " + nome;
    }
}

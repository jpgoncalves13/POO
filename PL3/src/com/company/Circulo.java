package com.company;

import java.lang.Math;
import java.lang.StringBuilder;

/**
 * Classe Circulo - Ex1 Ficha3
 * @author jpg
 * @version 20220314
 */

public class Circulo {

    private Ponto centro;
    private double raio;

   /* public Circulo(){
        this.x = 0;
        this.y = 0;
        this.raio = 1; //valor válido???
    }*/

    public Circulo(){
        this.centro = new Ponto();
        this.raio = 1;
    }

    /*public Circulo(double x, double y, double raio){
        this.x = x;
        this.y = y;
        this.raio=raio; //o raio tem de ser positivo
    }*/

    public Circulo(Ponto centro, double raio){
        this.centro = centro;
        this.raio=raio; //o raio tem de ser positivo
    }

    public Circulo(Circulo umCirc){
        this.centro = getCentro();
        this.raio = umCirc.getRaio();
    }

    public Ponto getCentro() {
        return centro;
    }

/*    public double getX(){
        return this.x;
    }

    public double getY(){
        return this.y;
    }*/

    public double getRaio(){
        return this.raio;
    }

    public void setCentro(Ponto centro){
        this.centro = centro;
    }

   /* public void setY(double novoy){
        this.y = novoy;
    }*/

    public void setRaio(double novoRaio){
        this.raio = novoRaio;
    }

    public void alteraCentro(Ponto centro){
        this.centro = centro;
    }

    public double calculaArea(){
        return (this.raio*this.raio * Math.PI);
    }

    public double calculaPer(){
        return (this.raio*2 * Math.PI);
    }

    /**
     * Implementa clone
     * Cria um objeto distinto mas com os mesmos argumentos
     */
    public Circulo clone(){
        return new Circulo(this);
    }

    /**
     * Implementa método equals
     */
    /*public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || (this.getClass() != o.getClass())) return false;
        Circulo c = (Circulo) o;
        return (c.getX()==((Circulo) o).getX() && c.getY() == ((Circulo) o).getY() && c.getRaio() == ((Circulo) o).getRaio());
    }*/

    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || (this.getClass() != o.getClass())) return false;
        Circulo c = (Circulo) o;
        return (c.getCentro()==((Circulo) o).getCentro() && c.getRaio() == ((Circulo) o).getRaio());
    }

    /**
     * Implementação básica do método toString
     */
   /* public String toString(){
        return "X = " + this.x + "Y = " + this.y + "raio = " + this.raio;
    }*/

    /**
     * Implementação mais avançada do método toString
     */
    public String toString2(){
        StringBuilder sb = new StringBuilder();
        sb.append("Centro = ");
        sb.append(sb.append(this.centro.toString()));
        sb.append("raio = ");
        sb.append(this.raio);
        String str = sb.toString();
        return str;
    }

}

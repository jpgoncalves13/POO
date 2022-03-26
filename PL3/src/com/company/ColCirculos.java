package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ColCirculos {
    private String nome;
    private String nomeDono;
    private List<Circulo> circulos;

    public ColCirculos(){
        this.nome = "";
        this.nomeDono = "";
        this.circulos = new ArrayList<Circulo>();
    }

    public ColCirculos(String nome, String nomeDono){
        this.nome=nome;
        this.nomeDono=nomeDono;
        this.circulos = new ArrayList<Circulo>();
    }

    //mais construtores

    public void adicionaCirculo(Circulo c){
        this.circulos.add(c.clone());
    }

    //verificar se um circulo existe

    public boolean existeCirculo(Circulo c){
        return this.circulos.contains(c);
    }

    //qual a posição do circulo

    public int posicao(Circulo c){
        return this.circulos.indexOf(c);
    }

    //verificar quantos circulos tem na lista

    public int quantosCirculos(){
        return this.circulos.size();
    }

    /**
     * Metodo getCirculos
     * return arraylist com uma copia dos circulos
     */

    public List<Circulo> getCirculos(){
        //return this.circulos;
        //return new ArrayList(this.circulos);

        ArrayList<Circulo> res = new ArrayList();
        for(Circulo c: this.circulos) res.add(c.clone());

        return res;
    }

}

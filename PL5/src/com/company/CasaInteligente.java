package com.company;

import java.util.*;
import java.util.stream.Collectors;

import static com.company.Lampada.Modo.ECO;
import static com.company.Lampada.Modo.ON;
import static com.company.Lampada.Modo.OFF;

public class CasaInteligente {
    List<Lampada> lampadas;

    public CasaInteligente() {
        this.lampadas = new ArrayList<Lampada>();
    }

    public CasaInteligente(List lampadas){
        this.lampadas = new ArrayList<Lampada>(5);
        Iterator<Lampada> it = lampadas.iterator();
        while(it.hasNext()){
            Lampada l = it.next();
            this.lampadas.add(l);
        }
    }

    private void setModeNormal(int index){
        this.lampadas.get(index).setModo(ON);
    }

    private void setModeEco(int index){
        this.lampadas.get(index).setModo(ECO);
    }

    public List<Lampada> getLampadas() {
        ArrayList<Lampada> list = new ArrayList<Lampada>();
        list.addAll(this.lampadas);
        return list;
    }

    private void copiaLamp(List<Lampada> lampadas){
        this.lampadas = new ArrayList<>();
        Iterator<Lampada> it = lampadas.iterator();
        while(it.hasNext()) {
            Lampada l = it.next();
            this.lampadas.add(l);
        }
    }

    public void setLampadas(CasaInteligente lampadas) {
        copiaLamp(lampadas.getLampadas());
    }

    /**
     * Adicionar uma lampada a casa
     * @param l
     */
    public void addLampada(Lampada l){
        this.lampadas.add(l);
    }

    /**
     * Liga no modo de consumo máximo a lampada no index indicado
     */
    public void ligaLampadaNormal(int index){ setModeNormal(index); }

    /**
     * Liga no modo de ECO a lampada no index indicado
     */
    public void ligaLampadaEco(int index){
        setModeEco(index);
    }

    /**
     * Calcula a quantidade de lampadas em modo ECO
     */
    public int qtEmEco(){
        int count = 0;
        for (Lampada a : this.lampadas){
            if (a.getModo() == ECO) count++;
        }
        return count;
    }

    /**
     * remove a lampada da posição indicada
     */
    public void removeLampada(int index){
        this.lampadas.remove(index);
    }

    /**
     * Liga todas as lampadas da casa em modo eco
     */
    public void ligaTodasEco(){
        Iterator<Lampada> it = this.lampadas.iterator();
        while(it.hasNext()){
            Lampada l = it.next();
            l.setModo(ECO);
        }
    }

    /**
     * Liga todas as lampadas da casa em modo Normal
     */
    public void ligaTodasNormal(){
        Iterator<Lampada> it = this.lampadas.iterator();
        while(it.hasNext()){
            Lampada l = it.next();
            l.setModo(ON);
        }
    }

    /**
     * Determina o consumo total da casa
     */
    public double consumoTotal(){
        double count=0;
        Iterator<Lampada> it = this.lampadas.iterator();
        while(it.hasNext()){
            Lampada l = it.next();
            count += l.getConsumoTotal();
        }
        return count;
    }

    /**
     * Determina a lampada mais gastadora
     * @return
     */

    public Lampada maisGastadora(){
        Lampada aux = new Lampada();
        Iterator<Lampada> it = this.lampadas.iterator();
        while(it.hasNext()) {
            Lampada l = it.next();
            if (l.getConsumoTotal() > aux.getConsumoTotal()) aux = new Lampada(l);
        }
        return aux;
    }

    /**
     * podio das lampadas menos gastadoras
     * @return
     */

    public Set<Lampada> podiumEconomia(){
        Set<Lampada> set = new TreeSet<>(Lampada :: compareTo);

        for(Lampada l: this.lampadas) {
            set.add(l.clone());
        }

        Iterator<Lampada> it = set.iterator();
        Set<Lampada> res = new TreeSet<>(Lampada :: compareTo);

        int i=0;
        while (it.hasNext() && i<3){
            res.add(it.next());
            i++;
        }

        return res;
    }

    /**
     * da reset ao contador das lampadas
     */
    public void reset(){
        for(Lampada a :this.lampadas){
            a.setPeriodoConsumo(0);
        }
    }

}
